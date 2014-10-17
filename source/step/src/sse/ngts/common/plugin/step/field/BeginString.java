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

public class BeginString extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 8;

	public BeginString() {
		super(8);
	}

	public BeginString(String data) {
		super(8, data);
	}
}
