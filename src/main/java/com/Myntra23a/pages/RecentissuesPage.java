package com.Myntra23a.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Myntra23a.keywords.UIKeyword;

public class RecentissuesPage {
	@FindBy(css = " div:nth-child(4) > div.sideBar-queryText")
	public WebElement RecentIssues;

	public RecentissuesPage() {

		PageFactory.initElements(UIKeyword.driver, this);

	}

	public void ClickOnRecentIssues() {
		UIKeyword.ClickOnElement(RecentIssues);
	}
}