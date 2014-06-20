package sse.ngts.ezexpress.app.filter;

import org.apache.log4j.Logger;
import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.session.IoSession;

import sse.ngts.common.plugin.step.business.TCPLogin;
import sse.ngts.ezexpress.app.ExpressConstant;

/**
 * 登录过滤器
 */
public class TCPLoginFilter extends IoFilterAdapter {
	private static Logger log = Logger.getLogger(TCPLoginFilter.class);

	@Override
	public void messageReceived(NextFilter nextFilter, IoSession session, Object message) throws Exception {
		if (message instanceof TCPLogin) {
			LockExpress lock = (LockExpress) session.getAttribute(ExpressConstant.SESSION_LOCK);
			try {
				synchronized (lock) {
					lock.setOk(true);
					lock.notify();
				}
			} catch (Exception e) {
				log.error("TCPLoginFilter.messageReceived error:", e);
			}
			log.info("客户端登录消息接收成功");
		} else {
			nextFilter.messageReceived(session, message);
		}
	}

}
