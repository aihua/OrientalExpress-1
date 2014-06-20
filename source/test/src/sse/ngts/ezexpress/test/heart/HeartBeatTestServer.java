package sse.ngts.ezexpress.test.heart;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Date;
import java.util.concurrent.ExecutorService;

import org.apache.mina.core.service.IoHandler;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.filter.executor.ExecutorFilter;
import org.apache.mina.filter.executor.OrderedThreadPoolExecutor;
import org.apache.mina.filter.keepalive.KeepAliveFilter;
import org.apache.mina.filter.keepalive.KeepAliveMessageFactory;
import org.apache.mina.filter.keepalive.KeepAliveRequestTimeoutHandler;
import org.apache.mina.transport.socket.SocketAcceptor;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

public class HeartBeatTestServer {
	private static final int PORT = 8889;

	/** 30秒后超时 */
	private static final int IDELTIMEOUT = 30;

	/** 15秒发送一次心跳包 */
	private static final int HEARTBEATRATE = 15;

	/** 心跳包内容 */
	private static final String HEARTEATREQUEST = "HEARTBEATREQUERST";
	private static final String HEARTBEATRESPONSE = "HEARTBEATRESPONSE";

	private static SocketAcceptor acceptor;
	private static ExecutorService filterExecutor = new OrderedThreadPoolExecutor();
	private static IoHandler handler = new HeartBeatServerHandler();

	public static void main(String[] args) throws IOException {
		acceptor = new NioSocketAcceptor(Runtime.getRuntime().availableProcessors());
		acceptor.setReuseAddress(true);
		acceptor.getSessionConfig().setReadBufferSize(1024);
		acceptor.getSessionConfig().setIdleTime(IdleStatus.BOTH_IDLE, IDELTIMEOUT);

		acceptor.getSessionConfig().setReceiveBufferSize(1024);

		acceptor.getFilterChain().addLast("threadPool", new ExecutorFilter(filterExecutor));
		acceptor.getFilterChain().addLast("codec", new ProtocolCodecFilter(new TextLineCodecFactory()));

		KeepAliveMessageFactory heartBeatFactory = new KeepAliveMessageFactoryImpl();
		KeepAliveRequestTimeoutHandler heartBeatHandler = new KeepAliveRequestTimeoutHandlerImpl();
		KeepAliveFilter heartBeat = new KeepAliveFilter(heartBeatFactory, IdleStatus.BOTH_IDLE, heartBeatHandler);

		/** 是否回发 */
		heartBeat.setForwardEvent(true);
		/** 发送频率 */
		heartBeat.setRequestInterval(HEARTBEATRATE);
		acceptor.getFilterChain().addLast("heartbeat", heartBeat);

		/** ******************** */

		acceptor.setHandler(handler);
		acceptor.bind(new InetSocketAddress(PORT));

		System.out.println("服务器开启，监听端口： " + PORT + " " + new Date());
	}

	/**
	 * 内部类，实现心跳工厂
	 */
	private static class KeepAliveMessageFactoryImpl implements KeepAliveMessageFactory {

		@Override
		public Object getRequest(IoSession session) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object getResponse(IoSession session, Object message) {
			System.out.println("返回预设语句" + HEARTBEATRESPONSE + new Date());
			/** 返回预设语句 */
			return HEARTBEATRESPONSE;
		}

		@Override
		public boolean isRequest(IoSession session, Object message) {
			System.out.println("是否是心跳包" + message + new Date());
			if (message.equals(HEARTEATREQUEST)) {
				return true;
			}
			return false;
		}

		@Override
		public boolean isResponse(IoSession session, Object message) {
			System.out.println("是否是心跳包：" + message + new Date());
			if (message.equals(HEARTBEATRESPONSE)) {
				return true;
			}
			return false;
		}
	}

	/**
	 * 当心跳超时时的处理，也可以用默认处理，这里like KeepAliveRequestTimeoutHandler.log的处理
	 */
	private static class KeepAliveRequestTimeoutHandlerImpl implements KeepAliveRequestTimeoutHandler {

		@Override
		public void keepAliveRequestTimedOut(KeepAliveFilter arg0, IoSession arg1) throws Exception {
			System.out.println("心跳超时！" + new Date());
		}

	}

}
