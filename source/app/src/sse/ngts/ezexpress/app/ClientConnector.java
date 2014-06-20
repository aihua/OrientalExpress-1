package sse.ngts.ezexpress.app;

public abstract class ClientConnector implements ExpressConnector {

	/**
	 * 屏蔽创建只输入port地址
	 */
	@Override
	public void connect(int port) throws Exception {

	}

	public void connect(int port, int timeout) throws Exception {

	}

}
