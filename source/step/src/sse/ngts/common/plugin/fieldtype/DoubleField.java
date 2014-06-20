/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.fieldtype;

import java.lang.Double;

import sse.ngts.common.plugin.step.Field;

/**
 * A double-values message field.
 */
public class DoubleField extends Field<Double> {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private int padding = 0;

	public DoubleField(int field) {
		super(field, 0d);
	}

	public DoubleField(int field, Double data) {
		super(field, data);
	}

	public DoubleField(int field, double data) {
		super(field, data);
	}

	public DoubleField(int field, double data, int padding) {
		super(field, data);
		this.padding = padding;
	}

	public void setValue(Double value) {
		setObject(value);
	}

	public void setValue(double value) {
		setObject(value);
	}

	public double getValue() {
		return getObject();
	}

	public int getPadding() {
		return padding;
	}

	public boolean valueEquals(Double value) {
		return getObject().equals(value);
	}

	public boolean valueEquals(double value) {
		return getObject().equals(value);
	}
}
