package sse.ngts.ezexpress.app.udp;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

import org.apache.log4j.Logger;
import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.core.service.IoHandler;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.logging.LogLevel;
import org.apache.mina.filter.logging.LoggingFilter;
import org.apache.mina.transport.socket.nio.NioDatagramAcceptor;

import sse.ngts.ezexpress.app.ClientAcceptor;
import sse.ngts.ezexpress.app.ExpressConstant;
import sse.ngts.ezexpress.app.codec.ExpressCodecFactory;
import sse.ngts.ezexpress.app.filter.BackFlowFilter;

public class UDPClientAcceptor extends ClientAcceptor {
	private static Logger log = Logger.getLogger(UDPClientAcceptor.class);
	private IoAcceptor connector;

	public UDPClientAcceptor(IoHandler handler) {
		initConnector(handler);
	}

	/**
	 *  ��ʼ��������
	 */
	public synchronized void initConnector(IoHandler handler) {
		if (connector == null) {
			connector = new NioDatagramAcceptor();
			// ��ӹ�����
			connector.getFilterChain().addLast("codec",
					new ProtocolCodecFilter(new ExpressCodecFactory(Charset.forName(ExpressConstant.DECODE_CHARSET))));
			//������־������
			LoggingFilter loggingFilter = new LoggingFilter();
			loggingFilter.setMessageReceivedLogLevel(LogLevel.DEBUG);
			loggingFilter.setMessageSentLogLevel(LogLevel.DEBUG);
			connector.getFilterChain().addLast("logger", loggingFilter);
			//������������
			connector.getFilterChain().addLast("backFlowFilter", new BackFlowFilter());
			// ���ҵ���߼���������
			connector.setHandler(handler);
			
		}
	}

	/**
	 * ����port�½�һ��UDP�������ӽ�������
	 * @param port �˿�
	 */
	@Override
	public void connect(int port) throws Exception {
		connect(port, ExpressConstant.RECEIVE_TIMEOUT);
	}

	/**
	 * session��port
	 * @param port �󶨶˿�
	 * @param timeout �����������ݳ�ʱʱ��/��
	 */
	@Override
	public void connect(int port, int timeout) throws Exception {
		// ��������
		connector.bind(new InetSocketAddress(port));
		// ���ûỰ��ʱʱ��
		connector.getSessionConfig().setIdleTime(IdleStatus.READER_IDLE, timeout);
		log.debug("��ʱʱ�䣺" + timeout + "��");
	}

	/**
	 * ע����ǰ����
	 */
	public void dispose() {
		if (connector != null) {
			connector.dispose();
		}
	}

}
