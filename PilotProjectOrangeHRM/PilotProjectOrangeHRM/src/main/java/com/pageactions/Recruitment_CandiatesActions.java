package com.pageactions;

import org.openqa.selenium.support.PageFactory;

import com.pageobjects.Recruitment_CandiatesObj;
import com.pageutilities.DriverClass;

public class Recruitment_CandiatesActions {
	Recruitment_CandiatesObj recobj= null;
	
	public Recruitment_CandiatesActions() {
		
		this.recobj = new Recruitment_CandiatesObj();
		
		PageFactory.initElements(DriverClass.getDriver(), recobj);
	}
	
	public void setselectRecritment() {
		recobj.selectRecruitment.click();
	}
	
	public void setselectCandidates() {
		recobj.selectCandidates.click();
	}
	
	public void setAddBtu() {
		recobj.selectAdd.click();
	}
	
	public void setFillData() {
		recobj.enterFristName.sendKeys("Mallikarjun");
		recobj.enterLastName.sendKeys("Maralinganavar");
		recobj.enterEmail.sendKeys("mallikarjunmaralinganavar@gmail.com");
	}
	
	public void setSaveBtu() {
		recobj.clickSave.click();;
	}
	
	public void setSearchName() {
		recobj.searchEnterName.sendKeys("Mallikajrun");
	}
	
	public void setSearch() {
		recobj.clicksearch.click();
	}
	
	public String getTextsofHome() {
		return recobj.getTextOfthePage.getText();
	}
}
