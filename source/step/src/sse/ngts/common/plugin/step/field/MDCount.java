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

public class MDCount extends IntField {
    static final long serialVersionUID = 20140211;
    public static final int FIELD = 5468;

    public MDCount() {
        super(FIELD);
    }

    public MDCount(int data) {
        super(FIELD, data);
    }

}
