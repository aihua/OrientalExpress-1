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

public class UnderlyingSecurityID extends StringField {
    static final long serialVersionUID = 20140211;
    public static final int FIELD = 308;

    public UnderlyingSecurityID() {
        super(FIELD);
    }

    public UnderlyingSecurityID(String data) {
        super(FIELD, data);
    }

}
