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

public class RawDataLength extends IntField {
	private static final long serialVersionUID = 2074631245764095247L;
	public static final int FIELD = 95;

	public RawDataLength() {
		super(95);
	}

	public RawDataLength(int data) {
		super(95, data);
	}
}
