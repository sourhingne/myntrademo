package com.Myntra23a;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Myntra23a.Util.Environment;
import com.Myntra23a.Util.PropUtil;
import com.Myntra23a.config.TestBase;
import com.Myntra23a.keywords.UIKeyword;

public class ProductTests{
	
	@Test
	public void verifysearchResultForPoloMen() throws AWTException {
		PropUtil repo= new PropUtil();
		Environment  env = new Environment();
		
		//UIKeyword.launchUrl(env.getAppUrl());
		//UIKeyword.enterText(By.cssSelector(repo.getLocator("search_products_txtbx")), "Polo men");
		UIKeyword.hitbutton(KeyEvent.VK_ENTER);
		UIKeyword.releaseButton(KeyEvent.VK_ENTER);
	//	List<String> productTitles = UIKeyword.getTexts(By.cssSelector(repo.getLocator("product_titles_txt")));
		//for (String productTitle : productTitles) {
		//	Assert.assertTrue(productTitles.contains("polo"), "product Title doesnt Contains polo: " + productTitle);

		}
	}

	
	


