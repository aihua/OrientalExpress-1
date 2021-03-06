/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.field.converter;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sse.ngts.common.plugin.step.FieldConvertError;
import sse.ngts.common.plugin.step.RuntimeError;

/**
 * Converts between a double and a String.
 */
public class DoubleConverter {
	private static final Pattern decimalPattern = Pattern.compile("-?\\d*(\\.\\d*)?");
	private static ThreadLocal<DecimalFormat[]> threadDecimalFormats = new ThreadLocal<DecimalFormat[]>();

	/**
	 * Converts a double to a string with no padding.
	 * @param d the double to convert
	 * @return the formatted String representing the double.
	 * @see #convert(double, int)
	 */
	public static String convert(double d) {
		return convert(d, 0);
	}

	static DecimalFormat getDecimalFormat(int padding) {
		if (padding > 14) {
			// FieldConvertError not supported in setDouble methods on Message
			throw new RuntimeError("maximum padding of 14 zeroes is supported: " + padding);
		}
		DecimalFormat[] decimalFormats = threadDecimalFormats.get();
		if (decimalFormats == null) {
			decimalFormats = new DecimalFormat[14];
			threadDecimalFormats.set(decimalFormats);
		}
		DecimalFormat f = decimalFormats[padding];
		if (f == null) {
			StringBuffer buffer = new StringBuffer("0.");
			for (int i = 0; i < padding; i++) {
				buffer.append('0');
			}
			for (int i = padding; i < 14; i++) {
				buffer.append('#');
			}
			f = new DecimalFormat(buffer.toString());
			f.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.US));
			decimalFormats[padding] = f;
		}
		return f;
	}

	/**
	 * Converts a double to a string with padding.
	 * @param d the double to convert
	 * @param padding the number of zeros to add to end of the formatted double
	 * @return the formatted String representing the double.
	 */
	public static String convert(double d, int padding) {
		return getDecimalFormat(padding).format(d);
	}

	/**
	 * Convert a String value to a double.
	 * @param value the String value to convert
	 * @return the parsed double
	 * @throws FieldConvertError if the String is not a valid double pattern.
	 */
	public static double convert(String value) throws FieldConvertError {
		try {
			Matcher matcher = decimalPattern.matcher(value);
			if (!matcher.matches()) {
				throw new NumberFormatException();
			}
			return Double.parseDouble(value);
		} catch (NumberFormatException e) {
			throw new FieldConvertError("invalid double value: " + value);
		}
	}
}