package com.Myntra23a.pages;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Myntra23a.keywords.UIKeyword;

public class HomePage {
	@FindBy(css = "input[placeholder=\"Search for products, brands and more\"]")
	public WebElement searchComponentElement;

	public HomePage() {

		PageFactory.initElements(UIKeyword.driver, this);
	}

	public void searchProduct(String ProductName) throws AWTException {
		UIKeyword.enterText(searchComponentElement, ProductName);
		UIKeyword.hitbutton(KeyEvent.VK_ENTER);
		UIKeyword.releaseButton(KeyEvent.VK_ENTER);
	}

}
