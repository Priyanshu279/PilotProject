package com.stepdefinition;

import com.pageactions.MyInfo_PersonalDetailsActions;
import com.pageactions.OrangeHRMLoginPageActions;
import com.pageutilities.DriverClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyInfo_PersonalDetailsStepDefinition {
	
	MyInfo_PersonalDetailsActions obj1PersonalDetails = new MyInfo_PersonalDetailsActions();
	OrangeHRMLoginPageActions obj1Login = new OrangeHRMLoginPageActions();
	
	@Given("the user is on the MyInfo home page {string}")
	public void MyInfoPage(String string) {
	    DriverClass.openPage(string);
	}

	@When("the user enters personal details and save them")
	public void EnterDetails() {
		obj1PersonalDetails.Save();
	}

	@Then("the user should be able to successfully add personal details")
	public void VerifySave() {
		System.out.println("Saved Info");
	}
}