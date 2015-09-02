/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.ezexpress.demo.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import sse.ngts.ezexpress.app.ExpressApi;
import sse.ngts.ezexpress.app.ExpressConnector;
import sse.ngts.ezexpress.app.ExpressEnum.EpsConnMode;
import sse.ngts.ezexpress.demo.handle.ExpressHandler;
/**
 * UDP单点连接简单Demo
 * @since 2014-06
 * @author kzhao
 */
public class UDPUnicastClient {

	private static Logger log = Logger.getLogger(UDPUnicastClient.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("cfg/log4j.properties");
		//建立连接
		ExpressConnector connect = ExpressApi.createClientConnector(new ExpressHandler(), 
				EpsConnMode.EPS_CONN_MODE_UDP_UNICAST);
		try {
			ExpressApi.connectClientConnector(connect, 4002, "200.200.202.11");//开启连接
		} catch (Exception e) {
			log.error("connect exception", e);
			return;
		}

		while (true) {
			log.info("是否终止连接(true)：");
			String input = null;
			try {
				input = new BufferedReader(new InputStreamReader(System.in)).readLine();
			} catch (IOException e) {
				log.error("input exception", e);
			}
			if ("true".equals(input.trim())) {
				ExpressApi.destroyClientConnector(connect);
				break;
			}
		}
		
	}

}
