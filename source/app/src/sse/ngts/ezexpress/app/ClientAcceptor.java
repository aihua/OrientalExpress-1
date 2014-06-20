package sse.ngts.ezexpress.app;

public abstract class ClientAcceptor implements ExpressConnector {

	/**
	 * 创建输入host port地址
	 */
	@Override
	public void connect(String host, int port) throws Exception {

	}

	@Override
	public void connect(String host, int port, int timeout) throws Exception {

	}
}
