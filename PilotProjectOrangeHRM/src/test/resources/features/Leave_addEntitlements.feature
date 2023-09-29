

@entitlements
Feature: Add Entitlements

Background: 
Given Open Browser OrangeHRM "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When Use enter login details
And click the Login btn
Given the user should on leave home page
When the user click on add entitlements from entitlements dropdown mwnu

  @validData
 Scenario: The user Add Entitlements with valid data
    And the user click on add to
    And the user enter name
    And the user select leave type and leave period
    And the user enter leave entitlement 
    And the user click on save button
    And the user click on confirm 
    Then the user should added  leave entitlements successfully 

@missingRequiredFields
Scenario: The user Addd Entitlements without filling required fields
		 And the user select leave type and leave period 
		 And the user enter leave entitlement 
     And the user click on save button
     And the user should get required message
