Feature: Configure-Leave Period

Background:
Given Open Browser OrangeHRM "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When Use enter login details
And click the Login btn

Scenario: the user sets leave period
Given the user should on leave home page
And the user click on leave period from configure tab
And the user select month
And the user click on save. button
Then the user should be sucessfully set leave period