/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.fieldtype;

import java.io.UnsupportedEncodingException;

import sse.ngts.common.plugin.step.Field;

/**
 * BytesField enables better handling of binary data. With BytesFields binary data can
 * be directly put into FIX messages without casting them into Strings.
 */
public class BytesField extends Field<byte[]> {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public BytesField(int field) {
		super(field, new byte[0]);
	}

	public BytesField(int field, byte[] data) {
		super(field, data);
	}

	public void setValue(byte[] data) {
		setObject(data);
	}

	public byte[] getValue() {
		return getObject();
	}

	@Override
	protected String objectAsString() {
		try {
			return new String(getObject(), "UTF8");
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}

}
