package com.Myntra23a.stepdefination;

import java.awt.AWTException;
import java.util.List;

import org.testng.Assert;

import com.Myntra23a.Util.Environment;
import com.Myntra23a.keywords.UIKeyword;
import com.Myntra23a.pages.BlackJeansPage;
import com.Myntra23a.pages.HomePage;

import com.Myntra23a.pages.PoloMenPage;
import com.Myntra23a.pages.SelectSizePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductsStepsDefination {

	@Given("Chrome browser is opened")
	public void openBrowser() {
		UIKeyword.openBrowser("Chrome");
	}

	@And("url of myntra is launched")
	public void launchMyntraUrl() {
		UIKeyword.launchUrl(Environment.URL);
	}

	@Then("Verify the title of homepage")
	public void verifyTitleOfHomePage() {
		String title = UIKeyword.getTitle();
		Assert.assertEquals(title, "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra");

	}

	@When("User Searches for Polo men")
	public void searchPoloMen() throws AWTException {
		HomePage home = new HomePage();
		home.searchProduct("Polo");

	}

	@Then("All results should be related to polo")
	public void verifyAllResultContainsPolo() {
		PoloMenPage poloMenPage = new PoloMenPage();
		List<String> productTexts = poloMenPage.getSearchResultTexts();
		for (String text : productTexts) {
			Assert.assertTrue(text.contains("Polo"), "Product is mismatch:" + text);

		}
	}

	@When("User hover on Profile")
	public void userhoverOnProfile() {
		HomePage home = new HomePage();
		home.hoveronProfile();
	}

	@Then("click on LOGIN_SIGNUP button Verify That Login Page Is Display")
	public void clickONLOGIN_SIGNUPbutton() {
		HomePage home = new HomePage();
		home.clickOnLOGIN_SIGNUP();

	}

	@When("User Searches for Black jeans")
	public void searchREsultForBlackJeans() throws AWTException {
		HomePage home = new HomePage();
		home.searchProduct("Black Jeans");

	}

	@And("click on the first search result")
	public void clickOnFirstSearchResult() throws InterruptedException {
		BlackJeansPage blackp = new BlackJeansPage();
		blackp.clickOnFirstSearch();
	}

	@And("select the size")
	public void selectSize() {
		SelectSizePage sizepage = new SelectSizePage();
		sizepage.selectSizeProsuct();

	}

	@Then("click on the Add to Cart button and the product should be added in cart")
	public void productShouldBeSeeInCart() {
		SelectSizePage sizepage = new SelectSizePage();
		sizepage.clickOnAddToCa();

	}

}
