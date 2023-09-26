package com.pageactions;

import org.openqa.selenium.support.PageFactory;

import com.pageobjects.OrangeHRMLocator;
import com.pageutilities.DriverClass;

public class OrangeHRMLoginPageActions {
	OrangeHRMLocator loginPageLocators = null;
	String strUserName, strPassWord;
	
	public OrangeHRMLoginPageActions() {
		this.loginPageLocators = new OrangeHRMLocator();
		
		PageFactory.initElements(DriverClass.getDriver(), loginPageLocators);
	}
	
	public void setUserName(String usname) {
		loginPageLocators.UserName.sendKeys(usname);
	}
	
	public void setPassWord(String psw) {
		loginPageLocators.passWord.sendKeys(psw);
	}
	
	public void setLoingbtn() {
		loginPageLocators.clickBtn.click();
	}
	
	public void setLogOut() {
		loginPageLocators.clikProfile.click();
		loginPageLocators.clickLogout.click();
	}
	
	public void login(String userName,String passWord) {
	    
	    this.setUserName(userName);
	    this.setPassWord(passWord);
	}
	
}
