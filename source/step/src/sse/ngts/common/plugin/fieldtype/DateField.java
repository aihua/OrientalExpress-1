/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.fieldtype;

import java.util.Date;

import sse.ngts.common.plugin.step.Field;

/**
 * A date-valued message field.
 */
public class DateField extends Field<Date> {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	protected DateField(int field) {
		super(field, new Date());
	}

	protected DateField(int field, Date data) {
		super(field, data);
	}

	public void setValue(Date value) {
		setObject(value);
	}

	public Date getValue() {
		return getObject();
	}

	public boolean valueEquals(Date value) {
		return getValue().equals(value);
	}
}
