package sse.ngts.ezexpress.app.config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;
import org.openfast.Context;
import org.openfast.template.TemplateRegistry;
import org.openfast.template.loader.XMLMessageTemplateLoader;

import sse.ngts.common.plugin.step.STEPParser;
import sse.ngts.ezexpress.app.ExpressConstant;
import sse.ngts.ezexpress.util.ValidityUtil;

/**
 * ���ݽ����������ļ�������
 */
public class ParserConfig {
	private static Logger log = Logger.getLogger(ParserConfig.class);

	private static ParserConfig instance;

	private Map<String, String> reqIdXMLPathMap = new HashMap<String, String>();
	private Map<String, STEPParser> parserMap = new ConcurrentHashMap<String, STEPParser>();

	private Map<String, String> fastXMLPathMap = new HashMap<String, String>();
	private Map<String, Context> contextMap = new HashMap<String, Context>();

	private ParserConfig() {
		reqIdXMLPathMap.put(ExpressConstant.STEP_REQID, "cfg/step.xml");
		File configfile = new File(ExpressConstant.MARKET_XML_PATH_CFG);
		try {
			BufferedReader bReader = new BufferedReader(new FileReader(configfile));
			String line;
			while((line = bReader.readLine()) != null){
				String[] cp = line.split("=");
				if (cp.length != 2) {
					continue;
				}
				fastXMLPathMap.put(cp[0].trim(), cp[1].trim());
			}
			bReader.close();
		} catch (FileNotFoundException e) {
			log.error("marketXmlPathCfg.ini �ļ�������");
		} catch (IOException e) {
			log.error("��ȡmarketXmlPathCfg.ini�ļ��쳣��", e);
		}
	}

	public static synchronized ParserConfig getInstance() {
		if (instance == null) {
			instance = new ParserConfig();
		}
		return instance;
	}

	/**
	 * ��ʼ������ģ��
	 */
	public void init() {
		initStep();
		initFast();
	}

	public void initStep() {
		//����StepЭ��ģ��
		for (String reqId : reqIdXMLPathMap.keySet()) {
			try {
				STEPParser parser = new STEPParser(reqIdXMLPathMap.get(reqId));
				setParser(reqId, parser);
			} catch (Exception e) {
				log.error("STEPParserConfig.init error:", e);
			}
		}
	}

	public void initFast() {
		//����FastЭ��ģ��
		for (String securityType : fastXMLPathMap.keySet()) {
			String fileName = fastXMLPathMap.get(securityType);
			Context fastContext = loadTemplates(fileName);
			if (fastContext == null) {
				log.error("FASTģ��[" + fileName + "]������ȷ����");
			}
			setFastContext(securityType, fastContext);
		}
	}

	/**
	 * ����FASTģ��,ǰע��ģ��������
	 * @param fileName
	 * @return
	 */
	private Context loadTemplates(String fileName) {
		XMLMessageTemplateLoader loader = new XMLMessageTemplateLoader();
		loader.setLoadTemplateIdFromAuxId(true);

		// read from file
		InputStream is = convertFile2Stream(fileName);
		if (is == null) {
			return null;
		}

		// load
		loader.load(is);

		try {
			TemplateRegistry templateRegistry = loader.getTemplateRegistry();
			Context marketDataContext = new Context();
			marketDataContext.setTemplateRegistry(templateRegistry);
			return marketDataContext;
		} catch (Exception e) {
			return null;
		}
	}

	/*
	 * Read file!
	 * 
	 * @param fileName 
	 * 
	 * @return ����FAST����ģ��ת������Ϣ
	 */
	private InputStream convertFile2Stream(String fileName) {
		if (!ValidityUtil.isValid(fileName)) {
			return null;
		}
		InputStream stream = null;
		try {
			stream = new FileInputStream(fileName);
			if (stream != null) {
				return stream;
			}
		} catch (FileNotFoundException e) {
			log.info(e.getMessage());
		}
		//������try��
		stream = getClass().getClassLoader().getResourceAsStream(fileName);
		return stream;
	}

	private synchronized void setParser(String reqId, STEPParser parser) {
		if (reqId == null || parser == null) {
			return;
		}
		if (!parserMap.containsKey(reqId)) {
			parserMap.put(reqId, parser);
		}
	}

	private synchronized void setFastContext(String securityType, Context context) {
		if (securityType == null || context == null) {
			return;
		}
		if (!contextMap.containsKey(securityType)) {
			contextMap.put(securityType, context);
		}
	}

	/**
	 * ����reqId��ȡStepЭ��ģ��
	 * @param reqId
	 * @return
	 */
	public STEPParser getStepParser(String reqId) {
		synchronized (reqId) {
			if (!parserMap.containsKey(reqId)) {
				initStep();
			}
		}
		return parserMap.get(reqId);
	}

	/**
	 * ��ȡStepЭ��ģ��
	 * @return
	 */
	public STEPParser getStep() {
		return getStepParser(ExpressConstant.STEP_REQID);
	}

	/**
	 * ��ȡMarketData FastЭ��ģ��
	 * @return
	 */
	public Context getMarketDataContext(String securityType) {
		synchronized (securityType) {
			if (!contextMap.containsKey(securityType)) {
				initFast();
			}
		}
		return contextMap.get(securityType);
	}
}
