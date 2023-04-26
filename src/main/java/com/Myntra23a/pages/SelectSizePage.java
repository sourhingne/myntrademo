package com.Myntra23a.pages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Myntra23a.keywords.UIKeyword;

public class SelectSizePage {
	@FindBy(css = "body > div:nth-child(8) > div:nth-child(1) > main:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > section:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(3) > div:nth-child(2) > h4:nth-child(3) > span:nth-child(1)")
	WebElement sizeElement;
	@FindBy(css = "  div.pdp-add-to-bag.pdp-button.pdp-flex.pdp-center")
	WebElement addCartElement;

	public SelectSizePage() {
		PageFactory.initElements(UIKeyword.driver, this);
	}

	public void selectSizeProsuct() {
		UIKeyword.clickOn(sizeElement);
	}

	public void clickOnAddToCa() {
		UIKeyword.clickOn(addCartElement);
	}
}
