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

public class NumTrades extends IntField{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int FIELD = 8503;
	public NumTrades() {
		super(FIELD);
	}

	public NumTrades(int data) {
		super(FIELD, data);
	}
}

