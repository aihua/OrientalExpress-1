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

public class UnderlyingDirtyPrice extends DecimalField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 882;

	public UnderlyingDirtyPrice() {
		super(882);
	}

	public UnderlyingDirtyPrice(double data) {
		super(882, data);
	}
	
	public UnderlyingDirtyPrice(BigDecimal data) {
		super(882, data);
	}
}
