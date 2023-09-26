package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Time_AttendanceObjects {
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[4]/a[1]")
	public static WebElement TimeTab;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")
	public static WebElement AttendanceTab;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[2]")
	public static WebElement PunchInOutTab;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")
	public static WebElement PunchInTimeInput;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/form/div[3]/button")
	public static WebElement PunchInBtn;
	
	@FindBy(xpath="//body/div[@id='app']/div[@id='oxd-toaster_1']/div[1]/div[1]/div[2]/p[2]")
	public static WebElement PunchInToast;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/input")
	public static WebElement PunchOutTimeInput;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/form/div[3]/button")
	public static WebElement PunchOutBtn;
	
	@FindBy(xpath="//body/div[@id='app']/div[@id='oxd-toaster_1']/div[1]")
	public static WebElement PunchOutToast;
	
}