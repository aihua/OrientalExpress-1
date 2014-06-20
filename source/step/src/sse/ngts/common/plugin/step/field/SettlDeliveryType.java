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

public class SettlDeliveryType extends IntField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 172;
	public static final int VERSUS_PAYMENT = 0;
	public static final int FREE = 1;
	public static final int TRI_PARTY = 2;
	public static final int HOLD_IN_CUSTODY = 3;

	public SettlDeliveryType() {
		super(172);
	}

	public SettlDeliveryType(int data) {
		super(172, data);
	}
}
