package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Time_ProjectInfoObjects {
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[4]/a[1]")
	public static WebElement TimeTab;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]")
	public static WebElement ProjectInfoTab;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")
	public static WebElement CustomersTab;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/div/span")
	public static WebElement TotalNoOfRecords;
	
}
