/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.StringField;

public class NewsID extends StringField {
    static final long serialVersionUID = 20130520;
    public static final int FIELD = 1472;

    public NewsID() {
        super(FIELD);
    }

    public NewsID(String data) {
        super(FIELD, data);
    }

}
