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

public class PossDupFlag extends StringField {
	static final long serialVersionUID = 20140820;
	public static final int FIELD = 43;

	public PossDupFlag() {
		super(FIELD);
	}

	public PossDupFlag(String data) {
		super(FIELD, data);
	}
}
