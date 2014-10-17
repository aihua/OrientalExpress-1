/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.IntField;

public class NoLinesOfText extends IntField {
    static final long serialVersionUID = 20130520;
    public static final int FIELD = 33;

    public NoLinesOfText() {
        super(FIELD);
    }

    public NoLinesOfText(int data) {
        super(FIELD, data);
    }

}
