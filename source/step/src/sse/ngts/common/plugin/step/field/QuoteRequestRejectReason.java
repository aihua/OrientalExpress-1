/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.IntField;

public class QuoteRequestRejectReason extends IntField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 658;
	public static final int UNKNOWN_SYMBOL = 1;
	public static final int EXCHANGE_CLOSED = 2;
	public static final int QUOTE_REQUEST_EXCEEDS_LIMIT = 3;
	public static final int TOO_LATE_TO_ENTER = 4;
	public static final int INVALID_PRICE = 5;
	public static final int NOT_AUTHORIZED_TO_REQUEST_QUOTE = 6;
	public static final int NO_MATCH_FOR_INQUIRY = 7;
	public static final int NO_MARKET_FOR_INSTRUMENT = 8;
	public static final int NO_INVENTORY = 9;
	public static final int PASS = 10;
	public static final int INSUFFICIENT_CREDIT = 11;
	public static final int OTHER = 99;

	public QuoteRequestRejectReason() {
		super(658);
	}

	public QuoteRequestRejectReason(int data) {
		super(658, data);
	}
}
