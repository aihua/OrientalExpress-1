/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.business;

import sse.ngts.common.plugin.step.*;
import sse.ngts.common.plugin.step.field.*;

public class ExecutionReport extends Message {
    private static final long serialVersionUID = 20130819;
	public static final String MSGTYPE = "8";

    public ExecutionReport() {
        super();
        getHeader().setField(new MsgType(MSGTYPE));
    }

    public ExecutionReport(int[] fieldOrder) {
        super(fieldOrder);
        getHeader().setField(new MsgType(MSGTYPE));
    }

    public void set(ClOrdID value) {
        setField(value);
    }

    public ClOrdID get(ClOrdID value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public ClOrdID getClOrdID() throws FieldNotFound {
        ClOrdID value = new ClOrdID();
        getField(value);
        return value;
    }

    public boolean isSet(ClOrdID field) {
        return isSetField(field);
    }

    public boolean isSetClOrdID() {
        return isSetField(ClOrdID.FIELD);
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

    public void set(OrderID value) {
        setField(value);
    }

    public OrderID get(OrderID value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public OrderID getOrderID() throws FieldNotFound {
        OrderID value = new OrderID();
        getField(value);
        return value;
    }

    public boolean isSet(OrderID field) {
        return isSetField(field);
    }

    public boolean isSetOrderID() {
        return isSetField(OrderID.FIELD);
    }

    public void set(OrdStatus value) {
        setField(value);
    }

    public OrdStatus get(OrdStatus value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public OrdStatus getOrdStatus() throws FieldNotFound {
        OrdStatus value = new OrdStatus();
        getField(value);
        return value;
    }

    public boolean isSet(OrdStatus field) {
        return isSetField(field);
    }

    public boolean isSetOrdStatus() {
        return isSetField(OrdStatus.FIELD);
    }

    public void set(OrdType value) {
        setField(value);
    }

    public OrdType get(OrdType value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public OrdType getOrdType() throws FieldNotFound {
        OrdType value = new OrdType();
        getField(value);
        return value;
    }

    public boolean isSet(OrdType field) {
        return isSetField(field);
    }

    public boolean isSetOrdType() {
        return isSetField(OrdType.FIELD);
    }

    public void set(OrigClOrdID value) {
        setField(value);
    }

    public OrigClOrdID get(OrigClOrdID value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public OrigClOrdID getOrigClOrdID() throws FieldNotFound {
        OrigClOrdID value = new OrigClOrdID();
        getField(value);
        return value;
    }

    public boolean isSet(OrigClOrdID field) {
        return isSetField(field);
    }

    public boolean isSetOrigClOrdID() {
        return isSetField(OrigClOrdID.FIELD);
    }

    public void set(OrigTime value) {
        setField(value);
    }

    public OrigTime get(OrigTime value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public OrigTime getOrigTime() throws FieldNotFound {
        OrigTime value = new OrigTime();
        getField(value);
        return value;
    }

    public boolean isSet(OrigTime field) {
        return isSetField(field);
    }

    public boolean isSetOrigTime() {
        return isSetField(OrigTime.FIELD);
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

    public void set(Side value) {
        setField(value);
    }

    public Side get(Side value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public Side getSide() throws FieldNotFound {
        Side value = new Side();
        getField(value);
        return value;
    }

    public boolean isSet(Side field) {
        return isSetField(field);
    }

    public boolean isSetSide() {
        return isSetField(Side.FIELD);
    }

    public void set(Text value) {
        setField(value);
    }

    public Text get(Text value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public Text getText() throws FieldNotFound {
        Text value = new Text();
        getField(value);
        return value;
    }

    public boolean isSet(Text field) {
        return isSetField(field);
    }

    public boolean isSetText() {
        return isSetField(Text.FIELD);
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

    public void set(PositionEffect value) {
        setField(value);
    }

    public PositionEffect get(PositionEffect value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public PositionEffect getPositionEffect() throws FieldNotFound {
        PositionEffect value = new PositionEffect();
        getField(value);
        return value;
    }

    public boolean isSet(PositionEffect field) {
        return isSetField(field);
    }

    public boolean isSetPositionEffect() {
        return isSetField(PositionEffect.FIELD);
    }

    public void set(OrdRejReason value) {
        setField(value);
    }

    public OrdRejReason get(OrdRejReason value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public OrdRejReason getOrdRejReason() throws FieldNotFound {
        OrdRejReason value = new OrdRejReason();
        getField(value);
        return value;
    }

    public boolean isSet(OrdRejReason field) {
        return isSetField(field);
    }

    public boolean isSetOrdRejReason() {
        return isSetField(OrdRejReason.FIELD);
    }

    public void set(ExecType value) {
        setField(value);
    }

    public ExecType get(ExecType value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public ExecType getExecType() throws FieldNotFound {
        ExecType value = new ExecType();
        getField(value);
        return value;
    }

    public boolean isSet(ExecType field) {
        return isSetField(field);
    }

    public boolean isSetExecType() {
        return isSetField(ExecType.FIELD);
    }

    public void set(LeavesQty value) {
        setField(value);
    }

    public LeavesQty get(LeavesQty value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public LeavesQty getLeavesQty() throws FieldNotFound {
        LeavesQty value = new LeavesQty();
        getField(value);
        return value;
    }

    public boolean isSet(LeavesQty field) {
        return isSetField(field);
    }

    public boolean isSetLeavesQty() {
        return isSetField(LeavesQty.FIELD);
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

    public void set(CoveredOrUncovered value) {
        setField(value);
    }

    public CoveredOrUncovered get(CoveredOrUncovered value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public CoveredOrUncovered getCoveredOrUncovered() throws FieldNotFound {
        CoveredOrUncovered value = new CoveredOrUncovered();
        getField(value);
        return value;
    }

    public boolean isSet(CoveredOrUncovered field) {
        return isSetField(field);
    }

    public boolean isSetCoveredOrUncovered() {
        return isSetField(CoveredOrUncovered.FIELD);
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

    public void set(NoPartyIDs value) {
        setField(value);
    }

    public NoPartyIDs get(NoPartyIDs value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public NoPartyIDs getNoPartyIDs() throws FieldNotFound {
        NoPartyIDs value = new NoPartyIDs();
        getField(value);
        return value;
    }

    public boolean isSet(NoPartyIDs field) {
        return isSetField(field);
    }

    public boolean isSetNoPartyIDs() {
        return isSetField(NoPartyIDs.FIELD);
    }

    public void set(OwnerType value) {
        setField(value);
    }

    public OwnerType get(OwnerType value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public OwnerType getOwnerType() throws FieldNotFound {
        OwnerType value = new OwnerType();
        getField(value);
        return value;
    }

    public boolean isSet(OwnerType field) {
        return isSetField(field);
    }

    public boolean isSetOwnerType() {
        return isSetField(OwnerType.FIELD);
    }

    public void set(DiscretionPrice value) {
        setField(value);
    }

    public DiscretionPrice get(DiscretionPrice value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public DiscretionPrice getDiscretionPrice() throws FieldNotFound {
        DiscretionPrice value = new DiscretionPrice();
        getField(value);
        return value;
    }

    public boolean isSet(DiscretionPrice field) {
        return isSetField(field);
    }

    public boolean isSetDiscretionPrice() {
        return isSetField(DiscretionPrice.FIELD);
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

    public void set(NoFills value) {
        setField(value);
    }

    public NoFills get(NoFills value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public NoFills getNoFills() throws FieldNotFound {
        NoFills value = new NoFills();
        getField(value);
        return value;
    }

    public boolean isSet(NoFills field) {
        return isSetField(field);
    }

    public boolean isSetNoFills() {
        return isSetField(NoFills.FIELD);
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

    public void set(TransactTimeOnly value) {
        setField(value);
    }

    public TransactTimeOnly get(TransactTimeOnly value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public TransactTimeOnly getTransactTimeOnly() throws FieldNotFound {
        TransactTimeOnly value = new TransactTimeOnly();
        getField(value);
        return value;
    }

    public boolean isSet(TransactTimeOnly field) {
        return isSetField(field);
    }

    public boolean isSetTransactTimeOnly() {
        return isSetField(TransactTimeOnly.FIELD);
    }

}
