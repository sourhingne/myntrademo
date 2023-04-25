package com.Myntra23a.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Myntra23a.keywords.UIKeyword;

public class AddItemsFromWishListPage {
	@FindBy(css = "div.emptyCart-base-addFromWishlist > div")
	public WebElement AddItemsFromWishList;

	public AddItemsFromWishListPage() {

		PageFactory.initElements(UIKeyword.driver, this);

	}

	public void ClickOnAddItemsFromWishList() {
		UIKeyword.ClickOnElement(AddItemsFromWishList);
	}
}