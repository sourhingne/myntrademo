package com.Myntra23a.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Myntra23a.keywords.UIKeyword;

public class MenTshirtPage {

	@FindBy(css = "div.horizontal-filters-sortContainer > div > div > div")
	public WebElement sortFilter;

	@FindBy(css = "div >div > div > ul > li:nth-child(3) > label")
	public WebElement Popularityfilter;

	public MenTshirtPage() {

		PageFactory.initElements(UIKeyword.driver, this);
	}

	public void hoveronSortFilter() {
		UIKeyword.mousemove(sortFilter);
	}

	public void selectPopularityFilter() {
		UIKeyword.clickOn(Popularityfilter);
	}
}
