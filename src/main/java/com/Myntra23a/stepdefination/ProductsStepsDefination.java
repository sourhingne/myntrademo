package com.Myntra23a.stepdefination;

import java.awt.AWTException;
import java.util.List;

import org.testng.Assert;

import com.Myntra23a.Util.Environment;
import com.Myntra23a.keywords.UIKeyword;
import com.Myntra23a.pages.HomePage;
import com.Myntra23a.pages.MenTshirtPage;
import com.Myntra23a.pages.PoloMenPage;

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

	@When(" User hover on men menu")
	public void hoversOnMenMenu() {
		HomePage homePage = new HomePage();
		homePage.hoverOnMenMenu();
	}

	@And("user clicks on men t-shirt")
	public void clickOnTshirt() {
		HomePage homePage = new HomePage();
		homePage.clickonTshirt();

	}

	@Then("user select popularity filter")
	public void popularityfilter() {
		MenTshirtPage mentshirt = new MenTshirtPage();
		mentshirt.hoveronSortFilter();
		mentshirt.selectPopularityFilter();
	}

}
