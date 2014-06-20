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

public class QuoteCancelType extends IntField {
	static final long serialVersionUID = 20120617;
	public static final int FIELD = 298;

	public QuoteCancelType() {
		super(FIELD);
	}

	public QuoteCancelType(int data) {
		super(FIELD, data);
	}
}
