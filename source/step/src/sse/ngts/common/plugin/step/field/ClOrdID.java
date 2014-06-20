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

public class ClOrdID extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 11;

	public ClOrdID() {
		super(11);
	}

	public ClOrdID(String data) {
		super(11, data);
	}
}
