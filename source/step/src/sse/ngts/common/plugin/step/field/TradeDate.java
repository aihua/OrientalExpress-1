/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.StringField;

public class TradeDate extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 75;

	public TradeDate() {
		super(75);
	}

	public TradeDate(String data) {
		super(75, data);
	}
}
