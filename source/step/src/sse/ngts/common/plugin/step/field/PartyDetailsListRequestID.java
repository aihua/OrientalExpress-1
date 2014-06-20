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

public class PartyDetailsListRequestID extends StringField {
    static final long serialVersionUID = 20130814;
    public static final int FIELD = 1505;

    public PartyDetailsListRequestID() {
        super(FIELD);
    }

    public PartyDetailsListRequestID(String data) {
        super(FIELD, data);
    }

}
