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

public class DefaultCstmApplVerID extends StringField {
	static final long serialVersionUID = 20140801;
	public static final int FIELD = 1408;

	public DefaultCstmApplVerID() {
		super(FIELD);
	}

	public DefaultCstmApplVerID(String data) {
		super(FIELD, data);
	}
}
