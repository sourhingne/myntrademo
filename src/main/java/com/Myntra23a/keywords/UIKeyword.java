/*
 * Project Name: Myntra23a
 * Author:Sourabh Hingne for Testing Shastra
 * Client: Avinash Pingale
 * Organization: Testing Shastra
 */

package com.Myntra23a.keywords;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class UIKeyword {
	public static RemoteWebDriver driver;

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
			options.addArguments("--disable-notification", "start-maximized");
			driver = new ChromeDriver(options);
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			driver = new FirefoxDriver(options);
		} else if (browserName.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		}
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

}
