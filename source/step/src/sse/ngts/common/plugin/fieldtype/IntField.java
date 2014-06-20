/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.fieldtype;

import java.lang.Integer;

import sse.ngts.common.plugin.step.Field;

/**
 * A integer message field.
 */
public class IntField extends Field<Integer> {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public IntField(int field) {
		super(field, 0);
	}

	public IntField(int field, Integer data) {
		super(field, data);
	}

	public IntField(int field, int data) {
		super(field, data);
	}

	public void setValue(Integer value) {
		setObject(value);
	}

	public void setValue(int value) {
		setObject(value);
	}

	public int getValue() {
		return getObject();
	}

	public boolean valueEquals(Integer value) {
		return getObject().equals(value);
	}

	public boolean valueEquals(int value) {
		return getObject().equals(value);
	}
}
