package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.pageutilities.BugStrikerLogin;
import com.pageutilities.DriverClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.When;

public class HooKs {
	BugStrikerLogin bs = new BugStrikerLogin();
	@Before
	public void setUP() {
		DriverClass.setUpDriver();
	}
	
	@When("Use enter login details")
	public void Use_enter_login_details(){
		bs.setLoginBS();
	}
	
	@After(order = 2)
	public void takeScreenshot(Scenario scenario) throws IOException{
		if(scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) DriverClass.getDriver();
			byte[] scr = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(scr,"image/png","Screenshot");
		}else {
			TakesScreenshot ts = (TakesScreenshot) DriverClass.getDriver();
			byte[] scr = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(scr,"image/png","Screenshot");
		}
	}
	
	@After(order = 0)
	public void setDown() {
		DriverClass.tearDown();
	}

}
