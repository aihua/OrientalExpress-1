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

public class IOIRefID extends StringField {
    static final long serialVersionUID = 20130801;
    public static final int FIELD = 26;

    public IOIRefID() {
        super(FIELD);
    }

    public IOIRefID(String data) {
        super(FIELD, data);
    }

}
