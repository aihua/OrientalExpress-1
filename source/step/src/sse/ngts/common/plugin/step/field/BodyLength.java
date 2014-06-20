/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.IntField;

public class BodyLength extends IntField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 9;

	public BodyLength() {
		super(9);
	}

	public BodyLength(int data) {
		super(9, data);
	}
}
