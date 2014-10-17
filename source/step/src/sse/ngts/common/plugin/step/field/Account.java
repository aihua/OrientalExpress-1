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

public class Account extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 1;

	public Account() {
		super(1);
	}

	public Account(String data) {
		super(1, data);
	}
}
