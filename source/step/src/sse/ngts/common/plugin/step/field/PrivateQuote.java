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

public class PrivateQuote extends IntField {
	static final long serialVersionUID = 20120617;
	public static final int FIELD = 1171;

	public static final int PUBLIC = 0;
	public static final int PRIVATE = 1;

	public PrivateQuote() {
		super(FIELD);
	}

	public PrivateQuote(int data) {
		super(FIELD, data);
	}
}
