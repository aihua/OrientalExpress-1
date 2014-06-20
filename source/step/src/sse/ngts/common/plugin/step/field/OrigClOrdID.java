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

public class OrigClOrdID extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 41;

	public OrigClOrdID() {
		super(41);
	}

	public OrigClOrdID(String data) {
		super(41, data);
	}
}
