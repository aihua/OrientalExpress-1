/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.CharField;

public class SecurityUpdateAction extends CharField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 980;
	public static final char ADD = 'A';
	public static final char DELETE = 'D';
	public static final char MODIFY = 'M';

	public SecurityUpdateAction() {
		super(980);
	}

	public SecurityUpdateAction(char data) {
		super(980, data);
	}
}
