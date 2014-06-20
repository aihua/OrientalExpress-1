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

	/** 30���ʱ */
	private static final int IDELTIMEOUT = 30;

	/** 15�뷢��һ�������� */
	private static final int HEARTBEATRATE = 15;

	/** ���������� */
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

		/** �Ƿ�ط� */
		heartBeat.setForwardEvent(true);
		/** ����Ƶ�� */
		heartBeat.setRequestInterval(HEARTBEATRATE);
		acceptor.getFilterChain().addLast("heartbeat", heartBeat);

		/** ******************** */

		acceptor.setHandler(handler);
		acceptor.bind(new InetSocketAddress(PORT));

		System.out.println("�����������������˿ڣ� " + PORT + " " + new Date());
	}

	/**
	 * �ڲ��࣬ʵ����������
	 */
	private static class KeepAliveMessageFactoryImpl implements KeepAliveMessageFactory {

		@Override
		public Object getRequest(IoSession session) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object getResponse(IoSession session, Object message) {
			System.out.println("����Ԥ�����" + HEARTBEATRESPONSE + new Date());
			/** ����Ԥ����� */
			return HEARTBEATRESPONSE;
		}

		@Override
		public boolean isRequest(IoSession session, Object message) {
			System.out.println("�Ƿ���������" + message + new Date());
			if (message.equals(HEARTEATREQUEST)) {
				return true;
			}
			return false;
		}

		@Override
		public boolean isResponse(IoSession session, Object message) {
			System.out.println("�Ƿ�����������" + message + new Date());
			if (message.equals(HEARTBEATRESPONSE)) {
				return true;
			}
			return false;
		}
	}

	/**
	 * ��������ʱʱ�Ĵ���Ҳ������Ĭ�ϴ�������like KeepAliveRequestTimeoutHandler.log�Ĵ���
	 */
	private static class KeepAliveRequestTimeoutHandlerImpl implements KeepAliveRequestTimeoutHandler {

		@Override
		public void keepAliveRequestTimedOut(KeepAliveFilter arg0, IoSession arg1) throws Exception {
			System.out.println("������ʱ��" + new Date());
		}

	}

}
