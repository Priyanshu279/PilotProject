package com.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.pageutilities.DriverClass;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooKs {
	BugStriker bs = new BugStriker();
		
	@When("Use enter login details")
	public void Use_enter_login_details(){
		bs.setLoginBS();
	}
	
//	@Then("Click Screenshot {string}")
//	public void click_screenshot(String NameofImg) throws IOException {
//		File screenshotfile = ((TakesScreenshot)DriverClass.getDriver()).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(screenshotfile,new File("Screenshots\\"+NameofImg+".png"));
//	}
	
	@After(order = 1)
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
	public void setLogout() {
		bs.setLogoutBS();
	}

}
