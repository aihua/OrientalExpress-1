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


public class TransactTime extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 60;

	public TransactTime() {
		super(60);
	}

	public TransactTime(String data) {
		super(60, data);
	}
}
