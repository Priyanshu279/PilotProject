package com.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class Leave_EntitlemenAndUsageReportObjects {
	
	@FindBy (xpath="//span[contains(text(),'Reports') ]")
	public  WebElement reportsTab;
	
	@FindBy (partialLinkText="Leave Entitlements and Usage Report")
	public WebElement leaveEntitlementusageReport;
	
	@FindBy (xpath="//*[text()='Employee']")
	public WebElement employeeRadioButton;
	
	@FindBy (xpath="//input[@placeholder=\"Type for hints...\"]")
	public  WebElement employeeName;
	
	@FindBy (xpath="//div[@class=\"oxd-select-text oxd-select-text--active\"]")
	public WebElement leavePeriod;
	
	@FindAll (@FindBy(xpath="//div[@role=\"option\"]" ))
	public List<WebElement> leaveDropDownList;
	
	@FindBy (xpath="//button[@type=\"submit\"]")
	public  WebElement  generateButton;
	
	
	@FindBy (xpath="//div[@class=\"orangehrm-background-container\"]//div[@class=\"oxd-report-table-header--pagination\"]")
	public  WebElement asserElementRecordFound;
	
	@FindBy (xpath="//div[@role=\"listbox\"]")
	public  WebElement nameDropDown;
	
	
	//...........second scenario object
	@FindBy (xpath="//label[text()='Leave Type']//input[@type=\"radio\"]")
    public WebElement leaveTypeRadioButton;	
	
	@FindBy (xpath="//div[@class=\"oxd-table-filter-area\"]//div[text()='CAN - Bereavement']")
	public WebElement leaveTypeDropDown;
	
	@FindBy (xpath="//div[@role=\"option\"]")
	public List<WebElement> leaveTypeDropDownList;
	
	@FindBy (xpath="//div[@class=\"oxd-table-filter-area\"]//div[text()='2023-01-01 - 2024-01-31']")
	public WebElement leavePeriodDropDown;
	
	@FindBy (xpath="//div[@role=\"option\"]")
	public List<WebElement> leavePeriodDropDownList;
	
	@FindBy (xpath="//form[@class=\"oxd-form\"]//div[3]//div[@class=\"oxd-select-text oxd-select-text--active\"]")
	public WebElement locationDropDown;
	
	@FindBy (xpath="//div[@role=\"option\"]")
	public List<WebElement> locationDropDownList;
	
	@FindBy (xpath="//form[@class=\"oxd-form\"]//div[4]//div[2]//div[@class=\"oxd-select-text oxd-select-text--active\"]")
	public WebElement subUnitDropDown;
	
	@FindBy (xpath="//div[@role=\"option\"]")
	public List<WebElement> subUnitDropDownList;
	
	@FindBy (xpath="//form[@class=\"oxd-form\"]//div[5]//div[2]")
	public WebElement jobTitleDropDown;
	
	@FindBy (xpath="//div[@role=\"option\"]")
	public List<WebElement> jobTitleDropDownList;
	
	@FindBy (xpath="//button[@type=\"submit\"]")
	public WebElement generateButtonscenario2;
	
	

}

