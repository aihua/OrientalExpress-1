/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.IntField;

public class OwnerType extends IntField {
    static final long serialVersionUID = 20140211;
    public static final int FIELD = 522;

    public OwnerType() {
        super(FIELD);
    }

    public OwnerType(int data) {
        super(FIELD, data);
    }

}
