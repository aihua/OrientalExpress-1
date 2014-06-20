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

public class SignatureLength extends IntField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 93;

	public SignatureLength() {
		super(93);
	}

	public SignatureLength(int data) {
		super(93, data);
	}
}
