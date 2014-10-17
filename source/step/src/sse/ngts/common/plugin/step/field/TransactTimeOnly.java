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

public class TransactTimeOnly extends StringField {
    static final long serialVersionUID = 20140211;
    public static final int FIELD = 8541;

    public TransactTimeOnly() {
        super(FIELD);
    }

    public TransactTimeOnly(String data) {
        super(FIELD, data);
    }

}
