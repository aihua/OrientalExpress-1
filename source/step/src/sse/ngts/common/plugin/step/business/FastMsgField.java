package sse.ngts.common.plugin.step.business;

public class FastMsgField {
	/** 所有用到的Template　field定义常量*/
	//行情数据模版
	public static FastMsgField ApplID = new FastMsgField("ApplID", 1180);
	public static FastMsgField ApplSeqNum = new FastMsgField("ApplSeqNum", 1181);
	public static FastMsgField Symbol = new FastMsgField("Symbol", 55);
	public static FastMsgField TradeDate = new FastMsgField("TradeDate", 75);
	public static FastMsgField SendingTime = new FastMsgField("SendingTime", 52);
	public static FastMsgField CFICode = new FastMsgField("CFICode", 461);
	public static FastMsgField PrevClosePx = new FastMsgField("PrevClosePx", 140);
	public static FastMsgField PrevSetPx = new FastMsgField("PrevSetPx",734);
	public static FastMsgField NumTrades = new FastMsgField("NumTrades", 8503);
	public static FastMsgField TotalValueTraded = new FastMsgField("TotalValueTraded", 8504);
	public static FastMsgField TradeVolume = new FastMsgField("TradeVolume", 1020);
	public static FastMsgField MDFullGrp = new FastMsgField("MDFullGrp", -1);//-1,没有ＩＤ
	public static FastMsgField MDEntryType = new FastMsgField("MDEntryType", 269);
	public static FastMsgField MDEntryPx = new FastMsgField("MDEntryPx", 270);
	public static FastMsgField MDEntrySize = new FastMsgField("MDEntrySize", 271);
	public static FastMsgField MDEntryTime = new FastMsgField("MDEntryTime", 273);
	public static FastMsgField MDEntryPositionNo = new FastMsgField("MDEntryPositionNo", 290);
	public static FastMsgField TradingPhaseCode = new FastMsgField("TradingPhaseCode", 8538);
	public static FastMsgField SecurityID = new FastMsgField("SecurityID", 48);
	public static FastMsgField RefreshIndicator = new FastMsgField("RefreshIndicator", 1187);
	public static FastMsgField TotalLongPosition = new FastMsgField("TotalLongPosition", 8506);
	
	private int tag;
	private String name;

	public FastMsgField(String name, int tag) {
		super();
		this.name = name;
		this.tag = tag;
	}

	public int getTag() {
		return tag;
	}

	public String getName() {
		return name;
	}

}
