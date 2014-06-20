/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.LongField;

public class OrderQty extends LongField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 38;

	public OrderQty() {
		super(38);
	}

	public OrderQty(long data) {
		super(38, data);
	}
}
