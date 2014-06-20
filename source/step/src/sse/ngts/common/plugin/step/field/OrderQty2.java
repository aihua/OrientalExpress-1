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
public class OrderQty2 extends LongField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 192;

	public OrderQty2() {
		super(192);
	}

	public OrderQty2(long data) {
		super(192, data);
	}
}
