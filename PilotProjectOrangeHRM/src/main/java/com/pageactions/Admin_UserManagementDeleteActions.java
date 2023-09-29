package com.pageactions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.pageobjects.Admin_UserManagementDeleteObj;
import com.pageobjects.Admin_UserManagementObj;
import com.pageutilities.DriverClass;

import io.cucumber.java.lu.ugeholl;

public class Admin_UserManagementDeleteActions {
	
	Admin_UserManagementDeleteObj userObj = null;
	
	public Admin_UserManagementDeleteActions() {
		// TODO Auto-generated constructor stub
		this.userObj = new Admin_UserManagementDeleteObj();
		
		PageFactory.initElements(DriverClass.getDriver(), userObj);
	}
	
	public void setDelect() {
		userObj.deletUser.click();
	}
}
