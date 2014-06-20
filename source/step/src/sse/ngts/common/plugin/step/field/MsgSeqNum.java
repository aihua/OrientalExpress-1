/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.IntField;

public class MsgSeqNum extends IntField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 34;

	public MsgSeqNum() {
		super(34);
	}

	public MsgSeqNum(int data) {
		super(34, data);
	}
}
