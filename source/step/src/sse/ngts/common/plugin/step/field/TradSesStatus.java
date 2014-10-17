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

public class TradSesStatus extends IntField {
	static final long serialVersionUID = 20131121;
	public static final int FIELD = 340;

	public TradSesStatus() {
		super(FIELD);
	}

	public TradSesStatus(int data) {
		super(FIELD, data);
	}
}
