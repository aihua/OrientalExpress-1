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
 * An exception for field conversion problems. (The "error" naming is from the C++ JNI API.)
 */
public class FieldConvertError extends Exception {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public FieldConvertError(String s) {
		super(s);
	}
}
