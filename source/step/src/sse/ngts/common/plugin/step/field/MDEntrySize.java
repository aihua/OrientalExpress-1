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

public class MDEntrySize extends LongField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 271;

	public MDEntrySize() {
		super(271);
	}

	public MDEntrySize(long data) {
		super(271, data);
	}
}
