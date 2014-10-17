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

public class TradeType extends CharField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 418;

	public TradeType() {
		super(418);
	}

	public TradeType(char data) {
		super(418, data);
	}
}
