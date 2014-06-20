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

public class OrdRejReason extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 103;

	public OrdRejReason() {
		super(FIELD);
	}

	public OrdRejReason(String data) {
		super(FIELD, data);
	}
}
