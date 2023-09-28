
@tag
Feature: Trackers Feature 

Background:
Given Open Browser OrangeHRM "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When Use enter login details
And click the Login btn
 
  
  @tag2
  Scenario Outline: the user add performance tracker for multiple employees
    Given the user should on performance home page
    When the user click on tracker from configure dropdown
    And the user click on add button
    And the user enter trackername <Trackername>
    And the user enter empname <EmpName>
    And the user enter reviewername <Reviewer>
    And the user click on performance tracker save button 
    Then the user should successfully get saved message
    

    Examples: 
      | Trackername  | EmpName | Reviewer  |
      | Tracker1     |     v   | h |
      |Tracker2      |     b   |v  |
     
