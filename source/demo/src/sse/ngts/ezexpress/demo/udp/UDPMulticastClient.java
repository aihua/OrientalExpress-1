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
import java.io.InputStreamReader;

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

	public static void main(String[] args) {
		PropertyConfigurator.configure("cfg/log4j.properties");
		try {
			//建立连接
			ExpressConnector connect = ExpressApi.createClientConnector(new ExpressHandler(), EpsConnMode.EPS_CONN_MODE_UDP_MULTICAST);
			connect.connect("225.225.225.0", 6661);//开启连接
			
			while (true) {
				System.out.println("是否终止连接(true)：");
				String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
				if ("true".equals(input.trim())) {
					connect.dispose();
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
