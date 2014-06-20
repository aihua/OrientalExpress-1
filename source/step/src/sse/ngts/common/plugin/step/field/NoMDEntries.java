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

public class NoMDEntries extends IntField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 268;

	public NoMDEntries() {
		super(268);
	}

	public NoMDEntries(int data) {
		super(268, data);
	}
}
