/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.fieldtype;

import java.math.BigDecimal;

import sse.ngts.common.plugin.step.Field;

/**
 * A double-values message field.
 */
public class DecimalField extends Field<BigDecimal> {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private int padding = 0;

	public DecimalField(int field) {
		super(field, BigDecimal.ZERO);
	}

	public DecimalField(int field, BigDecimal data) {
		super(field, data);
	}

	public DecimalField(int field, double data) {
		super(field, BigDecimal.valueOf(data));
	}

	public DecimalField(int field, BigDecimal data, int padding) {
		super(field, data);
		this.padding = padding;
	}

	public void setValue(BigDecimal value) {
		setObject(value);
	}

	public void setValue(double value) {
		setObject(BigDecimal.valueOf(value));
	}

	public BigDecimal getValue() {
		return getObject();
	}

	public int getPadding() {
		return padding;
	}

	public boolean valueEquals(BigDecimal value) {
		return getValue().compareTo(value) == 0;
	}

	public boolean valueEquals(double value) {
		return getValue().compareTo(new BigDecimal(value)) == 0;
	}
}
