package com.Myntra23a.stepdefination;

import java.awt.AWTException;
import java.util.List;

import org.apache.commons.compress.harmony.pack200.NewAttribute;
import org.testng.Assert;

import com.Myntra23a.Util.Environment;
import com.Myntra23a.keywords.UIKeyword;


import com.Myntra23a.pages.BlackJeansPage;
import com.Myntra23a.pages.HomePage;

import com.Myntra23a.pages.PoloMenPage;
import com.Myntra23a.pages.SelectSizePage;
import com.Myntra23a.pages.AddItemsFromWishListPage;
import com.Myntra23a.pages.Checkboxofjwellaryset;
import com.Myntra23a.pages.Haircream;
import com.Myntra23a.pages.Helpcenterpage;
import com.Myntra23a.pages.HomePage;
import com.Myntra23a.pages.MenTshirtPage;

import com.Myntra23a.pages.LoginPage;

import com.Myntra23a.pages.LoginPage;

import com.Myntra23a.pages.PoloMenPage;
import com.Myntra23a.pages.RecentissuesPage;

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

	@When("User Clicks on Bag")
	public void ClickOnBag() {
		HomePage homePage = new HomePage();
		homePage.ClickOnBag();

	}

	@And("User Clicks on Add Items From Wish List")
	public void AddItemsFromWishList() {
		AddItemsFromWishListPage additem = new AddItemsFromWishListPage();

		additem.ClickOnAddItemsFromWishList();
	}

	@Then("Login page should Be Open")
	public void ClickLoginPage() {
		LoginPage page = new LoginPage();
		page.ClickOnLoginButton();
	}

	@When("User Clicks on ContactUs")
	public void ClickOnContactUs() {
		HomePage homePage = new HomePage();
		homePage.ClickOnContactUs();

	}

	@And("User Clicks on RecentIssues")
	public void RecentIssuePage() {
		RecentissuesPage issue = new RecentissuesPage();

		issue.ClickOnRecentIssues();
	}
  
	@Then("Help Center Login page should Be Open")
	public void ClickOnLogin1Button() {
		Helpcenterpage helppage = new Helpcenterpage();
		helppage.ClickOnLogin1Button();
	}

	@When("User Hover on Women Menu")
	public void HoverOnWomenMenu() {
		HomePage homePage = new HomePage();
		homePage.ClicksOnWomen();
	}

	@And("User Clicks on Belts,Scarves&More")
	public void ClicksOnBeltsScarvesAndMore() {
		HomePage homePage = new HomePage();
		homePage.ClickOnBeltsScarvesAndMore();
	}

	@And("User Clicks on Checkbox of Jewellary Set")
	public void CheckBoxOfJewellarySet() {
		Checkboxofjwellaryset jwellaryset = new Checkboxofjwellaryset();
		jwellaryset.ClickOnCheckboxofjwellaryset();
	}

	@And("User Clicks on Rating")
	public void ClicksOnRating() {
		Checkboxofjwellaryset jwellaryset = new Checkboxofjwellaryset();
		jwellaryset.ClickOnRating();
	}

	@Then("User Clicks on Checkbox of Four Star")
	public void ClicksOnCheckBoxOfFourStar() {
		Checkboxofjwellaryset jwellaryset = new Checkboxofjwellaryset();
		jwellaryset.ClickOnCheckBoxOfFourStar();
	}
	@When("User Clicks on Beauty")
	public void ClicksOnBeauty() {
		HomePage homePage = new HomePage();
		homePage.ClicksOnBEAUTY();
	}
	@And("User Clicks on Haircream")
	public void ClicksOnHaircream() {
        Haircream haircream=new Haircream();
        haircream.ClickOnHaircream();
	}
	@Then("Click on FilterMen")
	public void ClicksOnFilterMen() {
		Haircream haircream=new Haircream();
		haircream.ClickOnFilterMen();

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

	@Then("Help Center Login page should Be Open")
	public void ClickOnLogin1Button() {
		Helpcenterpage helppage = new Helpcenterpage();
		helppage.ClickOnLogin1Button();
	}

	@When("User Hover on Women Menu")
	public void HoverOnWomenMenu() {
		HomePage homePage = new HomePage();
		homePage.ClicksOnWomen();
	}

	@And("User Clicks on Belts,Scarves&More")
	public void ClicksOnBeltsScarvesAndMore() {
		HomePage homePage = new HomePage();
		homePage.ClickOnBeltsScarvesAndMore();
	}

	@And("User Clicks on Checkbox of Jewellary Set")
	public void CheckBoxOfJewellarySet() {
		Checkboxofjwellaryset jwellaryset = new Checkboxofjwellaryset();
		jwellaryset.ClickOnCheckboxofjwellaryset();
	}

	@And("User Clicks on Rating")
	public void ClicksOnRating() {
		Checkboxofjwellaryset jwellaryset = new Checkboxofjwellaryset();
		jwellaryset.ClickOnRating();
	}

	@Then("User Clicks on Checkbox of Four Star")
	public void ClicksOnCheckBoxOfFourStar() {
		Checkboxofjwellaryset jwellaryset = new Checkboxofjwellaryset();
		jwellaryset.ClickOnCheckBoxOfFourStar();
	}
	@When("User Clicks on Beauty")
	public void ClicksOnBeauty() {
		HomePage homePage = new HomePage();
		homePage.ClicksOnBEAUTY();
	}
	@And("User Clicks on Haircream")
	public void ClicksOnHaircream() {
        Haircream haircream=new Haircream();
        haircream.ClickOnHaircream();
	}
	@Then("Click on FilterMen")
	public void ClicksOnFilterMen() {
		Haircream haircream=new Haircream();
		haircream.ClickOnFilterMen();
	}
}
