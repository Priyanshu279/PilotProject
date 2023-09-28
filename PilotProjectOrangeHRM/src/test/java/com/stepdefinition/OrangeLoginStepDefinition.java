package com.stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import com.pageactions.OrangeHRMHomePageActions;
import com.pageactions.OrangeHRMLoginPageActions;
import com.pageutilities.DriverClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeLoginStepDefinition {
	OrangeHRMHomePageActions oh = new OrangeHRMHomePageActions();
	OrangeHRMLoginPageActions ol = new OrangeHRMLoginPageActions();
	DriverClass dc = null;
	
	@Given("Open Browser OrangeHRM {string}")
	public void open_browser_orange_hrm(String string){
		dc.setUpDriver();
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		DriverClass.openPage(string);
	}
	
//	@When("^User enter the Login Data(.*) and (.*)$")
//	public void user_enter_the_user_name_and_pass_word(String UserName,String PassWord) {
//		ol.login(UserName, PassWord);
//
//	}
//	
//	@When("User enter the valid data {string} and {string}")
//	public void user_enter_the_valid_data_and(String string, String string2) {
//	    ol.login(string, string2);
//	}
//
//	@When("User enter the Invalid data {string} and {string}")
//	public void user_enter_the_invalid_data_and(String string, String string2) {
//		ol.login(string,string2);
//	}
	
	@When("click the Login btn")
	public void click_the_login_btn() {
	    ol.setLoingbtn();
	}
	
	@Then("Validating Login Page")
	public void validating_login_page() throws InterruptedException {
	     Assert.assertEquals(oh.getHomePageText(), "Dashboard");
	     Thread.sleep(2000);
	}	
	
}
