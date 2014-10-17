/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.LongField;

public class RiskLimitAmount extends LongField {
    static final long serialVersionUID = 20130814;
    public static final int FIELD = 1531;

    public RiskLimitAmount() {
        super(FIELD);
    }

    public RiskLimitAmount(long data) {
        super(FIELD, data);
    }

}
