/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
*/

package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.StringField;

public class MDReportID extends StringField{
	static final long serialVersionUID = 20120617;
	public static final int FIELD = 963;

	public MDReportID() {
		super(FIELD);
	}

	public MDReportID(String data) {
		super(FIELD, data);
	}
}

