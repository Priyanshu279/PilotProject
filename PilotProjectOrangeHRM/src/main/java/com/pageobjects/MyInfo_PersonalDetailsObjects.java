package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyInfo_PersonalDetailsObjects {
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[6]/a[1]")
	public static WebElement MyInfoTab;

	@FindBy(xpath="//input[@class=\"oxd-input oxd-input--active oxd-input--error orangehrm-firstname\"]")
	public static WebElement EmpFirstNameInput;
	
	@FindBy(xpath="//input[@placeholder=\"Last Name\"]")
	public static WebElement EmpLastNameInput;
	 
	@FindBy(xpath="")
	public static WebElement ;
	
	
}
