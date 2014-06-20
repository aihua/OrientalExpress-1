package sse.ngts.ezexpress.app;

/**
 * APIö��������
 */
public class ExpressEnum {

	/**
	 * ����ģʽö��
	 */
	public enum EpsConnMode {
		EPS_CONN_MODE_TCP(1), /* TCP����ģʽ */
		EPS_CONN_MODE_UDP_UNICAST(2), /* UDP����ģʽ */
		EPS_CONN_MODE_UDP_MULTICAST(3); /* UDP�ಥģʽ */

		private int connMode;

		private EpsConnMode(int connMode) {
			this.connMode = connMode;
		}

		public int getConnMode() {
			return connMode;
		}
	}

	/**
	 * �г�����ö��
	 */
	public enum MarketType {
		EPS_MKTTYPE_ALL(0, "00"), /* �����г� */
		EPS_MKTTYPE_STK(1, "01"), /* ��Ʊ�г�(��ָ��) */
		EPS_MKTTYPE_DEV(2, "02"); /* ����Ʒ�г� */

		private int mktType;
		private String mkdRequest;

		private MarketType(int mktType, String mkdRequest) {
			this.mktType = mktType;
			this.mkdRequest = mkdRequest;
		}

		public int getMktType() {
			return mktType;
		}

		public String getMkdRequest() {
			return mkdRequest;
		}
	}

	/**
	 * ����ģʽö��
	 */
	public enum EpsTrdSesModeTag {
		EPS_TRDSES_MODE_TESTING(1), /* ϵͳ����ģʽ */
		EPS_TRDSES_MODE_SIMULATED(2), /* ģ�⽻��ģʽ */
		EPS_TRDSES_MODE_PRODUCTION(3); /* ����ģʽ */

		private int trdsesMode;

		private EpsTrdSesModeTag(int trdsesMode) {
			this.trdsesMode = trdsesMode;
		}

		public int getTrdsesMode() {
			return trdsesMode;
		}
	}

	/**
	 * �¼�����ö��
	 */
	public enum EpsEventTypeTag {
		EPS_EVENTTYPE_INFORMATION(1), /* ��ʾ��Ϣ���� */
		EPS_EVENTTYPE_WARNING(2), /* ������Ϣ���� */
		EPS_EVENTTYPE_ERROR(3), /* ������Ϣ���� */
		EPS_EVENTTYPE_FATAL(4); /* ���ش�����Ϣ���� */

		private int eventType;

		private EpsEventTypeTag(int eventType) {
			this.eventType = eventType;
		}

		public int getEventType() {
			return eventType;
		}
	}

}
