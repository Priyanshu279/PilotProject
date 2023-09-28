package com.pageactions;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pageobjects.Pim_ConfigurationObjects;
import com.pageutilities.DriverClass;


public class pimActions {
	Pim_ConfigurationObjects pimObjects=null;
	String product;

	public pimActions() {
		this.pimObjects=new Pim_ConfigurationObjects();
		PageFactory.initElements(DriverClass.getDriver(), pimObjects);
	}
	
	public void search1() {
		pimObjects.search.sendKeys("PIM",Keys.ENTER);
		
	}

	public void clickOnPim() {
		pimObjects.pim.click();
	}
	
	public void clickOnconfigurationList() {
		pimObjects.configurationList.click();
	}
	
	public void clickOnTerminationreasons() {
		pimObjects.terminationreasons.click();
		
	}
	public void clickOnAdd() {
		pimObjects.add.click();
	}
	public void enterName() {
		pimObjects.name.sendKeys("Keerti");
	}
	public void clickOnSave() {
		pimObjects.save.click();
	}
	public void ValidateSuccessfullysaved() {
		pimObjects.Successfullysaved.click();
	}

	public void nameEnter() {
		Properties prop=new Properties();
		WebElement element = new WebDriverWait(DriverClass.getDriver(), Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(pimObjects.add));
		product=prop.getProperty("name");
//		this.enterName(product);
	}
}
	
	






