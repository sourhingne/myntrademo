/*
 * Project Name: Myntra23a
 * Author:Sourabh Hingne for Testing Shastra
 * Client: Avinash Pingale
 * Organization: Testing Shastra
 */

package com.Myntra23a.keywords;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class UIKeyword {
	public static RemoteWebDriver driver;
	public static FluentWait<WebDriver> wait;

	/**
	 * Opens specified web Browser
	 * 
	 * @param browserName. Browser name should only
	 *                     include,Chrome,Firefox,InternetExplorer. No browserName
	 *                     apart from mentioned is allowed.
	 * 
	 */

	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--disable-notifications", "start-maximized");
			driver = new ChromeDriver(options);
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			driver = new FirefoxDriver(options);
		} else if (browserName.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		}
		wait = new FluentWait<WebDriver>(driver);
		wait = wait.withTimeout(Duration.ofSeconds(60));
		wait = wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(NoSuchElementException.class);

		System.out.println(browserName + "browser is launched successfully");
	}

	/**
	 * It opens the specified url in Web Browser recently opened by driver instance
	 * 
	 * @param url {@code String} url to open
	 * @return void
	 */
	public static void launchUrl(String url) {
		driver.get(url);
		System.out.println("url is launched:" + url);
	}

	public static void enterText(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void hitbutton(int keycode) throws AWTException {
		Robot robo = new Robot();
		robo.keyPress(keycode);
	}

	public static void selectValueFromDropdownlist(WebElement element) {
		Select select = new Select(element);
		select.deselectByVisibleText(getTitle());
	}

	public static void releaseButton(int keycode) throws AWTException {
		Robot robot = new Robot();
		robot.keyRelease(keycode);
	}

	public static List<String> getTexts(By element) {
		List<WebElement> elements = driver.findElements(element);
		List<String> texts = new ArrayList<String>();
		for (WebElement elmnt : elements) {
			texts.add(elmnt.getText());
		}
		return texts;

	}

	public static List<String> getTexts(List<WebElement> elements) {
		List<WebElement> element1 = elements;
		List<String> texts = new ArrayList<>();
		for (WebElement elemnt : elements) {
			String text = elemnt.getText();
			texts.add(text);

		}
		return texts;
	}

	public static void closeBrowser() {
		driver.close();
		System.out.println("Browser is closed successfully");

	}

	public static String getTitle() {
		return driver.getTitle();
	}


	public static void ClickOnElement(WebElement element) {
		element.click();
	}

	public static void scrollby() {
		driver.executeScript("window.scrollBy(0,800)");
	}

	public static void scrollwindow(int x, int y) {
		driver.executeScript("window.scrollBy(arguments[0],arguments[1]))", x, y);
	}

	public static void mousemove(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}

	public static void clickOn(WebElement element) {
		element.click();

	}

	public static void selectByPopularity(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}



	public static void mousemove(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}

	public static void clickOn(WebElement element) {
		element.click();

	}

	public static String getcurrentURL() {
		driver.getCurrentUrl();
		return null;
	}

	public static void switchToWindow(String byTitle) {
		String parentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		String title = driver.getTitle();
		for (String window : windows) {
			if (driver.switchTo().window(window).getTitle().equals(byTitle)) {
				System.out.println("switch to window" + byTitle);
				break;
			}
		}
	}

	public static void waitelementToBeClickable(WebElement element) {

		wait.ignoring(org.openqa.selenium.NoSuchElementException.class, org.openqa.selenium.TimeoutException.class);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void time(int durationInSeconds) {
		long startatime = System.currentTimeMillis();
		long endTime = startatime + (durationInSeconds * 1000);
		while (startatime <= endTime) {
			startatime = System.currentTimeMillis();
		}

	public static void ClickOnElement(WebElement element) {
		element.click();
	}
	public static void scrollby() {
		driver.executeScript("window.scrollBy(0,800)");

	}
	public static void scrollwindow(int x, int y) {
		driver.executeScript("window.scrollBy(arguments[0],arguments[1]))", x, y);
	}

	
	

}


	
	
	public static void mousemove(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}

	
	}


