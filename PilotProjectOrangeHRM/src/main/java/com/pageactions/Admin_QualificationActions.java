package com.pageactions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.pageobjects.Admin_QualificationObj;
import com.pageobjects.Admin_UserManagementObj;
import com.pageutilities.DriverClass;

public class Admin_QualificationActions {
	Admin_QualificationObj aqobj = null;
	Admin_UserManagementObj userManagementObj = new Admin_UserManagementObj();
	
	public Admin_QualificationActions() {
		this.aqobj = new Admin_QualificationObj();
		
		PageFactory.initElements(DriverClass.getDriver(), aqobj);
	}
	
	public void setQualification() {
		//userManagementObj.userMangement.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
		aqobj.selectQualification.click();
	}
	
	public void setSillks() {
		aqobj.selectSillks.click();
	}
	
	public void setAdd() {
		aqobj.clickAdd.click();
	}
	
	public void setUserName() {
		aqobj.userName.sendKeys("Mallikarjun");
	}
	
	public void setclickSave() {
		aqobj.clickSaveSillks.click();
	}
	
}
