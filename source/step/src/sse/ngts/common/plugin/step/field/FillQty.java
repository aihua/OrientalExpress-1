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

public class FillQty extends IntField {
    static final long serialVersionUID = 20140211;
    public static final int FIELD = 1365;

    public FillQty() {
        super(FIELD);
    }

    public FillQty(int data) {
        super(FIELD, data);
    }

}
