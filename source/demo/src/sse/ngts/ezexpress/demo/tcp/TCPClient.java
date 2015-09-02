/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.ezexpress.demo.tcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import sse.ngts.ezexpress.app.ExpressApi;
import sse.ngts.ezexpress.app.ExpressConnector;
import sse.ngts.ezexpress.app.ExpressEnum.EpsConnMode;
import sse.ngts.ezexpress.app.ExpressEnum.MarketType;
import sse.ngts.ezexpress.demo.handle.ExpressHandler;

/**
 * TCP连接简单Demo
 * @since 2014-06
 * @author kzhao
 */
public class TCPClient {
	
	private static Logger log = Logger.getLogger(TCPClient.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("cfg/log4j.properties");
		//建立连接
		ExpressConnector connect = ExpressApi.createClientConnector(new ExpressHandler(),
				EpsConnMode.EPS_CONN_MODE_TCP);
		try {
			//开启连接
			boolean connectSuc = ExpressApi.connectClientConnector(connect, "180.2.24.1",
					9005, "180.2.97.1");
			if (!connectSuc) {
				log.info("无法连接到后台");
				return;
			}
		} catch (Exception e) {
			log.info("无法连接到后台");
			return;
		}

		if (ExpressApi.connectorLogin(connect, "xxxxx", "xxxxxxxx")) {//登录
			log.info("发送订阅消息");
			ExpressApi.subscribeMarketData(connect, MarketType.EPS_MKTTYPE_ALL);//发送订阅消息
		} else {
			log.info("登录超时!!");
			return;
		}

		while (true) {
			try {
				log.info("是否终止连接(true)：");
				String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
				if ("true".equalsIgnoreCase(input.trim())) {
					//登出
					ExpressApi.connectorLogout(connect);
					//销毁接口
					ExpressApi.destroyClientConnector(connect);
					break;
				}
			} catch (Exception e) {
				log.error("Logout exception", e);
			}
		}
		
	}
	
}

