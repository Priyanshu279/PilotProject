package com.pageactions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.pageobjects.Admin_UserManagementObj;
import com.pageutilities.DriverClass;

public class Admin_UserManagementActions {
	
	Admin_UserManagementObj userManagementObj = null;
	
	public Admin_UserManagementActions() {
		// TODO Auto-generated constructor stub
		this.userManagementObj = new Admin_UserManagementObj();
		
		PageFactory.initElements(DriverClass.getDriver(), userManagementObj);
	}
		
	public void setAdmin() {
		userManagementObj.adminOp.click();
	}
	
	public void setUserManagement() {
		userManagementObj.userMangement.click();
	}
	
	public void setUser() {
		userManagementObj.users.click();
	}
	
	public void setAdd() {
		userManagementObj.add.click();
	}
	
	public void addUser() throws InterruptedException {
		
		File file = new File("src/test/resources/AdminData.properties");
		
		FileInputStream fileInput = null;
	    try {

	    	fileInput = new FileInputStream(file);

	   } catch(FileNotFoundException e) {

		   e.printStackTrace();

	   }

	    Properties prop = new Properties();

	    try {

			prop.load(fileInput);

	    } catch(IOException e1) {

	    	e1.printStackTrace();

	    }
		
		userManagementObj.selectuserRole.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		userManagementObj.employeeName.sendKeys(prop.getProperty("employeeName"));
		Thread.sleep(2000);
		userManagementObj.employeeName.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		userManagementObj.selectstatus.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		userManagementObj.userName.sendKeys(prop.getProperty("userName"));
		userManagementObj.passWord.sendKeys(prop.getProperty("passWord"));
		userManagementObj.confirmPassword.sendKeys(prop.getProperty("confirmPassword"));
	}
	public void setSaveUser() {
		userManagementObj.userinfosave.click();
	}
	
	public void setClickSearch() {
		userManagementObj.clickSearch.click();
	}
	public void searchUser(String searchName) {
		userManagementObj.enterUserName.sendKeys(searchName);
	}
	
	public String getUserName() {
		return userManagementObj.checktheUserName.getText();
	}
}
