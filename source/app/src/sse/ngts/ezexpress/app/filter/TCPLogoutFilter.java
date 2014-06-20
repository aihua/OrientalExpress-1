package sse.ngts.ezexpress.app.filter;

import org.apache.log4j.Logger;
import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.session.IoSession;

import sse.ngts.common.plugin.step.business.TCPLogout;
import sse.ngts.ezexpress.app.ExpressConstant;

/**
 * �ǳ�������
 */
public class TCPLogoutFilter extends IoFilterAdapter {
	private static Logger log = Logger.getLogger(TCPLogoutFilter.class);

	@Override
	public void messageReceived(NextFilter nextFilter, IoSession session, Object message) throws Exception {
		if (message instanceof TCPLogout) {
			log.info("�ͻ��˵ǳ���Ϣ���ճɹ�");
			LockExpress lock = (LockExpress) session.getAttribute(ExpressConstant.SESSION_LOCK);
			//�õ���̨��Ӧ��ر�session
			session.close(true);
			log.info("�ͻ��˵ǳ��ɹ�");
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
