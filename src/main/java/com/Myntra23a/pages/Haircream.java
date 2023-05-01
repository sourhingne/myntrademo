package com.Myntra23a.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Myntra23a.keywords.UIKeyword;

public class Haircream {
	@FindBy(css = " div:nth-child(5) div > div > div > div > li:nth-child(3) > ul > li:nth-child(4) > a")
	public WebElement Haircream;
	
	@FindBy(css = " div.search-leftContainer.column-base section > div > div:nth-child(2) > ul > li:nth-child(1) > label")
	public WebElement FilterMen;

	public Haircream() {
		PageFactory.initElements(UIKeyword.driver, this);
	}

	public void ClickOnHaircream() {
		UIKeyword.ClickOnElement(Haircream);
	}
	public void ClickOnFilterMen() {
		UIKeyword.ClickOnElement(FilterMen);
}
}
