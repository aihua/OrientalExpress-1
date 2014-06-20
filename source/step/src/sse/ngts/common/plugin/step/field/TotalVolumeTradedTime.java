/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.UtcTimeOnlyField;

import java.util.Date;

public class TotalVolumeTradedTime extends UtcTimeOnlyField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 450;

	public TotalVolumeTradedTime() {
		super(450);
	}

	public TotalVolumeTradedTime(Date data) {
		super(450, data, true);
	}
}
