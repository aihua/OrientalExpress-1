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

public class Headline extends StringField {
    static final long serialVersionUID = 20130520;
    public static final int FIELD = 148;

    public Headline() {
        super(FIELD);
    }

    public Headline(String data) {
        super(FIELD, data);
    }

}
