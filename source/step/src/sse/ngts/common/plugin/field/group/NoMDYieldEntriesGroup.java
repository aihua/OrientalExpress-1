/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
*/

package sse.ngts.common.plugin.field.group;

import sse.ngts.common.plugin.step.FieldNotFound;
import sse.ngts.common.plugin.step.Group;
import sse.ngts.common.plugin.step.field.MDEntryPx;
import sse.ngts.common.plugin.step.field.MDEntryType;
import sse.ngts.common.plugin.step.field.MDEntryYield;

public class NoMDYieldEntriesGroup extends Group {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoMDYieldEntriesGroup() {
		super(268, 269, new int[] { 269, 270, 274 });
	}

	public void set(MDEntryType value) {
		setField(value);
	}

	public MDEntryType get(MDEntryType value) throws FieldNotFound {
		getField(value);

		return value;
	}

	public MDEntryType getMDEntryType() throws FieldNotFound {
		MDEntryType value = new MDEntryType();
		getField(value);

		return value;
	}

	public boolean isSet(MDEntryType field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryType() {
		return isSetField(MDEntryType.FIELD);
	}

	public void set(MDEntryPx value) {
		setField(value);
	}

	public MDEntryPx get(MDEntryPx value) throws FieldNotFound {
		getField(value);

		return value;
	}

	public MDEntryPx getMDEntryPx() throws FieldNotFound {
		MDEntryPx value = new MDEntryPx();
		getField(value);

		return value;
	}

	public boolean isSet(MDEntryPx field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryPx() {
		return isSetField(MDEntryPx.FIELD);
	}

	public void set(MDEntryYield value) {
		setField(value);
	}

	public MDEntryYield get(MDEntryYield value) throws FieldNotFound {
		getField(value);

		return value;
	}

	public MDEntryYield getMDEntryYield() throws FieldNotFound {
		MDEntryYield value = new MDEntryYield();
		getField(value);

		return value;
	}

	public boolean isSet(MDEntryYield field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryYield() {
		return isSetField(MDEntryYield.FIELD);
	}

	
}
