/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */

package sse.ngts.common.plugin.fieldtype;

import sse.ngts.common.plugin.step.Field;

/**
 * A string-valued message field.
 */
public class StringField extends Field<String> {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public StringField(int field) {
		super(field, "");
	}

	public StringField(int field, String data) {
		super(field, data);
	}

	public void setValue(String value) {
		setObject(value);
	}

	public String getValue() {
		return getObject();
	}

	public boolean valueEquals(String value) {
		return getValue().equals(value);
	}
}
