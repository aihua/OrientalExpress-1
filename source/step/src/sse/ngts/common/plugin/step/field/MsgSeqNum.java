/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.LongField;

public class MsgSeqNum extends LongField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 34;

	public MsgSeqNum() {
		super(34);
	}

	public MsgSeqNum(long data) {
		super(34, data);
	}
}
