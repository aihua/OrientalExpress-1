/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step;

public class FieldException extends RuntimeException {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	private final int field;

	private final int sessionRejectReason;

	public FieldException(int sessionRejectReason) {
		this(sessionRejectReason, -1);
	}

	public FieldException(int sessionRejectReason, int field) {
		super(", field=" + field);
		this.sessionRejectReason = sessionRejectReason;
		this.field = field;
	}

	public FieldException(int sessionRejectReason, String msg, int field) {
		super(msg);
		this.sessionRejectReason = sessionRejectReason;
		this.field = field;
	}

	public boolean isFieldSpecified() {
		return field != -1;
	}

	public int getField() {
		return field;
	}

	public int getSessionRejectReason() {
		return sessionRejectReason;
	}
}
