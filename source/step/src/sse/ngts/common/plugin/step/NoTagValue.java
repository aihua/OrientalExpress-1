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
 * An exception thrown when a tag does not have a value.
 */
public class NoTagValue extends RuntimeException {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	public int field;

	public NoTagValue(String message, Throwable cause) {
		super(message, cause);
	}

	public NoTagValue(String message) {
		super(message);
	}

	public NoTagValue(int field) {
		super("Field [" + field + "] has no tag value.");
		this.field = field;
	}

}
