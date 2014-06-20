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
 * Field has a badly formatted value. (From the C++ API documentation.)
 */
public class IncorrectDataFormat extends Exception {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	public final int field;
	public final String data;

	/**
	 * @param field the tag number with the incorrect data
	 * @param data the incorrect data
	 */
	public IncorrectDataFormat(final int field, final String data) {
		this(field, data, "Field [" + field + "] contains badly formatted data.");
	}

	/**
	 * This constructor is here for QF JNI compatibility.
	 * 
	 * @param field the tag number with the incorrect data
	 */
	public IncorrectDataFormat(final int field) {
		this(field, null);
	}

	/**
	 * This constructor is here for QF JNI compatibility.
	 * 
	 * @param message
	 */
	public IncorrectDataFormat(final String message) {
		this(0, null, message);
	}

	private IncorrectDataFormat(final int field, final String data, final String message) {
		super(message);
		this.field = field;
		this.data = data;
	}
}
