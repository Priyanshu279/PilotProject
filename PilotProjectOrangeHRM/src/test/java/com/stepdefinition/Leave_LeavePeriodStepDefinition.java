package com.stepdefinition;


import com.pageactions.Leave_PeriodActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class Leave_LeavePeriodStepDefinition {

	Leave_PeriodActions leavePeriodAction = new Leave_PeriodActions();

	@Given("the user click on leave period from configure tab")
	public void the_user_click_on_leave_period_from_configure_tab() {
		leavePeriodAction.clickONLeavePeriod();

	}

	@Given("the user select month")
	public void the_user_select_month() {
		leavePeriodAction.selectMonth();

	}

	@Given("the user click on save. button")
	public void the_user_click_on_save_button() {
		leavePeriodAction.clickOnSave();

	}

	@Then("the user should be sucessfully set leave period")
	public void the_user_should_be_sucessfully_set_leave_period() {
		Assert.assertEquals(leavePeriodAction.getSuccessMessage(), "Successfully Saved");

	}

}
