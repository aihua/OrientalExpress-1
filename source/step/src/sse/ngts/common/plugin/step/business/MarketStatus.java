/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
*/

package sse.ngts.common.plugin.step.business;

import sse.ngts.common.plugin.step.FieldNotFound;
import sse.ngts.common.plugin.step.field.MessageEncoding;
import sse.ngts.common.plugin.step.field.MsgSeqNum;
import sse.ngts.common.plugin.step.field.MsgType;
import sse.ngts.common.plugin.step.field.SecurityType;
import sse.ngts.common.plugin.step.field.SenderCompID;
import sse.ngts.common.plugin.step.field.SendingTime;
import sse.ngts.common.plugin.step.field.TargetCompID;
import sse.ngts.common.plugin.step.field.TotNoRelatedSym;
import sse.ngts.common.plugin.step.field.TradSesMode;
import sse.ngts.common.plugin.step.field.TradSesStatus;

public class MarketStatus extends Message {
	private static final long serialVersionUID = -3545556332993174766L;
	public static final String MSGTYPE = "h";

	public MarketStatus() {
		super();
		getHeader().setField(new MsgType(MSGTYPE));
	}

	public MarketStatus(int[] fieldOrder) {
		super(fieldOrder);
		getHeader().setField(new MsgType(MSGTYPE));
	}

	public void set(SenderCompID value) {
		setField(value);
	}

	public SenderCompID get(SenderCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public SenderCompID getSenderCompID() throws FieldNotFound {
		SenderCompID value = new SenderCompID();
		getField(value);
		return value;
	}

	public boolean isSet(SenderCompID field) {
		return isSetField(field);
	}

	public boolean isSetSenderCompID() {
		return isSetField(SenderCompID.FIELD);
	}

	public void set(TargetCompID value) {
		setField(value);
	}

	public TargetCompID get(TargetCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public TargetCompID getTargetCompID() throws FieldNotFound {
		TargetCompID value = new TargetCompID();
		getField(value);
		return value;
	}

	public boolean isSet(TargetCompID field) {
		return isSetField(field);
	}

	public boolean isSetTargetCompID() {
		return isSetField(TargetCompID.FIELD);
	}

	public void set(SendingTime value) {
		setField(value);
	}

	public SendingTime get(SendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public SendingTime getSendingTime() throws FieldNotFound {
		SendingTime value = new SendingTime();
		getField(value);
		return value;
	}

	public boolean isSet(SendingTime field) {
		return isSetField(field);
	}

	public boolean isSetSendingTime() {
		return isSetField(SendingTime.FIELD);
	}

	public void set(MsgSeqNum value) {
		setField(value);
	}

	public MsgSeqNum get(MsgSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public MsgSeqNum getMsgSeqNum() throws FieldNotFound {
		MsgSeqNum value = new MsgSeqNum();
		getField(value);
		return value;
	}

	public boolean isSet(MsgSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetMsgSeqNum() {
		return isSetField(MsgSeqNum.FIELD);
	}

	public void set(MessageEncoding value) {
		setField(value);
	}

	public MessageEncoding get(MessageEncoding value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public MessageEncoding getMessageEncoding() throws FieldNotFound {
		MessageEncoding value = new MessageEncoding();
		getField(value);
		return value;
	}

	public boolean isSet(MessageEncoding field) {
		return isSetField(field);
	}

	public boolean isSetMessageEncoding() {
		return isSetField(MessageEncoding.FIELD);
	}

	public void set(SecurityType value) {
		setField(value);
	}

	public SecurityType get(SecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public SecurityType getSecurityType() throws FieldNotFound {
		SecurityType value = new SecurityType();
		getField(value);
		return value;
	}

	public boolean isSet(SecurityType field) {
		return isSetField(field);
	}

	public boolean isSetSecurityType() {
		return isSetField(SecurityType.FIELD);
	}

	public void set(TradSesMode value) {
		setField(value);
	}

	public TradSesMode get(TradSesMode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public TradSesMode getTradSesMode() throws FieldNotFound {
		TradSesMode value = new TradSesMode();
		getField(value);
		return value;
	}

	public boolean isSet(TradSesMode field) {
		return isSetField(field);
	}

	public boolean isSetTradSesMode() {
		return isSetField(TradSesMode.FIELD);
	}

	public void set(TradSesStatus value) {
		setField(value);
	}

	public TradSesStatus get(TradSesStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public TradSesStatus getTradSesStatus() throws FieldNotFound {
		TradSesStatus value = new TradSesStatus();
		getField(value);
		return value;
	}

	public boolean isSet(TradSesStatus field) {
		return isSetField(field);
	}

	public boolean isSetTradSesStatus() {
		return isSetField(TradSesStatus.FIELD);
	}

	public void set(TotNoRelatedSym value) {
		setField(value);
	}

	public TotNoRelatedSym get(TotNoRelatedSym value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public TotNoRelatedSym getTotNoRelatedSym() throws FieldNotFound {
		TotNoRelatedSym value = new TotNoRelatedSym();
		getField(value);
		return value;
	}

	public boolean isSet(TotNoRelatedSym field) {
		return isSetField(field);
	}

	public boolean isSetTotNoRelatedSym() {
		return isSetField(TotNoRelatedSym.FIELD);
	}
}

