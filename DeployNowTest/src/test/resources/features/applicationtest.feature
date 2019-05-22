@app_test
Feature: Automation Test for REAN Demo Application

Background:
Given User direct to REAN Demo application		  


Scenario: To check the functionality of adding user information
          When User click on name field and enter the name
          And User click on age field and enter the age
          And User click on salary field and enter the salary
          Then User click on Add button and should see message User created successfully
          Then User click on Remove button and user should get removed successfully   
          
Scenario: To check the functionality of Edit user information
          When User click on name field and enter the name
          And User click on age field and enter the age
          And User click on salary field and enter the salary
          Then User click on Add button and should see message User created successfully
          Then User click on Edit button
          And User edit the User information
          Then User click on Update button and should see message User Updated successfully 
          Then User click on Remove button and user should get removed successfully   
 
          
 Scenario: To check the functionality of Remove user information  
          When User click on name field and enter the name
          And User click on age field and enter the age
          And User click on salary field and enter the salary
          Then User click on Add button and should see message User created successfully
          Then User click on Remove button and user should get removed successfully 

Scenario: To check the functionality of Reset Form user information
           When User click on name field and enter the name
          And User click on age field and enter the age
          And User click on salary field and enter the salary
          Then User click on Reset Form button and User information reset successfully
          
