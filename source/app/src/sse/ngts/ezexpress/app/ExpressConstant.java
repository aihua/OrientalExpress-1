package sse.ngts.ezexpress.app;


/**
 * �洢��̬����
 */
public class ExpressConstant {

	/** ���ӳ�ʱʱ�䣺�� **/
	public static final int CONNECT_TIMEOUT = 40;
	/** ����һ��������ʱ�䣺�� */
	public static final int HEARTBEATRATE = 20;
	/** ���ղ������ݳ�ʱʱ�䣺�� */
	public static final int RECEIVE_TIMEOUT = 40;
	//����ģ���õ��ĳ���
	public static final String STEP_REQID = "STEP";
	public static final String MARKET_XML_PATH_CFG = "cfg/marketXmlPathCfg.ini";

	public static final String SESSION_BACKFLOW = "back_flow";

	public static final String LOGOUT_TEXT = "Logout";
	public static final String SESSION_LOCK = "lock";

	public static final String STRING_ZERO = "0";
	public static final String STRING_ONE = "1";
	//TCP�������
	public static final String STEP_MSGTYPE_MARKET_DATA = "W";
	public static final String STEP_MSGTYPE_LOGIN = "A";
	public static final String STEP_MSGTYPE_MARKET = "V";
	public static final String STEP_MSGTYPE_MARKET_STATUS = "h";
	public static final String STEP_MSGTYPE_HEARTBEAT = "0";
	public static final String STEP_MSGTYPE_LOGINOUT = "5";
	public static final String STEP_TAG_BEGINSTRING = "8";
	public static final String STEP_TAG_BODYLENGTH = "9";
	public static final String STEP_TAG_MSGTYPE = "35";
	public static final String STEP_TAG_CHECKSUM = "10";
	public static final String STEP_VALUE_BEGINSTRING = "STEP.1.0.0";
	
	//���������õ��ĳ���
	public static final String BEGINSTRING = "8=STEP.1.0.0";//��ʼString:��8=STEP.1.0.0��
	public static final int BEGINSTRING_LENGTH_WITH_SPLIT = 13;//��ʼ����"��Ϣ�峤��"�ĳ���:��8=STEP.1.0.0��
	public static final int MAX_BODYLENGTH = 7;//"��Ϣ�峤��"����ֶ���󳤶ȣ�N5(9=*****)
	public static final int SPLIT_BYTE_LENGTH = 1;//�ָ������ȣ�����
	public static final String REGION_VALU_SPLIT_STRING = "=";//��=��
	public static final int BODYLENGTH_REGION_STRING = 9;//������Ϣ�����ֵ
	public static final int CHECKSUM_LENGTH = 6;//CHECKSUM���ȣ���10=134��
	public static final int BEGINSTRING_LENGTH_NOT_SPLIT = BEGINSTRING_LENGTH_WITH_SPLIT - SPLIT_BYTE_LENGTH;
	
}
