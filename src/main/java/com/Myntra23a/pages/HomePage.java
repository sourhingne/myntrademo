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
	@FindBy(css = "div.desktop-userIconsContainer > span.desktop-userTitle")
	public WebElement profilElement;
	@FindBy(css = "div.desktop-getUserInLinks.desktop-getInLinks > a")
	public WebElement LOGIN_SIGNUP;
	@FindBy(css = "a[data-index=\"2\"]")
	public WebElement kidsMenuElement;

	@FindBy(css = "span.myntraweb-sprite.desktop-iconBag.sprites-headerBag")
	public WebElement Bag;

	@FindBy(css = " nav > div > div:nth-child(2) > div > a")
	public WebElement Women;

	@FindBy(css = "nav > div > div:nth-child(2) > div li:nth-child(1) > ul > li:nth-child(13) > a")
	public WebElement BeltsScarvesAndMore;

	

	@FindBy(css = "nav > div > div:nth-child(1) > div > a")
	public WebElement menmenu;

	@FindBy(css = "nav >div > div:nth-child(1) div > div > div > div > li:nth-child(1) > ul > li:nth-child(2) > a")
	public WebElement tshirt;

	@FindBy(css = "span.myntraweb-sprite.desktop-iconBag.sprites-headerBag")
	public WebElement Bag;

	@FindBy(css = ".desktop-showBanner > a:nth-child(4)")
	public WebElement contactUs;

	@FindBy(css = " nav > div > div:nth-child(2) > div > a")
	public WebElement Women;

	@FindBy(css = "nav > div > div:nth-child(2) > div li:nth-child(1) > ul > li:nth-child(13) > a")
	public WebElement BeltsScarvesAndMore;

	@FindBy(css = " nav > div > div:nth-child(5) > div > a")
	public WebElement BEAUTY;

	public HomePage() {

		PageFactory.initElements(UIKeyword.driver, this);
	}

	public void hoveronProfile() {
		UIKeyword.mousemove(profilElement);

	}

	public void clickOnLOGIN_SIGNUP() {
		UIKeyword.clickOn(LOGIN_SIGNUP);
	}

	public void searchProduct(String ProductName) throws AWTException {
		UIKeyword.enterText(searchComponentElement, ProductName);
		UIKeyword.hitbutton(KeyEvent.VK_ENTER);
		UIKeyword.releaseButton(KeyEvent.VK_ENTER);
	}


	public void hoverOnMenMenu() {
		UIKeyword.mousemove(menmenu);

	}

	public void clickonTshirt() {
		UIKeyword.clickOn(tshirt);
	}


	public void ClickOnBag() {
		UIKeyword.ClickOnElement(Bag);
	}

	public void ClicksOnWomen() {
		UIKeyword.ClickOnElement(Women);
	}

	public void ClickOnBeltsScarvesAndMore() {
		UIKeyword.ClickOnElement(searchComponentElement);
	}

}
