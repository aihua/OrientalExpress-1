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

public class QuoteStatusReqID extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 649;

	public QuoteStatusReqID() {
		super(649);
	}

	public QuoteStatusReqID(String data) {
		super(649, data);
	}
}
