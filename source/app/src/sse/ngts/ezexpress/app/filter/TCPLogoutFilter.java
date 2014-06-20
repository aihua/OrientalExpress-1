package sse.ngts.ezexpress.app.filter;

import org.apache.log4j.Logger;
import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.session.IoSession;

import sse.ngts.common.plugin.step.business.TCPLogout;
import sse.ngts.ezexpress.app.ExpressConstant;

/**
 * 登出过滤器
 */
public class TCPLogoutFilter extends IoFilterAdapter {
	private static Logger log = Logger.getLogger(TCPLogoutFilter.class);

	@Override
	public void messageReceived(NextFilter nextFilter, IoSession session, Object message) throws Exception {
		if (message instanceof TCPLogout) {
			log.info("客户端登出消息接收成功");
			LockExpress lock = (LockExpress) session.getAttribute(ExpressConstant.SESSION_LOCK);
			//得到后台响应后关闭session
			session.close(true);
			log.info("客户端登出成功");
			try {
				synchronized (lock) {
					lock.setOk(true);
					lock.notify();
				}
			} catch (Exception e) {
				log.error("TCPLogoutFilter.messageReceived error:", e);
			}
		} else {
			nextFilter.messageReceived(session, message);
		}
	}
}
