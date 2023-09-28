package com.pageactions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.pageobjects.Leave_AddEntitlementsObjects;
import com.pageutilities.DriverClass;

public class Leave_AddEntitlementsActions {

	Leave_AddEntitlementsObjects addEntitlementsObj = null;

	public Leave_AddEntitlementsActions() {
		this.addEntitlementsObj = new Leave_AddEntitlementsObjects();
		PageFactory.initElements(DriverClass.getDriver(), addEntitlementsObj);
	}

	// object creation of properties read class
	Leave_ReadPropertesFileData FileData = new Leave_ReadPropertesFileData();

	public void clickLeave() {
		addEntitlementsObj.leave.click();
	}

	public void clickOnAddEntitlements() {
		addEntitlementsObj.entitlementsTab.click();
		addEntitlementsObj.addEntitlements.click();
	}

	public void addTO() {

		addEntitlementsObj.AddTo.click();
	}

	public void enterName() throws InterruptedException {
		addEntitlementsObj.EmployeeNmae.sendKeys(FileData.getName());
		Thread.sleep(3000);
//		WebElement objs = DriverClass.wait.until(ExpectedConditions.elementToBeClickable(addEntitlementsObj.EmployeeNmae));
		addEntitlementsObj.EmployeeNmae.sendKeys(Keys.ARROW_DOWN);
		addEntitlementsObj.EmployeeNmae.sendKeys(Keys.ENTER);

		

	}

	public void selectLeaveType() {
		addEntitlementsObj.LeaveType.click();
		addEntitlementsObj.personalLeave.click();

//		addEntitlementsObj.LeavePeriod.click();
//		addEntitlementsObj.period.click();

	}

	public void enterEntitlements() {
		addEntitlementsObj.enterEntitlements.sendKeys(FileData.getEntitlementDay());
	}

	public void clickOnSave() {
		addEntitlementsObj.saveButton.click();
	}

	public void clickOnConfirm() {
		addEntitlementsObj.confirmButton.click();

	}

	public String assertIsAdded() {
		String assertText = addEntitlementsObj.assertAdded.getText();
		return assertText;
	}
	
	//Second scenario
	
	public String getRequiredFieldMessage() {
		String message=addEntitlementsObj.requiredFieldMessage.getText();
		return message;
	}

}
