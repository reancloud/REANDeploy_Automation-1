@RegressionTest @Sanity @Suite3 
Feature: Automation on Environment List
Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	
@Sanity    
Scenario: To check the functionality of no button on share pop up in Environment list Page
    Then User create the required environment for Environment_List
	When User click on the dropdown for Environment list
	When User click on the share environment button
	Then User click on the share environment no button
	When User click on the deploy now logo
	Then User delete the environment for Environment_List

@Sanity	  
Scenario: To check the functionality of search bar in Environment list  page 
    Then User create the required environment for Environment_List
	When User click on the dropdown for Environment list
	Then User enter environment in search bar
	When User click on the deploy now logo
	Then User delete the environment for Environment_List
	
@Sanity	
Scenario: To check whether the environment is there in the list
   Then User create the required environment for Environment_List
	When User click on the dropdown for Environment list
	When User click on the deploy now logo
	Then User delete the environment for Environment_List

@Sanity	
Scenario: To check the functionality of Environment List at welcome dropdown
   Then User create the required environment for Environment_List
	When User click on the dropdown for Environment list
	When User click on the deploy now logo
	Then User delete the environment for Environment_List
	
@Sanity  
Scenario: To check the functionality of yes button on share pop up in Environment list Page
    Then User create the required environment for Environment_List
	When User click on the dropdown for Environment list
	When User click on the share environment button
	Then User click on the share environment yes button
	When User click on the deploy now logo
	Then User delete the environment for Environment_List

