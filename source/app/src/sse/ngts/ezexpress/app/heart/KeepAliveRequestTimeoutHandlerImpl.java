package sse.ngts.ezexpress.app.heart;

import org.apache.log4j.Logger;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.keepalive.KeepAliveFilter;
import org.apache.mina.filter.keepalive.KeepAliveRequestTimeoutHandler;

/**
 * 心跳超时处理
 * KeepAliveFilter 在没有收到心跳消息的响应时，会报告给KeepAliveRequestTimeoutHandler。
 * 默认处理是KeepAliveRequestTimeoutHandler.CLOSE(即弱国不给handler参数，则会使用默认的从而Close这个Session)
 * 这里只打印超时信息
 */
public class KeepAliveRequestTimeoutHandlerImpl implements KeepAliveRequestTimeoutHandler {
	private static Logger log = Logger.getLogger(KeepAliveRequestTimeoutHandlerImpl.class);

	@Override
	public void keepAliveRequestTimedOut(KeepAliveFilter arg0, IoSession arg1) throws Exception {
		log.info("心跳超时!");
	}
}
