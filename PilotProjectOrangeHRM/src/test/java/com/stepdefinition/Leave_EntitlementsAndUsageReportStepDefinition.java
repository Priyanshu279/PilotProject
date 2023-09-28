package com.stepdefinition;


import com.pageactions.Leave_EntitlementsUsageReportActions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Leave_EntitlementsAndUsageReportStepDefinition {

	//created instance of actions class
	Leave_EntitlementsUsageReportActions leaveentitlementusagereport_obj = new Leave_EntitlementsUsageReportActions();
	
	@When("the user click on Leave Entitlements and Usage Report from reports dropdown")
	public void the_user_click_on_leave_entitlements_and_usage_report_from_reports_dropdown() {
		leaveentitlementusagereport_obj.clickOnLeaveEntitlementUsageReport();
	}

	@When("the user select generate for option as employee")
	public void the_user_select_generate_for_option_as_employee() {
		leaveentitlementusagereport_obj.clickONGenerateForOptionAsEmployee();
	}
	
	@When("the user enters name")
	public void the_user_enters_name() throws InterruptedException {
		leaveentitlementusagereport_obj.enterName();
	}
	
	@When("the user select leave period.")
	public void the_user_select_leave_period() {
		leaveentitlementusagereport_obj.selectLeavePeriod();
	    
	}

	@When("the user click on generate button")
	public void the_user_click_on_generate_button() {
		leaveentitlementusagereport_obj.clickOnGenerateButton();
	}

	@Then("the user should successfully get generated records")
	public void the_user_should_successfully_get_generated_records() {
		leaveentitlementusagereport_obj.AssertGeneredRecord();
	}
	

	//Scenario second by using leave type ...............................................
	
	@When("the user select generate for leave type option")
	public void the_user_select_generate_for_leave_type_option() {
		leaveentitlementusagereport_obj.clickLeaveTypeRadioButton();
	}

	@When("the user select leave type for generate report")
	public void the_user_select_leave_type_for_generate_report() {
		leaveentitlementusagereport_obj.selectLeaveType();
			}

	@When("the user select leave period for generate report")
	public void the_user_select_leave_period_for_generate_report() {
		leaveentitlementusagereport_obj.selectLeavePeriodScenario2();
		
	}

	@When("the user select location for generate report")
	public void the_user_select_location_for_generate_report() {
		leaveentitlementusagereport_obj.selectLocation();
		
	}

	@When("the user select subunit for generate report")
	public void the_user_select_subunit_for_generate_report() {
		leaveentitlementusagereport_obj.selectSubUnit();
		
	}

	@When("the user select job title for generate report")
	public void the_user_select_job_title_for_generate_report() {
		leaveentitlementusagereport_obj.selectJobTitle();
		
	}

	@When("the user click on generate button for generate report")
	public void the_user_click_on_generate_button_for_generate_report() {
		leaveentitlementusagereport_obj.clickOnGenerateScenario2();
		
	}

	@Then("the user shoudld successfully get generated recordss")
	public void the_user_shoudld_successfully_get_generated_recordss() {
		leaveentitlementusagereport_obj.AssertGeneredRecord();
		
		
	}

}


