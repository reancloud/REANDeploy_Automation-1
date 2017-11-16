@RegressionTest
Feature: Automation of Network Interface

Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	Then User create or search an environment for Network Interface and see message as environment created successfully

 @P1  @network1 @Suite3
Scenario: To check the functionality of yes destroy button for Network Interface
#Test case no:23
        
    
         
        When User drag subnet resource and enter all the attribute values
		When User drag VPC resource and enter all the attribute values
		When User click Network Interface resource and drag on the dashboard
		And User enter the resource name for Network Interface
		Then Message should display resource created successfully
		And User fill the security groups for Network Interface
		And User fill the subnet id for Network Interface
		And User fill the private ips for Network Interface
		And User fill the source dest check for Network Interface
		And User fill the depends on for Network Interface
		And User fill the connection for Network Interface
		And User fill the tags for Network Interface
		And User fill the attachment for Network Interface
		And User fill the description for Network Interface
        Then User should see message environment saved successfully
        When User click on canvas
		Then User click deploy button and should see message environment deployed successfully
	    When User click on destroy button
	    Then User should see message environment destroyed sucessfully
		Then User delete the environment for Network Interface and see message environment deleted successfully
		
@P1 @network2 @Suite3 
Scenario: To check the functionality of re deploy button for Network Interface
#Test case no:23
            
       	When User drag subnet resource and enter all the attribute values
		When User drag VPC resource and enter all the attribute values
		When User click Network Interface resource and drag on the dashboard
		And User enter the resource name for Network Interface
		Then Message should display resource created successfully
		And User fill the security groups for Network Interface
		And User fill the subnet id for Network Interface
		And User fill the private ips for Network Interface
		And User fill the source dest check for Network Interface
		And User fill the depends on for Network Interface
		And User fill the connection for Network Interface
		And User fill the tags for Network Interface
		And User fill the attachment for Network Interface
		And User fill the description for Network Interface
        Then User should see message environment saved successfully
        When User click on canvas
		Then User click deploy button and should see message environment deployed successfully
		Then User click redeploy button and should see message environment deployed successfully
	    When User click on destroy button
	    Then User should see message environment destroyed sucessfully
		Then User delete the environment for Network Interface and see message environment deleted successfully

		
		
		
			
			
			
			
			
			
   			
    		
            

