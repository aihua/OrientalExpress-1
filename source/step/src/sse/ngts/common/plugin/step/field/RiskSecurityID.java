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

public class RiskSecurityID extends StringField {
    static final long serialVersionUID = 20130814;
    public static final int FIELD = 1538;

    public RiskSecurityID() {
        super(FIELD);
    }

    public RiskSecurityID(String data) {
        super(FIELD, data);
    }

}
