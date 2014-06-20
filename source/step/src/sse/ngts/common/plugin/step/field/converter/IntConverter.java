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
 * Convert between an integer and a String
 */
public final class IntConverter {

	/**
	 * Convert and integer to a String
	 * @param i the integer to convert
	 * @return the String representing the integer
	 * @see java.lang.Long#toString(long)
	 */
	public static String convert(int i) {
		return Long.toString(i);
	}

	/**
	 * Convert a String to an integer.
	 * @param value the String to convert
	 * @return the converted integer
	 * @throws FieldConvertError raised if the String does not represent a
	 * valid integer.
	 * @see java.lang.Integer#parseInt(String)
	 */
	public static int convert(String value) throws FieldConvertError {
		try {
			for (int i = 0; i < value.length(); i++) {
				if (!Character.isDigit(value.charAt(i)) && !(i == 0 && value.charAt(i) == '-')) {
					throw new FieldConvertError("invalid integral value: " + value);
				}
			}
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			throw new FieldConvertError("invalid integral value: " + value + ": " + e);
		}
	}
}