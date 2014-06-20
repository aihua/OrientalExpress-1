package sse.ngts.ezexpress.app.filter;

import org.apache.log4j.Logger;
import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.session.IoSession;

import sse.ngts.common.plugin.step.business.TCPLogin;
import sse.ngts.ezexpress.app.ExpressConstant;

/**
 * ��¼������
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
			log.info("�ͻ��˵�¼��Ϣ���ճɹ�");
		} else {
			nextFilter.messageReceived(session, message);
		}
	}

}
