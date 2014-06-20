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

public class MDEntryRefID extends StringField {
    static final long serialVersionUID = 20130819;
    public static final int FIELD = 280;

    public MDEntryRefID() {
        super(FIELD);
    }

    public MDEntryRefID(String data) {
        super(FIELD, data);
    }

}
