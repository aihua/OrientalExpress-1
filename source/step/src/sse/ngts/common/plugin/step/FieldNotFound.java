/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step;

/**
 * An exception thrown when a field is not found in message. If you see
 * this exception, be sure you accessing the field in the correct section
 * of the message (for example, a header field in message.getHeader()).
 */
public class FieldNotFound extends Exception {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public FieldNotFound(int field) {
		super("Field [" + field + "] was not found in message.");
		this.field = field;
	}

	public FieldNotFound(String s) {
		super(s);
	}

	public int field;
}
