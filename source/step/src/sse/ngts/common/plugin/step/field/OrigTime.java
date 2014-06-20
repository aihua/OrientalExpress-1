/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2011 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */

package sse.ngts.common.plugin.step.field;


import sse.ngts.common.plugin.fieldtype.StringField;

public class OrigTime extends StringField {

	private static final long serialVersionUID = -1296903529611329976L;
	public static final int FIELD = 42;

	public OrigTime() {
		super(42);
	}

	public OrigTime(String data) {
		super(42, data);
	}
}
