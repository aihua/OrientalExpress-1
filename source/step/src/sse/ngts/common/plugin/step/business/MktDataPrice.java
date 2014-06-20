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

public class MktDataPrice extends Message {
    private static final long serialVersionUID = 20130819;
	public static final String MSGTYPE = "U010";

    public MktDataPrice() {
        super();
        getHeader().setField(new MsgType(MSGTYPE));
    }

    public MktDataPrice(int[] fieldOrder) {
        super(fieldOrder);
        getHeader().setField(new MsgType(MSGTYPE));
    }

    public void set(AvgPx value) {
        setField(value);
    }

    public AvgPx get(AvgPx value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public AvgPx getAvgPx() throws FieldNotFound {
        AvgPx value = new AvgPx();
        getField(value);
        return value;
    }

    public boolean isSet(AvgPx field) {
        return isSetField(field);
    }

    public boolean isSetAvgPx() {
        return isSetField(AvgPx.FIELD);
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

    public void set(PreClosePx value) {
        setField(value);
    }

    public PreClosePx get(PreClosePx value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public PreClosePx getPreClosePx() throws FieldNotFound {
        PreClosePx value = new PreClosePx();
        getField(value);
        return value;
    }

    public boolean isSet(PreClosePx field) {
        return isSetField(field);
    }

    public boolean isSetPreClosePx() {
        return isSetField(PreClosePx.FIELD);
    }

    public void set(NoMDEntries value) {
        setField(value);
    }

    public NoMDEntries get(NoMDEntries value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public NoMDEntries getNoMDEntries() throws FieldNotFound {
        NoMDEntries value = new NoMDEntries();
        getField(value);
        return value;
    }

    public boolean isSet(NoMDEntries field) {
        return isSetField(field);
    }

    public boolean isSetNoMDEntries() {
        return isSetField(NoMDEntries.FIELD);
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

    public void set(TotalVolumeTraded value) {
        setField(value);
    }

    public TotalVolumeTraded get(TotalVolumeTraded value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public TotalVolumeTraded getTotalVolumeTraded() throws FieldNotFound {
        TotalVolumeTraded value = new TotalVolumeTraded();
        getField(value);
        return value;
    }

    public boolean isSet(TotalVolumeTraded field) {
        return isSetField(field);
    }

    public boolean isSetTotalVolumeTraded() {
        return isSetField(TotalVolumeTraded.FIELD);
    }

    public void set(NumTrades value) {
        setField(value);
    }

    public NumTrades get(NumTrades value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public NumTrades getNumTrades() throws FieldNotFound {
        NumTrades value = new NumTrades();
        getField(value);
        return value;
    }

    public boolean isSet(NumTrades field) {
        return isSetField(field);
    }

    public boolean isSetNumTrades() {
        return isSetField(NumTrades.FIELD);
    }

    public void set(TotalValueTraded value) {
        setField(value);
    }

    public TotalValueTraded get(TotalValueTraded value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public TotalValueTraded getTotalValueTraded() throws FieldNotFound {
        TotalValueTraded value = new TotalValueTraded();
        getField(value);
        return value;
    }

    public boolean isSet(TotalValueTraded field) {
        return isSetField(field);
    }

    public boolean isSetTotalValueTraded() {
        return isSetField(TotalValueTraded.FIELD);
    }

    public void set(PreCloseYield value) {
        setField(value);
    }

    public PreCloseYield get(PreCloseYield value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public PreCloseYield getPreCloseYield() throws FieldNotFound {
        PreCloseYield value = new PreCloseYield();
        getField(value);
        return value;
    }

    public boolean isSet(PreCloseYield field) {
        return isSetField(field);
    }

    public boolean isSetPreCloseYield() {
        return isSetField(PreCloseYield.FIELD);
    }

    public void set(PreAvgPx value) {
        setField(value);
    }

    public PreAvgPx get(PreAvgPx value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public PreAvgPx getPreAvgPx() throws FieldNotFound {
        PreAvgPx value = new PreAvgPx();
        getField(value);
        return value;
    }

    public boolean isSet(PreAvgPx field) {
        return isSetField(field);
    }

    public boolean isSetPreAvgPx() {
        return isSetField(PreAvgPx.FIELD);
    }

    public void set(PreAvgYield value) {
        setField(value);
    }

    public PreAvgYield get(PreAvgYield value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public PreAvgYield getPreAvgYield() throws FieldNotFound {
        PreAvgYield value = new PreAvgYield();
        getField(value);
        return value;
    }

    public boolean isSet(PreAvgYield field) {
        return isSetField(field);
    }

    public boolean isSetPreAvgYield() {
        return isSetField(PreAvgYield.FIELD);
    }

    public void set(AvgYield value) {
        setField(value);
    }

    public AvgYield get(AvgYield value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public AvgYield getAvgYield() throws FieldNotFound {
        AvgYield value = new AvgYield();
        getField(value);
        return value;
    }

    public boolean isSet(AvgYield field) {
        return isSetField(field);
    }

    public boolean isSetAvgYield() {
        return isSetField(AvgYield.FIELD);
    }

}
