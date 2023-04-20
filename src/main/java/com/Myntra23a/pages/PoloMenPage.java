package com.Myntra23a.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Myntra23a.keywords.UIKeyword;

public class PoloMenPage {
	@FindBy(css = "li:nth-child(1) > a > div.product-productMetaInfo > h4.product-product")
	public List<WebElement> productTexts;

	public PoloMenPage() {
		PageFactory.initElements(UIKeyword.driver, this);

	}

	public List<String> getSearchResultTexts() {
		return UIKeyword.getTexts(productTexts);
	}

}
