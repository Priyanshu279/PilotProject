package com.stepdefinition;

import org.testng.Assert;

import com.pageactions.OrangeHRMHomePageActions;
import com.pageactions.OrangeHRMLoginPageActions;
import com.pageutilities.DriverClass;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeLoginStepDefinition {
	OrangeHRMHomePageActions oh = new OrangeHRMHomePageActions();
	OrangeHRMLoginPageActions ol = new OrangeHRMLoginPageActions();
	DriverClass dc = null;
	
	@Given("Open Browser OrangeHRM {string}")
	public void open_browser_orange_hrm(String string) {
		dc.setUpDriver();
		DriverClass.openPage(string);
	}
	
	@When("^User enter the (.*) and (.*)$")
	public void user_enter_the_user_name_and_pass_word(String UserName,String PassWord) {
		ol.login(UserName, PassWord);
	}
	
	@When("click the Login btn")
	public void click_the_login_btn() {
	    ol.setLoingbtn();
	}
	
	@Then("Validating Login Page")
	public void validating_login_page() {
	     Assert.assertEquals(oh.getHomePageText(), "Dashboard");
	     DriverClass.tearDown();
	}
	
}
