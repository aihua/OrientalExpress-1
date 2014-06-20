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

public class NewOrderSingle extends Message {
    private static final long serialVersionUID = 20130819;
	public static final String MSGTYPE = "D";

    public NewOrderSingle() {
        super();
        getHeader().setField(new MsgType(MSGTYPE));
    }

    public NewOrderSingle(int[] fieldOrder) {
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

    public void set(OrderQty value) {
        setField(value);
    }

    public OrderQty get(OrderQty value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public OrderQty getOrderQty() throws FieldNotFound {
        OrderQty value = new OrderQty();
        getField(value);
        return value;
    }

    public boolean isSet(OrderQty field) {
        return isSetField(field);
    }

    public boolean isSetOrderQty() {
        return isSetField(OrderQty.FIELD);
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

    public void set(Price value) {
        setField(value);
    }

    public Price get(Price value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public Price getPrice() throws FieldNotFound {
        Price value = new Price();
        getField(value);
        return value;
    }

    public boolean isSet(Price field) {
        return isSetField(field);
    }

    public boolean isSetPrice() {
        return isSetField(Price.FIELD);
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

    public void set(TimeInForce value) {
        setField(value);
    }

    public TimeInForce get(TimeInForce value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public TimeInForce getTimeInForce() throws FieldNotFound {
        TimeInForce value = new TimeInForce();
        getField(value);
        return value;
    }

    public boolean isSet(TimeInForce field) {
        return isSetField(field);
    }

    public boolean isSetTimeInForce() {
        return isSetField(TimeInForce.FIELD);
    }

    public void set(TradeDate value) {
        setField(value);
    }

    public TradeDate get(TradeDate value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public TradeDate getTradeDate() throws FieldNotFound {
        TradeDate value = new TradeDate();
        getField(value);
        return value;
    }

    public boolean isSet(TradeDate field) {
        return isSetField(field);
    }

    public boolean isSetTradeDate() {
        return isSetField(TradeDate.FIELD);
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

    public void set(ProcessCode value) {
        setField(value);
    }

    public ProcessCode get(ProcessCode value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public ProcessCode getProcessCode() throws FieldNotFound {
        ProcessCode value = new ProcessCode();
        getField(value);
        return value;
    }

    public boolean isSet(ProcessCode field) {
        return isSetField(field);
    }

    public boolean isSetProcessCode() {
        return isSetField(ProcessCode.FIELD);
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

    public void set(UnderlyingSecurityID value) {
        setField(value);
    }

    public UnderlyingSecurityID get(UnderlyingSecurityID value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public UnderlyingSecurityID getUnderlyingSecurityID() throws FieldNotFound {
        UnderlyingSecurityID value = new UnderlyingSecurityID();
        getField(value);
        return value;
    }

    public boolean isSet(UnderlyingSecurityID field) {
        return isSetField(field);
    }

    public boolean isSetUnderlyingSecurityID() {
        return isSetField(UnderlyingSecurityID.FIELD);
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

    public void set(AccountType value) {
        setField(value);
    }

    public AccountType get(AccountType value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public AccountType getAccountType() throws FieldNotFound {
        AccountType value = new AccountType();
        getField(value);
        return value;
    }

    public boolean isSet(AccountType field) {
        return isSetField(field);
    }

    public boolean isSetAccountType() {
        return isSetField(AccountType.FIELD);
    }

    public void set(ConfirmID value) {
        setField(value);
    }

    public ConfirmID get(ConfirmID value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public ConfirmID getConfirmID() throws FieldNotFound {
        ConfirmID value = new ConfirmID();
        getField(value);
        return value;
    }

    public boolean isSet(ConfirmID field) {
        return isSetField(field);
    }

    public boolean isSetConfirmID() {
        return isSetField(ConfirmID.FIELD);
    }

    public void set(ExerciseMethod value) {
        setField(value);
    }

    public ExerciseMethod get(ExerciseMethod value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public ExerciseMethod getExerciseMethod() throws FieldNotFound {
        ExerciseMethod value = new ExerciseMethod();
        getField(value);
        return value;
    }

    public boolean isSet(ExerciseMethod field) {
        return isSetField(field);
    }

    public boolean isSetExerciseMethod() {
        return isSetField(ExerciseMethod.FIELD);
    }

    public void set(QuoteRefID value) {
        setField(value);
    }

    public QuoteRefID get(QuoteRefID value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public QuoteRefID getQuoteRefID() throws FieldNotFound {
        QuoteRefID value = new QuoteRefID();
        getField(value);
        return value;
    }

    public boolean isSet(QuoteRefID field) {
        return isSetField(field);
    }

    public boolean isSetQuoteRefID() {
        return isSetField(QuoteRefID.FIELD);
    }

}
