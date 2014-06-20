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

public class MDEntryOriginator extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 282;

	public MDEntryOriginator() {
		super(282);
	}

	public MDEntryOriginator(String data) {
		super(282, data);
	}
}
