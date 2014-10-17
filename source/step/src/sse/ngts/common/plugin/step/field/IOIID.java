/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.StringField;

public class IOIID extends StringField {
    static final long serialVersionUID = 20130801;
    public static final int FIELD = 23;

    public IOIID() {
        super(FIELD);
    }

    public IOIID(String data) {
        super(FIELD, data);
    }

}
