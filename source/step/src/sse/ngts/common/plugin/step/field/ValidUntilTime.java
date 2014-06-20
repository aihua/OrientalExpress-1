/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.UtcTimeStampField;

import java.util.Date;

public class ValidUntilTime extends UtcTimeStampField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 62;

	public ValidUntilTime() {
		super(62);
	}

	public ValidUntilTime(Date data) {
		super(62, data, true);
	}
}
