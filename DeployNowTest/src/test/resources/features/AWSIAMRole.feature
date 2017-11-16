@RegressionTest @IamroleAll @Suite2 
Feature: Automate IAM role resource using SSH connention & AWS provider

Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	
@P1 @Suite2 
Scenario: Validate yes destroy it button for iamrole  
#Test case no 19
	Then User search or create environment for iamrole and see message as environment created successfully
	When User click iamrole resource and drag on the dashboard
	And User enter iamrole resource name
	Then Message should display resource created successfully
	When User click on iamrole resource
	And User set assume_role_policy for iamrole
	And User enter dependson for iamrole
	And User select connection for iamrole
	And User enter name for iamrole
	And User enter nameprefix for iamrole
	And User enter path for iamrole
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete iamrole environment and see message environment deleted sucessfully 	
	
	
@P1 @Suite2 	
Scenario: Validate redeploy button for iamrole  
#Test case no 16
	Then User search or create environment for iamrole and see message as environment created successfully
	When User click iamrole resource and drag on the dashboard
	And User enter iamrole resource name
	Then Message should display resource created successfully
	When User click on iamrole resource
	And User set assume_role_policy for iamrole
	And User enter dependson for iamrole
	And User select connection from dropdown for iamrole
	And User enter name for iamrole
	And User enter nameprefix for iamrole
	And User enter path for iamrole
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	Then User click redeploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete iamrole environment and see message environment deleted sucessfully

@P2 
Scenario: Validate IAM role resource can be added to the aws environment
#Test case no 1
	
	Then User search or create environment for iamrole and see message as environment created successfully
	When User click iamrole resource and drag on the dashboard
	And User enter iamrole resource name
	Then Message should display resource created successfully
	When User click on iamrole resource 
	And User set assume_role_policy for iamrole
	And User enter dependson for iamrole
	And User select connection from dropdown for iamrole
	And User enter name for iamrole
	And User enter nameprefix for iamrole
	And User enter path for iamrole
	When User click on canvas
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete iamrole environment and see message environment deleted sucessfully 

@P2	
Scenario: Validate Save and deploy button for iamrole
#Test case no 2
	Then User search or create environment for iamrole and see message as environment created successfully
	When User click iamrole resource and drag on the dashboard
	And User enter iamrole resource name
	Then Message should display resource created successfully
	When User click on iamrole resource 
	And User set assume_role_policy for iamrole
	And User enter dependson for iamrole
	And User select connection from dropdown for iamrole
	And User enter name for iamrole
	And User enter nameprefix for iamrole
	And User enter path for iamrole
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete iamrole environment and see message environment deleted sucessfully
	
@P3	
Scenario: Validate IAM role when mandatory field are not provided
#Test case no 3
	Then User search or create environment for iamrole and see message as environment created successfully
	When User click iamrole resource and drag on the dashboard
	And User enter iamrole resource name
	Then Message should display resource created successfully
	When User click on iamrole resource 
	Then User should see message environment saved successfully
	When User click on canvas
	#Then User click deploy button and should see message environment deployed successfully
	Then User delete iamrole environment and see message environment deleted sucessfully
	

@P2	
Scenario: Validate create button when resource name is passed blank for iamrole
#Test case no 4
	Then User search or create environment for iamrole and see message as environment created successfully
	When User click iamrole resource and drag on the dashboard
	And User enter blank resource name for iamrole 
	Then Message should display resource created successfully
	Then User delete iamrole environment and see message environment deleted sucessfully

@P3	
Scenario: Validate create button when resource name is duplicated for iamrole
#Test case no 5
	Then User search or create environment for iamrole and see message as environment created successfully
	When User click iamrole resource and drag on the dashboard
	And User enter iamrole resource name
	Then Message should display resource created successfully
	When User click iamrole resource and drag on the dashboard
	And User enter iamrole resource name
	Then Message should display resource created successfully
	Then User delete iamrole environment and see message environment deleted sucessfully

@P2 @iimr
Scenario: Validate save button on Resource name link when name is edited in rightsidebar for iamrole
#Test case no 6
	Then User search or create environment for iamrole and see message as environment created successfully
	When User click iamrole resource and drag on the dashboard
	And User enter iamrole resource name
	Then Message should display resource created successfully
	When User click on iamrole resource 
	Then User click on resource name on rightsidebar
	When User click the name text box to edit resource name "adn_iam_role"
	When User click save button on pop up of resource name link
	Then User delete iamrole environment and see message environment deleted sucessfully

@P2	
Scenario: Validate close button on Resource name link popup in rightsidebar for iamrole
#Test case no 7
	Then User search or create environment for iamrole and see message as environment created successfully
	When User click iamrole resource and drag on the dashboard
	And User enter iamrole resource name
	Then Message should display resource created successfully
	When User click on iamrole resource 
	Then User click on resource name on rightsidebar
	Then User click close button on pop up of resource name link
	Then User delete iamrole environment and see message environment deleted sucessfully
	
@P3
Scenario: Validate save button when resource name is passed blank in rightsidebar for iamrole
#Test case no 8
	Then User search or create environment for iamrole and see message as environment created successfully
	When User click iamrole resource and drag on the dashboard
	And User enter iamrole resource name
	Then Message should display resource created successfully
	When User click on iamrole resource 
	Then User click on resource name on rightsidebar
	When User click the name text box to edit resource name ""
	When User click save button on pop up of resource name link
	Then User click cross button on pop up of resource name link
	Then User delete iamrole environment and see message environment deleted sucessfully 

@P3	
Scenario: Validate cross button on Resource name link popup in rightsidebar for iamrole
#Test case no 9 
	Then User search or create environment for iamrole and see message as environment created successfully
	When User click iamrole resource and drag on the dashboard
	And User enter iamrole resource name
	Then Message should display resource created successfully
	When User click on iamrole resource 
	Then User click on resource name on rightsidebar
	Then User click cross button on pop up of resource name link
   	Then User delete iamrole environment and see message environment deleted sucessfully

@P2  
Scenario: Validate please delete after delete button if resource iamrole need to be deleted 
#Test case no 10
	Then User search or create environment for iamrole and see message as environment created successfully
	When User click iamrole resource and drag on the dashboard
	And User enter iamrole resource name
	Then Message should display resource created successfully
	And User click on please delete it resource cross button popup for iamrole 
	Then User delete iamrole environment and see message environment deleted sucessfully

@P3
Scenario: Validate dont delete after delete button if resource iamrole need to be deleted 
#Test case no 11
	Then User search or create environment for iamrole and see message as environment created successfully
	When User click iamrole resource and drag on the dashboard
	And User enter iamrole resource name
	Then Message should display resource created successfully
	And User click on please dont delete it resource cross button popup for iamrole
	Then User delete iamrole environment and see message environment deleted sucessfully

@P3
Scenario: Validate cross button when resource is draged for iamrole 
#Test case no 12
	Then User search or create environment for iamrole and see message as environment created successfully
	When User click iamrole resource and drag on the dashboard
	Then User click on the cross close button when user drags the resource from resource section
	Then User delete iamrole environment and see message environment deleted sucessfully 	
	
@P2
Scenario: Validate close button when resource is draged for iamrole 
#Test case no 13
	Then User search or create environment for iamrole and see message as environment created successfully
	When User click iamrole resource and drag on the dashboard
	Then User click on the close button when user drags the resource from resource section
	Then User delete iamrole environment and see message environment deleted sucessfully

@P2 
Scenario: Validate resource log button and and close button on dashboard for iamrole  
#Test case no 14
	Then User search or create environment for iamrole and see message as environment created successfully
	When User click iamrole resource and drag on the dashboard
	And User enter iamrole resource name
	Then Message should display resource created successfully
	When User click on iamrole resource 
	And User set assume_role_policy for iamrole
	And User enter dependson for iamrole
	And User select connection from dropdown for iamrole
	And User enter name for iamrole
	And User enter nameprefix for iamrole
	And User enter path for iamrole
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on logs button on dash board
	And User click on close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete iamrole environment and see message environment deleted sucessfully	
	
@P3 
Scenario: Validate resource log refresh button for iamrole  
#Test case no 15
	#When User create environment for iamrole 
	Then User search or create environment for iamrole and see message as environment created successfully
	When User click iamrole resource and drag on the dashboard
	And User enter iamrole resource name
	Then Message should display resource created successfully
	When User click on iamrole resource 
	And User set assume_role_policy for iamrole
	And User enter dependson for iamrole
	And User select connection from dropdown for iamrole
	And User enter name for iamrole
	And User enter nameprefix for iamrole
	And User enter path for iamrole
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on logs button on dash board
	And User click on refresh button on logs window
	And User click on close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete iamrole environment and see message environment deleted sucessfully 	



@P3	
Scenario: Validate resource log cross button for iamrole  
#Test case no 17
	#When User create environment for iamrole 
	Then User search or create environment for iamrole and see message as environment created successfully
	When User click iamrole resource and drag on the dashboard
	And User enter iamrole resource name
	Then Message should display resource created successfully
	When User click on iamrole resource 
	And User set assume_role_policy for iamrole
	And User enter dependson for iamrole
	And User select connection from dropdown for iamrole
	And User enter name for iamrole
	And User enter nameprefix for iamrole
	And User enter path for iamrole
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on logs button on dash board
	And User click on cross close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete iamrole environment and see message environment deleted sucessfully

@P3
Scenario: Validate dont destroy button for iamrole  
#Test case no 18
	#When User create environment for iamrole 
	Then User search or create environment for iamrole and see message as environment created successfully
	When User click iamrole resource and drag on the dashboard
	And User enter iamrole resource name
	Then Message should display resource created successfully
	When User click on iamrole resource 
	And User set assume_role_policy for iamrole
	And User enter dependson for iamrole
	And User select connection from dropdown for iamrole
	And User enter name for iamrole
	And User enter nameprefix for iamrole
	And User enter path for iamrole
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	And User click on destroy button
	Then User click on dont destroy button
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete iamrole environment and see message environment deleted sucessfully

@P3 @iimr
Scenario: Validate search bar under resource for iamrole
#Test case no 24	
	Then User search or create environment for iamrole and see message as environment created successfully
	When User click iamrole resource and drag on the dashboard
	And User enter iamrole resource name
	Then Message should display resource created successfully
	When User click on iamrole resource 
	And User set assume_role_policy for iamrole
	And User enter dependson for iamrole
	And User select connection from dropdown for iamrole
	And User enter name for iamrole
	And User enter nameprefix for iamrole
	And User enter path for iamrole
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on canvas
	When User click on iamrole resource 
	And User click on resource link on the attribute section
	Then User search for attributes in the resource section "name"
	When User click on canvas
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete iamrole environment and see message environment deleted sucessfully

@P3	@iimr
Scenario: Validate search bar under resource details for iamrole
#Test case no 25	
	Then User search or create environment for iamrole and see message as environment created successfully
	When User click iamrole resource and drag on the dashboard
	And User enter iamrole resource name
	Then Message should display resource created successfully
	When User click on iamrole resource 
	And User set assume_role_policy for iamrole
	And User enter dependson for iamrole
	And User select connection from dropdown for iamrole
	And User enter name for iamrole
	And User enter nameprefix for iamrole
	And User enter path for iamrole
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on canvas
	When User click on iamrole resource 
	And User click on resource details link on the attribute section
	Then User search for attributes in the resource details "connection"
	When User click on canvas
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete iamrole environment and see message environment deleted sucessfully  

	
	
