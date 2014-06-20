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

public class QuoteID extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 117;

	public QuoteID() {
		super(117);
	}

	public QuoteID(String data) {
		super(117, data);
	}
}
