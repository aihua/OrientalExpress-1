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
 * A timestamp-valued message field (a timestamp has both a date and a time).
 */
public class UtcTimeStampField extends DateField {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private boolean includeMilliseconds = true;

	public UtcTimeStampField(int field) {
		super(field);
	}

	protected UtcTimeStampField(int field, Date data) {
		super(field, data);
	}

	public UtcTimeStampField(int field, boolean includeMilliseconds) {
		super(field);
		this.includeMilliseconds = includeMilliseconds;
	}

	protected UtcTimeStampField(int field, Date data, boolean includeMilliseconds) {
		super(field, data);
		this.includeMilliseconds = includeMilliseconds;
	}

	public boolean showMilliseconds() {
		return includeMilliseconds;
	}
}
