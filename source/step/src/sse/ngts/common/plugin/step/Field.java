/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step;

import java.io.Serializable;

/**
 * Base class for FIX message fields. This class should be
 * abstract but that would break compatibility with the QF JNI
 * classes.
 */
public class Field<T> implements Serializable {
	static final long serialVersionUID = 7098326013456432197L;
	private int tag;
	private T object;
	private boolean isCalculated = false;
	private String data;

	public Field(int field, T object) {
		this.tag = field;
		this.object = object;
	}

	/**
	 * Gets the field's tag.
	 * 
	 * @return the tag
	 */
	public int getTag() {
		return tag;
	}

	/**
	 * Gets the field's tag. (QF/C++ compatibility)
	 * 
	 * @return the tag
	 * @see quickfix.Field#getTag()
	 */
	public int getField() {
		return getTag();
	}

	/**
	 * Sets the field's value to the given object.
	 * @param object
	 */
	protected void setObject(T object) {
		this.object = object;
		isCalculated = false;
	}

	/**
	 * Get the field value
	 * @return an object representing the field's value
	 */
	public T getObject() {
		return object;
	}

	/**
	 * Return's the formatted field (tag=value<SOH>)
	 * @return the formatted field
	 */
	public String toString() {
		calculate();
		return data;
	}

	public void toString(StringBuffer buffer) {
		buffer.append(tag).append('=').append(objectAsString());
	}

	protected String objectAsString() {
		return object.toString();
	}

	public boolean equals(Object object) {
		if (super.equals(object) == true)
			return true;
		if (!(object instanceof Field))
			return false;
		return tag == ((Field<?>) object).getField() && getObject().equals(((Field<?>) object).getObject());
	}

	public int hashCode() {
		return object.hashCode();
	}

	public int getLength() {
		calculate();
		return data.getBytes().length + 1;
	}

	public int getTotal() {
		calculate();
		int sum = 0;
		for (int i = 0; i < data.length(); i++) {
			sum += data.charAt(i);
		}
		return sum + 1;
	}

	private void calculate() {
		if (isCalculated) {
			return;
		}

		StringBuffer buffer = new StringBuffer();
		toString(buffer);
		data = buffer.toString();

		isCalculated = true;
	}

	public void setTag(int tag) {
		this.tag = tag;
		isCalculated = false;
		calculate();
	}
}