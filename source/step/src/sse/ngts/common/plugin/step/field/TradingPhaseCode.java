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

public class TradingPhaseCode extends StringField{
	static final long serialVersionUID = 20120617;
	public static final int FIELD = 8538;

	public TradingPhaseCode() {
		super(FIELD);
	}

	public TradingPhaseCode(String data) {
		super(FIELD, data);
	}
}

