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

public class QuoteResponse extends Message {
    private static final long serialVersionUID = 20130819;
	public static final String MSGTYPE = "AJ";

    public QuoteResponse() {
        super();
        getHeader().setField(new MsgType(MSGTYPE));
    }

    public QuoteResponse(int[] fieldOrder) {
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

    public void set(QuoteRespID value) {
        setField(value);
    }

    public QuoteRespID get(QuoteRespID value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public QuoteRespID getQuoteRespID() throws FieldNotFound {
        QuoteRespID value = new QuoteRespID();
        getField(value);
        return value;
    }

    public boolean isSet(QuoteRespID field) {
        return isSetField(field);
    }

    public boolean isSetQuoteRespID() {
        return isSetField(QuoteRespID.FIELD);
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
