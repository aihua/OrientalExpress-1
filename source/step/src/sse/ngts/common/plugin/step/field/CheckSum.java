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

public class CheckSum extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 10;

	public CheckSum() {
		super(10);
	}

	public CheckSum(String data) {
		super(10, data);
	}
}
