package sse.ngts.ezexpress.app.filter;

import java.util.HashMap;
import java.util.Map;

import org.apache.mina.core.session.IoSession;

import sse.ngts.common.plugin.step.business.MktDataFull;
import sse.ngts.ezexpress.app.ExpressConstant;

public class BackFlowExpress {

	Map<String, OldMessageInfo> securityTypeMap = new HashMap<String, OldMessageInfo>();

	public BackFlowExpress() {

	}

	public static synchronized BackFlowExpress getBackFlowExpressBySession(IoSession session) {
		BackFlowExpress backFlowObj = (BackFlowExpress) session.getAttribute(ExpressConstant.SESSION_BACKFLOW);
		if (backFlowObj == null) {
			backFlowObj = new BackFlowExpress();
			session.setAttribute(ExpressConstant.SESSION_BACKFLOW, backFlowObj);
		}
		return backFlowObj;
	}

	public OldMessageInfo getOldMessageInfo(String securityType) {
		return securityTypeMap.get(securityType);
	}

	public synchronized OldMessageInfo getNewMessageinfo(String securityType, MktDataFull dataFull) throws Exception {
		OldMessageInfo newInfo = new OldMessageInfo(dataFull);
		securityTypeMap.put(securityType, newInfo);
		return newInfo;
	}

}
