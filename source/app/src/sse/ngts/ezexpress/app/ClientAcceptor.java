package sse.ngts.ezexpress.app;

public abstract class ClientAcceptor implements ExpressConnector {

	/**
	 * session��port
	 * @param lcoalIP ��IP
	 * @param port �󶨶˿�
	 * @param timeout �����������ݳ�ʱʱ��/��
	 */
	@Override
	public void connect(String host, int port, String localIP, int timeout) throws Exception {

	}
	
}
