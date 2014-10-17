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
import sse.ngts.common.plugin.step.field.DefaultApplExtID;
import sse.ngts.common.plugin.step.field.DefaultApplVerID;
import sse.ngts.common.plugin.step.field.DefaultCstmApplVerID;
import sse.ngts.common.plugin.step.field.EncryptMethod;
import sse.ngts.common.plugin.step.field.HeartBtInt;
import sse.ngts.common.plugin.step.field.MessageEncoding;
import sse.ngts.common.plugin.step.field.MsgSeqNum;
import sse.ngts.common.plugin.step.field.MsgType;
import sse.ngts.common.plugin.step.field.NextExpectedMsgSeqNum;
import sse.ngts.common.plugin.step.field.Password;
import sse.ngts.common.plugin.step.field.ResetSeqNumFlag;
import sse.ngts.common.plugin.step.field.SenderCompID;
import sse.ngts.common.plugin.step.field.SendingTime;
import sse.ngts.common.plugin.step.field.TargetCompID;
import sse.ngts.common.plugin.step.field.UserName;

public class TCPLogin extends MessageEx {

	private static final long serialVersionUID = 6126341111805458449L;
	public static final String MSGTYPE = "A";

	public TCPLogin() {
		super();
		setMsgType(new MsgType(MSGTYPE), 1);
		getHeader().setField(new MsgType(MSGTYPE));
	}

	public TCPLogin(int[] fieldOrder, long sendMsgSeqNum) {
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

	public void set(EncryptMethod value) {
		setField(value);
	}

	public EncryptMethod get(EncryptMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public EncryptMethod getEncryptMethod() throws FieldNotFound {
		EncryptMethod value = new EncryptMethod();
		getField(value);
		return value;
	}

	public boolean isSet(EncryptMethod field) {
		return isSetField(field);
	}

	public boolean isSetEncryptMethod() {
		return isSetField(EncryptMethod.FIELD);
	}

	public void set(HeartBtInt value) {
		setField(value);
	}

	public HeartBtInt get(HeartBtInt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public HeartBtInt getHeartBtInt() throws FieldNotFound {
		HeartBtInt value = new HeartBtInt();
		getField(value);
		return value;
	}

	public boolean isSet(HeartBtInt field) {
		return isSetField(field);
	}

	public boolean isSetHeartBtInt() {
		return isSetField(HeartBtInt.FIELD);
	}

	public void set(UserName value) {
		setField(value);
	}

	public UserName get(UserName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public UserName getUserName() throws FieldNotFound {
		UserName value = new UserName();
		getField(value);
		return value;
	}

	public boolean isSet(UserName field) {
		return isSetField(field);
	}

	public boolean isSetUserName() {
		return isSetField(UserName.FIELD);
	}

	public void set(Password value) {
		setField(value);
	}

	public Password get(Password value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public Password getPassword() throws FieldNotFound {
		Password value = new Password();
		getField(value);
		return value;
	}

	public boolean isSet(Password field) {
		return isSetField(field);
	}

	public boolean isSetPassword() {
		return isSetField(Password.FIELD);
	}

	public void set(ResetSeqNumFlag value) {
		setField(value);
	}
	
	public ResetSeqNumFlag get(ResetSeqNumFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}
	
	public ResetSeqNumFlag getResetSeqNumFlag() throws FieldNotFound {
		ResetSeqNumFlag value = new ResetSeqNumFlag();
		getField(value);
		return value;
	}
	
	public boolean isSet(ResetSeqNumFlag field) {
		return isSetField(field);
	}
	
	public boolean isSetResetSeqNumFlag() {
		return isSetField(ResetSeqNumFlag.FIELD);
	}

	public void set(NextExpectedMsgSeqNum value) {
		setField(value);
	}
	
	public NextExpectedMsgSeqNum get(NextExpectedMsgSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}
	
	public NextExpectedMsgSeqNum getNextExpectedMsgSeqNum() throws FieldNotFound {
		NextExpectedMsgSeqNum value = new NextExpectedMsgSeqNum();
		getField(value);
		return value;
	}
	
	public boolean isSet(NextExpectedMsgSeqNum field) {
		return isSetField(field);
	}
	
	public boolean isSetNextExpectedMsgSeqNum() {
		return isSetField(NextExpectedMsgSeqNum.FIELD);
	}

	public void set(DefaultApplVerID value) {
		setField(value);
	}
	
	public DefaultApplVerID get(DefaultApplVerID value) throws FieldNotFound {
		getField(value);
		return value;
	}
	
	public DefaultApplVerID getDefaultApplVerID() throws FieldNotFound {
		DefaultApplVerID value = new DefaultApplVerID();
		getField(value);
		return value;
	}
	
	public boolean isSet(DefaultApplVerID field) {
		return isSetField(field);
	}
	
	public boolean isSetDefaultApplVerID() {
		return isSetField(DefaultApplVerID.FIELD);
	}

	public void set(DefaultApplExtID value) {
		setField(value);
	}
	
	public DefaultApplExtID get(DefaultApplExtID value) throws FieldNotFound {
		getField(value);
		return value;
	}
	
	public DefaultApplExtID getDefaultApplExtID() throws FieldNotFound {
		DefaultApplExtID value = new DefaultApplExtID();
		getField(value);
		return value;
	}
	
	public boolean isSet(DefaultApplExtID field) {
		return isSetField(field);
	}
	
	public boolean isSetDefaultApplExtID() {
		return isSetField(DefaultApplExtID.FIELD);
	}

	public void set(DefaultCstmApplVerID value) {
		setField(value);
	}
	
	public DefaultCstmApplVerID get(DefaultCstmApplVerID value) throws FieldNotFound {
		getField(value);
		return value;
	}
	
	public DefaultCstmApplVerID getDefaultCstmApplVerID() throws FieldNotFound {
		DefaultCstmApplVerID value = new DefaultCstmApplVerID();
		getField(value);
		return value;
	}
	
	public boolean isSet(DefaultCstmApplVerID field) {
		return isSetField(field);
	}
	
	public boolean isSetDefaultCstmApplVerID() {
		return isSetField(DefaultCstmApplVerID.FIELD);
	}
}
