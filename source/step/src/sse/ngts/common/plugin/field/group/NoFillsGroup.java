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
import sse.ngts.common.plugin.step.field.FillLiquidityInd;
import sse.ngts.common.plugin.step.field.FillQty;
import sse.ngts.common.plugin.step.field.NoFills;

public class NoFillsGroup extends Group {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoFillsGroup() {
		super(NoFills.FIELD, FillLiquidityInd.FIELD, new int[] { FillLiquidityInd.FIELD, FillQty.FIELD });
	}

	public void set(FillLiquidityInd value) {
		setField(value);
	}

	public FillLiquidityInd get(FillLiquidityInd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public FillLiquidityInd getFillLiquidityInd() throws FieldNotFound {
		FillLiquidityInd value = new FillLiquidityInd();
		getField(value);
		return value;
	}

	public boolean isSet(FillLiquidityInd field) {
		return isSetField(field);
	}

	public boolean isSetFillLiquidityInd() {
		return isSetField(FillLiquidityInd.FIELD);
	}

	public void set(FillQty value) {
		setField(value);
	}

	public FillQty get(FillQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public FillQty getFillQty() throws FieldNotFound {
		FillQty value = new FillQty();
		getField(value);
		return value;
	}

	public boolean isSet(FillQty field) {
		return isSetField(field);
	}

	public boolean isSetFillQty() {
		return isSetField(FillQty.FIELD);
	}

}

