#Feature: Validating the Admin Functionality
#
#Background:
#Given Open Browser OrangeHRM "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
#When Use enter login details
#And click the Login btn
#Given Select Admin
#
#Scenario: Checking the Functionality of Job Title in Job
#And Select Job and click on Job Title
#When Click on Add and fill the details Job Title
#And Click on Save Job Title
#Then User validate the saved Successfully JobTitle
#
#Scenario: Checking the functionality Pay Grades in Job
#And Select Job and click on Pay Grades
#When Click on Add and fill the details of Pay Grades
#And Click on Save Pay Grades
#Then User validate the saved successfully Pay Grades
#
#Scenario: Checking the functionality of General Informationf in Organization
#When Click on Organization and select General Informationf
#And Click on Edit and fill the details 
#Then Take screeshotUser succesfully
#
#Scenario: Checking the functionality of Location in Organization
#When Click on Organization and select Location
#And Click on Add and fill the details 
#Then User validate the saved successfully
#
#Scenario: Searching the user by selecting the Location in Organization
#When Click on Organization and select Location
#And User Click the Search Btn
#Then get the user and validate the user by it location 
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