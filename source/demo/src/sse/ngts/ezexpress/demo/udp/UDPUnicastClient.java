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
 * UDP单点连接简单Demo
 * @since 2014-06
 * @author kzhao
 */
public class UDPUnicastClient {

	public static void main(String[] args) {
		PropertyConfigurator.configure("cfg/log4j.properties");
		//建立连接
		ExpressConnector connect = ExpressApi.createClientConnector(new ExpressHandler(), EpsConnMode.EPS_CONN_MODE_UDP_UNICAST);
		try {
			ExpressApi.connectClientConnector(connect, "127.0.0.1", 6661);//开启连接
		} catch (Exception e) {
			System.out.println("无法连接到后台...");
			return;
		}

		boolean isWhile = true;
		while (isWhile) {
			try {
				String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
				if ("Logout".equalsIgnoreCase(input.trim())) {
					//销毁接口
					ExpressApi.destroyClientConnector(connect);
					isWhile = false;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		connect.dispose();
	}

}
