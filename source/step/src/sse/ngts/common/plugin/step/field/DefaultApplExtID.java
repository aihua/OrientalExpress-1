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

public class DefaultApplExtID extends IntField {
	static final long serialVersionUID = 20140801;
	public static final int FIELD = 1407;

	public DefaultApplExtID() {
		super(FIELD);
	}

	public DefaultApplExtID(int data) {
		super(FIELD, data);
	}
}
