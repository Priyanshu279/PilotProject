package com.pageactions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.pageobjects.Performance_ConfigureTrackersObjects;
import com.pageutilities.DriverClass;
public class Performance_ConfigureTrackersActions {
	
	Performance_ConfigureTrackersObjects trackersObj=null;
	public Performance_ConfigureTrackersActions(){
		this.trackersObj=new Performance_ConfigureTrackersObjects();
		PageFactory.initElements(DriverClass.getDriver(), trackersObj);	}
	
	
	public void clickOnPerformance() {
		trackersObj.performanceModule.click();
	}
	
	public void clickOnTrackers() throws InterruptedException {
		trackersObj.configureDrop.click();
		trackersObj.track.click();
//		Actions  action=new Actions(DriverClass.getDriver());
//		Thread.sleep(3000);
//		action.moveToElement(trackersObj.trackersFeature).click().build().perform();
//		trackersObj.trackersFeature.click();
		
	}
	
	public void clickOnAddButoon() {
		trackersObj.addButoon.click();
	}
	
	public void enterTrackerName(String trackerName) {
		trackersObj.trackerName.sendKeys(trackerName);
	}
	
	public void enterEmpName(String EmpName) throws InterruptedException {
		trackersObj.employeeName.sendKeys(EmpName);
		Thread.sleep(5000);
		trackersObj.empDropdownList.get(2).click();
		
	}
	
	public void enterReviewerName(String reviewers) throws InterruptedException {
		trackersObj.reviewers.sendKeys(reviewers);
		Thread.sleep(4000);
	
		trackersObj.reviewersDropdownList.get(2).click();
	}
	
	public void clickOnSaveButton() {
		trackersObj.submitButton.click();
	}
	
	
	public String getSuccessMessage() {
		return trackersObj.assertSeccessMessage.getText();
		
	}
	
	
	
	
	

}
