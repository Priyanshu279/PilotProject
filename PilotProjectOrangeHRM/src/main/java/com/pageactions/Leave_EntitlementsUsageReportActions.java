package com.pageactions;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.pageobjects.Leave_EntitlemenAndUsageReportObjects;
import com.pageutilities.DriverClass;

public class Leave_EntitlementsUsageReportActions {

	// pageObject instance
	Leave_EntitlemenAndUsageReportObjects usageReportObj = null;

	// constructor
	public Leave_EntitlementsUsageReportActions() {
		this.usageReportObj = new Leave_EntitlemenAndUsageReportObjects();
		PageFactory.initElements(DriverClass.getDriver(), usageReportObj);

	}

	// created instance To read data from properties file
	Leave_ReadPropertesFileData propertiesFileData = new Leave_ReadPropertesFileData();

	public void clickOnLeaveEntitlementUsageReport() {
		usageReportObj.reportsTab.click();
		usageReportObj.leaveEntitlementusageReport.click();

	}

	// click on Employee radio Butoon
	public void clickONGenerateForOptionAsEmployee() {
		usageReportObj.employeeRadioButton.click();
	}

	// Enter name
	public void enterName() throws InterruptedException {
		usageReportObj.employeeName.sendKeys(propertiesFileData.getNameLeaveEntitlementAndUsageRport());
		// DriverClass.explicitWaitVisibility(usageReportObj.nameDropDown);
		Thread.sleep(4000);
		usageReportObj.employeeName.sendKeys(Keys.ARROW_DOWN);
		usageReportObj.employeeName.sendKeys(Keys.ENTER);
	}

	// select leave period
	public void selectLeavePeriod() {
		usageReportObj.leavePeriod.click();
		List<WebElement> ele = usageReportObj.leaveDropDownList;

		for (WebElement a : ele) {
			if (a.getText().equals(propertiesFileData.getLeavePeriod_LeaveEntitlementAndUsageReport())) {
				a.click();
			}
		}
	}

	// click on generate button
	public void clickOnGenerateButton() {
		usageReportObj.generateButton.click();
	}

	// assert by using record found text
	public void AssertGeneredRecord() {
		String assertMessage = usageReportObj.asserElementRecordFound.getText();
		String[] str = assertMessage.split(" ");
		System.out.println(str[1] + " " + str[2]);
	}

	// Scenario second by using leave
	// type............................................................

	// click on Leave type radio button
	public void clickLeaveTypeRadioButton() {
		Boolean selected = usageReportObj.leaveTypeRadioButton.isSelected();
		if (selected == false) {
			usageReportObj.leaveTypeRadioButton.click();
		}
	}

	// Select leave type
	public void selectLeaveType() {
		usageReportObj.leaveTypeDropDown.click();
		List<WebElement> ele = usageReportObj.leaveTypeDropDownList;

		for (WebElement a : ele) {
			if (!a.isDisplayed()) {
				continue;
			}
			if (a.getText().equals(propertiesFileData.getLeaveType_LeaveEntitlementAndUsageReport_scenario2())) {
				a.click();
				break;

			}
		}
	}

	// Select leave period
	public void selectLeavePeriodScenario2() {

		usageReportObj.leavePeriodDropDown.click();
		List<WebElement> ele = usageReportObj.leavePeriodDropDownList;

		for (WebElement a : ele) {
			if (a.getText().equals(propertiesFileData.getLeavePeriod_LeaveEntitlementAndUsageReport_scenario2())) {
				a.click();
			}
		}

	}

	// select location
	public void selectLocation() {
		usageReportObj.locationDropDown.click();
		List<WebElement> ele = usageReportObj.locationDropDownList;

		for (WebElement a : ele) {
			if (a.getText().equals(propertiesFileData.getLocation_LeaveEntitlementAndUsageReport_scenario2())) {
				a.click();
			}
		}

	}

	// select subUnit
	public void selectSubUnit() {
		usageReportObj.subUnitDropDown.click();
		List<WebElement> ele = usageReportObj.subUnitDropDownList;

		for (WebElement a : ele) {
			if (!a.isDisplayed()) {
				continue;
			}
			if (a.getText().equals(propertiesFileData.getSubUnit_LeaveEntitlementAndUsageReport_scenario2())) {
				a.click();
				break;
			}
		}
	}

	// Select job title
	public void selectJobTitle() {
		usageReportObj.jobTitleDropDown.click();
		List<WebElement> ele = usageReportObj.jobTitleDropDownList;

		for (WebElement a : ele) {
			if (!a.isDisplayed()) {
				continue;
			}
			if (a.getText().equals(propertiesFileData.getJobTitle_LeaveEntitlementAndUsageReport_scenario2())) {
				a.click();
				break;
			}
		}

	}

	// Click on generate button
	public void clickOnGenerateScenario2() {
		usageReportObj.generateButtonscenario2.click();

	}

	// Asserting using record found string
	public void AssertGeneredRecordScenario2() {
		String assertMessage = usageReportObj.asserElementRecordFound.getText();
		String[] str = assertMessage.split(" ");
		System.out.println(str[1] + " " + str[2]);

	}

}
