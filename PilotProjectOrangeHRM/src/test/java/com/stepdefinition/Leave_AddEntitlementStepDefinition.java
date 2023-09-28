package com.stepdefinition;

import com.pageactions.Leave_AddEntitlementsActions;
import com.pageactions.OrangeHRMLoginPageActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Leave_AddEntitlementStepDefinition {

	OrangeHRMLoginPageActions loginAction = new OrangeHRMLoginPageActions();
	Leave_AddEntitlementsActions AddEntitlements = new Leave_AddEntitlementsActions();

	@Given("the user should on leave home page")
	public void the_user_should_on_leave_home_page() {
		AddEntitlements.clickLeave();
	}

	@When("the user click on add entitlements from entitlements dropdown mwnu")
	public void the_user_click_on_add_entitlements_from_entitlements_dropdown_mwnu() {
		AddEntitlements.clickOnAddEntitlements();
	}

	@When("the user click on add to")
	public void the_user_click_on_add_to() {
		// AddEntitlements.addTO();

	}

	@When("the user enter name")
	public void the_user_enter_name() throws InterruptedException {
		AddEntitlements.enterName();

	}

	@When("the user select leave type and leave period")
	public void the_user_select_leave_type_and_leave_period() {
		AddEntitlements.selectLeaveType();

	}

	@When("the user enter leave entitlement")
	public void the_user_enter_leave_entitlement() {
		AddEntitlements.enterEntitlements();

	}

	@When("the user click on save button")
	public void the_user_click_on_save_button() {
		AddEntitlements.clickOnSave();

	}

	@When("the user click on confirm")
	public void the_user_click_on_confirm() {
		AddEntitlements.clickOnConfirm();

	}

	@Then("the user should added  leave entitlements successfully")
	public void the_user_should_added_leave_entitlements_successfully() {

		Assert.assertEquals(AddEntitlements.assertIsAdded(), "Added");
	}

	// Second secenario



	@When("the user should get required message")
	public void the_user_should_get_required_message() {
		
		Assert.assertEquals(AddEntitlements.getRequiredFieldMessage(), "Required");
		System.out.println("MESSAGE: Enter Required fields");

	}

}
