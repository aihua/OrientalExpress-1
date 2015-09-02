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
 *  �����쳵API
 *  @since 2014-06
 *  @author kzhao
 */
public class ExpressApi {

	/**
	 * �����ӿ�
	 * @param handler �¼����ݻص�����
	 * @param connMode ����ģʽ
	 * @return �ɹ����� ClientConnectorʵ��
	 */
	public static ExpressConnector createClientConnector(IoHandler handler, EpsConnMode connMode) {
		//��ʼ�������ļ�
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
	 * ���ٽӿ�
	 * @param connector  �ӿ�����ʵ��
	 * @return �ɹ�/ʧ��
	 */
	public static boolean destroyClientConnector(ExpressConnector connector) {
		if (connector != null) {
			connector.dispose();
			return true;
		}
		return false;
	}

	/**
	 *  ��������  TCP���Ӻ�UDP�鲥
	 * @param connector ����ʵ��
	 * @param host ��������ַ
	 * @param port �������˿�
	 * @return �ɹ�/ʧ��
	 * @throws Exception 
	 */
	public static boolean connectClientConnector(ExpressConnector connector, String host, int port)
			throws Exception {
		return connectClientConnector(connector, host, port, null, -1);
	}
	
	/**
	 *  ��������  TCP���Ӻ�UDP�鲥
	 * @param connector ����ʵ��
	 * @param host ��������ַ
	 * @param port �������˿�
	 * @param timeout δ�յ����ݳ�ʱʱ��/��
	 * @return �ɹ�/ʧ�� 
	 * @throws Exception 
	 */
	public static boolean connectClientConnector(ExpressConnector connector, String host, 
			int port, int timeout) throws Exception {
		return connectClientConnector(connector, host, port, null, timeout);
	}
	
	/**
	 *  ��������  TCP���Ӻ�UDP�鲥
	 * @param connector ����ʵ��
	 * @param host ��������ַ
	 * @param port �������˿�
	 * @param localIP ���ص�ַ
	 * @return �ɹ�/ʧ�� 
	 * @throws Exception 
	 */
	public static boolean connectClientConnector(ExpressConnector connector, String host, 
			int port, String localIP) throws Exception {
		return connectClientConnector(connector, host, port, localIP, -1);
	}
	
	/**
	 *  �������� UDP����
	 * @param connector ����ʵ��
	 * @param localPort ���ض˿�
	 * @param localIP ���ص�ַ
	 * @return �ɹ�/ʧ��
	 * @throws Exception 
	 */
	public static boolean connectClientConnector(ExpressConnector connector, int localPort, String localIP)
			throws Exception {
		return connectClientConnector(connector, null, localPort, localIP, -1);
	}
	
	/**
	 *  �������� UDP����
	 * @param connector ����ʵ��
	 * @param localPort ���ض˿�
	 * @param localIP ���ص�ַ
	 * @param timeout δ�յ����ݳ�ʱʱ��/��
	 * @return �ɹ�/ʧ�� 
	 * @throws Exception 
	 */
	public static boolean connectClientConnector(ExpressConnector connector, int localPort, String localIP,
			int timeout) throws Exception {
		return connectClientConnector(connector, null, localPort, localIP, timeout);
	}
	
	/**
	 *  �������� UDP����
	 * @param connector ����ʵ��
	 * @param localPort ���ض˿�
	 * @return �ɹ�/ʧ��
	 * @throws Exception 
	 */
	public static boolean connectClientConnector(ExpressConnector connector, int localPort)
			throws Exception {
		return connectClientConnector(connector, null, localPort, null, -1);
	}
	
	/**
	 *  �������� UDP����
	 * @param connector ����ʵ��
	 * @param localPort ���ض˿�
	 * @param timeout δ�յ����ݳ�ʱʱ��/��
	 * @return �ɹ�/ʧ�� 
	 * @throws Exception 
	 */
	public static boolean connectClientConnector(ExpressConnector connector, int localPort,
			int timeout) throws Exception {
		return connectClientConnector(connector, null, localPort, null, timeout);
	}
	
	/**
	 *  ��������  TCP���Ӻ�UDP�鲥/����
	 * @param connector ����ʵ��
	 * @param host ��������ַ
	 * @param port �������˿�
	 * @param localIP ���ص�ַ
	 * @param timeout δ�յ����ݳ�ʱʱ��/��
	 * @return �ɹ�/ʧ�� 
	 * @throws Exception 
	 */
	public static boolean connectClientConnector(ExpressConnector connector, String host, 
			int port, String localIP, int timeout) throws Exception {
		if (connector != null) {
			if (connector instanceof ClientConnector) {
				connector.connect(host, port, localIP, timeout);
				return true;
			} else if (connector instanceof ClientAcceptor) {
				connector.connect(localIP, port, timeout);
				return true;
			}
		}
		return false;
	}

	/**
	 *  ��½
	 * @param connector ����ʵ��
	 * @param userName �û���
	 * @param password ����
	 * @param heartbeat �������
	 * @return �ɹ�/ʧ��
	 */
	public static boolean connectorLogin(ExpressConnector connector, String userName, String password) {
		if (connector instanceof TCPClientConnector) {
			TCPClientConnector tcpClent = ((TCPClientConnector) connector);
			return tcpClent.sendLoginMessage(userName, password);
		}
		return false;
	}

	/**
	 * �ǳ�
	 * @param connector ����ʵ��
	 * @return �ɹ�/ʧ��
	 */
	public static boolean connectorLogout(ExpressConnector connector) {
		if (connector instanceof TCPClientConnector) {
			TCPClientConnector tcpClent = ((TCPClientConnector) connector);
			return tcpClent.sendLogoutMessage();
		}
		return false;
	}

	/**
	 * ����
	 * @param connector ����ʵ��
	 * @param marketType �г�����
	 * @return �ɹ�/ʧ��
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
