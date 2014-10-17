/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
*/

package sse.ngts.common.plugin.step.business;

import sse.ngts.common.plugin.step.FieldNotFound;
import sse.ngts.common.plugin.step.MessageEx;
import sse.ngts.common.plugin.step.field.MessageEncoding;
import sse.ngts.common.plugin.step.field.MsgSeqNum;
import sse.ngts.common.plugin.step.field.MsgType;
import sse.ngts.common.plugin.step.field.SenderCompID;
import sse.ngts.common.plugin.step.field.SendingTime;
import sse.ngts.common.plugin.step.field.TargetCompID;
import sse.ngts.common.plugin.step.field.TestReqID;

public class Heartbeat extends MessageEx {
	private static final long serialVersionUID = 2446721918921254876L;
	public static final String MSGTYPE = "0";

	public Heartbeat() {
		super();
		setMsgType(new MsgType(MSGTYPE), 1);
		getHeader().setField(new MsgType(MSGTYPE));
	}

	public Heartbeat(int[] fieldOrder, long sendMsgSeqNum) {
		super(fieldOrder);
		setMsgType(new MsgType(MSGTYPE), sendMsgSeqNum);
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
	
	public void set(TestReqID value) {
		setField(value);
	}
	
	public TestReqID get(TestReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}
	
	public TestReqID getTestReqID() throws FieldNotFound {
		TestReqID value = new TestReqID();
		getField(value);
		return value;
	}
	
	public boolean isSet(TestReqID field) {
		return isSetField(field);
	}
	
	public boolean isSetTestReqID() {
		return isSetField(TestReqID.FIELD);
	}
}
