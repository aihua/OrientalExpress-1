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

/**
 * 收到消息后解析成的step头信息的封装
 * @author kzhao
 */
public class MktDataFull extends Message {
	private static final long serialVersionUID = 20130819;
	public static final String MSGTYPE = "W";

	public MktDataFull() {
		super();
		getHeader().setField(new MsgType(MSGTYPE));
	}

	public MktDataFull(int[] fieldOrder) {
		super(fieldOrder);
		getHeader().setField(new MsgType(MSGTYPE));
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

	public void set(AccruedInterestAmt value) {
		setField(value);
	}

	public AccruedInterestAmt get(AccruedInterestAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public AccruedInterestAmt getAccruedInterestAmt() throws FieldNotFound {
		AccruedInterestAmt value = new AccruedInterestAmt();
		getField(value);
		return value;
	}

	public boolean isSet(AccruedInterestAmt field) {
		return isSetField(field);
	}

	public boolean isSetAccruedInterestAmt() {
		return isSetField(AccruedInterestAmt.FIELD);
	}

	public void set(Yield value) {
		setField(value);
	}

	public Yield get(Yield value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public Yield getYield() throws FieldNotFound {
		Yield value = new Yield();
		getField(value);
		return value;
	}

	public boolean isSet(Yield field) {
		return isSetField(field);
	}

	public boolean isSetYield() {
		return isSetField(Yield.FIELD);
	}

	public void set(MDEntryType value) {
		setField(value);
	}

	public MDEntryType get(MDEntryType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public MDEntryType getMDEntryType() throws FieldNotFound {
		MDEntryType value = new MDEntryType();
		getField(value);
		return value;
	}

	public boolean isSet(MDEntryType field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryType() {
		return isSetField(MDEntryType.FIELD);
	}

	public void set(MDEntryPx value) {
		setField(value);
	}

	public MDEntryPx get(MDEntryPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public MDEntryPx getMDEntryPx() throws FieldNotFound {
		MDEntryPx value = new MDEntryPx();
		getField(value);
		return value;
	}

	public boolean isSet(MDEntryPx field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryPx() {
		return isSetField(MDEntryPx.FIELD);
	}

	public void set(MDEntrySize value) {
		setField(value);
	}

	public MDEntrySize get(MDEntrySize value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public MDEntrySize getMDEntrySize() throws FieldNotFound {
		MDEntrySize value = new MDEntrySize();
		getField(value);
		return value;
	}

	public boolean isSet(MDEntrySize field) {
		return isSetField(field);
	}

	public boolean isSetMDEntrySize() {
		return isSetField(MDEntrySize.FIELD);
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

	public void set(MDEntryRefID value) {
		setField(value);
	}

	public MDEntryRefID get(MDEntryRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public MDEntryRefID getMDEntryRefID() throws FieldNotFound {
		MDEntryRefID value = new MDEntryRefID();
		getField(value);
		return value;
	}

	public boolean isSet(MDEntryRefID field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryRefID() {
		return isSetField(MDEntryRefID.FIELD);
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

	public void set(UnderlyingDirtyPrice value) {
		setField(value);
	}

	public UnderlyingDirtyPrice get(UnderlyingDirtyPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public UnderlyingDirtyPrice getUnderlyingDirtyPrice() throws FieldNotFound {
		UnderlyingDirtyPrice value = new UnderlyingDirtyPrice();
		getField(value);
		return value;
	}

	public boolean isSet(UnderlyingDirtyPrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingDirtyPrice() {
		return isSetField(UnderlyingDirtyPrice.FIELD);
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

	public void set(MDReportID value) {
		setField(value);
	}

	public MDReportID get(MDReportID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public MDReportID getMDReportID() throws FieldNotFound {
		MDReportID value = new MDReportID();
		getField(value);
		return value;
	}

	public boolean isSet(MDReportID field) {
		return isSetField(field);
	}

	public boolean isSetMDReportID() {
		return isSetField(MDReportID.FIELD);
	}

	public void set(RefreshIndicator value) {
		setField(value);
	}

	public RefreshIndicator get(RefreshIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public RefreshIndicator getRefreshIndicator() throws FieldNotFound {
		RefreshIndicator value = new RefreshIndicator();
		getField(value);
		return value;
	}

	public boolean isSet(RefreshIndicator field) {
		return isSetField(field);
	}

	public boolean isSetRefreshIndicator() {
		return isSetField(RefreshIndicator.FIELD);
	}

	public void set(TradingPhaseCode value) {
		setField(value);
	}

	public TradingPhaseCode get(TradingPhaseCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public TradingPhaseCode getTradingPhaseCode() throws FieldNotFound {
		TradingPhaseCode value = new TradingPhaseCode();
		getField(value);
		return value;
	}

	public boolean isSet(TradingPhaseCode field) {
		return isSetField(field);
	}

	public boolean isSetTradingPhaseCode() {
		return isSetField(TradingPhaseCode.FIELD);
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

	public void set(MDEntryPositionNo value) {
		setField(value);
	}

	public MDEntryPositionNo get(MDEntryPositionNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public MDEntryPositionNo getMDEntryPositionNo() throws FieldNotFound {
		MDEntryPositionNo value = new MDEntryPositionNo();
		getField(value);
		return value;
	}

	public boolean isSet(MDEntryPositionNo field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryPositionNo() {
		return isSetField(MDEntryPositionNo.FIELD);
	}

	public void set(SenderCompID value) {
		setField(value);
	}

	public SenderCompID get(SenderCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public SenderCompID getSenderCompID() throws FieldNotFound {
		SenderCompID value = new SenderCompID();
		getField(value);
		return value;
	}

	public boolean isSet(SenderCompID field) {
		return isSetField(field);
	}

	public boolean isSetSenderCompID() {
		return isSetField(SenderCompID.FIELD);
	}

	public void set(TargetCompID value) {
		setField(value);
	}

	public TargetCompID get(TargetCompID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public TargetCompID getTargetCompID() throws FieldNotFound {
		TargetCompID value = new TargetCompID();
		getField(value);
		return value;
	}

	public boolean isSet(TargetCompID field) {
		return isSetField(field);
	}

	public boolean isSetTargetCompID() {
		return isSetField(TargetCompID.FIELD);
	}

	public void set(SendingTime value) {
		setField(value);
	}

	public SendingTime get(SendingTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public SendingTime getSendingTime() throws FieldNotFound {
		SendingTime value = new SendingTime();
		getField(value);
		return value;
	}

	public boolean isSet(SendingTime field) {
		return isSetField(field);
	}

	public boolean isSetSendingTime() {
		return isSetField(SendingTime.FIELD);
	}

	public void set(SecurityType value) {
		setField(value);
	}

	public SecurityType get(SecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public SecurityType getSecurityType() throws FieldNotFound {
		SecurityType value = new SecurityType();
		getField(value);
		return value;
	}

	public boolean isSet(SecurityType field) {
		return isSetField(field);
	}

	public boolean isSetSecurityType() {
		return isSetField(SecurityType.FIELD);
	}

	public void set(ApplSeqNum value) {
		setField(value);
	}

	public ApplSeqNum get(ApplSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public ApplSeqNum getApplSeqNum() throws FieldNotFound {
		ApplSeqNum value = new ApplSeqNum();
		getField(value);
		return value;
	}

	public boolean isSet(ApplSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetApplSeqNum() {
		return isSetField(ApplSeqNum.FIELD);
	}

	public void set(RawDataLength value) {
		setField(value);
	}

	public RawDataLength get(RawDataLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public RawDataLength getRawDataLength() throws FieldNotFound {
		RawDataLength value = new RawDataLength();
		getField(value);
		return value;
	}

	public boolean isSet(RawDataLength field) {
		return isSetField(field);
	}

	public boolean isSetRawDataLength() {
		return isSetField(RawDataLength.FIELD);
	}

	public void set(RawData value) {
		setField(value);
	}

	public RawData get(RawData value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public RawData getRawData() throws FieldNotFound {
		RawData value = new RawData();
		getField(value);
		return value;
	}

	public boolean isSet(RawData field) {
		return isSetField(field);
	}

	public boolean isSetRawData() {
		return isSetField(RawData.FIELD);
	}

	public void set(MDUpdateType value) {
		setField(value);
	}

	public MDUpdateType get(MDUpdateType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public MDUpdateType getMDUpdateType() throws FieldNotFound {
		MDUpdateType value = new MDUpdateType();
		getField(value);
		return value;
	}

	public boolean isSet(MDUpdateType field) {
		return isSetField(field);
	}

	public boolean isSetMDUpdateType() {
		return isSetField(MDUpdateType.FIELD);
	}

	public void set(TradSesMode value) {
		setField(value);
	}

	public TradSesMode get(TradSesMode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public TradSesMode getTradSesMode() throws FieldNotFound {
		TradSesMode value = new TradSesMode();
		getField(value);
		return value;
	}

	public boolean isSet(TradSesMode field) {
		return isSetField(field);
	}

	public boolean isSetTradSesMode() {
		return isSetField(TradSesMode.FIELD);
	}

	public void set(MDCount value) {
		setField(value);
	}

	public MDCount get(MDCount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public MDCount getMDCount() throws FieldNotFound {
		MDCount value = new MDCount();
		getField(value);
		return value;
	}

	public boolean isSet(MDCount field) {
		return isSetField(field);
	}

	public boolean isSetNoSecurities() {
		return isSetField(MDCount.FIELD);
	}

	public void set(CheckSum value) {
		setField(value);
	}

	public CheckSum get(CheckSum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public CheckSum getCheckSum() throws FieldNotFound {
		CheckSum value = new CheckSum();
		getField(value);
		return value;
	}

	public boolean isSet(CheckSum field) {
		return isSetField(field);
	}

	public boolean isSetCheckSum() {
		return isSetField(CheckSum.FIELD);
	}

	public void set(MsgSeqNum value) {
		setField(value);
	}

	public MsgSeqNum get(MsgSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public MsgSeqNum getMsgSeqNum() throws FieldNotFound {
		MsgSeqNum value = new MsgSeqNum();
		getField(value);
		return value;
	}

	public boolean isSet(MsgSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetMsgSeqNum() {
		return isSetField(MsgSeqNum.FIELD);
	}

	public void set(MessageEncoding value) {
		setField(value);
	}

	public MessageEncoding get(MessageEncoding value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public MessageEncoding getMessageEncoding() throws FieldNotFound {
		MessageEncoding value = new MessageEncoding();
		getField(value);
		return value;
	}

	public boolean isSet(MessageEncoding field) {
		return isSetField(field);
	}

	public boolean isSetMessageEncoding() {
		return isSetField(MessageEncoding.FIELD);
	}

	public void set(LastUpdateTime value) {
		setField(value);
	}

	public LastUpdateTime get(LastUpdateTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public LastUpdateTime getLastUpdateTime() throws FieldNotFound {
		LastUpdateTime value = new LastUpdateTime();
		getField(value);
		return value;
	}

	public boolean isSet(LastUpdateTime field) {
		return isSetField(field);
	}

	public boolean isSetLastUpdateTime() {
		return isSetField(LastUpdateTime.FIELD);
	}

	public void set(TotalLongPosition value) {
		setField(value);
	}

	public TotalLongPosition get(TotalLongPosition value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public TotalLongPosition getTotalLongPosition() throws FieldNotFound {
		TotalLongPosition value = new TotalLongPosition();
		getField(value);
		return value;
	}

	public boolean isSet(TotalLongPosition field) {
		return isSetField(field);
	}

	public boolean isSetTotalLongPosition() {
		return isSetField(TotalLongPosition.FIELD);
	}
}
