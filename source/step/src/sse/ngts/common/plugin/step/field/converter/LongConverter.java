package sse.ngts.common.plugin.step.field.converter;

import sse.ngts.common.plugin.step.FieldConvertError;

/**
 * Convert between an long and a String
 */
public class LongConverter {
	/**
	 * Convert and long to a String
	 * @param i the long to convert
	 * @return the String representing the long
	 * @see java.lang.Long#toString(long)
	 */
	public static String convert(long i) {
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
	public static long convert(String value) throws FieldConvertError {
		try {
			for (int i = 0; i < value.length(); i++) {
				if (!Character.isDigit(value.charAt(i)) && !(i == 0 && value.charAt(i) == '-')) {
					throw new FieldConvertError("invalid long value: " + value);
				}
			}
			return Long.parseLong(value);
		} catch (NumberFormatException e) {
			throw new FieldConvertError("invalid long value: " + value + ": " + e);
		}
	}
}
