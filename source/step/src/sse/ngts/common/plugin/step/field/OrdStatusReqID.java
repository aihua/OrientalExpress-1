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

public class OrdStatusReqID extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 790;

	public OrdStatusReqID() {
		super(790);
	}

	public OrdStatusReqID(String data) {
		super(790, data);
	}
}
