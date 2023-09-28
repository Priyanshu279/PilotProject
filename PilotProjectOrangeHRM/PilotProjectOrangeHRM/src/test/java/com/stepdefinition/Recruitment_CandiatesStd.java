package com.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pageactions.Recruitment_CandiatesActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Recruitment_CandiatesStd {
	Recruitment_CandiatesActions rca = new Recruitment_CandiatesActions();
	
	@Given("Select Recruitment")
	public void select_recruitment() {
		rca.setselectRecritment();
	}
	
	@Given("Select Recruitment and after clickiing on Candidates")
	public void select_recruitment_and_after_clickiing_on_candidates() {
		rca.setselectCandidates();
		BugStriker.WindowScroll("200");
		rca.setAddBtu();
	}
	
	@When("Click on Add and filling the details of Candidates")
	public void click_on_add_and_filling_the_details_of_candidates() {
		rca.setFillData();
		
	}
	
	@When("Click on Save Candidates")
	public void click_on_save_candidates() {
		rca.setSaveBtu();
	}
	
	@Then("User validate the saved successfully Candidates")
	public void user_validate_the_saved_successfully_candidates() {
	    
	}
	
	@Given("Select Recruitment and click on Candidates")
	public void select_recruitment_and_click_on_candidates() {
		rca.setselectRecritment();
		rca.setselectCandidates();
	}
	
	@When("User Enter the Search Details of Candidates")
	public void user_enter_the_search_details_of_candidates() {
		rca.setSearchName();
	}
	
	@When("User Click the Search Btn Candidates")
	public void user_click_the_search_btn_candidates() {
		rca.setSearch();
	}
	
	@Then("User Check Weather New user Added or not Candidates")
	public void user_check_weather_new_user_added_or_not_candidates() {
		System.out.println(rca.getTextsofHome());
	}
}
