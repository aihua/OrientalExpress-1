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

public class SecurityID extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 48;

	public SecurityID() {
		super(48);
	}

	public SecurityID(String data) {
		super(48, data);
	}
}
