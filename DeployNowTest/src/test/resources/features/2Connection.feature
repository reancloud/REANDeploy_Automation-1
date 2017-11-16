@RegressionTest @Suite3 @Smoke @Sanity  
Feature: Automate Connection Module

Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	
 @Suite0 @Smoke @Sanity   
Scenario: To create a new Connection 

 	When User select connections from drop down
 	And  User select add button for SSH from connection page
 	And User click on save button in connection page
 	
 	
 
@Smoke @Sanity
Scenario: To create and edit a new Connection
#Test case no 5
 	When User select connections from drop down
	And  User select add button for WinRM from connection page
 	Then User click on save button in connection page
	When User select edit button for SSH type from connection page
 	Then User select remove WinRM button from connection page
 
 @Smoke @Sanity
Scenario: To delete a new WinRM Connection
#Test case no 8

 	When User select connections from drop down
 	And User select add button for WinRM from connection page
 	Then User click on save button in connection page
	Then User select remove WinRM button from connection page
 

@Smoke @Sanity   
Scenario: Sign in and create connection for type WinRM
#Test case no 3
	 
	 When User select connections from drop down
   	 And User select add button for WinRM from connection page
     Then User click on save button in connection page
	 Then User select remove WinRM button from connection page
  

@Smoke @Sanity 
Scenario: Sign in and create connection with Blank data
#Test case no 4
	  
	  When User select connections from drop down
   	  And User create new connection with blank data
      Then User click on save button in connection page
   

@Smoke @Sanity   
Scenario: Sign in and Perform scroll bar functionality on Connection page
#Test case no 6

	 When User select connections from drop down
     #Then User check for scroll bar on connection page
       
   
          

