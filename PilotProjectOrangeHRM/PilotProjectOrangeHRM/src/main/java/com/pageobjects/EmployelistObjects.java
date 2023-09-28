package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployelistObjects {
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")
	public WebElement ClickOnPIM;
	
	
	@FindBy(xpath="(//input[@placeholder='Type for hints...'])[1]")
	public WebElement Enteremployename;
	
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2] ")
	public WebElement Enteremployeid;
	
	
	@FindBy(xpath="//div[@class=\"oxd-form-row\"]/div/div[3]//div[@class=\"oxd-select-wrapper\"]")
	public WebElement employeeStatus;


	@FindBy(xpath="//span[text()='Full-Time Contract']")
	public WebElement statusOption;
	
	
	@FindBy(xpath="(//input[@placeholder='Type for hints...'])[2]")
	public WebElement Supervisorname;
	
	
	@FindBy(xpath="(//div[@class='oxd-select-text-input'][normalize-space()='-- Select --'])[2]")
	public WebElement jobTitle;
	

//	@FindBy(xpath="//span[text()='Chief Technical Officer']")
//	public WebElement chooseJob;


	@FindBy(xpath="(//div[@class='oxd-select-text-input'][normalize-space()='-- Select --'])[3]")
	public WebElement subUnit;
	
	
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span']")
	public WebElement norecordsfound;

	

//	@FindBy(xpath="//span[text()='Engineering']")
//	public WebElement chooseSubUnit;

	

	@FindBy(xpath="//button[@type='submit']")
	public WebElement search;
	

}
