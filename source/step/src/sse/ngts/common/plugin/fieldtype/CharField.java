/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.fieldtype;

import java.lang.Character;

import sse.ngts.common.plugin.step.Field;

/**
 * A character message field.
 */
public class CharField extends Field<Character> {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public CharField(int field) {
		super(field, ' ');
	}

	public CharField(int field, Character data) {
		super(field, data);
	}

	public CharField(int field, char data) {
		super(field, data);
	}

	public void setValue(Character value) {
		setObject(value);
	}

	public void setValue(char value) {
		setObject(value);
	}

	public char getValue() {
		return getObject();
	}

	public boolean valueEquals(Character value) {
		return getObject().equals(value);
	}

	public boolean valueEquals(char value) {
		return getObject().equals(value);
	}
}
