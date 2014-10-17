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
public class TotalValueTraded extends DecimalField {
	static final long serialVersionUID = 20120617;
	public static final int FIELD = 8504;

	public TotalValueTraded() {
		super(FIELD);
	}

	public TotalValueTraded(double data) {
		super(FIELD, data);
	}
	
	public TotalValueTraded(BigDecimal data) {
		super(FIELD, data);
	}
}
