/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.DecimalField;

public class DiscretionPrice extends DecimalField {
    static final long serialVersionUID = 20140211;
    public static final int FIELD = 845;

    public DiscretionPrice() {
        super(FIELD);
    }

    public DiscretionPrice(java.math.BigDecimal data) {
        super(FIELD, data);
    }

    public DiscretionPrice(double data) {
        super(FIELD, data);
    }

}
