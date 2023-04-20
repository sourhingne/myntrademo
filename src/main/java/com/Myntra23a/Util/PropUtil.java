package com.Myntra23a.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.Myntra23a.config.TestBase;

public class PropUtil {
	
	private static final Logger log=Logger.getLogger(PropUtil.class);

	public String getValue(String filepath, String key){
		String value = "";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filepath);
			Properties prop = new Properties();
				prop.load(fis);
				value=prop.getProperty(key);
			log.info("Returning locator:" +value);
		} catch (FileNotFoundException e) {
			log.error("File not found:" + filepath);
		} catch (IOException e) {
			log.error("unable to load properties file:" + filepath);
		}
		return value;
	}
	
	public String getLocater(String key)  {
		String baseDir=System.getProperty("user.dir");
	String locator	= getValue(baseDir+"/src/main/resources/OR.properties", key);
		return locator;
	}

}