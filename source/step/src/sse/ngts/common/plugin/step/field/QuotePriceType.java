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

public class QuotePriceType extends IntField {
	static final long serialVersionUID = 20120617;
	public static final int FIELD = 692;

	public QuotePriceType() {
		super(FIELD);
	}

	public QuotePriceType(int data) {
		super(FIELD, data);
	}
}
