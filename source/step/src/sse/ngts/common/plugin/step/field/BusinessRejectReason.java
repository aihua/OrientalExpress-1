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

public class BusinessRejectReason extends IntField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 380;
	public static final int OTHER = 0;
	public static final int UNKOWN_ID = 1;
	public static final int UNKNOWN_SECURITY = 2;
	public static final int UNSUPPORTED_MESSAGE_TYPE = 3;
	public static final int APPLICATION_NOT_AVAILABLE = 4;
	public static final int CONDITIONALLY_REQUIRED_FIELD_MISSING = 5;
	public static final int NOT_AUTHORIZED = 6;
	public static final int DELIVERTO_FIRM_NOT_AVAILABLE_AT_THIS_TIME = 7;
	public static final int INVALID_PRICE_INCREMENT = 18;

	public BusinessRejectReason() {
		super(380);
	}

	public BusinessRejectReason(int data) {
		super(380, data);
	}
}
