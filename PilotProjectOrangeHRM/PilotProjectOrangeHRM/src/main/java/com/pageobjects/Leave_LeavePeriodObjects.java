package com.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Leave_LeavePeriodObjects {
	
	
	@FindBy  (xpath="//span[text()='Configure ']")
	public  WebElement configureTab;
	
	@FindBy (partialLinkText="Leave Period")
	public  WebElement leavePeriodTab;
	
	@FindBy (xpath="//div[@class=\"oxd-grid-4 orangehrm-full-width-grid\"]/child::div[1]//div[@class=\"oxd-select-wrapper\"]")
	public  WebElement startMonth;
	
	@FindBy (xpath="//span[text()='February']")
	public  WebElement februarySelect;
	
	@FindBy (xpath="//button[@type=\"submit\"]")
	public  WebElement  saveButton;
	
	@FindBy (xpath="//p[text()='Successfully Saved']")
	public  WebElement successfullMessage;
	

}

