package org.openfast.template.type.codec;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.openfast.ByteVectorValue;
import org.openfast.ScalarValue;
import org.openfast.StringValue;
import org.openfast.error.FastConstants;
import org.openfast.error.FastException;

public class GbkString extends NotStopBitEncodedTypeCodec {

	private static final long serialVersionUID = 1L;

	GbkString() {
	}

	/**
	 * Takes a ScalarValue object, and converts it to a byte array
	 * 
	 * @param value
	 *            The ScalarValue to be encoded
	 * @return Returns a byte array of the passed object
	 */
	public byte[] encodeValue(ScalarValue value) {
		try {
			byte[] gbkencoding = ((StringValue) value).value.getBytes("GBK");
			return TypeCodec.BYTE_VECTOR.encode(new ByteVectorValue(gbkencoding));
		} catch (UnsupportedEncodingException e) {
			throw new FastException("Apparently GBK is no longer supported by Java.", FastConstants.IMPOSSIBLE_EXCEPTION, e);
		}
	}

	/**
	 * Reads in a stream of data and stores it to a StringValue object
	 * 
	 * @param in
	 *            The InputStream to be decoded
	 * @return Returns a new StringValue object with the data stream as a String
	 */
	public ScalarValue decode(InputStream in) {
		ByteVectorValue value = (ByteVectorValue) TypeCodec.BYTE_VECTOR.decode(in);
		try {
			return new StringValue(new String(value.value, "GBK"));
		} catch (UnsupportedEncodingException e) {
			throw new FastException("Apparently GBK is no longer supported by Java.", FastConstants.IMPOSSIBLE_EXCEPTION, e);
		}
	}

	/**
	 * @return Returns a new StringValue object with the passed value
	 */
	public ScalarValue fromString(String value) {
		return new StringValue(value);
	}

	/**
	 * 
	 * @return Returns a new StringValue with a default value
	 */
	public ScalarValue getDefaultValue() {
		return new StringValue("");
	}

}
