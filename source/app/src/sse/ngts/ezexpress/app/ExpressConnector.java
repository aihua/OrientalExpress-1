package sse.ngts.ezexpress.app;

import org.apache.mina.core.service.IoHandler;

public interface ExpressConnector {

	public void initConnector(IoHandler handler);

	public void connect(String host, int port, int timeout) throws Exception;
	
	public void connect(String host, int port, String localIP, int timeout) throws Exception;

	public void dispose();
	
}
