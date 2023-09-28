package com.pageactions;


import org.openqa.selenium.support.PageFactory;

import com.pageobjects.Leave_LeavePeriodObjects;
import com.pageutilities.DriverClass;


public class Leave_PeriodActions {

	Leave_LeavePeriodObjects leavePeriodObj = null;

	public Leave_PeriodActions() {
		this.leavePeriodObj = new Leave_LeavePeriodObjects();
		PageFactory.initElements(DriverClass.getDriver(), leavePeriodObj);
	}

	public void clickONLeavePeriod() {
		leavePeriodObj.configureTab.click();
		leavePeriodObj.leavePeriodTab.click();
	}

	public void selectMonth() {
		leavePeriodObj.startMonth.click();
		leavePeriodObj.februarySelect.click();
	}

	public void clickOnSave() {
		leavePeriodObj.saveButton.click();
	}

	public String getSuccessMessage() {
		String message = leavePeriodObj.successfullMessage.getText();
		return message;
	}

}
