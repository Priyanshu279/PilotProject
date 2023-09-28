package com.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class Performance_ConfigureTrackersObjects {
	
	@FindBy (xpath="//span[text()='Performance']")
	public  WebElement performanceModule;
	
	@FindBy (xpath="//span[text()='Configure ']")
	public  WebElement configureDrop;
	
	@FindBy  (xpath="//ul[@class=\"oxd-dropdown-menu\"]//a[text()='Trackers']")
	public  WebElement trackersFeature;
	
	//.
	@FindBy (xpath="//a[text()='Trackers']")
	public WebElement track;
	
	
	@FindBy (xpath="//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")
	public  WebElement addButoon;
	
	@FindBy  (xpath="//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]//input[@class=\"oxd-input oxd-input--active\"]")
	public  WebElement trackerName;
	
	@FindBy (xpath="//div[@class=\"oxd-form-row\"]/div/div[1]/div[1]/div/div/div//input[@placeholder=\"Type for hints...\"]")
	public  WebElement employeeName;
	
	@FindAll(@FindBy(xpath="//div[@role=\"option\"]"))
	public  List<WebElement> empDropdownList;
	
	@FindBy  (xpath ="//div[@class=\"oxd-form-row\"]/div/div[2]/div[1]/div/div/div//input[@placeholder=\"Type for hints...\"]")
	public  WebElement reviewers;
	
	@FindAll(@FindBy(xpath="//div[@role=\"option\"]"))
	public  List<WebElement> reviewersDropdownList;
	
	@FindBy (xpath="//button[@type=\"submit\"]")
	public  WebElement submitButton;
	
	
	@FindBy (xpath ="//p[@class=\"oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text\"]")
	public  WebElement  assertSeccessMessage;
	
}
