package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Time_ReportsObjects {
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[4]/a[1]")
	public static WebElement TimeTab;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]")
	public static WebElement Reports;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[1]/a")
	public static WebElement ProjectReport;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[1]/div/div/div/div[2]/div/div/input")
	public static WebElement ProjectName;

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input")
	public static WebElement ProjectDateFrom;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/div[2]/div/div[2]/div/div/input")
	public static WebElement ProjectDateTo;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/div[3]/div/label/input")
	public static WebElement ToggleBtn;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[3]/button")
	public static WebElement ViewBtn;
	
	@FindBy(xpath="//body/div[@id='app']/div[@id='oxd-toaster_1']/div[1]")
	public static WebElement ProjectRecordInfoToast;
}
