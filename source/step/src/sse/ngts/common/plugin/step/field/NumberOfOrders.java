/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.IntField;

public class NumberOfOrders extends IntField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 346;

	public NumberOfOrders() {
		super(346);
	}

	public NumberOfOrders(int data) {
		super(346, data);
	}
}
