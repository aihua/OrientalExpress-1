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

public class TextType extends IntField {
    static final long serialVersionUID = 20130520;
    public static final int FIELD = 8545;
    
	public static final int CONTENT = 1;
	public static final int AUTHOR = 2;
	public static final int KEYWORD = 3;

    public TextType() {
        super(FIELD);
    }

    public TextType(int data) {
        super(FIELD, data);
    }

}
