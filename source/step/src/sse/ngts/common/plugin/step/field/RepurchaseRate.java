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

public class RepurchaseRate extends DoubleField {
	static final long serialVersionUID = 20120617;
	public static final int FIELD = 227;

	public RepurchaseRate() {
		super(FIELD);
	}

	public RepurchaseRate(double data) {
		super(FIELD, data);
	}
}
