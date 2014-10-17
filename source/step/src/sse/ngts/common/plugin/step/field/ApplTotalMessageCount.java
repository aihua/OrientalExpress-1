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

public class ApplTotalMessageCount extends IntField {
    static final long serialVersionUID = 20130819;
    public static final int FIELD = 1349;

    public ApplTotalMessageCount() {
        super(FIELD);
    }

    public ApplTotalMessageCount(int data) {
        super(FIELD, data);
    }

}
