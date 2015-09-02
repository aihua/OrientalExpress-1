package sse.ngts.ezexpress.app.udp;

import java.net.InetSocketAddress;

import org.apache.log4j.Logger;
import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.core.service.IoHandler;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.filter.logging.LogLevel;
import org.apache.mina.filter.logging.LoggingFilter;
import org.apache.mina.transport.socket.nio.NioDatagramAcceptor;

import sse.ngts.ezexpress.app.ClientAcceptor;
import sse.ngts.ezexpress.app.ExpressConstant;

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
			//������־������
			LoggingFilter loggingFilter = new LoggingFilter();
			loggingFilter.setMessageReceivedLogLevel(LogLevel.DEBUG);
			loggingFilter.setMessageSentLogLevel(LogLevel.DEBUG);
			connector.getFilterChain().addLast("logger", loggingFilter);
			// ���ҵ���߼���������
			connector.setHandler(handler);
			
		}
	}

	/**
	 * session��port
	 * @param lcoalIP ��IP
	 * @param port �󶨶˿�
	 * @param timeout �����������ݳ�ʱʱ��/��
	 */
	@Override
	public void connect(String localIP, int port, int timeout) throws Exception {
		if (null == localIP || "".equals(localIP.trim())) {
			connector.bind(new InetSocketAddress(port));
		} else {
			connector.bind(new InetSocketAddress(localIP, port));
		}
		
		// ���ûỰ��ʱʱ��
		timeout = timeout < 0  ? ExpressConstant.RECEIVE_TIMEOUT : timeout;
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
