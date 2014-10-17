/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
*/

package sse.ngts.common.plugin.step;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

import sse.ngts.common.plugin.step.field.BeginString;
import sse.ngts.common.plugin.step.field.BodyLength;
import sse.ngts.common.plugin.step.field.CheckSum;
import sse.ngts.common.plugin.step.field.MessageEncoding;
import sse.ngts.common.plugin.step.field.MsgSeqNum;
import sse.ngts.common.plugin.step.field.MsgType;
import sse.ngts.common.plugin.step.field.PossDupFlag;
import sse.ngts.common.plugin.step.field.SenderCompID;
import sse.ngts.common.plugin.step.field.SendingTime;
import sse.ngts.common.plugin.step.field.TargetCompID;

public class MessageEx extends Message {
	private static final long serialVersionUID = 5820958609658175416L;
	private final String beginString = "FIXT.1.1";
	private final String senderCompID = "EzExpress";
	private final String targetCompID = "EzEI";
	private final String messageEncoding = "GBK";
	protected Header header = new Header();
	protected Trailer trailer = new Trailer();
	private static DecimalFormat checksumFormat = new DecimalFormat("000");

	public MessageEx() {
	}

	protected MessageEx(int[] fieldOrder) {
		super(fieldOrder);
	}

	public void setMsgType(MsgType msgType, long sendMsgSeqNum) {
		setHeader(msgType, sendMsgSeqNum);
	}

	private void setHeader(MsgType msgType, long sendMsgSeqNum) {
		header.setField(msgType);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HH:mm:ss.SSS");
		String sendTime = sdf.format(new java.util.Date());
		sendTime = sendTime.substring(0, 21);
		header.setField(new BeginString(beginString));
		header.setField(new SenderCompID(senderCompID));
		header.setField(new TargetCompID(targetCompID));
		header.setField(new MsgSeqNum(sendMsgSeqNum));
		header.setField(new SendingTime(sendTime));
		header.setField(new MessageEncoding(messageEncoding));
	}

	@Override
	public String toString() {

		header.setField(new BodyLength(bodyLength()));
		trailer.setField(new CheckSum(checkSum()));

		final StringBuffer sb = new StringBuffer();
		header.calculateString(sb, null, null);
		calculateString(sb, null, null);
		trailer.calculateString(sb, null, null);

		return sb.toString();
	}

	@Override
	public int bodyLength() {
		return header.calculateLength() + calculateLength() + trailer.calculateLength();
	}

	@Override
	public String checkSum() {
		return checksumFormat.format((header.calculateTotal() + calculateTotal() + trailer.calculateTotal()) % 256);
	}
	
	public static class Header extends FieldMap {
		static final long serialVersionUID = -3193357271891865972L;
		private static final int[] EXCLUDED_HEADER_FIELDS = { BeginString.FIELD, BodyLength.FIELD, MsgType.FIELD,
				SenderCompID.FIELD, TargetCompID.FIELD, MsgSeqNum.FIELD, SendingTime.FIELD, MessageEncoding.FIELD,
				PossDupFlag.FIELD, PossDupFlag.FIELD};

		@Override
		protected void calculateString(StringBuffer buffer, int[] excludedFields, int[] postFields) {
			super.calculateString(buffer, EXCLUDED_HEADER_FIELDS, postFields);
		}

	}

	public static class Trailer extends FieldMap {
		static final long serialVersionUID = -3193357271891865972L;

		public Trailer() {
			super(null);
		}

		@Override
		protected void calculateString(StringBuffer buffer, int[] excludedFields, int[] postFields) {
			super.calculateString(buffer, null, new int[] { CheckSum.FIELD });
		}
	}
}
