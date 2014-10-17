/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.LongField;

public class TradeVolume extends LongField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 1020;

	public TradeVolume() {
		super(1020);
	}

	public TradeVolume(long data) {
		super(1020, data);
	}
}
