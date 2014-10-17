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

public class EventType extends IntField {
	static final long serialVersionUID = 20120617;
	public static final int FIELD = 865;

	public EventType() {
		super(FIELD);
	}

	public EventType(int data) {
		super(FIELD, data);
	}
}
