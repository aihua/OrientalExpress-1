/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.IntField;

public class NextExpectedMsgSeqNum extends IntField {
	static final long serialVersionUID = 20140801;
	public static final int FIELD = 789;

	public NextExpectedMsgSeqNum() {
		super(FIELD);
	}

	public NextExpectedMsgSeqNum(int data) {
		super(FIELD, data);
	}
}
