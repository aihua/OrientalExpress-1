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

public class Text extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 58;

	public Text() {
		super(58);
	}

	public Text(String data) {
		super(58, data);
	}
}
