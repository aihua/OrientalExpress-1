package sse.ngts.ezexpress.app;

public abstract class ClientAcceptor implements ExpressConnector {

	/**
	 * ��������host port��ַ
	 */
	@Override
	public void connect(String host, int port) throws Exception {

	}

	@Override
	public void connect(String host, int port, int timeout) throws Exception {

	}
}
