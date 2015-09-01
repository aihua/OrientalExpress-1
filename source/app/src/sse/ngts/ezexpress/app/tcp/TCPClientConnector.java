package sse.ngts.ezexpress.app.tcp;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

import org.apache.log4j.Logger;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.service.IoHandler;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.logging.LogLevel;
import org.apache.mina.filter.logging.LoggingFilter;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

import sse.ngts.common.plugin.step.Message;
import sse.ngts.common.plugin.step.STEPParser;
import sse.ngts.ezexpress.app.ClientConnector;
import sse.ngts.ezexpress.app.ExpressConstant;
import sse.ngts.ezexpress.app.ExpressEnum.MarketType;
import sse.ngts.ezexpress.app.codec.ExpressCodecFactory;
import sse.ngts.ezexpress.app.config.ParserConfig;
import sse.ngts.ezexpress.app.filter.BackFlowFilter;
import sse.ngts.ezexpress.app.filter.LockExpress;
import sse.ngts.ezexpress.app.filter.TCPLoginFilter;
import sse.ngts.ezexpress.app.filter.TCPLogoutFilter;
import sse.ngts.ezexpress.timer.HealthDaemon;
import sse.ngts.ezexpress.util.StepMessage;

/**
 * TCP�ͻ���������
 */
public class TCPClientConnector extends ClientConnector {
	private static Logger log = Logger.getLogger(TCPClientConnector.class);

	private NioSocketConnector connector;
	private IoSession session;
	private HealthDaemon healthDaemon;

	public TCPClientConnector(IoHandler handler) {
		initConnector(handler);
	}

	/**
	 *  ��ʼ��������
	 */
	public synchronized void initConnector(IoHandler handler) {
		if (connector == null) {
			connector = new NioSocketConnector();
			connector.getSessionConfig().setTcpNoDelay(true);
			// ��ӹ�����
			connector.getFilterChain().addLast("codec",
					new ProtocolCodecFilter(new ExpressCodecFactory(Charset.forName(ExpressConstant.DECODE_CHARSET))));
			
			//������־������
			LoggingFilter loggingFilter = new LoggingFilter();
			loggingFilter.setMessageReceivedLogLevel(LogLevel.DEBUG);
			loggingFilter.setMessageSentLogLevel(LogLevel.DEBUG);
			connector.getFilterChain().addLast("logger", loggingFilter);
			//��ӵ�¼������
			connector.getFilterChain().addLast("loginFilter", new TCPLoginFilter());
			//��ӵǳ�������
			connector.getFilterChain().addLast("logoutFilter", new TCPLogoutFilter());
			//������������
			connector.getFilterChain().addLast("backFlowFilter", new BackFlowFilter());

			// ���ҵ���߼���������
			connector.setHandler(handler);
		}
	}

	/**
	 * ����host��port�½�һ��IoSession����
	 * @param host ��������IP
	 * @param port ���Ӷ˿�
	 */
	public void connect(String host, int port) throws Exception {
		connect(host, port, ExpressConstant.RECEIVE_TIMEOUT);
	}

	/**
	 * ����host��port�½�һ��IoSession����
	 * @param host ��������IP
	 * @param port ���Ӷ˿�
	 * @param timeout δ�յ����ݳ�ʱʱ��/��
	 */
	@Override
	public void connect(String host, int port, int timeout) throws Exception {
		connector.getSessionConfig().setIdleTime(IdleStatus.READER_IDLE, timeout);
		log.debug("��ʱʱ�䣺" + timeout + "��");
		// �������ӳ�ʱʱ��
		connector.setConnectTimeoutMillis(ExpressConstant.CONNECT_TIMEOUT);  

		// ��������
		ConnectFuture future = connector.connect(new InetSocketAddress(host, port));

		// �ȴ����Ӵ������
		future.awaitUninterruptibly();

		//�õ�����Session
		session = future.getSession();
		//����Sessionͬ��������
		session.setAttribute(ExpressConstant.SESSION_LOCK, new LockExpress());
		
	}

	/**
	 * ��¼/�ǳ��Ƿ�ɹ�
	 * @return boolean
	 */
	public boolean isLockOk() {
		if (session != null) {
			LockExpress lock = (LockExpress) session.getAttribute(ExpressConstant.SESSION_LOCK);
			return lock.isOk();
		}
		return false;
	}

	/**
	 * ������¼/�ǳ���ǰ�߳�
	 * @throws InterruptedException
	 */
	public void doLock() throws InterruptedException {
		if (session != null) {
			LockExpress lock = (LockExpress) session.getAttribute(ExpressConstant.SESSION_LOCK);
			synchronized (lock) {
				lock.setOk(false);
				lock.wait(ExpressConstant.CONNECT_TIMEOUT * 1000L);
			}
		}
	}

	/**
	 * ���͵�¼��Ϣ
	 * @param userName �û���
	 * @param password ����
	 */
	public boolean sendLoginMessage(String userName, String password) {
		STEPParser app = ParserConfig.getInstance().getStep();
		Message message = StepMessage.getLoginMessage(app, ExpressConstant.HEARTBEATRATE, userName, password);
		session.write(message);
		try {
			doLock();
		} catch (InterruptedException e) {
			log.error("Send Login Message InterruptedException: ", e);
		}
		if(isLockOk()) {//��¼�ɹ�������ʱ��������
			healthDaemon = new HealthDaemon(session);
		}
		return isLockOk();
	}

	/**
	 *  ����ע����Ϣ
	 */
	public boolean sendLogoutMessage() {
		STEPParser app = ParserConfig.getInstance().getStep();
		Message message = StepMessage.getLogoutMessage(app);
		session.write(message);
		try {
			doLock();
		} catch (InterruptedException e) {
			log.error("Send Logout Message InterruptedException: ", e);
		}
		return false;
	}

	/**
	 * send���Ͷ�����Ϣ
	 */
	public void sendMarketMessage(MarketType mrkType) {
		//���Ͷ�����Ϣ
		STEPParser app = ParserConfig.getInstance().getStep();
		Message marketMessage = StepMessage.getMarketSubscribeMessage(app, mrkType.getMkdRequest());
		session.write(marketMessage);
	}

	/**
	 * ע����ǰ����
	 */
	public void dispose() {
		if (connector != null) {
			connector.dispose();
		}
		if (healthDaemon != null) {
			healthDaemon.stopHeartBeat();
		}
	}

}
