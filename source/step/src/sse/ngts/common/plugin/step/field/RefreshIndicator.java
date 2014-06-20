/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2011 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
*/

package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.StringField;

public class RefreshIndicator extends StringField {
	static final long serialVersionUID = 20120617;
	public static final int FIELD = 1187;

	public RefreshIndicator() {
		super(FIELD);
	}

	public RefreshIndicator(String data) {
		super(FIELD, data);
	}
}
