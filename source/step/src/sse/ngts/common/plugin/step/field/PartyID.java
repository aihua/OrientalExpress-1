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

public class PartyID extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 448;

	public PartyID() {
		super(448);
	}

	public PartyID(String data) {
		super(448, data);
	}
}
