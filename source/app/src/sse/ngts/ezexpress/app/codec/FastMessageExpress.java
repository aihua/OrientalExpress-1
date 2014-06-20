/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.ezexpress.app.codec;

import java.io.Serializable;
import java.util.List;

import sse.ngts.common.plugin.step.business.MktDataBody;
import sse.ngts.common.plugin.step.business.MktDataFull;

/**
 * 收到消息后解析成的数据结构类
 * @since 2014-06
 * @author kzhao
 */
public class FastMessageExpress implements Serializable {
	private static final long serialVersionUID = 1L;

	//Step头信息
	private MktDataFull mktDataFull;

	//Fast体
	private List<MktDataBody> mktDataBody;

	public FastMessageExpress() {

	}

	public FastMessageExpress(MktDataFull mktDataFull, List<MktDataBody> mktDataBody) {
		this.mktDataFull = mktDataFull;
		this.mktDataBody = mktDataBody;
	}

	public MktDataFull getMktDataFull() {
		return mktDataFull;
	}

	public void setMktDataFull(MktDataFull mktDataFull) {
		this.mktDataFull = mktDataFull;
	}

	public List<MktDataBody> getmktDataBody() {
		return mktDataBody;
	}

	public void setmktDataBody(List<MktDataBody> mktDataBody) {
		this.mktDataBody = mktDataBody;
	}

	@Override
	public String toString() {
		if (mktDataFull != null && mktDataBody != null) {
			return mktDataFull.toString() + mktDataBody.toString();
		}
		return "";
	}
	
}
