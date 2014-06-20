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

public class ApplID extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 1180;

	public ApplID() {
		super(FIELD);
	}

	public ApplID(String data) {
		super(FIELD, data);
	}
}
