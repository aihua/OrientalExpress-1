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

public class IOI extends Message {
    private static final long serialVersionUID = 20130819;
	public static final String MSGTYPE = "6";

    public IOI() {
        super();
        getHeader().setField(new MsgType(MSGTYPE));
    }

    public IOI(int[] fieldOrder) {
        super(fieldOrder);
        getHeader().setField(new MsgType(MSGTYPE));
    }

    public void set(IOIID value) {
        setField(value);
    }

    public IOIID get(IOIID value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public IOIID getIOIID() throws FieldNotFound {
        IOIID value = new IOIID();
        getField(value);
        return value;
    }

    public boolean isSet(IOIID field) {
        return isSetField(field);
    }

    public boolean isSetIOIID() {
        return isSetField(IOIID.FIELD);
    }

    public void set(IOIRefID value) {
        setField(value);
    }

    public IOIRefID get(IOIRefID value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public IOIRefID getIOIRefID() throws FieldNotFound {
        IOIRefID value = new IOIRefID();
        getField(value);
        return value;
    }

    public boolean isSet(IOIRefID field) {
        return isSetField(field);
    }

    public boolean isSetIOIRefID() {
        return isSetField(IOIRefID.FIELD);
    }

    public void set(IOITransType value) {
        setField(value);
    }

    public IOITransType get(IOITransType value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public IOITransType getIOITransType() throws FieldNotFound {
        IOITransType value = new IOITransType();
        getField(value);
        return value;
    }

    public boolean isSet(IOITransType field) {
        return isSetField(field);
    }

    public boolean isSetIOITransType() {
        return isSetField(IOITransType.FIELD);
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

}
