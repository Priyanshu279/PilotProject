
@tag
Feature: Reports-Leave Entitlements and Usage Report

Background:
Given Open Browser OrangeHRM "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When Use enter login details
And click the Login btn 
Given the user should on leave home page
When the user click on Leave Entitlements and Usage Report from reports dropdown

  @tag1
  Scenario: Generate Leave Entitlements and Usage Reports for employee
    When the user select generate for option as employee 
    And the user enters name
    And the user select leave period.
    And the user click on generate button
    Then the user should successfully get generated records
    
    
  Scenario: Generate Leave Entitlements and Usage Reports for Leave type
  	When the user select generate for leave type option
  	And the user select leave type for generate report
  	And the user select leave period for generate report
  	And the user select location for generate report
  	And the user select subunit for generate report
  	And the user select job title for generate report
  	And the user click on generate button for generate report
  	Then the user shoudld successfully get generated recordss
  
   
