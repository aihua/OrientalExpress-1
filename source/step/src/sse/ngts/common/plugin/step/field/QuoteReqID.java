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

public class QuoteReqID extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 131;

	public QuoteReqID() {
		super(131);
	}

	public QuoteReqID(String data) {
		super(131, data);
	}
}
