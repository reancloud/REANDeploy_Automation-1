@RegressionTest @keypairAll
Feature: Automation of key pair resource

Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	Then User create or search an environment for Key Pair and see message as environment created successfully


@P1 @keypair1
Scenario: To check the functionality of destroy it button for key pair
#Test case no 

	When User click Key Pair resource and drag on the dashboard
	And User enter the resource name for Key Pair
	Then Message should display resource created successfully
	When User click on key pair resource
	And User fill the key name for Key Pair
	And User fill the public key for Key Pair
	And User fill the connection for Key Pair
	Then User should see message environment saved successfully
    When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for Key Pair and see message environment deleted successfully
	

@P1 @keypair2
Scenario: To check the functionality of re deploy for key pair
#Test case no 

	When User click Key Pair resource and drag on the dashboard
	And User enter the resource name for Key Pair
	Then Message should display resource created successfully
	When User click on key pair resource
	And User fill the key name for Key Pair
	And User fill the public key for Key Pair
	And User fill the connection for Key Pair
	Then User should see message environment saved successfully
    When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	Then User click redeploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for Key Pair and see message environment deleted successfully
	
	
@P3
Scenario:Negative test case to check the functionality of save Button and deploy without 
providing the mandatory fields for key pair
#Test case no 

	When User click Key Pair resource and drag on the dashboard
	And User enter the resource name for Key Pair
	Then Message should display resource created successfully
	When User click on key pair resource
	And User fill the connection for Key Pair
	Then User should see message environment saved successfully
    When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for Key Pair and see message environment deleted successfully
	
@P3
Scenario:To check the functionality of create button if resource name is blank for Key Pair
#Test case no 

	When User click Key Pair resource and drag on the dashboard
	Then User enter the resource name as blank for Key Pair
	Then Message should display resource created successfully
	Then User delete the environment for Key Pair and see message environment deleted successfully
	
@P3 
Scenario: To check the functionality of create button if resource name is duplicate for Key Pair
#Test case no 
	
	When User click Key Pair resource and drag on the dashboard
	And User enter the resource name for Key Pair
	Then Message should display resource created successfully
	When User click Key Pair resource and drag on the dashboard
	And User enter the resource name for Key Pair
	Then Message should display resource created successfully
	Then User delete the environment for Key Pair and see message environment deleted successfully
	
@P2	
Scenario: To check the functionality of Resource Logs button after the successful 
deployment of the resource for Key Pair
#Test case no

	When User click Key Pair resource and drag on the dashboard
	And User enter the resource name for Key Pair
	Then Message should display resource created successfully
	When User click on key pair resource
	And User fill the key name for Key Pair
	And User fill the public key for Key Pair
	And User fill the connection for Key Pair
	Then User should see message environment saved successfully
    When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on logs button on dash board
	And User click on close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for Key Pair and see message environment deleted successfully
		
	
	
@P3	
Scenario: To check the functionality of don't destroy button for Key Pair
#Test case no 
		
	When User click Key Pair resource and drag on the dashboard
	And User enter the resource name for Key Pair
	Then Message should display resource created successfully
	When User click on key pair resource
	And User fill the key name for Key Pair
	And User fill the public key for Key Pair
	And User fill the connection for Key Pair
	Then User should see message environment saved successfully
    When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User click on dont destroy button
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for Key Pair and see message environment deleted successfully
	
	
@P3
Scenario: To check the functionality of close button on logs window for Key Pair
#Test case no 
	
	When User click Key Pair resource and drag on the dashboard
	And User enter the resource name for Key Pair
	Then Message should display resource created successfully
	When User click on key pair resource
	And User fill the key name for Key Pair
	And User fill the public key for Key Pair
	And User fill the connection for Key Pair
	Then User should see message environment saved successfully
    When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on logs button on dash board
	And User click on close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for Key Pair and see message environment deleted successfully
	
@P3 
Scenario: To check the functionality of cross close button on logs window for Key Pair
#Test case no 
	
	When User click Key Pair resource and drag on the dashboard
	And User enter the resource name for Key Pair
	Then Message should display resource created successfully
	When User click on key pair resource
	And User fill the key name for Key Pair
	And User fill the public key for Key Pair
	And User fill the connection for Key Pair
	Then User should see message environment saved successfully
    When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on logs button on dash board
	Then User click on cross close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for Key Pair and see message environment deleted successfully
	
@P3 
Scenario: To check the functionality of refresh button on logs window for Key Pair
#Test case no
	
	When User click Key Pair resource and drag on the dashboard
	And User enter the resource name for Key Pair
	Then Message should display resource created successfully
	When User click on key pair resource
	And User fill the key name for Key Pair
	And User fill the public key for Key Pair
	And User fill the connection for Key Pair
	Then User should see message environment saved successfully
    When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on logs button on dash board
	Then User click on refresh button on logs window
	Then User click on cross close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for Key Pair and see message environment deleted successfully
	
@P3	
Scenario:To check the functionality of Search bar on side bar under resource details 
if user wants to search for attributes after deployment of the resource for Key Pair
#Test case no

	When User click Key Pair resource and drag on the dashboard
	And User enter the resource name for Key Pair
	Then Message should display resource created successfully
	When User click on key pair resource
	And User fill the key name for Key Pair
	And User fill the public key for Key Pair
	And User fill the connection for Key Pair
	Then User should see message environment saved successfully
    When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	Then User click on key pair resource
	When User click on resource details link on the attribute section
	Then User search for attributes in the resource details "id"
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for Key Pair and see message environment deleted successfully
	
@P3	
Scenario: To check the functionality of Search bar on side bar under resource 
if user wants to search for attributes after deployment of the resource for Instance
#Test case no 
		
	When User click Key Pair resource and drag on the dashboard
	And User enter the resource name for Key Pair
	Then Message should display resource created successfully
	When User click on key pair resource
	And User fill the key name for Key Pair
	And User fill the public key for Key Pair
	And User fill the connection for Key Pair
	Then User should see message environment saved successfully
    When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	Then User click on key pair resource
	When User click on resource link on the attribute section
	Then User search for attributes in the resource section "Connection"
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for Key Pair and see message environment deleted successfully
	
@P2 
Scenario: To check the functionality of save button if user edits Key Pair resource name
#Test case no
		
			When User click Key Pair resource and drag on the dashboard
			And User enter the resource name for Key Pair
			Then Message should display resource created successfully
			When User click on key pair resource
			Then Then User click on resource name on rightsidebar
			When User click the name text box to edit resource name "ADN_Key"
			When User click save button on pop up of resource name link
			Then User delete the environment for Key Pair and see message environment deleted successfully
			
@P3		
Scenario: To check the functionality of close button for Key Pair resource name link
#Test case no 

			When User click Key Pair resource and drag on the dashboard
			And User enter the resource name for Key Pair
			Then Message should display resource created successfully
			When User click on key pair resource
			Then Then User click on resource name on rightsidebar
			Then User click close button on pop up of resource name link
			Then User delete the environment for Key Pair and see message environment deleted successfully
			

@P3		
Scenario: To check the functionality of cross close button for Key Pair resource name link
#Test case no 

			When User click Key Pair resource and drag on the dashboard
			And User enter the resource name for Key Pair
			Then Message should display resource created successfully
			When User click on key pair resource
			Then Then User click on resource name on rightsidebar
			Then User click cross button on pop up of resource name link
			Then User delete the environment for Key Pair and see message environment deleted successfully
			
@P2 @12			
Scenario: To check the functionality of delete button if user wants to delete for Key Pair resource
#Test Case no

   			When User click Key Pair resource and drag on the dashboard
			And User enter the resource name for Key Pair
			Then Message should display resource created successfully
			Then User click on cross and click on please delete it button for KeyPair
			Then User delete the environment for Key Pair and see message environment deleted successfully
	
@P3 		
Scenario: To check the functionality of dont delete button if user wants to delete for Key Pair resource
#Test Case no

   			When User click Key Pair resource and drag on the dashboard
			And User enter the resource name for Key Pair
			Then Message should display resource created successfully
			Then User click on cross and click on dont delete it button for Key Pair
			Then User delete the environment for Key Pair and see message environment deleted successfully
	
