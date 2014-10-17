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

public class SettlType extends IntField {

	static final long serialVersionUID = 20120617;
	public static final int FIELD = 63;

	public SettlType() {
		super(FIELD);
	}

	public SettlType(int data) {
		super(FIELD, data);
	}
}
