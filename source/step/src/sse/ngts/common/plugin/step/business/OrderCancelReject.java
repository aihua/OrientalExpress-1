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

public class OrderCancelReject extends Message {
    private static final long serialVersionUID = 20130819;
	public static final String MSGTYPE = "9";

    public OrderCancelReject() {
        super();
        getHeader().setField(new MsgType(MSGTYPE));
    }

    public OrderCancelReject(int[] fieldOrder) {
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

    public void set(CxlRejReason value) {
        setField(value);
    }

    public CxlRejReason get(CxlRejReason value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public CxlRejReason getCxlRejReason() throws FieldNotFound {
        CxlRejReason value = new CxlRejReason();
        getField(value);
        return value;
    }

    public boolean isSet(CxlRejReason field) {
        return isSetField(field);
    }

    public boolean isSetCxlRejReason() {
        return isSetField(CxlRejReason.FIELD);
    }

    public void set(CxlRejResponseTo value) {
        setField(value);
    }

    public CxlRejResponseTo get(CxlRejResponseTo value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public CxlRejResponseTo getCxlRejResponseTo() throws FieldNotFound {
        CxlRejResponseTo value = new CxlRejResponseTo();
        getField(value);
        return value;
    }

    public boolean isSet(CxlRejResponseTo field) {
        return isSetField(field);
    }

    public boolean isSetCxlRejResponseTo() {
        return isSetField(CxlRejResponseTo.FIELD);
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
