/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.CharField;

public class Side extends CharField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 54;
	public static final char BUY = '1';
	public static final char SELL = '2';
	public static final char BUY_MINUS = '3';
	public static final char SELL_PLUS = '4';
	public static final char SELL_SHORT = '5';
	public static final char SELL_SHORT_EXEMPT = '6';
	public static final char UNDISCLOSED = '7';
	public static final char CROSS = '8';
	public static final char CROSS_SHORT = '9';
	public static final char CROSS_SHORT_EXEMPT = 'A';
	public static final char AS_DEFINED = 'B';
	public static final char OPPOSITE = 'C';
	public static final char SUBSCRIBE = 'D';
	public static final char REDEEM = 'E';
	public static final char LEND = 'F';
	public static final char BORROW = 'G';

	public Side() {
		super(54);
	}

	public Side(char data) {
		super(54, data);
	}
}
