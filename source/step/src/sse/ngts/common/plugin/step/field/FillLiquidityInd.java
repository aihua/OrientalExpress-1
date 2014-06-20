/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.StringField;

public class FillLiquidityInd extends StringField {
    static final long serialVersionUID = 20140211;
    public static final int FIELD = 1443;

    public FillLiquidityInd() {
        super(FIELD);
    }

    public FillLiquidityInd(String data) {
        super(FIELD, data);
    }

}
