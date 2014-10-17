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

public class Password extends StringField {
	static final long serialVersionUID = 20131121;
	public static final int FIELD = 554;

	public Password() {
		super(FIELD);
	}

	public Password(String data) {
		super(FIELD, data);
	}
}
