/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step;

public class MessageParseError extends Exception {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public MessageParseError() {
		super();
	}

	public MessageParseError(String message, Throwable cause) {
		super(message, cause);
	}

	public MessageParseError(String message) {
		super(message);
	}
}
