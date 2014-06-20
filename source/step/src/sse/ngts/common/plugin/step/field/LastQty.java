/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.DoubleField;

public class LastQty extends DoubleField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 32;

	public LastQty() {
		super(32);
	}

	public LastQty(double data) {
		super(32, data);
	}
}
