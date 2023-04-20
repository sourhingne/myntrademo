package com.Myntra23a.config;

import javax.management.loading.PrivateClassLoader;

import org.apache.log4j.Logger;

import com.Myntra23a.keywords.UIKeyword;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestBase {
private static final Logger log=Logger.getLogger(TestBase.class);

@Before
public void setUpMethod() throws Exception {
	UIKeyword.openBrowser("Chrome");
}
	
    @After
	public void tearDown() throws Exception {
		UIKeyword.closeBrowser();
	}
	
	
	
	
	
	
	
}



