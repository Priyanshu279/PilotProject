Feature: Validating the Recruitment Functionality in Candidates Options

Background:
Given Open Browser OrangeHRM "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When Use enter login details
And click the Login btn
Given Select Recruitment

@CandidatesCreation
Scenario: Add new Recruitment in Candidates
And Select Recruitment and after clickiing on Candidates
When Click on Add and filling the details of Candidates
And Click on Save Candidates
Then User validate the saved successfully Candidates

@CandidatesCreationValidation
Scenario: Searching for Added Candidates in Recruitment
And Select Recruitment and click on Candidates
When User Enter the Search Details of Candidates
And User Click the Search Btn Candidates
Then User Check Weather New user Added or not Candidates