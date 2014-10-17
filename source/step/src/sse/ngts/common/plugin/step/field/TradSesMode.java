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

public class TradSesMode extends IntField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 339;

	public TradSesMode() {
		super(FIELD);
	}

	public TradSesMode(int data) {
		super(FIELD, data);
	}
}
