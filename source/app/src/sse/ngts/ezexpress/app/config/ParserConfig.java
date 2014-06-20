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
 * 数据解码编码规则文件加载类
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
			log.error("marketXmlPathCfg.ini 文件不存在");
		} catch (IOException e) {
			log.error("读取marketXmlPathCfg.ini文件异常：", e);
		}
	}

	public static synchronized ParserConfig getInstance() {
		if (instance == null) {
			instance = new ParserConfig();
		}
		return instance;
	}

	/**
	 * 初始化所有模板
	 */
	public void init() {
		initStep();
		initFast();
	}

	public void initStep() {
		//加载Step协议模版
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
		//加载Fast协议模版
		for (String securityType : fastXMLPathMap.keySet()) {
			String fileName = fastXMLPathMap.get(securityType);
			Context fastContext = loadTemplates(fileName);
			if (fastContext == null) {
				log.error("FAST模版[" + fileName + "]不能正确导入");
			}
			setFastContext(securityType, fastContext);
		}
	}

	/**
	 * 加上FAST模板,前注册模板上下文
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
	 * @return 读到FAST行情模板转换流信息
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
		//不需在try中
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
	 * 根据reqId获取Step协议模板
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
	 * 获取Step协议模版
	 * @return
	 */
	public STEPParser getStep() {
		return getStepParser(ExpressConstant.STEP_REQID);
	}

	/**
	 * 获取MarketData Fast协议模版
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
