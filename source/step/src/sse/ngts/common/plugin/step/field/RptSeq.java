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

public class RptSeq extends IntField {
    static final long serialVersionUID = 20130814;
    public static final int FIELD = 83;

    public RptSeq() {
        super(FIELD);
    }

    public RptSeq(int data) {
        super(FIELD, data);
    }

}
