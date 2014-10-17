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

public class DefaultApplVerID extends StringField {
	static final long serialVersionUID = 20140801;
	public static final int FIELD = 1137;

	public DefaultApplVerID() {
		super(FIELD);
	}

	public DefaultApplVerID(String data) {
		super(FIELD, data);
	}
}
