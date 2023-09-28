Feature: MyInfo Module

Background:
Given Open Browser OrangeHRM "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When Use enter login details
And click the Login btn

Scenario: Fill Personal Details
Given the user is on the MyInfo home page "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7"
When the user enters personal details and save them
Then the user should be able to successfully add personal details

