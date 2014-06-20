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

public class QuoteStatusSend extends Message {
    private static final long serialVersionUID = 20130819;
	public static final String MSGTYPE = "U012";

    public QuoteStatusSend() {
        super();
        getHeader().setField(new MsgType(MSGTYPE));
    }

    public QuoteStatusSend(int[] fieldOrder) {
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

    public void set(QuoteStatus value) {
        setField(value);
    }

    public QuoteStatus get(QuoteStatus value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public QuoteStatus getQuoteStatus() throws FieldNotFound {
        QuoteStatus value = new QuoteStatus();
        getField(value);
        return value;
    }

    public boolean isSet(QuoteStatus field) {
        return isSetField(field);
    }

    public boolean isSetQuoteStatus() {
        return isSetField(QuoteStatus.FIELD);
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

    public void set(QuoteRespType value) {
        setField(value);
    }

    public QuoteRespType get(QuoteRespType value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public QuoteRespType getQuoteRespType() throws FieldNotFound {
        QuoteRespType value = new QuoteRespType();
        getField(value);
        return value;
    }

    public boolean isSet(QuoteRespType field) {
        return isSetField(field);
    }

    public boolean isSetQuoteRespType() {
        return isSetField(QuoteRespType.FIELD);
    }

}
