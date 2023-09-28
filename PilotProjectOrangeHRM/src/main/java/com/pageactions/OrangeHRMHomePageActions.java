package com.pageactions;

import org.openqa.selenium.support.PageFactory;

import com.pageobjects.OrangeHRMHomePage;
import com.pageutilities.DriverClass;

public class OrangeHRMHomePageActions {
	OrangeHRMHomePage homeLocator = null;
	
	public OrangeHRMHomePageActions() {
		// TODO Auto-generated constructor stub
		
		this.homeLocator = new OrangeHRMHomePage();
		PageFactory.initElements(DriverClass.getDriver(), homeLocator);
	}
	
	public String getHomePageText() {
		return homeLocator.homePage.getText();
	}
}
