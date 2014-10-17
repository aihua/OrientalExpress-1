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

public class SettlDate extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 64;

	public SettlDate() {
		super(64);
	}

	public SettlDate(String data) {
		super(64, data);
	}
}
