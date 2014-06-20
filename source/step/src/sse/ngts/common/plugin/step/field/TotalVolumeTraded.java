/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.DoubleField;

public class TotalVolumeTraded extends DoubleField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 387;

	public TotalVolumeTraded() {
		super(387);
	}

	public TotalVolumeTraded(double data) {
		super(387, data);
	}
}
