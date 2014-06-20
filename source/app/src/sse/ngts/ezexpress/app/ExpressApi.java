/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.ezexpress.app;

import org.apache.mina.core.service.IoHandler;

import sse.ngts.ezexpress.app.ExpressEnum.EpsConnMode;
import sse.ngts.ezexpress.app.ExpressEnum.MarketType;
import sse.ngts.ezexpress.app.config.ParserConfig;
import sse.ngts.ezexpress.app.tcp.TCPClientConnector;
import sse.ngts.ezexpress.app.udp.UDPClientAcceptor;
import sse.ngts.ezexpress.app.udp.UDPMulticastClient;

/**
 *  东方快车API
 *  @since 2014-06
 *  @author kzhao
 */
public class ExpressApi {

	/**
	 * 创建接口
	 * @param handler 事件数据回调函数
	 * @param connMode 连接模式
	 * @return 成功返回 ClientConnector实例
	 */
	public static ExpressConnector createClientConnector(IoHandler handler, EpsConnMode connMode) {
		//初始化配置文件
		ParserConfig.getInstance().init();
		if (connMode.equals(EpsConnMode.EPS_CONN_MODE_TCP)) {
			return new TCPClientConnector(handler);
		} else if (connMode.equals(EpsConnMode.EPS_CONN_MODE_UDP_UNICAST)) {
			return new UDPClientAcceptor(handler);
		} else if (connMode.equals(EpsConnMode.EPS_CONN_MODE_UDP_MULTICAST)) {
			return new UDPMulticastClient(handler);
		}
		return null;
	}

	/**
	 * 销毁接口
	 * @param connector  接口连接实例
	 * @return 成功/失败
	 */
	public static boolean destroyClientConnector(ExpressConnector connector) {
		if (connector != null) {
			connector.dispose();
			return true;
		}
		return false;
	}

	/**
	 *  开启连接  TCP连接和UDP组播
	 * @param connector 连接实例
	 * @param host 服务器地址
	 * @param port 服务器端口
	 * @return 成功/失败
	 * @throws Exception 
	 */
	public static boolean connectClientConnector(ExpressConnector connector, String host, int port) throws Exception {
		if (connector != null) {
			if (connector instanceof ClientConnector) {
				connector.connect(host, port);
				return true;
			} else if (connector instanceof ClientAcceptor) {
				return connectClientConnector(connector, port);
			}
		}
		return false;
	}
	
	/**
	 *  开启连接  TCP连接和UDP组播
	 * @param connector 连接实例
	 * @param host 服务器地址
	 * @param port 服务器端口
	 * @param timeout 未收到数据超时时间/秒
	 * @return 成功/失败 
	 * @throws Exception 
	 */
	public static boolean connectClientConnector(ExpressConnector connector, String host, 
			int port, int timeout) throws Exception {
		if (connector != null) {
			if (connector instanceof ClientConnector) {
				connector.connect(host, port, timeout);
				return true;
			} else if (connector instanceof ClientAcceptor) {
				return connectClientConnector(connector, port, timeout);
			}
		}
		return false;
	}

	/**
	 *  开启连接 UDP单播
	 * @param connector 连接实例
	 * @param host 服务器地址
	 * @param port 服务器端口
	 * @return 成功/失败
	 * @throws Exception 
	 */
	public static boolean connectClientConnector(ExpressConnector connector, int port) throws Exception {
		if (connector != null) {
			if (connector instanceof ClientAcceptor) {
				connector.connect(port);
				return true;
			}
		}
		return false;
	}
	
	/**
	 *  开启连接 UDP单播
	 * @param connector 连接实例
	 * @param host 服务器地址
	 * @param port 服务器端口
	 * @param timeout 未收到数据超时时间/秒
	 * @return 成功/失败
	 * @throws Exception 
	 */
	public static boolean connectClientConnector(ExpressConnector connector, int port, int timeout)
			throws Exception {
		if (connector != null) {
			if (connector instanceof ClientAcceptor) {
				connector.connect(port, timeout);
				return true;
			}
		}
		return false;
	}

	/**
	 *  登陆
	 * @param connector 连接实例
	 * @param userName 用户名
	 * @param password 密码
	 * @param heartbeat 心跳间距
	 * @return 成功/失败
	 */
	public static boolean connectorLogin(ExpressConnector connector, String userName, String password) {
		if (connector instanceof TCPClientConnector) {
			TCPClientConnector tcpClent = ((TCPClientConnector) connector);
			return tcpClent.sendLoginMessage(userName, password);
		}
		return false;
	}

	/**
	 * 登出
	 * @param connector 连接实例
	 * @return 成功/失败
	 */
	public static boolean connectorLogout(ExpressConnector connector) {
		if (connector instanceof TCPClientConnector) {
			TCPClientConnector tcpClent = ((TCPClientConnector) connector);
			return tcpClent.sendLogoutMessage();
		}
		return false;
	}

	/**
	 * 订阅
	 * @param connector 连接实例
	 * @param marketType 市场编码
	 * @return 成功/失败
	 */
	public static boolean subscribeMarketData(ExpressConnector connector, MarketType marketType) {
		if (connector instanceof TCPClientConnector) {
			TCPClientConnector tcpClent = ((TCPClientConnector) connector);
			tcpClent.sendMarketMessage(marketType);
			return true;
		}
		return false;
	}
	
}
