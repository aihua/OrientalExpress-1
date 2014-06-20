package sse.ngts.ezexpress.app.filter;

import org.apache.log4j.Logger;
import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.session.IoSession;

import sse.ngts.common.plugin.step.business.MktDataFull;
import sse.ngts.common.plugin.step.field.ApplID;
import sse.ngts.common.plugin.step.field.ApplSeqNum;
import sse.ngts.ezexpress.app.codec.FastMessageExpress;

public class BackFlowFilter extends IoFilterAdapter {
	private static Logger log = Logger.getLogger(BackFlowFilter.class);

	@Override
	public void messageReceived(NextFilter nextFilter, IoSession session, Object message) throws Exception {
		if (message instanceof FastMessageExpress) {
			FastMessageExpress sepMessage = (FastMessageExpress) message;
			if (checkBackFlow(sepMessage, session)) {
				nextFilter.messageReceived(session, message);
			} else {
				log.info("ApplSeqNum : " + sepMessage.getMktDataFull().getApplSeqNum() + " 回流,丢弃处理");
			}
		} else {
			nextFilter.messageReceived(session, message);
		}
	}

	private boolean checkBackFlow(FastMessageExpress message, IoSession session) throws Exception {
		MktDataFull dataFull = message.getMktDataFull();
		String securityType = dataFull.getSecurityType().getValue();
		BackFlowExpress backFlowObj = BackFlowExpress.getBackFlowExpressBySession(session);

		OldMessageInfo oldMessageInfo = backFlowObj.getOldMessageInfo(securityType);
		boolean isCheckOk = false;
		if (oldMessageInfo == null) {
			oldMessageInfo = backFlowObj.getNewMessageinfo(securityType, dataFull);
			isCheckOk = true;
			/**首包:不需使用防回流机制*/
			log.debug("首包:不需使用防回流机制");
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
