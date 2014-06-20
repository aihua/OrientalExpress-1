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

public class ExecID extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 17;

	public ExecID() {
		super(17);
	}

	public ExecID(String data) {
		super(17, data);
	}
}
