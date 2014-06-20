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

public class ProcessCode extends CharField {
    static final long serialVersionUID = 20130819;
    public static final int FIELD = 81;

    public static final char ADMINISTRATOR = 'Y';
    public static final char OTHER = 'N';
    
    public ProcessCode() {
        super(FIELD);
    }

    public ProcessCode(char data) {
        super(FIELD, data);
    }

}
