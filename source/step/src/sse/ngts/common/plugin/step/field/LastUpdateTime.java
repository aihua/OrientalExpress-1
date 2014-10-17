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

public class LastUpdateTime extends StringField {
	private static final long serialVersionUID = -2901537337675352448L;
	public static final int FIELD = 779;

	public LastUpdateTime() {
		super(FIELD);
	}

	public LastUpdateTime(String data) {
		super(FIELD, data);
	}
}
