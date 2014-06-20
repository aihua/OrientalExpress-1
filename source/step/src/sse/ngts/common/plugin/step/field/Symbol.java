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

public class Symbol extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 55;

	public Symbol() {
		super(55);
	}

	public Symbol(String data) {
		super(55, data);
	}
}
