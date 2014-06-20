/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.UtcDateOnlyField;

import java.util.Date;

public class TotalVolumeTradedDate extends UtcDateOnlyField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 449;

	public TotalVolumeTradedDate() {
		super(449);
	}

	public TotalVolumeTradedDate(Date data) {
		super(449, data);
	}
}
