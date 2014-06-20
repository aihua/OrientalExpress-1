/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.CharField;

public class PositionEffect extends CharField {
    static final long serialVersionUID = 20140211;
    public static final int FIELD = 77;

    public PositionEffect() {
        super(FIELD);
    }

    public PositionEffect(char data) {
        super(FIELD, data);
    }

}
