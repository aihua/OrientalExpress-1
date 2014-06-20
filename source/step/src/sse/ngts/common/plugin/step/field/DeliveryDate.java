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

public class DeliveryDate extends StringField {
	static final long serialVersionUID = 20120617;
	public static final int FIELD = 743;

	public DeliveryDate() {
		super(FIELD);
	}

	public DeliveryDate(String data) {
		super(FIELD, data);
	}
}
