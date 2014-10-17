/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.IntField;

public class AccountType extends IntField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 581;
	
	public static final int AGREEMENT_CUSTOMER = 1;
	public static final int AGREEMENT_DEALER = 2;
	public static final int OTHER = 0;


	public AccountType() {
		super(FIELD);
	}

	public AccountType(int data) {
		super(FIELD, data);
	}
}
