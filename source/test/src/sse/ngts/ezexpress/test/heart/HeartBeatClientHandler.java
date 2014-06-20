package sse.ngts.ezexpress.test.heart;

import java.util.Date;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

public class HeartBeatClientHandler extends IoHandlerAdapter {

	private static final String START = "心跳消息测试开始";

	@Override
	public void exceptionCaught(IoSession session, Throwable cause) throws Exception {
		System.out.println("捕获异常!" + new Date());
		super.exceptionCaught(session, cause);
	}

	@Override
	public void messageReceived(IoSession session, Object message) throws Exception {
		super.messageReceived(session, message);
	}

	@Override
	public void messageSent(IoSession session, Object message) throws Exception {
		// TODO Auto-generated method stub
		super.messageSent(session, message);
	}

	@Override
	public void sessionClosed(IoSession session) throws Exception {
		System.out.println("session被关闭!" + new Date());
		super.sessionClosed(session);
	}

	@Override
	public void sessionIdle(IoSession session, IdleStatus status) throws Exception {
		System.out.println("session正空闲!" + new Date());
		super.sessionIdle(session, status);
	}

	@Override
	public void sessionOpened(IoSession session) throws Exception {
		System.out.println("session连接被打开 :" + new Date());
		System.out.println("leaf: " + START + new Date());
		session.write(START);
		super.sessionOpened(session);
	}
}
