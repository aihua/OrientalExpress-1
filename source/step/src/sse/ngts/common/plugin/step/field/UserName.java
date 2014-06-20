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

public class UserName extends StringField {
	static final long serialVersionUID = 2005440617;
	public static final int FIELD = 553;

	public UserName() {
		super(FIELD);
	}

	public UserName(String data) {
		super(FIELD, data);
	}
}
