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
 * 心跳实现类
 */
public class KeepAliveMessageFactoryImpl implements KeepAliveMessageFactory {
	private static Logger log = Logger.getLogger(KeepAliveMessageFactoryImpl.class);

	/**
	 * 请求预设信息 返回预设语句
	 */
	@Override
	public Object getRequest(IoSession session) {
		log.info("发送心跳消息:");
		STEPParser app = ParserConfig.getInstance().getStep();
		Message heartbeat = StepMessage.getSocketHeartbeatMessage(app);
		return heartbeat;
	}

	/**
	 * 响应预设信息 返回预设语句
	 */
	@Override
	public Object getResponse(IoSession session, Object message) {
		return message;
	}

	/**
	 * 是否响应心跳包
	 */
	@Override
	public boolean isRequest(IoSession session, Object message) {
		return false;
	}

	/**
	 * 是否回应心跳包
	 */
	@Override
	public boolean isResponse(IoSession session, Object message) {
		if (message instanceof Heartbeat) {
			return true;
		}
		return false;
	}
}
