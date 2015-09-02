package sse.ngts.ezexpress.app;

public abstract class ClientConnector implements ExpressConnector {

	/**
	 * session绑定port
	 * @param lcoalIP 绑定IP
	 * @param port 绑定端口
	 * @param timeout 接收行情数据超时时间/秒
	 */
	@Override
	public void connect(String localIP, int port, int timeout) throws Exception {

	}

}
