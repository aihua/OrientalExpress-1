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

public class HeartBtInt extends IntField {
	static final long serialVersionUID = 20130617;
	public static final int FIELD = 108;

	public HeartBtInt() {
		super(FIELD);
	}

	public HeartBtInt(int data) {
		super(FIELD, data);
	}
}

