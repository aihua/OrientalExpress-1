/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.DoubleField;

public class DisplayQty extends DoubleField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 1138;

	public DisplayQty() {
		super(1138);
	}

	public DisplayQty(double data) {
		super(1138, data);
	}
}
