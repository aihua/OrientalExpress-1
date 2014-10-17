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

public class PartyDetailsListReportID extends StringField {
    static final long serialVersionUID = 20130814;
    public static final int FIELD = 1510;

    public PartyDetailsListReportID() {
        super(FIELD);
    }

    public PartyDetailsListReportID(String data) {
        super(FIELD, data);
    }

}
