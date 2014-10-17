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

public class Yield extends DecimalField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 236;

	public Yield() {
		super(236);
	}

	public Yield(double data) {
		super(236, data);
	}
	
	public Yield(BigDecimal data) {
		super(236, data);
	}
}
