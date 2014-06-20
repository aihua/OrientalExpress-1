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

public class AvgPx extends DecimalField {
	static final long serialVersionUID = 20120901;
	public static final int FIELD = 6;

	public AvgPx() {
		super(FIELD);
	}

	public AvgPx(double data) {
		super(FIELD, data);
	}
	public AvgPx(BigDecimal data) {
		super(FIELD, data);
	}
}
