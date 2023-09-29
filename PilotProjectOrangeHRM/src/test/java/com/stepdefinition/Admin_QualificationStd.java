package com.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import com.pageactions.Admin_QualificationActions;
import com.pageutilities.DriverClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Admin_QualificationStd {
	Admin_QualificationActions aqa = new Admin_QualificationActions();
	Logger logs = LogManager.getLogger(Admin_QualificationActions.class);
	
	@When("Click on Qualification and select Skills")
	public void click_on_qualification_and_select_skills()  {
		//DriverClass.getDriver().findElement(By.xpath("//header/div[2]/nav[1]/ul[1]/li[4]/span[1]")).click();
	    aqa.setQualification();
	    aqa.setSillks();
	}

	@When("Click on Add fill the details")
	public void click_on_add_fill_the_details() throws InterruptedException {
	    aqa.setAdd();
	    Thread.sleep(3000);
	    aqa.setUserName();
	    aqa.setclickSave();
	}
	
	@Then("validate the saved successfully")
	public void validate_the_saved_successfully() throws IOException {
		try {
			Assert.assertEquals(aqa.getPopTextSaved(),"Successfully Saved");
			logs.info("--------------------------"+aqa.getPopTextSaved()+"-------------------");
		}catch (Exception e) {
			System.err.println("--------------------------"+"Already exists"+"---------------------------");
			logs.info("--------------------------"+"Already exists"+"---------------------------");
		}
		File screenshotfile = ((TakesScreenshot)DriverClass.getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotfile,new File("Screenshots\\QualificationValidate.png"));
	}
}
