/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.StringField;

public class OrderID extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 37;

	public OrderID() {
		super(37);
	}

	public OrderID(String data) {
		super(37, data);
	}
}
