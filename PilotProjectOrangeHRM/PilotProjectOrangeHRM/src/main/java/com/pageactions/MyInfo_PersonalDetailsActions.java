package com.pageactions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.pageobjects.MyInfo_PersonalDetailsObjects;
import com.pageutilities.DriverClass;

public class MyInfo_PersonalDetailsActions {

	MyInfo_PersonalDetailsObjects myInfo_PersonalDetailsObjects = null;
	String strFirstName, strLastName, strEmployeeId, strDriverLicenseNumber, strExpiryDate, strNationality,
			strDateOfBirth, strGender, strMilitaryService;

	public MyInfo_PersonalDetailsActions() {
		this.myInfo_PersonalDetailsObjects = new MyInfo_PersonalDetailsObjects();
		PageFactory.initElements(DriverClass.getDriver(), myInfo_PersonalDetailsObjects);
	}

	// set FirstName
	public void setFirstName(String strFirstName) {
		myInfo_PersonalDetailsObjects.EmpLastNameInput.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);
		myInfo_PersonalDetailsObjects.EmpFirstNameInput.sendKeys(strFirstName);
	}

	// set LastName
	public void setLastName(String strLastName) {
//		myInfo_PersonalDetailsObjects.EmpLastNameInput.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		myInfo_PersonalDetailsObjects.EmpLastNameInput.sendKeys(strLastName);
	}

	// set EmployeeId
	public void setEmployeeId(String strEmployeeId) {
//		myInfo_PersonalDetailsObjects.EmpLastNameInput.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		myInfo_PersonalDetailsObjects.EmployeeId.sendKeys(strEmployeeId);
	}

	// set DriverLicenseNumber
	public void setDriverLicenseNumber(String strDriverLicenseNumber) {
//		myInfo_PersonalDetailsObjects.EmpLastNameInput.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		myInfo_PersonalDetailsObjects.DriverLicenseNumber.sendKeys(strDriverLicenseNumber);
	}

	// set ExpiryDate
	public void setExpiryDate(String strExpiryDate) {
//		myInfo_PersonalDetailsObjects.EmpLastNameInput.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		myInfo_PersonalDetailsObjects.ExpiryDate.sendKeys(strExpiryDate);
	}

	// set Nationality
	public void setNationality(String strNationality) {
		myInfo_PersonalDetailsObjects.Nationality.click();
		myInfo_PersonalDetailsObjects.Nationality.sendKeys(strNationality);
	}

	// set DateOfBirth
	public void setDateOfBirth(String strDateOfBirth) {
//		myInfo_PersonalDetailsObjects.EmpLastNameInput.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
//		myInfo_PersonalDetailsObjects.DateOfBirth.sendKeys(strDateOfBirth);
		
		DriverClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		myInfo_PersonalDetailsObjects.DateOfBirth.click();
		String desiredDate = strDateOfBirth;
		JavascriptExecutor jsExecutor = (JavascriptExecutor) DriverClass.getDriver();
		jsExecutor.executeScript("arguments[0].value = arguments[1];", myInfo_PersonalDetailsObjects.DateOfBirth, desiredDate);
		// Send Enter key to confirm the date selection (optional)
		myInfo_PersonalDetailsObjects.DateOfBirth.sendKeys(Keys.ENTER);
	}

	// set Gender
	public void setGender() {
		myInfo_PersonalDetailsObjects.Gender.click();
	}

	// set MilitaryService
	public void setMilitaryService(String strMilitaryService) {
//		myInfo_PersonalDetailsObjects.EmpLastNameInput.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		myInfo_PersonalDetailsObjects.MilitaryService.sendKeys(strMilitaryService);
	}

	// save button
	public void clickSaveBtn() {
		myInfo_PersonalDetailsObjects.SaveBtn.click();
	}
	
	public void Save() {

		File file = new File("C:\\Users\\mmaralinganavar\\Desktop\\Pilot Project\\GitOrangeHRM\\PilotProject\\PilotProjectOrangeHRM\\src\\test\\resources\\MyInfo_PersonalDetails.properties");
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Properties prop = new Properties();
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}

		strFirstName = prop.getProperty("FirstName1");
		strLastName = prop.getProperty("LastName1");
		strEmployeeId = prop.getProperty("EmployeeId1");
		strDriverLicenseNumber = prop.getProperty("DriverLicenseNumber1");
		strExpiryDate = prop.getProperty("ExpiryDate1");
//		strNationality = prop.getProperty("Nationality1");
		strDateOfBirth = prop.getProperty("DateOfBirth1");
		strGender = prop.getProperty("Gender1");
		strMilitaryService = prop.getProperty("MilitaryService1");

		this.setFirstName(strFirstName);
		this.setLastName(strLastName);
		this.setEmployeeId(strEmployeeId);
		this.setDriverLicenseNumber(strDriverLicenseNumber);
		this.setExpiryDate(strExpiryDate);
//		this.setNationality(strNationality);
		this.setDateOfBirth(strDateOfBirth);
		this.setGender();
		this.setMilitaryService(strMilitaryService);
		this.clickSaveBtn();
		
	}
}

