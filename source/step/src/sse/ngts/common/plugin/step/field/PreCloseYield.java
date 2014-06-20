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
public class PreCloseYield extends DecimalField {
	
	static final long serialVersionUID = 20120617;
	public static final int FIELD = 8541;

	public PreCloseYield() {
		super(FIELD);
	}

	public PreCloseYield(double data) {
		super(FIELD, data);
	}
	
	public PreCloseYield(BigDecimal data) {
		super(FIELD, data);
	}
}
