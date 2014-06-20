/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step;

/*
 * An exception when a message is not valid according to the
 * basic message validation or the data dictionary.
 */
public class InvalidMessage extends Exception {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public InvalidMessage() {
		super();
	}

	public InvalidMessage(String message) {
		super(message);
	}
}
