package com.stepdefinition;

import com.pageactions.pimActions;

import io.cucumber.java.en.Then;

public class pimdefinition {
	pimActions pimAction=new pimActions();
	
	@Then("Click on Search")
	public void click_on_search() {
	   pimAction.search1();
	}

	@Then("click on PIM")
	public void click_on_pim() {
	    pimAction.clickOnPim();
	}

	@Then("click on configuration list")
	public void click_on_configuration_list() {
	    pimAction.clickOnconfigurationList();
	}

	@Then("select termination reasons")
	public void select_termination_reasons() {
	   pimAction.clickOnTerminationreasons();
	}

	@Then("click on add")
	public void click_on_add() {
	    pimAction.clickOnAdd();
	}

	@Then("enter the name")
	public void enter_the_name() {
	   pimAction.enterName();
	}

	@Then("click on save")
	public void click_on_save() {
	    pimAction.clickOnSave();
	}

	@Then("validating the Records")
	public void validating_the_records() {
	    
	}
	
	
	
	
}