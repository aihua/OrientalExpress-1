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

public class CFICode extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 461;

	public CFICode() {
		super(461);
	}

	public CFICode(String data) {
		super(461, data);
	}
}
