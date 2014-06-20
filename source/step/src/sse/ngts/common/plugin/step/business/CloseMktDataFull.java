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

public class CloseMktDataFull extends Message {
    private static final long serialVersionUID = 20130819;
	public static final String MSGTYPE = "U013";

    public CloseMktDataFull() {
        super();
        getHeader().setField(new MsgType(MSGTYPE));
    }

    public CloseMktDataFull(int[] fieldOrder) {
        super(fieldOrder);
        getHeader().setField(new MsgType(MSGTYPE));
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

    public void set(QuoteType value) {
        setField(value);
    }

    public QuoteType get(QuoteType value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public QuoteType getQuoteType() throws FieldNotFound {
        QuoteType value = new QuoteType();
        getField(value);
        return value;
    }

    public boolean isSet(QuoteType field) {
        return isSetField(field);
    }

    public boolean isSetQuoteType() {
        return isSetField(QuoteType.FIELD);
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
