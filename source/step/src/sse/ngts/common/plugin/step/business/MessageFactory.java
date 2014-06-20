/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.business;

import sse.ngts.common.plugin.step.Group;
import sse.ngts.common.plugin.step.Message;

public class MessageFactory implements sse.ngts.common.plugin.step.MessageFactory {

	public Message create(String msgType) {
		if (CloseMktDataFull.MSGTYPE.equals(msgType)) {
			return new CloseMktDataFull();
		}
		if (DesignationReport.MSGTYPE.equals(msgType)) {
			return new DesignationReport();
		}
		if (DesignationRequest.MSGTYPE.equals(msgType)) {
			return new DesignationRequest();
		}
		if (ExecutionReport.MSGTYPE.equals(msgType)) {
			return new ExecutionReport();
		}
		if (IOI.MSGTYPE.equals(msgType)) {
			return new IOI();
		}
		if (MktDataFull.MSGTYPE.equals(msgType)) {
			return new MktDataFull();
		}
		if (MktDataPrice.MSGTYPE.equals(msgType)) {
			return new MktDataPrice();
		}
		if (MktDataTrade.MSGTYPE.equals(msgType)) {
			return new MktDataTrade();
		}
		if (NewOrderSingle.MSGTYPE.equals(msgType)) {
			return new NewOrderSingle();
		}
		if (News.MSGTYPE.equals(msgType)) {
			return new News();
		}
		if (OrderCancelReject.MSGTYPE.equals(msgType)) {
			return new OrderCancelReject();
		}
		if (OrderCancelRequest.MSGTYPE.equals(msgType)) {
			return new OrderCancelRequest();
		}
		if (PartyDetailsListReport.MSGTYPE.equals(msgType)) {
			return new PartyDetailsListReport();
		}
		if (PartyDetailsListRequest.MSGTYPE.equals(msgType)) {
			return new PartyDetailsListRequest();
		}
		if (Quote.MSGTYPE.equals(msgType)) {
			return new Quote();
		}
		if (QuoteCancel.MSGTYPE.equals(msgType)) {
			return new QuoteCancel();
		}
		if (QuoteRequest.MSGTYPE.equals(msgType)) {
			return new QuoteRequest();
		}
		if (QuoteResponse.MSGTYPE.equals(msgType)) {
			return new QuoteResponse();
		}
		if (QuoteStatusReport.MSGTYPE.equals(msgType)) {
			return new QuoteStatusReport();
		}
		if (QuoteStatusSend.MSGTYPE.equals(msgType)) {
			return new QuoteStatusSend();
		}
		if (Heartbeat.MSGTYPE.equals(msgType)) {
			return new Heartbeat();
		}
		if (TCPLogin.MSGTYPE.equals(msgType)) {
			return new TCPLogin();
		}
		if (TCPLogout.MSGTYPE.equals(msgType)) {
			return new TCPLogout();
		}
		if (MarketDataRequest.MSGTYPE.equals(msgType)) {
			return new MarketDataRequest();
		}
		if (MarketStatus.MSGTYPE.equals(msgType)) {
			return new MarketStatus();
		}
		return new Message();
	}

	public Group create(String msgType, int correspondingFieldID) {
		return null;
	}
}
