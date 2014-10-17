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

public class ApplSeqNum extends IntField {
	static final long serialVersionUID = 2005061733;
	public static final int FIELD = 1181;

	public ApplSeqNum() {
		super(FIELD);
	}

	public ApplSeqNum(int data) {
		super(FIELD, data);
	}
}

