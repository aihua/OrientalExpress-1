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

public class QtyType extends IntField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 854;
	public static final int UNITS = 0;
	public static final int CONTRACTS = 1;
	public static final int UNITS_OF_MEASURE_PER_TIME_UNIT = 2;

	public QtyType() {
		super(854);
	}

	public QtyType(int data) {
		super(854, data);
	}
}
