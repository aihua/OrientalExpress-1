/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
*/

package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.BytesField;

public class RawData extends BytesField {
	private static final long serialVersionUID = -2901577337675352448L;
	public static final int FIELD = 96;

	public RawData() {
		super(FIELD);
	}

	public RawData(byte[] data) {
		super(FIELD, data);
	}

}
