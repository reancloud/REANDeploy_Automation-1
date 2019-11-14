@app_test
Feature: Automation Test for CRS Application

Background:		  
Given User is directed to CRS application login page


Scenario: To check the functionality of login to CRS application
          When User clicks on username field and enter username
          And  User clicks on the password field and enter password 
          And  User click on login button
          Then Verify the presence of main title after login 

Scenario: To check the functionality of login to CRS application with invalid credentials
          When User clicks on username field and enter invalid username
          And  User clicks on the password field and enter invalid password
          And  User click on login button
          Then Verify the presence of error message for invalid credentials
          
Scenario: To check the functionality of login to CRS application with valid username and invalid password
          When User clicks on username field and enter username
          And  User clicks on the password field and enter invalid password
          And  User click on login button
          Then Verify the presence of error message for invalid credentials          
          
Scenario: To verify search button functionality when group code is given as input
          When User clicks on username field and enter username
          And  User clicks on the password field and enter password
          And  User click on login button
          Then Verify the presence of main title after login 
          When User enters the Group code in the search box and press enter
          Then Account overview for results matching the group code should only be displayed                          
        
Scenario: To verify search button functionality when account number is given as input
          When User clicks on username field and enter username
          And  User clicks on the password field and enter password
          And  User click on login button
          Then Verify the presence of main title after login 
          When User enters the Account number in the search box and press enter
          Then Account overview for results matching the account number should only be displayed    
          
Scenario: To verify the functionality of editing the Account Holder information
           When User clicks on username field and enter username
           And  User clicks on the password field and enter password
           And  User click on login button
           Then Verify the presence of main title after login 
           When User selects AccountHolder option from Account menu
           Then Verify account holder information should be displayed
           And  User selects edit option for the first record and edits DOB field
           Then verify the DOB field is updated