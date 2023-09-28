Feature: Validating the Vacancies Functionality in Vacancies Options

Background:
Given Open Browser OrangeHRM "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When User enter the Admin and admin123 
And click the Login btn
Given Select Admin

@VacanciesCreation
Scenario: Add new Recruitment in Vacancies
And Select Recruitment and after clickiing on Vacancies
When Click on Add and filling the details of Vacancies
And Click on Save Vacancies
Then User validate the saved successfully Vacancies

@VacanciesCreationValidation
Scenario: Searching for Added Vacancies in Recruitment
And Select Recruitment and click on Vacancies
When User Enter the Search Details of Vacancies
And User Click the Search Btn Vacancies
Then User Check Weather New user Added or not Vacancies