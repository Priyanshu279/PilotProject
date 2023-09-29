package com.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import com.pageactions.Admin_UserManagementActions;
import com.pageactions.Admin_UserManagementDeleteActions;
import com.pageutilities.DriverClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Admin_UserManagementDeleteStd {
	Admin_UserManagementDeleteActions aumd = new Admin_UserManagementDeleteActions();
	Admin_UserManagementActions aum = new Admin_UserManagementActions();
	Logger logs = LogManager.getLogger(Admin_UserManagementActions.class);
	BugStriker bs = new BugStriker();

	@Then("Delet the User and Check")
	public void user_check_weather_new_user_added_or_not() throws IOException {
		aumd.setDelect();
		bs.WindowScroll("200");
		try {
			Assert.assertEquals(aum.getUserName(),"Bug Striker");
			logs.info("----------------------------"+aum.getUserName()+"----------------------------");
		}catch (Exception e) {
			System.err.println("User is not existed");
			logs.info("-----------------------------"+"User is not existed"+"----------------------------");
		}
		//****
		File screenshotfile = ((TakesScreenshot)DriverClass.getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotfile,new File("Screenshots\\UserisAddedorNot.png"));
	}
	
}
