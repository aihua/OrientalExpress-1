/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.business;

import sse.ngts.common.plugin.step.*;
import sse.ngts.common.plugin.step.field.*;

public class MktDataTrade extends Message {
    private static final long serialVersionUID = 20130819;
	public static final String MSGTYPE = "U011";

    public MktDataTrade() {
        super();
        getHeader().setField(new MsgType(MSGTYPE));
    }

    public MktDataTrade(int[] fieldOrder) {
        super(fieldOrder);
        getHeader().setField(new MsgType(MSGTYPE));
    }

    public void set(ExecID value) {
        setField(value);
    }

    public ExecID get(ExecID value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public ExecID getExecID() throws FieldNotFound {
        ExecID value = new ExecID();
        getField(value);
        return value;
    }

    public boolean isSet(ExecID field) {
        return isSetField(field);
    }

    public boolean isSetExecID() {
        return isSetField(ExecID.FIELD);
    }

    public void set(LastPx value) {
        setField(value);
    }

    public LastPx get(LastPx value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public LastPx getLastPx() throws FieldNotFound {
        LastPx value = new LastPx();
        getField(value);
        return value;
    }

    public boolean isSet(LastPx field) {
        return isSetField(field);
    }

    public boolean isSetLastPx() {
        return isSetField(LastPx.FIELD);
    }

    public void set(LastQty value) {
        setField(value);
    }

    public LastQty get(LastQty value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public LastQty getLastQty() throws FieldNotFound {
        LastQty value = new LastQty();
        getField(value);
        return value;
    }

    public boolean isSet(LastQty field) {
        return isSetField(field);
    }

    public boolean isSetLastQty() {
        return isSetField(LastQty.FIELD);
    }

    public void set(SecurityID value) {
        setField(value);
    }

    public SecurityID get(SecurityID value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public SecurityID getSecurityID() throws FieldNotFound {
        SecurityID value = new SecurityID();
        getField(value);
        return value;
    }

    public boolean isSet(SecurityID field) {
        return isSetField(field);
    }

    public boolean isSetSecurityID() {
        return isSetField(SecurityID.FIELD);
    }

    public void set(Symbol value) {
        setField(value);
    }

    public Symbol get(Symbol value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public Symbol getSymbol() throws FieldNotFound {
        Symbol value = new Symbol();
        getField(value);
        return value;
    }

    public boolean isSet(Symbol field) {
        return isSetField(field);
    }

    public boolean isSetSymbol() {
        return isSetField(Symbol.FIELD);
    }

    public void set(TransactTime value) {
        setField(value);
    }

    public TransactTime get(TransactTime value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public TransactTime getTransactTime() throws FieldNotFound {
        TransactTime value = new TransactTime();
        getField(value);
        return value;
    }

    public boolean isSet(TransactTime field) {
        return isSetField(field);
    }

    public boolean isSetTransactTime() {
        return isSetField(TransactTime.FIELD);
    }

    public void set(AccruedInterestAmt value) {
        setField(value);
    }

    public AccruedInterestAmt get(AccruedInterestAmt value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public AccruedInterestAmt getAccruedInterestAmt() throws FieldNotFound {
        AccruedInterestAmt value = new AccruedInterestAmt();
        getField(value);
        return value;
    }

    public boolean isSet(AccruedInterestAmt field) {
        return isSetField(field);
    }

    public boolean isSetAccruedInterestAmt() {
        return isSetField(AccruedInterestAmt.FIELD);
    }

    public void set(Yield value) {
        setField(value);
    }

    public Yield get(Yield value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public Yield getYield() throws FieldNotFound {
        Yield value = new Yield();
        getField(value);
        return value;
    }

    public boolean isSet(Yield field) {
        return isSetField(field);
    }

    public boolean isSetYield() {
        return isSetField(Yield.FIELD);
    }

    public void set(MDUpdateAction value) {
        setField(value);
    }

    public MDUpdateAction get(MDUpdateAction value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public MDUpdateAction getMDUpdateAction() throws FieldNotFound {
        MDUpdateAction value = new MDUpdateAction();
        getField(value);
        return value;
    }

    public boolean isSet(MDUpdateAction field) {
        return isSetField(field);
    }

    public boolean isSetMDUpdateAction() {
        return isSetField(MDUpdateAction.FIELD);
    }

    public void set(UnderlyingDirtyPrice value) {
        setField(value);
    }

    public UnderlyingDirtyPrice get(UnderlyingDirtyPrice value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public UnderlyingDirtyPrice getUnderlyingDirtyPrice() throws FieldNotFound {
        UnderlyingDirtyPrice value = new UnderlyingDirtyPrice();
        getField(value);
        return value;
    }

    public boolean isSet(UnderlyingDirtyPrice field) {
        return isSetField(field);
    }

    public boolean isSetUnderlyingDirtyPrice() {
        return isSetField(UnderlyingDirtyPrice.FIELD);
    }

    public void set(ApplID value) {
        setField(value);
    }

    public ApplID get(ApplID value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public ApplID getApplID() throws FieldNotFound {
        ApplID value = new ApplID();
        getField(value);
        return value;
    }

    public boolean isSet(ApplID field) {
        return isSetField(field);
    }

    public boolean isSetApplID() {
        return isSetField(ApplID.FIELD);
    }

    public void set(TotalValueTraded value) {
        setField(value);
    }

    public TotalValueTraded get(TotalValueTraded value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public TotalValueTraded getTotalValueTraded() throws FieldNotFound {
        TotalValueTraded value = new TotalValueTraded();
        getField(value);
        return value;
    }

    public boolean isSet(TotalValueTraded field) {
        return isSetField(field);
    }

    public boolean isSetTotalValueTraded() {
        return isSetField(TotalValueTraded.FIELD);
    }

}
