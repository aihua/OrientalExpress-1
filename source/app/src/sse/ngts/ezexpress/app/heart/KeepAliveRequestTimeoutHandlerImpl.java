package sse.ngts.ezexpress.app.heart;

import org.apache.log4j.Logger;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.keepalive.KeepAliveFilter;
import org.apache.mina.filter.keepalive.KeepAliveRequestTimeoutHandler;

/**
 * ������ʱ����
 * KeepAliveFilter ��û���յ�������Ϣ����Ӧʱ���ᱨ���KeepAliveRequestTimeoutHandler��
 * Ĭ�ϴ�����KeepAliveRequestTimeoutHandler.CLOSE(����������handler���������ʹ��Ĭ�ϵĴӶ�Close���Session)
 * ����ֻ��ӡ��ʱ��Ϣ
 */
public class KeepAliveRequestTimeoutHandlerImpl implements KeepAliveRequestTimeoutHandler {
	private static Logger log = Logger.getLogger(KeepAliveRequestTimeoutHandlerImpl.class);

	@Override
	public void keepAliveRequestTimedOut(KeepAliveFilter arg0, IoSession arg1) throws Exception {
		log.info("������ʱ!");
	}
}
