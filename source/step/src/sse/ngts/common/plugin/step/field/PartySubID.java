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

public class PartySubID extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 523;

	public PartySubID() {
		super(523);
	}

	public PartySubID(String data) {
		super(523, data);
	}
}
