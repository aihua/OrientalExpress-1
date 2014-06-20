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

public class MDEntryTime extends UtcTimeOnlyField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 273;

	public MDEntryTime() {
		super(273);
	}

	public MDEntryTime(Date data) {
		super(273, data, true);
	}
}
