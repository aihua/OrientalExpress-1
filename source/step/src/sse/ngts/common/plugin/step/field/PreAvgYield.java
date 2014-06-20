/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
*/

package sse.ngts.common.plugin.step.field;

import java.math.BigDecimal;

import sse.ngts.common.plugin.fieldtype.DecimalField;

public class PreAvgYield extends DecimalField {
	static final long serialVersionUID = 20120901;
	public static final int FIELD = 8543;

	public PreAvgYield() {
		super(FIELD);
	}

	public PreAvgYield(double data) {
		super(FIELD, data);
	}
	public PreAvgYield(BigDecimal data) {
		super(FIELD, data);
	}
}

