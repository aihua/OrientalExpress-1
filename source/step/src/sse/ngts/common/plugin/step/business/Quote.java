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

public class Quote extends Message {
    private static final long serialVersionUID = 20130819;
	public static final String MSGTYPE = "S";

    public Quote() {
        super();
        getHeader().setField(new MsgType(MSGTYPE));
    }

    public Quote(int[] fieldOrder) {
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

    public void set(QuoteID value) {
        setField(value);
    }

    public QuoteID get(QuoteID value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public QuoteID getQuoteID() throws FieldNotFound {
        QuoteID value = new QuoteID();
        getField(value);
        return value;
    }

    public boolean isSet(QuoteID field) {
        return isSetField(field);
    }

    public boolean isSetQuoteID() {
        return isSetField(QuoteID.FIELD);
    }

    public void set(OrderQty2 value) {
        setField(value);
    }

    public OrderQty2 get(OrderQty2 value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public OrderQty2 getOrderQty2() throws FieldNotFound {
        OrderQty2 value = new OrderQty2();
        getField(value);
        return value;
    }

    public boolean isSet(OrderQty2 field) {
        return isSetField(field);
    }

    public boolean isSetOrderQty2() {
        return isSetField(OrderQty2.FIELD);
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

    public void set(OrderRestrictions value) {
        setField(value);
    }

    public OrderRestrictions get(OrderRestrictions value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public OrderRestrictions getOrderRestrictions() throws FieldNotFound {
        OrderRestrictions value = new OrderRestrictions();
        getField(value);
        return value;
    }

    public boolean isSet(OrderRestrictions field) {
        return isSetField(field);
    }

    public boolean isSetOrderRestrictions() {
        return isSetField(OrderRestrictions.FIELD);
    }

    public void set(Price2 value) {
        setField(value);
    }

    public Price2 get(Price2 value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public Price2 getPrice2() throws FieldNotFound {
        Price2 value = new Price2();
        getField(value);
        return value;
    }

    public boolean isSet(Price2 field) {
        return isSetField(field);
    }

    public boolean isSetPrice2() {
        return isSetField(Price2.FIELD);
    }

    public void set(PreTradeAnonymity value) {
        setField(value);
    }

    public PreTradeAnonymity get(PreTradeAnonymity value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public PreTradeAnonymity getPreTradeAnonymity() throws FieldNotFound {
        PreTradeAnonymity value = new PreTradeAnonymity();
        getField(value);
        return value;
    }

    public boolean isSet(PreTradeAnonymity field) {
        return isSetField(field);
    }

    public boolean isSetPreTradeAnonymity() {
        return isSetField(PreTradeAnonymity.FIELD);
    }

    public void set(DisplayQty value) {
        setField(value);
    }

    public DisplayQty get(DisplayQty value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public DisplayQty getDisplayQty() throws FieldNotFound {
        DisplayQty value = new DisplayQty();
        getField(value);
        return value;
    }

    public boolean isSet(DisplayQty field) {
        return isSetField(field);
    }

    public boolean isSetDisplayQty() {
        return isSetField(DisplayQty.FIELD);
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
