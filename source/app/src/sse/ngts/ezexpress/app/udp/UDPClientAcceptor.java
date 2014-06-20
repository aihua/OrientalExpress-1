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
	 *  初始化连接类
	 */
	public synchronized void initConnector(IoHandler handler) {
		if (connector == null) {
			connector = new NioDatagramAcceptor();
			connector.getSessionConfig().setMaxReadBufferSize(2048);
			// 添加过滤器
			connector.getFilterChain().addLast("codec",
					new ProtocolCodecFilter(new ExpressCodecFactory(Charset.forName("UTF-8"))));
			//设置日志过滤器
			LoggingFilter loggingFilter = new LoggingFilter();
			loggingFilter.setMessageReceivedLogLevel(LogLevel.DEBUG);
			loggingFilter.setMessageSentLogLevel(LogLevel.DEBUG);
			connector.getFilterChain().addLast("logger", loggingFilter);
			//防回流过滤器
			connector.getFilterChain().addLast("backFlowFilter", new BackFlowFilter());
			// 添加业务逻辑处理器类
			connector.setHandler(handler);
		}
	}

	/**
	 * 根据port新建一个UDP单播连接接收数据
	 * @param port 端口
	 */
	@Override
	public void connect(int port) throws Exception {
		connect(port, ExpressConstant.RECEIVE_TIMEOUT);
	}

	/**
	 * session绑定port
	 * @param port 绑定端口
	 * @param timeout 接收行情数据超时时间/秒
	 */
	@Override
	public void connect(int port, int timeout) throws Exception {
		// 创建连接
		connector.bind(new InetSocketAddress(port));
		// 设置会话超时时间
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
