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

	@FindBy(css = "nav > div > div:nth-child(1) > div > a")
	public WebElement menmenu;

	@FindBy(css = "nav >div > div:nth-child(1) div > div > div > div > li:nth-child(1) > ul > li:nth-child(2) > a")
	public WebElement tshirt;

	public HomePage() {

		PageFactory.initElements(UIKeyword.driver, this);
	}

	public void searchProduct(String ProductName) throws AWTException {
		UIKeyword.enterText(searchComponentElement, ProductName);
		UIKeyword.hitbutton(KeyEvent.VK_ENTER);
		UIKeyword.releaseButton(KeyEvent.VK_ENTER);
	}

	public void hoverOnMenMenu() {
		UIKeyword.mousemove(menmenu);

	}
	 public void clickonTshirt()  {
     UIKeyword.clickOn(tshirt);
	}
	

}
