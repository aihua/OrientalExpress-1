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

public class TargetCompID extends StringField {
	private static final long serialVersionUID = -2901546637675352448L;
	public static final int FIELD = 56;

	public TargetCompID() {
		super(FIELD);
	}

	public TargetCompID(String data) {
		super(FIELD, data);
	}
}
