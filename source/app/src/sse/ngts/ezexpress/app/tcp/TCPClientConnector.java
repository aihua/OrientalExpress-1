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
 * TCP客户端连接类
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
	 *  初始化连接类
	 */
	public synchronized void initConnector(IoHandler handler) {
		if (connector == null) {
			connector = new NioSocketConnector();
			connector.getSessionConfig().setTcpNoDelay(true);
			// 添加过滤�?
			connector.getFilterChain().addLast("codec",
					new ProtocolCodecFilter(new ExpressCodecFactory(Charset.forName(ExpressConstant.DECODE_CHARSET))));
			
			//设置日志过滤�?
			LoggingFilter loggingFilter = new LoggingFilter();
			loggingFilter.setMessageReceivedLogLevel(LogLevel.DEBUG);
			loggingFilter.setMessageSentLogLevel(LogLevel.DEBUG);
			connector.getFilterChain().addLast("logger", loggingFilter);
			//添加登录过滤�?
			connector.getFilterChain().addLast("loginFilter", new TCPLoginFilter());
			//添加登出过滤�?
			connector.getFilterChain().addLast("logoutFilter", new TCPLogoutFilter());
			//防回流过滤器
			connector.getFilterChain().addLast("backFlowFilter", new BackFlowFilter());

			// 添加业务逻辑处理器类
			connector.setHandler(handler);
		}
	}

	/**
	 * 根据host和port新建�?个IoSession连接
	 * @param host 连接主机IP
	 * @param port 连接端口
	 */
	public void connect(String host, int port) throws Exception {
		connect(host, port, ExpressConstant.RECEIVE_TIMEOUT);
	}

	/**
	 * 根据host和port新建�?个IoSession连接
	 * @param host 连接主机IP
	 * @param port 连接端口
	 * @param timeout 未收到数据超时时�?/�?
	 */
	@Override
	public void connect(String host, int port, int timeout) throws Exception {
		connector.getSessionConfig().setIdleTime(IdleStatus.READER_IDLE, timeout);
		log.debug("超时时间�?" + timeout + "�?");
		// 设置连接超时时间
		connector.setConnectTimeoutMillis(ExpressConstant.CONNECT_TIMEOUT);  

		// 创建连接
		ConnectFuture future = connector.connect(new InetSocketAddress(host, port));

		// 等待连接创建完成
		future.awaitUninterruptibly();

		//得到连接Session
		session = future.getSession();
		//设置Session同步锁对�?
		session.setAttribute(ExpressConstant.SESSION_LOCK, new LockExpress());
		
	}

	/**
	 * 登录/登出是否成功
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
	 * 锁定登录/登出当前线程
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
	 * 发�?�登录消�?
	 * @param userName 用户�?
	 * @param password 密码
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
		if(isLockOk()) {//登录成功�?启定时心跳发�?
			healthDaemon = new HealthDaemon(session);
		}
		return isLockOk();
	}

	/**
	 *  发�?�注�?消息
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
	 * send发�?�订阅消�?
	 */
	public void sendMarketMessage(MarketType mrkType) {
		//发�?�订阅消�?
		STEPParser app = ParserConfig.getInstance().getStep();
		Message marketMessage = StepMessage.getMarketSubscribeMessage(app, mrkType.getMkdRequest());
		session.write(marketMessage);
	}

	/**
	 * 注销当前连接
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
