package sse.ngts.ezexpress.app;

public abstract class ClientConnector implements ExpressConnector {

	/**
	 * session��port
	 * @param lcoalIP ��IP
	 * @param port �󶨶˿�
	 * @param timeout �����������ݳ�ʱʱ��/��
	 */
	@Override
	public void connect(String localIP, int port, int timeout) throws Exception {

	}

}
