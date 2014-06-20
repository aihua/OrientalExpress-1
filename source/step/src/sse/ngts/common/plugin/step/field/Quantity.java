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

public class Quantity extends DoubleField {
	static final long serialVersionUID = 20120617;
	public static final int FIELD = 53;

	public Quantity() {
		super(FIELD);
	}

	public Quantity(double data) {
		super(FIELD, data);
	}
}
