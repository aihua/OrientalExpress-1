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

public class ByteConverter {

	public static String convert(byte [] c) {
		return new String(c);
	}
	
	public static byte [] convert(String value) throws FieldConvertError {
		byte [] bytes = null;
		bytes = value.getBytes();
		return bytes;
	}
}
