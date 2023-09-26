Feature: Validating the Admin Functionality in Organization

Background:
Given Open Browser OrangeHRM "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When Use enter login details
And click the Login btn
Given Select Admin

#
#Scenario: Checking the functionality of Skills in Qualification
#When Click on Qualification and select Skills
#And Click on Add fill the details 
#Then validate the saved successfully
#
#Scenario: Checking the functionality of Help
#And Select User Management and click on user
#When Click on Help
#Then validate Help function working fine or not