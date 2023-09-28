package com.stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;

import com.pageactions.OrangeHRMLoginPageActions;
import com.pageutilities.DriverClass;

import io.cucumber.java.en.When;

public class BugStriker {
	
	OrangeHRMLoginPageActions loginBS = new OrangeHRMLoginPageActions();
	OrangeHRMLoginPageActions logoutBS = new OrangeHRMLoginPageActions();
	
	
	public void setLoginBS() {
		loginBS.login("Bug Striker","admin123");
	}
	
	@When("User enter the {string} and {string}")
	public void user_enter_the_and(String UserName, String Password) {
	    loginBS.login(UserName, Password);
	}
	
	public void setLogoutBS() {
		logoutBS.setLogOut();
	}
	
	public static void WindowScroll(String num){
		JavascriptExecutor jss = (JavascriptExecutor)DriverClass.getDriver();
        jss.executeScript("window.scrollBy(0,"+num+")", "");
	}
	
	public static String getBeforeWindowHandles() {
		String windwoBef = DriverClass.getDriver().getWindowHandle();
		return windwoBef;
	}
	
	public static void setSwitchBeforeWindow(String handles) {
		DriverClass.getDriver().switchTo().window(handles);
	}
	
//	public static String MyInfo_filePath() {
//		String my_info = "C:\\Users\\mmaralinganavar\\Desktop\\Pilot Project\\GitOrangeHRM\\PilotProject\\PilotProjectOrangeHRM\\src\\test\\resources\\MyInfo_PersonalDetails.properties";
//		return my_info;
//	}
}
