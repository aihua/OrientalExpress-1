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

public class NoFills extends IntField {
    static final long serialVersionUID = 20140211;
    public static final int FIELD = 1362;

    public NoFills() {
        super(FIELD);
    }

    public NoFills(int data) {
        super(FIELD, data);
    }

}
