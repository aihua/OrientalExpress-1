/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
*/

package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.IntField;

public class TotNoRelatedSym extends IntField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 393;

	public TotNoRelatedSym() {
		super(FIELD);
	}

	public TotNoRelatedSym(int data) {
		super(FIELD, data);
	}
}
