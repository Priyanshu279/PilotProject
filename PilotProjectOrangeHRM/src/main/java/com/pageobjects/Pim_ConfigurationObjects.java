package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pim_ConfigurationObjects {
	@FindBy(xpath="//input[@placeholder='Search']")
	public WebElement search;
	
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")
	public WebElement pim;

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span")
	public WebElement configurationList;

	@FindBy(xpath="//a[contains(text(),'Termination Reasons')]")
	public WebElement terminationreasons;

	@FindBy(xpath="//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")
	public WebElement add;

	@FindBy(xpath="//form[@class=\"oxd-form\"]/div[1]/div/div[2]/input")
	public WebElement name;

	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	public WebElement save;

	@FindBy(xpath="//span[@class='oxd-text oxd-text--span']")
	public WebElement Successfullysaved;
	
}



