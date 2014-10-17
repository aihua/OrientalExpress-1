/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
*/

package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.StringField;

public class TestReqID extends StringField {
	private static final long serialVersionUID = -2901546337675352448L;
	public static final int FIELD = 112;

	public TestReqID() {
		super(FIELD);
	}

	public TestReqID(String data) {
		super(FIELD, data);
	}

}
