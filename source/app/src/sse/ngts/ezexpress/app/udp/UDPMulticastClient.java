package sse.ngts.ezexpress.app.udp;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

import org.apache.log4j.Logger;
import org.apache.mina.core.service.IoHandler;
import org.apache.mina.core.session.IdleStatus;

import sse.ngts.common.plugin.step.business.MktDataFull;
import sse.ngts.common.plugin.step.field.ApplID;
import sse.ngts.common.plugin.step.field.ApplSeqNum;
import sse.ngts.ezexpress.app.ClientConnector;
import sse.ngts.ezexpress.app.ExpressConstant;
import sse.ngts.ezexpress.app.codec.FastMessageExpress;
import sse.ngts.ezexpress.app.codec.FastParser;
import sse.ngts.ezexpress.app.filter.BackFlowExpress;
import sse.ngts.ezexpress.app.filter.OldMessageInfo;

public class UDPMulticastClient extends ClientConnector {
	private static Logger log = Logger.getLogger(UDPMulticastClient.class);
	private MulticastSocket receiveMulticast;
	private IoHandler handler;
	private Thread runThread;

	public UDPMulticastClient(IoHandler handler) {
		initConnector(handler);
	}

	/**
	 *  ��ʼ��������
	 * @throws Exception 
	 */
	public synchronized void initConnector(IoHandler handler) {
		runThread = new Thread(new ReceiveDataHandleThread());
		this.handler = handler;
	}

	private void runReceive() throws Exception {
		runThread.start();
	}

	@Override
	public void connect(String host, int port) throws Exception {
		connect(host, port, ExpressConstant.RECEIVE_TIMEOUT);
	}

	/**
	 * ����host��port�½�һ��UDP�ಥ����
	 * @param host ������IP
	 * @param port ���Ӷ˿�
	 * @param timeout δ�յ����ݳ�ʱʱ��/��
	 * @throws Exception 
	 */
	@Override
	public void connect(String host, int port, int timeout) throws Exception {
			InetAddress receiveAddress = InetAddress.getByName(host);
			receiveMulticast = new MulticastSocket(port);
			receiveMulticast.joinGroup(receiveAddress);
			receiveMulticast.setSoTimeout(timeout * 1000);
			receiveMulticast.setReceiveBufferSize(ExpressConstant.RECEIVE_BUFFERSIZE);
			log.debug("��ʱʱ�䣺" + timeout + "��");
			runReceive();
	}

	/**
	 * ע����ǰ����
	 */
	@SuppressWarnings("deprecation")
	public void dispose() {
		if (receiveMulticast != null) {
			receiveMulticast.close();
		}
		if (runThread != null) {
			runThread.stop();
		}
	}

	private BackFlowExpress backFlowObj;
	
	private class ReceiveDataHandleThread implements Runnable {
		@Override
		public void run() {
			while (true) {
				try {
					DatagramPacket dp = new DatagramPacket(new byte[ExpressConstant.MAX_PACKAGESIE],
							ExpressConstant.MAX_PACKAGESIE);
					receiveMulticast.receive(dp);//��������
					byte[] inBytes = dp.getData();
					FastMessageExpress messages = FastParser.parseMarketData(inBytes);//�����ֽ�������
					
					//������
					if (backFlowObj == null) {
						backFlowObj = new BackFlowExpress();
						log.debug("�װ�:����ʹ�÷���������");
						handler.messageReceived(null, messages);
					} else {	//���װ�
						if (checkBackFlow(messages)) {
							handler.messageReceived(null, messages);
						} else {
							log.info("ApplSeqNum : " + messages.getMktDataFull().getApplSeqNum() + " ����,��������");
						}
					}
					
				} catch (SocketTimeoutException ste) {
					log.info("IDLE: �����������ݳ�ʱ");
					try {
						handler.sessionIdle(null, IdleStatus.READER_IDLE);
					} catch (Exception e) {
						log.error("multicast timeout to sessionIdle exception��" + e.getMessage());
					}
				} catch (Exception e) {
					log.error(e.getMessage());
				}
			}
		}
	}
	
	private boolean checkBackFlow(FastMessageExpress message) throws Exception {
		MktDataFull dataFull = message.getMktDataFull();
		String securityType = dataFull.getSecurityType().getValue();

		OldMessageInfo oldMessageInfo = backFlowObj.getOldMessageInfo(securityType);
		boolean isCheckOk = false;
		if (oldMessageInfo == null) {
			oldMessageInfo = backFlowObj.getNewMessageinfo(securityType, dataFull);
			isCheckOk = true;
			/**�װ�:����ʹ�÷���������*/
			log.debug("�װ�:����ʹ�÷���������");
		} else {
			if (oldMessageInfo.getApplID() == dataFull.getInt(ApplID.FIELD)) {
				if (oldMessageInfo.getApplSeqNum() < dataFull.getInt(ApplSeqNum.FIELD)) {
					isCheckOk = true;
					oldMessageInfo.setMessageParam(dataFull);
				}
			} else {
				isCheckOk = true;
				oldMessageInfo.setMessageParam(dataFull);
			}
		}
		return isCheckOk;
	}

}
