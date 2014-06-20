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

public class SenderCompID  extends StringField {
	private static final long serialVersionUID = -2901546337675352448L;
	public static final int FIELD = 49;

	public SenderCompID() {
		super(FIELD);
	}

	public SenderCompID(String data) {
		super(FIELD, data);
	}
}

