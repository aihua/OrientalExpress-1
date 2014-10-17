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

public class LastFragment extends CharField {
    static final long serialVersionUID = 20130814;
    public static final int FIELD = 893;
    
    public static final char IS_LAST = 'Y';
    public static final char NOT_LAST = 'N';

    public LastFragment() {
        super(FIELD);
    }

    public LastFragment(char data) {
        super(FIELD, data);
    }

}
