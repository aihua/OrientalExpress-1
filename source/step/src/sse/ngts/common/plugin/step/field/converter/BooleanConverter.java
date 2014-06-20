/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field.converter;

import sse.ngts.common.plugin.step.FieldConvertError;

/**
 * Converts between a boolean and a string.
 */
public class BooleanConverter {
	private static final String NO = "N";
	private static final String YES = "Y";

	/**
	 * Converts a boolean to a String.
	 * 
	 * @param b the boolean value
	 * @return "Y" for true and "N" for false.
	 */
	public static String convert(boolean b) {
		return b ? YES : NO;
	}

	/**
	 * Converts a String value to a boolean.
	 * 
	 * @param value the String value to convert
	 * @return true if "Y" and false if "N"
	 * @throws FieldConvertError raised for any value other than "Y" or "N".
	 */
	public static boolean convert(String value) throws FieldConvertError {
		if (YES.equals(value)) {
			return true;
		} else if (NO.equals(value)) {
			return false;
		} else {
			throw new FieldConvertError("invalid boolean value: " + value);
		}
	}
}