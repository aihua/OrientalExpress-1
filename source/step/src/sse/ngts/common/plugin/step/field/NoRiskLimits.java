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

public class NoRiskLimits extends IntField {
    static final long serialVersionUID = 20130814;
    public static final int FIELD = 1529;

    public NoRiskLimits() {
        super(FIELD);
    }

    public NoRiskLimits(int data) {
        super(FIELD, data);
    }

}
