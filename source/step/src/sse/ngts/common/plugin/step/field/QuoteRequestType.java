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

public class QuoteRequestType extends IntField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 303;
	public static final int MANUAL = 1;
	public static final int AUTOMATIC = 2;

	public QuoteRequestType() {
		super(303);
	}

	public QuoteRequestType(int data) {
		super(303, data);
	}
}
