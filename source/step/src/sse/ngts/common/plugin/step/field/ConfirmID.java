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

public class ConfirmID extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 664;

	public ConfirmID() {
		super(664);
	}

	public ConfirmID(String data) {
		super(664, data);
	}
}
