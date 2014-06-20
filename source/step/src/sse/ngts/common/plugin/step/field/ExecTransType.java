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

public class ExecTransType extends CharField {
    static final long serialVersionUID = 20130819;
    public static final int FIELD = 20;
    
    public static final char NEW = 'N';
    public static final char CANCEL = 'C';

    public ExecTransType() {
        super(20);
    }

    public ExecTransType(char data) {
        super(20, data);
    }
}
