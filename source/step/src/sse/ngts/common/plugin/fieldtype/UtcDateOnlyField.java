/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */

package sse.ngts.common.plugin.fieldtype;

import java.util.Date;

/**
 * A date-valued message field.
 */
public class UtcDateOnlyField extends DateField {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public UtcDateOnlyField(int field) {
		super(field);
	}

	protected UtcDateOnlyField(int field, Date data) {
		super(field, data);
	}
}
