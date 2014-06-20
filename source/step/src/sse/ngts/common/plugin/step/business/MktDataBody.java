/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.business;

import java.math.BigDecimal;

import org.openfast.FastMessage;
/**
 * 收到消息后解析成的fast行情信息的封装
 * @since 2014-06
 * @author kzhao
 */
public class MktDataBody {

	private FastMessage message;
	
	public MktDataBody(FastMessage message) {
		this.message = message;
	}
	
	public FastMessage getMessage() {
		return message;
	}

	public void setMessage(FastMessage message) {
		this.message = message;
	}

	public String getApplID() {
		return message.getString(FastMsgField.ApplID.getName());
	}
	
	public String getApplSeqNum() {
		return message.getString(FastMsgField.ApplSeqNum.getName());
	}
	
	public String getSymbol() {
		return message.getString(FastMsgField.Symbol.getName());
	}
	
	public String getTradeDate() {
		return message.getString(FastMsgField.TradeDate.getName());
	}
	
	public String getSendingTime() {
		return message.getString(FastMsgField.SendingTime.getName());
	}
	
	public String getCFICode() {
		return message.getString(FastMsgField.CFICode.getName());
	}
	
	public BigDecimal getPrevClosePx() {
		return message.getBigDecimal(FastMsgField.PrevClosePx.getName());
	}
	
	public BigDecimal getPrevSetPx() {
		return message.getBigDecimal(FastMsgField.PrevSetPx.getName());
	}
	
	public int getNumTrades() {
		return message.getInt(FastMsgField.NumTrades.getName());
	}

	public BigDecimal getTotalValueTraded() {
		return message.getBigDecimal(FastMsgField.TotalValueTraded.getName());
	}
	
	public long getTradeVolume() {
		return message.getLong(FastMsgField.TradeVolume.getName());
	}
	
	public String getMDFullGrp() {
		return message.getString(FastMsgField.MDFullGrp.getName());
	}
	
	public char getMDEntryType() {
		return message.getString(FastMsgField.MDEntryType.getName()).toCharArray()[0];
	}
	
	public BigDecimal getMDEntryPx() {
		return message.getBigDecimal(FastMsgField.MDEntryPx.getName());
	}
	
	public long getMDEntrySize() {
		return message.getLong(FastMsgField.MDEntrySize.getName());
	}
	
	public String getMDEntryTime() {
		return message.getString(FastMsgField.MDEntryTime.getName());
	}
	
	public int getMDEntryPositionNo() {
		return message.getInt(FastMsgField.MDEntryPositionNo.getName());
	}
	
	public String getTradingPhaseCode() {
		return message.getString(FastMsgField.TradingPhaseCode.getName());
	}
	
	public String getSecurityID() {
		return message.getString(FastMsgField.SecurityID.getName());
	}
	
	public String getRefreshIndicator() {
		return message.getString(FastMsgField.RefreshIndicator.getName());
	}
	
	public long getTotalLongPosition() {
		return message.getLong(FastMsgField.TotalLongPosition.getName());
	}
	
}
