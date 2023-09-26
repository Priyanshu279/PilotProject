package com.pageutilities;

import org.openqa.selenium.JavascriptExecutor;

import com.pageactions.OrangeHRMLoginPageActions;

public class BugStrikerLogin {
	
	OrangeHRMLoginPageActions loginBS = new OrangeHRMLoginPageActions();
	OrangeHRMLoginPageActions logoutBS = new OrangeHRMLoginPageActions();
	
	public void setLoginBS() {
		loginBS.login("Bug Striker","admin123");
	}
	
//	public void setLogoutBS() {
//		logoutBS.setLogOut();
//	}
	
	public void WindowScroll(String num){
		JavascriptExecutor jss = (JavascriptExecutor)DriverClass.getDriver();
        jss.executeScript("window.scrollBy(0,"+num+")", "");
	}
}
