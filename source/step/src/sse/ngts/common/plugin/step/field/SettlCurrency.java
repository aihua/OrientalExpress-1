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

public class SettlCurrency extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 120;

	public SettlCurrency() {
		super(120);
	}

	public SettlCurrency(String data) {
		super(120, data);
	}
}
