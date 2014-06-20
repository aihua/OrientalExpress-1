package sse.ngts.ezexpress.demo.handle;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

import sse.ngts.common.plugin.step.business.MktDataBody;
import sse.ngts.ezexpress.app.codec.FastMessageExpress;

/**
 * 自己实现的业务处理类
 * @since 2014-06
 * @author kzhao
 */
public class ExpressHandler extends IoHandlerAdapter {
	private static Logger log = Logger.getLogger(ExpressHandler.class);

	@Override
	public void sessionCreated(IoSession session) throws Exception {
		log.info("客户端与服务器创建连接...");
	}

	@Override
	public void sessionOpened(IoSession session) throws Exception {
		log.info("客户端与服务端连接打开...");
	}

	/**
	 * 收到一条完整的step行情数据解析后的通过此方法进行业务处理
	 * @param session 如果连接通信协议为多播则为null
	 * @param message 行情数据的封装对象@sse.ngts.ezexpress.app.codec.FastMessageExpress
	 */
	@Override
	public void messageReceived(IoSession session, Object message) throws Exception {
		if (message instanceof FastMessageExpress) {
			FastMessageExpress fme = (FastMessageExpress)message;
			log.debug("收到行情的证券类型：" + fme.getMktDataFull().getSecurityType().getValue());
			List<MktDataBody> mktDatas = fme.getmktDataBody();
			for (MktDataBody mktDataBody : mktDatas) {
				log.debug("收到行情的证券代码：" + mktDataBody.getSecurityID());
			}
		}
	}

	@Override
	public void messageSent(IoSession session, Object message) throws Exception {
		log.debug("客户端发送信息成功...");
	}

	@Override
	public void sessionClosed(IoSession session) throws Exception {
		log.info("注销Session(" + session.getConfig().toString() + ")成功");
	}

	/**
	 * 默认40秒内无新数据则调用此方法，以此实现接收行情数据超时
	 * 可在@see sse.ngts.ezexpress.app.ExpressApi 中connectClientConnector方法的timeout参数设置
	 * @param session 如果连接通信协议为多播则为null
	 * @param status 默认读超时
	 */
	@Override
	public void sessionIdle(IoSession session, IdleStatus status) throws Exception {
		log.info("客户端进入空闲状态...");
	}

	@Override
	public void exceptionCaught(IoSession session, Throwable cause) throws Exception {
		log.error("客户端发生异常...", cause);
	}
	
}
