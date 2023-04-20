
package com.Myntra23a.Util;

public class Environment {
	private static String filepath = "\\src\\main\\resources\\Environment.properties";
	public static String URL;

	static {
		PropUtil prop = new PropUtil();
		String baseDir = System.getProperty("user.dir");
		URL = prop.getValue(baseDir + filepath, "app_url");
	
	}
}
