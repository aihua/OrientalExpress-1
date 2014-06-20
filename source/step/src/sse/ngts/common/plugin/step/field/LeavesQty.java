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

public class LeavesQty extends DoubleField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 151;

	public LeavesQty() {
		super(151);
	}

	public LeavesQty(double data) {
		super(151, data);
	}
}
