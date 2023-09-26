package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Time_TimesheetsObjects {
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[4]/a[1]")
	public static WebElement TimeTab;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	public static WebElement EmployeeNameInput;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")
	public static WebElement ViewBtn;
	
	@FindBy(xpath="//body/div[@id='app']/div[@id='oxd-toaster_1']/div[1]/div[1]/div[2]")
	public static WebElement TimeSheetMessage;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/button[1]")
	public static WebElement EditBtn;
	
}
