package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHRMHomePage {
	@FindBy(xpath="//h6[text()='Dashboard']")
	public static WebElement homePage;
}
