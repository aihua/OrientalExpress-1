/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import java.math.BigDecimal;

import sse.ngts.common.plugin.fieldtype.DecimalField;

public class MDEntryYield extends DecimalField {
	static final long serialVersionUID = 20050617;
	
//��ʱ���ã���Ҫ�޸�
	public static final int FIELD = 274;

	public MDEntryYield() {
		super(FIELD);
	}

	public MDEntryYield(double data) {
		super(FIELD, data);
	}
	public MDEntryYield(BigDecimal data) {
		super(FIELD, data);
	}
}
