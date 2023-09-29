package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Recruitment_CandiatesObj {
	
	@FindBy(linkText = "Recruitment")
	public static WebElement selectRecruitment;
	
	@FindBy(xpath = "//a[text()='Candidates']")
	public static WebElement selectCandidates;
	
	@FindBy(xpath = "//button[text()=' Add ']")
	public static WebElement selectAdd;
	
	@FindBy(xpath ="//input[@placeholder='First Name']")
	public static WebElement enterFristName;
	
	@FindBy(xpath ="//input[@placeholder='Last Name']")
	public static WebElement enterLastName;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")
	public static WebElement enterEmail;
	
	
	@FindBy(xpath = "//button[text()=' Save ']")
	public static WebElement clickSave;
	
	@FindBy(xpath ="//input[@placeholder='Type for hints...']")
	public static WebElement searchEnterName;
	
	@FindBy(xpath ="//button[text()=' Search ']")
	public static WebElement clicksearch;
	
	@FindBy(xpath ="//div[@class='oxd-table-body oxd-card-table-body']/div/div/div/div/div/div/div/div[2]")
	public static WebElement getTextOfthePage;
	
}
