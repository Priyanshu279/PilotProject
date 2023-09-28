package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Leave_AddEntitlementsObjects {

	// Add Entitlements objects
	@FindBy(xpath = "//input[@value='0']")
	public  WebElement AddTo;

	@FindBy(xpath = "//input[@placeholder=\"Type for hints...\"]")
	public  WebElement EmployeeNmae;

	@FindBy(xpath = "//div[text()='-- Select --']")
	public  WebElement LeaveType;

	@FindBy(xpath = "//div[text()='2023-01-01 - 2023-12-31']")
	public  WebElement LeavePeriod;

	@FindBy(xpath = "//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]//input[@class=\"oxd-input oxd-input--active\"]")
	public  WebElement enterEntitlements;

	@FindBy(xpath = "//*[text()='CAN - Personal']")
	public  WebElement personalLeave;

	@FindBy(xpath = "//*[text()='2023-01-01 - 2024-08-24']")
	public  WebElement period;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	public  WebElement saveButton;

	@FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-button-margin\"]")
	public  WebElement confirmButton;

	@FindBy(partialLinkText = "Leave")
	public  WebElement leave;

	@FindBy(xpath = "//div[@class=\"oxd-topbar-body\"]//li[@class=\"oxd-topbar-body-nav-tab --parent\"]")
	public  WebElement entitlementsTab;

	@FindBy(partialLinkText = "Add Entitlements")
	public  WebElement addEntitlements;

	@FindBy(xpath = "//span[text()='Anthony  Nolan']")
	public  WebElement anthonyName;

	@FindBy(xpath = "//div[text()='Added']")
	public  WebElement assertAdded;
	
	//SECOND SCENARIO
	
	@FindBy (xpath="//span[text()='Required']")
	public WebElement requiredFieldMessage;
	
	

}
