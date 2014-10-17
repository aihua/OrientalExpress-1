package sse.ngts.ezexpress.app;


/**
 * �洢��̬����
 */
public class ExpressConstant {

	/** ���ӳ�ʱʱ�䣺�� **/
	public static final int CONNECT_TIMEOUT = 40;
	/** ����һ��������ʱ�䣺�� */
	public static final int HEARTBEATRATE = 20;
	/** �������ݻ��棺�ֽ� */
	public static final int RECEIVE_BUFFERSIZE = 4194304;
	/** �����ֽ� */
	public static final int MAX_PACKAGESIE = 4096;
	/** ���ղ������ݳ�ʱʱ�䣺�� */
	public static final int RECEIVE_TIMEOUT = 40;
	//����ģ���õ��ĳ���
	public static final String STEP_REQID = "STEP";
	public static final String MARKET_XML_PATH_CFG = "cfg/marketXmlPathCfg.ini";
	public static final String SESSION_BACKFLOW = "back_flow";

	public static final String LOGOUT_TEXT = "Logout";
	public static final String SESSION_LOCK = "lock";
	//����
	public static final String DECODE_CHARSET = "GBK";

	//TCP�������
	public static final String STEP_MSGTYPE_MARKET_DATA = "W";
	public static final String STEP_MSGTYPE_MARKET_STATUS_DATA = "h";
	
	//���������õ��ĳ���
	public static final String BEGINSTRING = "8=FIXT.1.1";//��ʼString:��8=FIXT.1.1��
	public static final int BEGINSTRING_LENGTH_WITH_SPLIT = 11;//��ʼ����"��Ϣ�峤��"�ĳ���:��8=FIXT.1.1��
	public static final int MAX_BODYLENGTH = 7;//"��Ϣ�峤��"����ֶ���󳤶ȣ�N5(9=*****)
	public static final int SPLIT_BYTE_LENGTH = 1;//�ָ������ȣ�����
	public static final String REGION_VALU_SPLIT_STRING = "=";//��=��
	public static final int BODYLENGTH_REGION_STRING = 9;//������Ϣ�����ֵ
	public static final int CHECKSUM_LENGTH = 6;//CHECKSUM���ȣ���10=134��
	public static final int BEGINSTRING_LENGTH_NOT_SPLIT = BEGINSTRING_LENGTH_WITH_SPLIT - SPLIT_BYTE_LENGTH;
	
}
