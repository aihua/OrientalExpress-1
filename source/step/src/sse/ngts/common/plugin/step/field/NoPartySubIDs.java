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

public class NoPartySubIDs extends IntField {
    static final long serialVersionUID = 20130814;
    public static final int FIELD = 802;

    public NoPartySubIDs() {
        super(FIELD);
    }

    public NoPartySubIDs(int data) {
        super(FIELD, data);
    }

}
