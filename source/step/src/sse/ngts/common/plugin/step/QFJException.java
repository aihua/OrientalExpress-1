/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step;

public class QFJException extends RuntimeException {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public QFJException() {
		super();
	}

	public QFJException(String message, Throwable cause) {
		super(message, cause);
	}

	public QFJException(String message) {
		super(message);
	}

	public QFJException(Throwable cause) {
		super(cause);
	}

}
