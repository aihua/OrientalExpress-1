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

public class NewsCategory extends IntField {
    static final long serialVersionUID = 20130520;
    public static final int FIELD = 1473;

	public static final int PUBLISHER = 0;
	public static final int EXCHANGE = 1;
	public static final int NEWS = 2;
	public static final int MOF = 90;
	public static final int PBC = 91;
	public static final int SPECIAL = 92;
	
    public NewsCategory() {
        super(FIELD);
    }

    public NewsCategory(int data) {
        super(FIELD, data);
    }

}
