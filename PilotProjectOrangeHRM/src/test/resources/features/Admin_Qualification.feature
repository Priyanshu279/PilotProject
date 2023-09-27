Feature: Validating the Admin Functionality in Organization

Background:
Given Open Browser OrangeHRM "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When Use enter login details
And click the Login btn
Given Select Admin


Scenario: Checking the functionality of Skills in Qualification
When Click on Qualification and select Skills
And Click on Add fill the details 
Then validate the saved successfully