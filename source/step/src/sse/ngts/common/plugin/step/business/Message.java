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
import sse.ngts.common.plugin.step.field.*;


public class Message extends sse.ngts.common.plugin.step.Message {
	static final long serialVersionUID = 20120617;

	public Message() {
		this(null);
	}

	protected Message(int[] fieldOrder) {
		super(fieldOrder);
		header = new Header(this);
		trailer = new Trailer();
	}

	public static class Header extends sse.ngts.common.plugin.step.Message.Header {
		static final long serialVersionUID = 20120617;

		public Header(Message msg) {
			// JNI compatibility
		}

		public void set(BodyLength value) {
			setField(value);
		}

		public BodyLength get(BodyLength value) throws FieldNotFound {
			getField(value);

			return value;
		}

		public BodyLength getBodyLength() throws FieldNotFound {
			BodyLength value = new BodyLength();
			getField(value);

			return value;
		}

		public boolean isSet(BodyLength field) {
			return isSetField(field);
		}

		public boolean isSetBodyLength() {
			return isSetField(9);
		}

		public void set(MsgType value) {
			setField(value);
		}

		public MsgType get(MsgType value) throws FieldNotFound {
			getField(value);

			return value;
		}

		public MsgType getMsgType() throws FieldNotFound {
			MsgType value = new MsgType();
			getField(value);

			return value;
		}

		public boolean isSet(MsgType field) {
			return isSetField(field);
		}

		public boolean isSetMsgType() {
			return isSetField(35);
		}

	}

}
