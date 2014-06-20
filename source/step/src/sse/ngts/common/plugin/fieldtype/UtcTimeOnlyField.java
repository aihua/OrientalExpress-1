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

/*
 * A time-valued message field.
 */
public class UtcTimeOnlyField extends DateField {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private boolean includeMilliseconds = true;

	public UtcTimeOnlyField(int field) {
		super(field);
	}

	protected UtcTimeOnlyField(int field, Date data) {
		super(field, data);
	}

	public UtcTimeOnlyField(int field, boolean includeMilliseconds) {
		super(field);
		this.includeMilliseconds = includeMilliseconds;
	}

	protected UtcTimeOnlyField(int field, Date data, boolean includeMilliseconds) {
		super(field, data);
		this.includeMilliseconds = includeMilliseconds;
	}

	public boolean showMilliseconds() {
		return includeMilliseconds;
	}

}
