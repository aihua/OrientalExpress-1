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
 * TCP���Ӽ�Demo
 * @since 2014-06
 * @author kzhao
 */
public class TCPClient {
	
	private static Logger log = Logger.getLogger(TCPClient.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("cfg/log4j.properties");
		//��������
		ExpressConnector connect = ExpressApi.createClientConnector(new ExpressHandler(), EpsConnMode.EPS_CONN_MODE_TCP);
		try {
			//��������
			boolean connectSuc = ExpressApi.connectClientConnector(connect, "198.2.91.1", 9905);
			if (!connectSuc) {
				log.info("�޷����ӵ���̨");
				return;
			}
		} catch (Exception e) {
			log.info("�޷����ӵ���̨");
			return;
		}

		if (ExpressApi.connectorLogin(connect, "xxxxx", "xxxxxxxx")) {//��¼
			log.info("���Ͷ�����Ϣ");
			ExpressApi.subscribeMarketData(connect, MarketType.EPS_MKTTYPE_ALL);//���Ͷ�����Ϣ
		} else {
			log.info("��¼��ʱ!!");
			return;
		}

		while (true) {
			try {
				log.info("�Ƿ���ֹ����(true)��");
				String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
				if ("true".equalsIgnoreCase(input.trim())) {
					//�ǳ�
					ExpressApi.connectorLogout(connect);
					//���ٽӿ�
					ExpressApi.destroyClientConnector(connect);
					break;
				}
			} catch (Exception e) {
				log.error("Logout exception", e);
			}
		}
		
	}
}

