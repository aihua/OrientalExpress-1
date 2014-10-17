/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.DoubleField;

public class SettlCurrAmt extends DoubleField {
	static final long serialVersionUID = 20120617;
	public static final int FIELD = 119;

	public SettlCurrAmt() {
		super(FIELD);
	}

	public SettlCurrAmt(double data) {
		super(FIELD, data);
	}
}
