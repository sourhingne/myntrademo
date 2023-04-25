package com.Myntra23a.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Myntra23a.keywords.UIKeyword;

public class Helpcenterpage {
	@FindBy(css = "div > div.errorCase-loginButtonWrapper > button")
	public WebElement Login1;
	
	public  Helpcenterpage() {
		PageFactory.initElements(UIKeyword.driver, this);
	}
	public void ClickOnLogin1Button() {
		UIKeyword.ClickOnElement(Login1);
	}
}