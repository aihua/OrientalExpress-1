package sse.ngts.ezexpress.test.heart;

import java.util.Date;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

public class HeartBeatServerHandler extends IoHandlerAdapter {

	@Override
	public void exceptionCaught(IoSession session, Throwable cause) throws Exception {
		System.out.println("�����쳣!" + new Date());
		super.exceptionCaught(session, cause);
	}

	@Override
	public void messageReceived(IoSession session, Object message) throws Exception {
		System.out.println("receive leaf: " + (String) message + new Date());
	}

	@Override
	public void messageSent(IoSession session, Object message) throws Exception {

		super.messageSent(session, message);
	}

	@Override
	public void sessionClosed(IoSession session) throws Exception {
		System.out.println("session���ر�!" + new Date());
		super.sessionClosed(session);
	}

	@Override
	public void sessionIdle(IoSession session, IdleStatus status) throws Exception {
		System.out.println("session������!" + status.toString() + new Date());
		super.sessionIdle(session, status);
	}
}
