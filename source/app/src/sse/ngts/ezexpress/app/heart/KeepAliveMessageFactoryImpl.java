package sse.ngts.ezexpress.app.heart;

import org.apache.log4j.Logger;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.keepalive.KeepAliveMessageFactory;

import sse.ngts.common.plugin.step.Message;
import sse.ngts.common.plugin.step.STEPParser;
import sse.ngts.common.plugin.step.business.Heartbeat;
import sse.ngts.ezexpress.app.config.ParserConfig;
import sse.ngts.ezexpress.util.StepMessage;

/**
 * ����ʵ����
 */
public class KeepAliveMessageFactoryImpl implements KeepAliveMessageFactory {
	private static Logger log = Logger.getLogger(KeepAliveMessageFactoryImpl.class);

	/**
	 * ����Ԥ����Ϣ ����Ԥ�����
	 */
	@Override
	public Object getRequest(IoSession session) {
		log.info("����������Ϣ:");
		STEPParser app = ParserConfig.getInstance().getStep();
		Message heartbeat = StepMessage.getSocketHeartbeatMessage(app);
		return heartbeat;
	}

	/**
	 * ��ӦԤ����Ϣ ����Ԥ�����
	 */
	@Override
	public Object getResponse(IoSession session, Object message) {
		return message;
	}

	/**
	 * �Ƿ���Ӧ������
	 */
	@Override
	public boolean isRequest(IoSession session, Object message) {
		return false;
	}

	/**
	 * �Ƿ��Ӧ������
	 */
	@Override
	public boolean isResponse(IoSession session, Object message) {
		if (message instanceof Heartbeat) {
			return true;
		}
		return false;
	}
}
