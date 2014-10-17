/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
*/

package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.LongField;

public class TotalLongPosition extends LongField{
	static final long serialVersionUID = 2005172334;
	public static final int FIELD = 8506;

	public TotalLongPosition() {
		super(FIELD);
	}

	public TotalLongPosition(long data) {
		super(FIELD, data);
	}
}
