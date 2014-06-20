package sse.ngts.ezexpress.test.heart;

import java.net.InetSocketAddress;
import java.util.Date;

import org.apache.mina.core.service.IoHandler;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.filter.keepalive.KeepAliveFilter;
import org.apache.mina.filter.keepalive.KeepAliveMessageFactory;
import org.apache.mina.filter.keepalive.KeepAliveRequestTimeoutHandler;
import org.apache.mina.filter.logging.LoggingFilter;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

public class HeartBeatTestClient {
	private static final int PORT = 8889;
	/** 30秒后超时 */
	private static final int IDELTIMEOUT = 30;
	/** 15秒发送一次心跳包 */
	private static final int HEARTBEATRATE = 15;
	/** 心跳包内容 */
	private static final String HEARTBEATREQUEST = "HEARTBEATREQUEST";
	private static final String HEARTBEATRESPONSE = "HEARTBEATRESPONSE";

	private static final String IPADDRESS = "127.0.0.1";

	private static NioSocketConnector connector;
	private static IoHandler handler = new HeartBeatClientHandler();

	public static void main(String[] args) {
		connector = new NioSocketConnector();
		connector.getFilterChain().addLast("logger", new LoggingFilter());
		connector.getFilterChain().addLast("code", new ProtocolCodecFilter(new TextLineCodecFactory()));
		connector.getSessionConfig().setIdleTime(IdleStatus.BOTH_IDLE, IDELTIMEOUT);

		/** 主角登场 */
		KeepAliveMessageFactory heartBeatFactory = new KeepAliveMessageFactoryImpl();
		KeepAliveRequestTimeoutHandler heartBeatHandler = new KeepAliveRequestTimeoutHandlerImpl();
		KeepAliveFilter heartBeat = new KeepAliveFilter(heartBeatFactory, IdleStatus.BOTH_IDLE, heartBeatHandler);
		/** 是否回发 */
		heartBeat.setForwardEvent(true);
		/** 发送频率 */
		heartBeat.setRequestInterval(HEARTBEATRATE);
		connector.getSessionConfig().setKeepAlive(true);
		connector.getFilterChain().addLast("heartbeat", heartBeat);

		/** ******************* */
		connector.setHandler(handler);
		connector.connect(new InetSocketAddress(IPADDRESS, PORT));
		System.out.println("客户端已连接上！" + new Date());
	}

	private static class KeepAliveMessageFactoryImpl implements KeepAliveMessageFactory {

		@Override
		public Object getRequest(IoSession session) {
			System.out.println("返回预设语句!" + HEARTBEATREQUEST + new Date());
			return HEARTBEATREQUEST;
		}

		@Override
		public Object getResponse(IoSession session, Object message) {
			System.out.println("得到返回!" + new Date());
			return null;
		}

		@Override
		public boolean isRequest(IoSession session, Object message) {
			System.out.println("是否是心跳包:" + message + new Date());
			if (message.equals(HEARTBEATREQUEST)) {
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

	private static class KeepAliveRequestTimeoutHandlerImpl implements KeepAliveRequestTimeoutHandler {

		@Override
		public void keepAliveRequestTimedOut(KeepAliveFilter arg0, IoSession arg1) throws Exception {
			System.out.println("心跳超时!" + new Date());
		}

	}
}
