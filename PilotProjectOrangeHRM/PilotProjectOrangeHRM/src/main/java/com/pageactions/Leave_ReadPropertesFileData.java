package com.pageactions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Leave_ReadPropertesFileData {

	//method to read data from properties file
	Properties properties;

	//path of data properties file
	String path = "src/test/resources/Leave_ModuleData.properties";

	
	//constructor  in which loading properties file data 
	public Leave_ReadPropertesFileData() {
		properties = new Properties();

		try {
			FileInputStream fis = new FileInputStream(path);
			try {
				properties.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	

	
	//Leave AddEntitlements data....................................................../
	
	//Read name 
	public String getName() {
		String name = properties.getProperty("name");
		return name;
	}

	
	
	//Read Entitilement days
	public String getEntitlementDay() {
		String day = properties.getProperty("EntitlementDays");
		return day;
	}

	// leave entitlementand usage report..........................................
	

	// scenario 1
	
	//Reading name
	public String getNameLeaveEntitlementAndUsageRport() {
		String name = properties.getProperty("nameLeave_EntitlementAndUsageReport");
		return name;

	}

	
	//Reading leave period
	public String getLeavePeriod_LeaveEntitlementAndUsageReport() {
		String leavePeriod = properties.getProperty("selectLeavePeriod_EntitlementAndUsageReport_scenario1");
		return leavePeriod;
	}
	
	
	

	// Scenario2............

	
	//Reading leave type
	public String getLeaveType_LeaveEntitlementAndUsageReport_scenario2() {
		String leaveType = properties.getProperty("leaveType_EntitlementAndUsageReport_Scenario2");
		return leaveType;
	}

	
	//Reading leave period
	public String getLeavePeriod_LeaveEntitlementAndUsageReport_scenario2() {
		String leavePeriod = properties.getProperty("leavePeriod_EntitlementAndUsageReport_Scenario2");
		return leavePeriod;
	}

	
	//Reading location
	public String getLocation_LeaveEntitlementAndUsageReport_scenario2() {
		String location = properties.getProperty("location_EntitlementAndUsageReport_Scenario2");
		return location;
	}

	
	//Reading subUnit 
	public String getSubUnit_LeaveEntitlementAndUsageReport_scenario2() {
		String subUnit = properties.getProperty("subUnit_EntitlementAndUsageReport_Scenario2");
		return subUnit;
	}

	
	//Reading jobTitle
	public String getJobTitle_LeaveEntitlementAndUsageReport_scenario2() {
		String jobTitle = properties.getProperty("jobTitle_EntitlementAndUsageReport_Scenario");
		return jobTitle;
	}

}
