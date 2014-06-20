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

public class LastPx extends DecimalField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 31;

	public LastPx() {
		super(31);
	}

	public LastPx(double data) {
		super(31, data);
	}
	
	public LastPx(BigDecimal data) {
		super(31, data);
	}
	
	
}
