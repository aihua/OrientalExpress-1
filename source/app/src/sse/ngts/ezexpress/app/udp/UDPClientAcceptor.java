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
	 *  初始化连接类
	 */
	public synchronized void initConnector(IoHandler handler) {
		if (connector == null) {
			connector = new NioDatagramAcceptor();
			//设置日志过滤器
			LoggingFilter loggingFilter = new LoggingFilter();
			loggingFilter.setMessageReceivedLogLevel(LogLevel.DEBUG);
			loggingFilter.setMessageSentLogLevel(LogLevel.DEBUG);
			connector.getFilterChain().addLast("logger", loggingFilter);
			// 添加业务逻辑处理器类
			connector.setHandler(handler);
			
		}
	}

	/**
	 * session绑定port
	 * @param lcoalIP 绑定IP
	 * @param port 绑定端口
	 * @param timeout 接收行情数据超时时间/秒
	 */
	@Override
	public void connect(String localIP, int port, int timeout) throws Exception {
		if (null == localIP || "".equals(localIP.trim())) {
			connector.bind(new InetSocketAddress(port));
		} else {
			connector.bind(new InetSocketAddress(localIP, port));
		}
		
		// 设置会话超时时间
		timeout = timeout < 0  ? ExpressConstant.RECEIVE_TIMEOUT : timeout;
		connector.getSessionConfig().setIdleTime(IdleStatus.READER_IDLE, timeout);
		log.debug("超时时间：" + timeout + "秒");
	}

	/**
	 * 注销当前连接
	 */
	public void dispose() {
		if (connector != null) {
			connector.dispose();
		}
	}

}
