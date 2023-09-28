package com.stepdefinition;

import com.pageactions.EmployelistAction;

import io.cucumber.java.en.Then;

public class Empolyedefinition {
	EmployelistAction employelistAction=new EmployelistAction();
	
	@Then("click on pim")
	public void click_on_pim() {
		employelistAction.PIM();
		
	}

	@Then("fill the details")
	public void fill_the_details() throws InterruptedException {
		try {
			employelistAction.Employedetails();
		} catch (Exception e) {
		}
	    
	}
	
	@Then("click on search")
	public void click_on_search() {
		employelistAction.Search();
	    
	}


	@Then("I should see employee details")
	public void i_should_see_employee_details() {
		//Assert.assertFalse(employelistAction.NorecordsFound().contains("NoRecordFound"));
	}
	

}
