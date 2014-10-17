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
public class Price extends DecimalField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 44;

	public Price() {
		super(44);
	}
	public Price(double data) {
		super(44, data);
	}
	public Price(BigDecimal data) {
		super(44, data);
	}
}
