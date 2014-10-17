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

public class NoMDEntryTypes extends IntField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 267;

	public NoMDEntryTypes() {
		super(267);
	}

	public NoMDEntryTypes(int data) {
		super(267, data);
	}
}
