/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
*/

package sse.ngts.common.plugin.step.field;

import java.math.BigDecimal;

import sse.ngts.common.plugin.fieldtype.DecimalField;

public class AvgYield extends DecimalField {
	static final long serialVersionUID = 20120901;
	public static final int FIELD = 8544;

	public AvgYield() {
		super(FIELD);
	}

	public AvgYield(double data) {
		super(FIELD, data);
	}
	public AvgYield(BigDecimal data) {
		super(FIELD, data);
	}
}
