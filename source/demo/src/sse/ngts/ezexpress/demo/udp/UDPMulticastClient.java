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
 * UDP多播连接简单Demo
 * @since 2014-06
 * @author kzhao
 */
public class UDPMulticastClient {
	
	private static Logger log = Logger.getLogger(UDPMulticastClient.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("cfg/log4j.properties");
		//建立连接
		ExpressConnector connect = ExpressApi.createClientConnector(new ExpressHandler(), 
				EpsConnMode.EPS_CONN_MODE_UDP_MULTICAST);
		try {
			//开启连接
			ExpressApi.connectClientConnector(connect, "230.12.1.1", 3400, "58.24.13.1");
		} catch (Exception e) {
			log.error("connect exception", e);
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
