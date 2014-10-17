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
public class AccruedInterestAmt extends DecimalField {
	static final long serialVersionUID = 20120617;
	public static final int FIELD = 159;

	public AccruedInterestAmt() {
		super(FIELD);
	}

	public AccruedInterestAmt(double data) {
		super(FIELD, data);
	}
	
	public AccruedInterestAmt(BigDecimal data) {
		super(FIELD, data);
	}
}
