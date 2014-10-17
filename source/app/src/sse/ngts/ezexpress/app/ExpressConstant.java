package sse.ngts.ezexpress.app;


/**
 * 存储静态变量
 */
public class ExpressConstant {

	/** 连接超时时间：秒 **/
	public static final int CONNECT_TIMEOUT = 40;
	/** 发送一次心跳包时间：秒 */
	public static final int HEARTBEATRATE = 20;
	/** 接收数据缓存：字节 */
	public static final int RECEIVE_BUFFERSIZE = 4194304;
	/** 最大包字节 */
	public static final int MAX_PACKAGESIE = 4096;
	/** 接收不到数据超时时间：秒 */
	public static final int RECEIVE_TIMEOUT = 40;
	//解析模版用到的常量
	public static final String STEP_REQID = "STEP";
	public static final String MARKET_XML_PATH_CFG = "cfg/marketXmlPathCfg.ini";
	public static final String SESSION_BACKFLOW = "back_flow";

	public static final String LOGOUT_TEXT = "Logout";
	public static final String SESSION_LOCK = "lock";
	//编码
	public static final String DECODE_CHARSET = "GBK";

	//TCP行情接受
	public static final String STEP_MSGTYPE_MARKET_DATA = "W";
	public static final String STEP_MSGTYPE_MARKET_STATUS_DATA = "h";
	
	//解析行情用到的常量
	public static final String BEGINSTRING = "8=FIXT.1.1";//开始String:”8=FIXT.1.1“
	public static final int BEGINSTRING_LENGTH_WITH_SPLIT = 11;//开始到的"消息体长度"的长度:”8=FIXT.1.1“
	public static final int MAX_BODYLENGTH = 7;//"消息体长度"这个字段最大长度：N5(9=*****)
	public static final int SPLIT_BYTE_LENGTH = 1;//分隔符长度：”“
	public static final String REGION_VALU_SPLIT_STRING = "=";//”=“
	public static final int BODYLENGTH_REGION_STRING = 9;//代表消息体的域值
	public static final int CHECKSUM_LENGTH = 6;//CHECKSUM长度：”10=134“
	public static final int BEGINSTRING_LENGTH_NOT_SPLIT = BEGINSTRING_LENGTH_WITH_SPLIT - SPLIT_BYTE_LENGTH;
	
}
