package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_CorporateBrandingObj {
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[1]")
	public static WebElement PrimaryColor;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div")
	public static WebElement PrimaryFontColor;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[5]/div/div[2]/div/div")
	public static WebElement PrimaryGradientColor1;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div")
	public static WebElement SecondaryColor;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/div/div")
	public static WebElement SecondaryFontColor;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[6]/div/div[2]/div/div")
	public static WebElement PrimaryGradientColor2;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/div/button[2]")
	public static WebElement PreviewBtn;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	public static WebElement PublishBtn;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/div/button[1]")
	public static WebElement ResetToDefaultBtn;
	
}