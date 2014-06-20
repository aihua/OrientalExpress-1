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

public class PreClosePx extends DecimalField{
	static final long serialVersionUID = 20120817;
	public static final int FIELD = 140;

	public PreClosePx() {
		super(FIELD);
	}

	public PreClosePx(double data) {
		super(FIELD, data);
	}
	
	public PreClosePx(BigDecimal data) {
		super(FIELD, data);
	}
}

