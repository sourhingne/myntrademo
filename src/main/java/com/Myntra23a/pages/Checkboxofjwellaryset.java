package com.Myntra23a.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Myntra23a.keywords.UIKeyword;

public class Checkboxofjwellaryset {
	@FindBy(css = " div.vertical-filters-filters.categories-container > ul > li:nth-child(3) > label")
	public WebElement checkBoxOfElementJwellarySet;

	@FindBy(css = "div.atsa-base > ul > li:nth-child(7) > label > h4")
	public WebElement ClickOnRating;
	
	@FindBy(css = "div.atsa-base > div > ul > li:nth-child(4) > label")
	public WebElement ClickOnCheckBoxOfFourStar;

	public Checkboxofjwellaryset() {

		PageFactory.initElements(UIKeyword.driver, this);
	}

	public void ClickOnCheckboxofjwellaryset() {
		UIKeyword.ClickOnElement(checkBoxOfElementJwellarySet);
	}

	public void ClickOnRating() {
		UIKeyword.ClickOnElement(ClickOnRating);
	}
	public void ClickOnCheckBoxOfFourStar() {
		UIKeyword.ClickOnElement(ClickOnCheckBoxOfFourStar);
}
}