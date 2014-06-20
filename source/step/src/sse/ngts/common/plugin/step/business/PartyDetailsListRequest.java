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

public class PartyDetailsListRequest extends Message {
    private static final long serialVersionUID = 20130819;
	public static final String MSGTYPE = "U014";

    public PartyDetailsListRequest() {
        super();
        getHeader().setField(new MsgType(MSGTYPE));
    }

    public PartyDetailsListRequest(int[] fieldOrder) {
        super(fieldOrder);
        getHeader().setField(new MsgType(MSGTYPE));
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

    public void set(RptSeq value) {
        setField(value);
    }

    public RptSeq get(RptSeq value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public RptSeq getRptSeq() throws FieldNotFound {
        RptSeq value = new RptSeq();
        getField(value);
        return value;
    }

    public boolean isSet(RptSeq field) {
        return isSetField(field);
    }

    public boolean isSetRptSeq() {
        return isSetField(RptSeq.FIELD);
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

    public void set(PartyDetailsListRequestID value) {
        setField(value);
    }

    public PartyDetailsListRequestID get(PartyDetailsListRequestID value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public PartyDetailsListRequestID getPartyDetailsListRequestID() throws FieldNotFound {
        PartyDetailsListRequestID value = new PartyDetailsListRequestID();
        getField(value);
        return value;
    }

    public boolean isSet(PartyDetailsListRequestID field) {
        return isSetField(field);
    }

    public boolean isSetPartyDetailsListRequestID() {
        return isSetField(PartyDetailsListRequestID.FIELD);
    }

}
