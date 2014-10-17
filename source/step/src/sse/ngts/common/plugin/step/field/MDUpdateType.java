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

public class MDUpdateType extends StringField {
	static final long serialVersionUID = 2005044617;
	public static final int FIELD = 265;

	public MDUpdateType() {
		super(FIELD);
	}

	public MDUpdateType(String data) {
		super(FIELD, data);
	}
}
