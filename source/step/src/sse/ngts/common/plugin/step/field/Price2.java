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
public class Price2 extends DecimalField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 640;

	public Price2() {
		super(640);
	}

	public Price2(double data) {
		super(640, data);
	}
	
	public Price2(BigDecimal data) {
		super(640, data);
	}
}
