/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.StringField;
//类型已修改
public class SendingTime extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 52;

	public SendingTime() {
		super(52);
	}

	public SendingTime(String data) {
		super(52, data);
	}
}
