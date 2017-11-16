@RegressionTest @Suite4 @Sanity
Feature: Test on AWS Bastion Connection 


Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
       
            
             
@Sanity
Scenario: To create a new Bastion Connection
 
 
     When User select connections link from drop down
 	And User select bastion connection link in the connection page
 	And User enter user on bastion connection page
 	And User enter host on bastion connection page
 	And User enter port on bastion connection page
 	And User enter key on bastion connection page
 	Then user click the set parameter button on connection page
 	
 	
@Sanity
 Scenario: check the functionality of Negative test cases for Bastion connection
 
 
     When User select connections link from drop down
 	And User select bastion connection link in the connection page
 	And User fill the attributes for the bastion connection page
 	Then user click the set parameter button on connection page	
 	
 	
@Sanity
 Scenario: check the functionality of the cross button on bastion connection page
 
 
     When User select connections link from drop down
 	And User select bastion connection link in the connection page
 	And User click the cross button on bastion connection page	
 	
@Sanity
 Scenario: check the functionality of the edit the bastion connection page
 
            When User select connections link from drop down
 	And User select bastion connection link in the connection page
 	And User enter user on bastion connection page
 	And User enter host on bastion connection page
 	And User enter port on bastion connection page
 	And User enter key on bastion connection page
 	Then user click the set parameter button on connection page
 	 And User select bastion connection link in the connection page
 	And User enter user on bastion connection page
 	And User enter host on bastion connection page
 	And User enter port on bastion connection page
 	And User enter key on bastion connection page
 Then user click the set parameter button on connection page
 	
           	
 	
 	 
	