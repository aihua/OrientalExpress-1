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

public class SessionStatus extends IntField {
	static final long serialVersionUID = 20130617;
	public static final int FIELD = 1409;

	public SessionStatus() {
		super(FIELD);
	}

	public SessionStatus(int data) {
		super(FIELD, data);
	}
}