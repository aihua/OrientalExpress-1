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

public class PreTradeAnonymity extends IntField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 1091;

	public static final int UNANONYMITY = 0;
	public static final int ANONYMITY = 1;

	public PreTradeAnonymity() {
		super(FIELD);
	}

	public PreTradeAnonymity(int data) {
		super(FIELD, data);
	}
}
