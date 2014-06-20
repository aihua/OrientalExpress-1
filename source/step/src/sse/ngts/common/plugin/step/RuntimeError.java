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
 * 
 * Application encountered serious error during runtime.
 * (The "error" naming is from the C++ JNI API.)
 */
public class RuntimeError extends RuntimeException {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public RuntimeError() {
		super();
	}

	public RuntimeError(String message) {
		super(message);
	}

	public RuntimeError(Throwable e) {
		super(e);
	}

	public RuntimeError(String message, Throwable cause) {
		super(message, cause);
	}
}
