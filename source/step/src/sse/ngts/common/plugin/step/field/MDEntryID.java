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

public class MDEntryID extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 278;

	public MDEntryID() {
		super(278);
	}

	public MDEntryID(String data) {
		super(278, data);
	}
}
