package com.stepdefinition;

import com.pageactions.ReportAction;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReportStepdefinition {
	ReportAction reportAction=new ReportAction();

	@Then("I click reports")
	public void i_click_reports() {
		reportAction.clickOnReport();
	}

	@Then("enter report name")
	public void enter_report_name() {
		reportAction.reportName();
	}

	@Then("select select criteria")
	public void select_select_criteria() throws InterruptedException {
		reportAction.clickOnSelectionCreteria();
	}

	@Then("choose the option")
	public void choose_the_option() {
		reportAction.chooseCreteria();
	}

	@Then("select dispay fields group")
	public void select_dispay_fields_group() throws InterruptedException {
		reportAction.selectGroupField();
	}

	@Then("choose display group option")
	public void choose_display_group_option() {
		reportAction.groupOption();
	}

	@Then("select display field")
	public void select_display_field() throws InterruptedException {
		reportAction.selectDisplayField();
	}

	@Then("choose thr display option")
	public void choose_thr_display_option() {
		reportAction.displayOption();
	}

	@Then("click on plus")
	public void click_on_plus() {
		reportAction.clickOnPlus();
	}

	@Then("save the record and validate it")
	public void save_the_record_and_validate_it() throws InterruptedException {
		reportAction.clickOnSave();
	}


}
