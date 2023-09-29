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
import com.pageutilities.DriverClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Admin_UserManagementStd {
	Admin_UserManagementActions aum = new Admin_UserManagementActions();
	Logger logs = LogManager.getLogger(Admin_UserManagementActions.class);
	BugStriker bs = new BugStriker();
		
	@Given("Select Admin")
	public void select_admin() {
	   aum.setAdmin();
	}	
	
		
	@Given("Select User Management and click on user")
	public void select_user_management_and_click_on_user() {
	    aum.setUserManagement();
	    aum.setUser();
	}
	
	@When("Click on Add and filling the details of user")
	public void click_on_add_and_filling_the_details_of_user() throws InterruptedException {
	    aum.setAdd();
	    aum.addUser();
	}
	
	@When("Click on Save User")
	public void click_on_save_User() {
		aum.setSaveUser();
	}
	
	@Then("User validate the saved successfully")
	public void user_validate_the_saved_successfully() throws InterruptedException, IOException {
		try {
			Assert.assertEquals(aum.getPopTextSaved(),"Successfully Saved");
			logs.info(aum.getPopTextSaved());
		}catch (Exception e) {
			System.err.println("Already exists");
			logs.info("Already exists");
		}
		Thread.sleep(3000);
		File screenshotfile = ((TakesScreenshot)DriverClass.getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotfile,new File("Screenshots\\UserValidateSaveSuccessfully.png"));
	}
	
	@When("User Enter the Search Details")
	public void user_enter_the_search_details() {
		aum.searchUser("Bug Striker");
	}
	
	@When("User Click the Search Btn")
	public void user_click_the_search_btn() {
		aum.setClickSearch();	    
	}
		

	@Then("User Check Weather New user Added or not")
	public void user_check_weather_new_user_added_or_not() throws IOException {
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
