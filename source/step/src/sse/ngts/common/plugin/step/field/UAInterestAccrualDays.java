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

public class UAInterestAccrualDays extends IntField {
	static final long serialVersionUID = 20120617;
	public static final int FIELD = 8847;

	public UAInterestAccrualDays() {
		super(FIELD);
	}

	public UAInterestAccrualDays(int data) {
		super(FIELD, data);
	}
}
