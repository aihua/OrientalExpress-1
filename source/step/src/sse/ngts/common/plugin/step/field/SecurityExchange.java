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

public class SecurityExchange extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 207;

	public SecurityExchange() {
		super(207);
	}

	public SecurityExchange(String data) {
		super(207, data);
	}
}
