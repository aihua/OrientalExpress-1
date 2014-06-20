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

public class ValueOfFutures extends DoubleField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 408;

	public ValueOfFutures() {
		super(408);
	}

	public ValueOfFutures(double data) {
		super(408, data);
	}
}
