package com.stepdefinition;

import com.pageactions.OrangeHRMLoginPageActions;
import com.pageactions.Performance_ConfigureTrackersActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.internal.org.jline.utils.Log;
import junit.framework.Assert;

public class Performance_TrackerStepDefinition {
	Performance_ConfigureTrackersActions TrackerObj=new  Performance_ConfigureTrackersActions();
	OrangeHRMLoginPageActions loginAction = new OrangeHRMLoginPageActions();

	
	@Given("the user should on performance home page")
	public void the_user_should_on_performance_home_page() {
		TrackerObj.clickOnPerformance();
		
	}

	@When("the user click on tracker from configure dropdown")
	public void the_user_click_on_tracker_from_configure_dropdown() throws InterruptedException {
		TrackerObj.clickOnTrackers();
	}

	@When("the user click on add button")
	public void the_user_click_on_add_button() {
		TrackerObj.clickOnAddButoon();
		
	}

	@When("^the user enter trackername (.*)$")
	public void the_user_enter_k(String TrackerName) {
		TrackerObj.enterTrackerName(TrackerName);
		
	}

	@When("^the user enter empname (.*)$")
	public void the_user_enter_v(String EmpName) throws InterruptedException {
		TrackerObj.enterEmpName(EmpName);
		
	
	}

	@When("^the user enter reviewername (.*)")
	public void the_user_enter_h(String Reviewer) throws InterruptedException {
		TrackerObj.enterReviewerName(Reviewer);
	
	}

	
	@When("the user click on performance tracker save button")
	public void the_user_click_on_performance_tracker_save_button() {
		TrackerObj.clickOnSaveButton();
		
	  
	}
	
	@Then("the user should successfully get saved message")
	public void the_user_should_successfully_get_saved_message() {
		Assert.assertEquals(TrackerObj.getSuccessMessage(), "Successfully Saved");
	}


}
