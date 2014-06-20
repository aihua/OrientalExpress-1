package sse.ngts.ezexpress.demo.handle;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

import sse.ngts.common.plugin.step.business.MktDataBody;
import sse.ngts.ezexpress.app.codec.FastMessageExpress;

/**
 * �Լ�ʵ�ֵ�ҵ������
 * @since 2014-06
 * @author kzhao
 */
public class ExpressHandler extends IoHandlerAdapter {
	private static Logger log = Logger.getLogger(ExpressHandler.class);

	@Override
	public void sessionCreated(IoSession session) throws Exception {
		log.info("�ͻ������������������...");
	}

	@Override
	public void sessionOpened(IoSession session) throws Exception {
		log.info("�ͻ������������Ӵ�...");
	}

	/**
	 * �յ�һ��������step�������ݽ������ͨ���˷�������ҵ����
	 * @param session �������ͨ��Э��Ϊ�ಥ��Ϊnull
	 * @param message �������ݵķ�װ����@sse.ngts.ezexpress.app.codec.FastMessageExpress
	 */
	@Override
	public void messageReceived(IoSession session, Object message) throws Exception {
		if (message instanceof FastMessageExpress) {
			FastMessageExpress fme = (FastMessageExpress)message;
			log.debug("�յ������֤ȯ���ͣ�" + fme.getMktDataFull().getSecurityType().getValue());
			List<MktDataBody> mktDatas = fme.getmktDataBody();
			for (MktDataBody mktDataBody : mktDatas) {
				log.debug("�յ������֤ȯ���룺" + mktDataBody.getSecurityID());
			}
		}
	}

	@Override
	public void messageSent(IoSession session, Object message) throws Exception {
		log.debug("�ͻ��˷�����Ϣ�ɹ�...");
	}

	@Override
	public void sessionClosed(IoSession session) throws Exception {
		log.info("ע��Session(" + session.getConfig().toString() + ")�ɹ�");
	}

	/**
	 * Ĭ��40����������������ô˷������Դ�ʵ�ֽ����������ݳ�ʱ
	 * ����@see sse.ngts.ezexpress.app.ExpressApi ��connectClientConnector������timeout��������
	 * @param session �������ͨ��Э��Ϊ�ಥ��Ϊnull
	 * @param status Ĭ�϶���ʱ
	 */
	@Override
	public void sessionIdle(IoSession session, IdleStatus status) throws Exception {
		log.info("�ͻ��˽������״̬...");
	}

	@Override
	public void exceptionCaught(IoSession session, Throwable cause) throws Exception {
		log.error("�ͻ��˷����쳣...", cause);
	}
	
}
