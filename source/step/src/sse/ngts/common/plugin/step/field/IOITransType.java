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

public class IOITransType extends CharField {
    static final long serialVersionUID = 20130801;
    public static final int FIELD = 28;
    public static final char NEW = 'N';
    public static final char CANCEL = 'C';
    
    public IOITransType() {
        super(FIELD);
    }

    public IOITransType(char data) {
        super(FIELD, data);
    }

}
