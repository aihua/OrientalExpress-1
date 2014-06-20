/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2011 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
*/

package sse.ngts.common.plugin.field.group;

import sse.ngts.common.plugin.step.FieldNotFound;
import sse.ngts.common.plugin.step.Group;
import sse.ngts.common.plugin.step.field.MDEntryPositionNo;
import sse.ngts.common.plugin.step.field.MDEntryPx;
import sse.ngts.common.plugin.step.field.MDEntrySize;
import sse.ngts.common.plugin.step.field.MDEntryType;

public class NoMDEntriesGroup extends Group {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoMDEntriesGroup() {
		super(268, 269, new int[] { 269, 270, 271, 290 });
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

	public void set(MDEntrySize value) {
		setField(value);
	}

	public MDEntrySize get(MDEntrySize value) throws FieldNotFound {
		getField(value);

		return value;
	}

	public MDEntrySize getMDEntrySize() throws FieldNotFound {
		MDEntrySize value = new MDEntrySize();
		getField(value);

		return value;
	}

	public boolean isSet(MDEntrySize field) {
		return isSetField(field);
	}

	public boolean isSetMDEntrySize() {
		return isSetField(MDEntrySize.FIELD);
	}

	public void set(MDEntryPositionNo value) {
		setField(value);
	}

	public MDEntryPositionNo get(MDEntryPositionNo value) throws FieldNotFound {
		getField(value);

		return value;
	}

	public MDEntryPositionNo getMDEntryPositionNo() throws FieldNotFound {
		MDEntryPositionNo value = new MDEntryPositionNo();
		getField(value);

		return value;
	}

	public boolean isSet(MDEntryPositionNo field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryPositionNo() {
		return isSetField(MDEntryPositionNo.FIELD);
	}
}
