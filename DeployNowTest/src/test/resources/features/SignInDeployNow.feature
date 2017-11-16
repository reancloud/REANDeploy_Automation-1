@RegressionTest @Smoke @Sanity
Feature: Sign in functionality 

@Smoke @Sanity @Suite0    
Scenario: Successful Login with Valid Credentials

     Given User direct to deploy now application
	 When User log in
	 Then Login sucessfully should display
	 Then User log out
    
@Smoke @Sanity    
Scenario Outline:Successful Login with Valid and Invalid Credentials
	Given User direct to deploy now application
	When User enters Credentials to LogIn Username as "<username>" password as "<password>"
	Then Login sucessfully should display
	
	
	Examples:
	|username 					 |password |
    |priyankargangurde2@gmail.com|priyanka123 |
    |priyankargangurde2@gmail.com|0pex	   |
    |priyankargangurde2@gmail.com|         |
    |priyankargangurde2@gmail.com|123      |
    |ganesh.e.khakare			 	 |         |
    |                            	 |  	   |
    |                            	 |priyanka123 |
    |ganesh                 	 	 |priyanka123 |