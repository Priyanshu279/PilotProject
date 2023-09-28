package com.pageactions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import com.pageobjects.EmployelistObjects;
import com.pageutilities.DriverClass;


public class EmployelistAction {
	EmployelistObjects empolyelistObjects = null;
	String Strname,empid,Supervisor;
	
	
	public EmployelistAction() {
		this.empolyelistObjects=new EmployelistObjects();
		PageFactory.initElements(DriverClass.getDriver(), empolyelistObjects);
	}
	
	 public void PIM () {
		 empolyelistObjects.ClickOnPIM.click();
	   }
	   
	   public void Empolyename(String empname,String id,String supervisor) throws InterruptedException {
		   empolyelistObjects.Enteremployename.sendKeys(empname);
		   Thread.sleep(3000);
		   empolyelistObjects.Enteremployename.sendKeys(Keys.ARROW_DOWN);
		   Thread.sleep(3000);
		   empolyelistObjects.Enteremployename.sendKeys(Keys.ENTER);
		   Thread.sleep(3000);
		   
		   
		   empolyelistObjects.Enteremployeid.sendKeys(id);
		   Thread.sleep(3000);
		   
		   empolyelistObjects.employeeStatus.click();
		   Thread.sleep(3000);
		   empolyelistObjects.statusOption.click();
		 
		   
		   empolyelistObjects.Supervisorname.sendKeys(supervisor);
		   Thread.sleep(3000);
		   empolyelistObjects.Supervisorname.sendKeys(Keys.ARROW_DOWN);
		   Thread.sleep(2000);
		   empolyelistObjects.Supervisorname.sendKeys(Keys.ENTER);
		   
		   
		   empolyelistObjects.Supervisorname.sendKeys(Keys.TAB,Keys.ARROW_DOWN,Keys.ENTER);
		   Thread.sleep(3000);
		   
		   empolyelistObjects.Supervisorname.sendKeys(Keys.TAB,Keys.TAB,Keys.ARROW_DOWN,Keys.ENTER);
		   Thread.sleep(3000);
		  // empolyelistObjects.chooseSubUnit.click();
		  
		}
	   
	   public void Search() {
			 empolyelistObjects.search.click();
		   }
	   
	   public void NorecordsFound() {
		   empolyelistObjects.norecordsfound.getText();
	   }
	   
	   
	   public void Employedetails() throws InterruptedException {
		   File file=new File("src/test/resources/EmployeList.properties");
			FileInputStream fileInput=null;

			try {

				fileInput=new FileInputStream(file);

			} catch (FileNotFoundException e) {

				// TODO: handle exception

				e.printStackTrace();

			}

			Properties prop= new Properties();

			try {

				prop.load(fileInput);

			} catch (IOException e) {

				// TODO: handle exception

				e.printStackTrace();

			}

			Strname=prop.getProperty("NAME");

			empid=prop.getProperty("id");
    
			Supervisor=prop.getProperty("Supervisor");
			
			
			

			//Fill the details

			this.Empolyename(Strname,empid,Supervisor);

			

		   
	   }

	        
	}

