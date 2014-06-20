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

public class PartyDetailsListReport extends Message {
    private static final long serialVersionUID = 20130819;
	public static final String MSGTYPE = "U015";

    public PartyDetailsListReport() {
        super();
        getHeader().setField(new MsgType(MSGTYPE));
    }

    public PartyDetailsListReport(int[] fieldOrder) {
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

    public void set(LastFragment value) {
        setField(value);
    }

    public LastFragment get(LastFragment value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public LastFragment getLastFragment() throws FieldNotFound {
        LastFragment value = new LastFragment();
        getField(value);
        return value;
    }

    public boolean isSet(LastFragment field) {
        return isSetField(field);
    }

    public boolean isSetLastFragment() {
        return isSetField(LastFragment.FIELD);
    }

    public void set(ApplTotalMessageCount value) {
        setField(value);
    }

    public ApplTotalMessageCount get(ApplTotalMessageCount value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public ApplTotalMessageCount getApplTotalMessageCount() throws FieldNotFound {
        ApplTotalMessageCount value = new ApplTotalMessageCount();
        getField(value);
        return value;
    }

    public boolean isSet(ApplTotalMessageCount field) {
        return isSetField(field);
    }

    public boolean isSetApplTotalMessageCount() {
        return isSetField(ApplTotalMessageCount.FIELD);
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

    public void set(PartyDetailsListReportID value) {
        setField(value);
    }

    public PartyDetailsListReportID get(PartyDetailsListReportID value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public PartyDetailsListReportID getPartyDetailsListReportID() throws FieldNotFound {
        PartyDetailsListReportID value = new PartyDetailsListReportID();
        getField(value);
        return value;
    }

    public boolean isSet(PartyDetailsListReportID field) {
        return isSetField(field);
    }

    public boolean isSetPartyDetailsListReportID() {
        return isSetField(PartyDetailsListReportID.FIELD);
    }

}
