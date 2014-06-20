/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.ezexpress.app.filter;

import sse.ngts.common.plugin.step.business.MktDataFull;
import sse.ngts.common.plugin.step.field.ApplID;
import sse.ngts.common.plugin.step.field.ApplSeqNum;
import sse.ngts.common.plugin.step.field.MDCount;
import sse.ngts.common.plugin.step.field.MDUpdateType;
import sse.ngts.common.plugin.step.field.RawDataLength;
import sse.ngts.common.plugin.step.field.TradSesMode;

/**
 * 防回流中存上一次收到的行情信息
 * @author kzhao
 */
public class OldMessageInfo {
	private int tradSesMode;
	private int applID;
	private int applSeqNum;
	private String mDUpdateType;
	private int mDCount;
	private int rawDataLength;

	private String checkSum;

	public OldMessageInfo() {

	}

	public OldMessageInfo(MktDataFull dataFull) throws Exception {
		setMessageParam(dataFull);
	}

	public void setMessageParam(MktDataFull dataFull) throws Exception {
		tradSesMode = dataFull.getInt(TradSesMode.FIELD);
		applID = dataFull.getInt(ApplID.FIELD);
		applSeqNum = dataFull.getInt(ApplSeqNum.FIELD);
		mDUpdateType = dataFull.getString(MDUpdateType.FIELD);
		mDCount = dataFull.getInt(MDCount.FIELD);
		rawDataLength = dataFull.getInt(RawDataLength.FIELD);
	}

	public int getTradSesMode() {
		return tradSesMode;
	}

	public void setTradSesMode(int tradSesMode) {
		this.tradSesMode = tradSesMode;
	}

	public int getApplID() {
		return applID;
	}

	public void setApplID(int applID) {
		this.applID = applID;
	}

	public int getApplSeqNum() {
		return applSeqNum;
	}

	public void setApplSeqNum(int applSeqNum) {
		this.applSeqNum = applSeqNum;
	}

	public String getmDUpdateType() {
		return mDUpdateType;
	}

	public void setmDUpdateType(String mDUpdateType) {
		this.mDUpdateType = mDUpdateType;
	}

	public int getmDCount() {
		return mDCount;
	}

	public void setmDCount(int mDCount) {
		this.mDCount = mDCount;
	}

	public int getRawDataLength() {
		return rawDataLength;
	}

	public void setRawDataLength(int rawDataLength) {
		this.rawDataLength = rawDataLength;
	}

	public String getCheckSum() {
		return checkSum;
	}

	public void setCheckSum(String checkSum) {
		this.checkSum = checkSum;
	}

}
