/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.fieldtype;

import java.lang.Boolean;

import sse.ngts.common.plugin.step.Field;

public class BooleanField extends Field<Boolean> {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public BooleanField(int field) {
		super(field, false);
	}

	public BooleanField(int field, Boolean data) {
		super(field, data);
	}

	public BooleanField(int field, boolean data) {
		super(field, data);
	}

	public void setValue(Boolean value) {
		setObject(value);
	}

	public void setValue(boolean value) {
		setObject(value);
	}

	public boolean getValue() {
		return ((Boolean) getObject());
	}

	public boolean valueEquals(Boolean value) {
		return getObject().equals(value);
	}

	public boolean valueEquals(boolean value) {
		return getObject().equals(value);
	}
}
