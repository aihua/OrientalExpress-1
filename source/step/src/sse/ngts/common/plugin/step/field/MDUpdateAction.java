/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2011 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
*/

package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.CharField;

public class MDUpdateAction extends CharField {
	static final long serialVersionUID = 20120617;
	public static final int FIELD = 279;
	public static final char ADD = '0';
	//Fix 标准是   DELETE = '1' MODIFY = '2', 建议之后修改step协议
	public static final char MODIFY = '1';
	public static final char DELETE = '2';
  //eztrader 非公开行情  已成交情况
	public static final char TRADED = '3';
	public MDUpdateAction() {
		super(FIELD);
	}

	public MDUpdateAction(char data) {
		super(FIELD, data);
	}
}
