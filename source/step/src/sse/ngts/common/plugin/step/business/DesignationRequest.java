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

public class DesignationRequest extends Message {
    private static final long serialVersionUID = 20130819;
	public static final String MSGTYPE = "U001";

    public DesignationRequest() {
        super();
        getHeader().setField(new MsgType(MSGTYPE));
    }

    public DesignationRequest(int[] fieldOrder) {
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

    public void set(DesignationInstruction value) {
        setField(value);
    }

    public DesignationInstruction get(DesignationInstruction value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public DesignationInstruction getDesignationInstruction() throws FieldNotFound {
        DesignationInstruction value = new DesignationInstruction();
        getField(value);
        return value;
    }

    public boolean isSet(DesignationInstruction field) {
        return isSetField(field);
    }

    public boolean isSetDesignationInstruction() {
        return isSetField(DesignationInstruction.FIELD);
    }

    public void set(DesignationTransType value) {
        setField(value);
    }

    public DesignationTransType get(DesignationTransType value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public DesignationTransType getDesignationTransType() throws FieldNotFound {
        DesignationTransType value = new DesignationTransType();
        getField(value);
        return value;
    }

    public boolean isSet(DesignationTransType field) {
        return isSetField(field);
    }

    public boolean isSetDesignationTransType() {
        return isSetField(DesignationTransType.FIELD);
    }

}
