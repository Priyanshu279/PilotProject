package com.pageutilities;

/**
*	@ Driver Class for all the methods and constructor.
*	@author Bug Strikers (Expleo)
*	@since JDK17 22/09/2023
*/

import java.time.Duration;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;

public class DriverClass {

	// Declaration of required variables...
	private static DriverClass driverClass;
	private static WebDriver driver;
	private static WebDriverWait wait;
	private final static int TIMEOUT = 10;

	// Initializes a Chrome WebDriver instance, maximizes the browser window, and sets up implicit and explicit wait mechanisms.
	DriverClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
	}

	public static void explicitWaitClickable(WebElement explicitWait) {
		wait.until(ExpectedConditions.elementToBeClickable(explicitWait));
	}
	
	public static void explicitWaitVisibility(WebElement explicitWait) {
		wait.until(ExpectedConditions.visibilityOf(explicitWait));
	}

	public static void openPage(String url) {
		driver.get(url);
	}
  
	public static WebDriver getDriver() {
		return driver;
	}

	public static void setUpDriver() {
		if (driverClass == null) {
			driverClass = new DriverClass();
		}
	}

	// Closes and quits the WebDriver instance, effectively ending the browser session.
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
		
		driverClass = null;
	}

	// Closes the currently active tab in the browser.
	public static void closeTab() {
		if (driver != null) {
			driver.close();
		}

		driverClass = null;
	}
}