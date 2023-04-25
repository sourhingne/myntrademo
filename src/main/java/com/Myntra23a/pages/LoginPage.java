package com.Myntra23a.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Myntra23a.keywords.UIKeyword;

public class LoginPage {
	@FindBy(css = "div:nth-child(1) > div > div:nth-child(4) > a")
	public WebElement Login;
	
	
	public LoginPage() {

		PageFactory.initElements(UIKeyword.driver, this);
	}

	public void ClickOnLoginButton() {
		UIKeyword.ClickOnElement(Login);
	}
	
}
