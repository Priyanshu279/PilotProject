Feature: Validating the Admin UserMagement Functionality

Background:
Given Open Browser OrangeHRM "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

@UserCreation @Valid_Credential
Scenario: Add new User in User Management
When User enter the "Admin" and "admin123" 
And click the Login btn
Given Select Admin
And Select User Management and click on user
When Click on Add and filling the details of user
And Click on Save User
Then User validate the saved successfully

@UserCreationValidation
Scenario: Searching for Added User in User Management
When Use enter login details
And click the Login btn
Given Select Admin
And Select User Management and click on user
When User Enter the Search Details 
And User Click the Search Btn
Then User Check Weather New user Added or not
