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

public class SecuritySubType extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 762;

	public SecuritySubType() {
		super(762);
	}

	public SecuritySubType(String data) {
		super(762, data);
	}
}
