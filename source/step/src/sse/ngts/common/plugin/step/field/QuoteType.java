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

public class QuoteType extends IntField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 537;
	public static final int INDICATIVE = 0;
	public static final int TRADEABLE = 1;
	public static final int RESTRICTED_TRADEABLE = 2;
	public static final int COUNTER = 3;

	public QuoteType() {
		super(537);
	}

	public QuoteType(int data) {
		super(537, data);
	}
}
