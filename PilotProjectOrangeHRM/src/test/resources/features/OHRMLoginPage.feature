Feature: Orange HRM Login feature test

@Valid_Credential @UserCreation
Scenario: To validate the Login feature of the OrangeHRM 
Given Open Browser OrangeHRM "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When User enter the "Admin" and "admin123"
And click the Login btn
Then Validating Login Page

@Invalid_Credential
Scenario: To validate the Login feature of the OrangeHRM 
Given Open Browser OrangeHRM "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When User enter the "Admin" and "admin123" 
And click the Login btn
Then Validating Login Page