/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.CharField;

public class CoveredOrUncovered extends CharField {
    static final long serialVersionUID = 20140211;
    public static final int FIELD = 203;

    public CoveredOrUncovered() {
        super(FIELD);
    }

    public CoveredOrUncovered(char data) {
        super(FIELD, data);
    }

}
