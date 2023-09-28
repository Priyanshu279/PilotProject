
@PIM
Feature: PIM Module in OrangeHRM

Background:
Given Open Browser OrangeHRM "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When Use enter login details
And click the Login btn
And Click on Search
Then click on PIM

@ConfigurationList
Scenario: Login with valid credentials
And click on configuration list
And select termination reasons
Then click on add
And enter the name
Then click on save
Then validating the Records


 @EmployeList
Scenario: View Employee List
Then click on pim
And fill the details
And click on search
Then I should see employee details



@Report
Scenario: Employee check
When I click the PIM tab in the menu
Then I click reports
And click on add
Then enter report name
And select select criteria
Then choose the option
And select dispay fields group
Then choose display group option
And select display field
Then choose thr display option
And click on plus
Then save the record and validate it

      