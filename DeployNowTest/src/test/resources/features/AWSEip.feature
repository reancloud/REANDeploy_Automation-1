@RegressionTest  @Suite2 
Feature: Automate EIP resource using SSH connention & AWS provider
Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display

@P3 
Scenario: Validate aws Eip resource can be added to the environment
#Test case no 1
	Then User search or create environment for Eip and see message as environment created successfully
	When User click eip resource and drag on the dashboard
	And User enter eip resource name
	Then Message should display resource created successfully
	When User click on eip resource
	And User enter attributes for eip
	Then User should see message environment saved successfully
	When User click on canvas	
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	And User double refresh the page
	Then User delete eip environment and see message environment deleted sucessfully

@P3	
Scenario: Validate resource if fields are not provided for eip
#Test case no 2
	Then User search or create environment for Eip and see message as environment created successfully
	When User click eip resource and drag on the dashboard
	And User enter eip resource name
	Then Message should display resource created successfully
	When User click on eip resource
	Then User enter attributes for eip
	Then User should see message environment saved successfully
	And User double refresh the page
	Then User delete eip environment and see message environment deleted sucessfully
@P3   
Scenario: Validate dragged resource close button for eip
#Test case no 3
	Then User search or create environment for Eip and see message as environment created successfully
	When User click eip resource and drag on the dashboard
	Then User click on the cross close button when user drags the resource from resource section
	And User double refresh the page
	Then User delete eip environment and see message environment deleted sucessfully
@P2   
Scenario: Validate dragged resource cross button  for eip 
#Test case no 4
	Then User search or create environment for Eip and see message as environment created successfully
	When User click eip resource and drag on the dashboard
	Then User click on the cross close button when user drags the resource from resource section
	And User double refresh the page
	Then User delete eip environment and see message environment deleted sucessfully
@P3   
Scenario: Validate create button when resource name is left blank for eip
#Test case no 5
	Then User search or create environment for Eip and see message as environment created successfully
	When User click eip resource and drag on the dashboard
	And User enter blank resource name for eip
	Then Message should display resource created successfully
	And User double refresh the page
	Then User delete eip environment and see message environment deleted sucessfully
@P3	
Scenario: Validate create button when resource name is duplicated
#Test case no 6
	Then User search or create environment for Eip and see message as environment created successfully
	When User click eip resource and drag on the dashboard
	And User enter eip resource name
	Then Message should display resource created successfully
	When User click eip resource and drag on the dashboard
	And User enter eip resource name
	Then Message should display resource created successfully
	And User double refresh the page
	Then User delete eip environment and see message environment deleted sucessfully
@P2
Scenario: Validate please delete after delete button if resource eip need to be deleted
#Test case no 7
	 Then User search or create environment for Eip and see message as environment created successfully
	 When User click eip resource and drag on the dashboard
	 And User enter eip resource name
	 Then Message should display resource created successfully
	 And User click on please delete if resource need to be deleted for eip
	 And User double refresh the page
	 Then User delete eip environment and see message environment deleted sucessfully
@P3
Scenario: Validate dont delete after delete button if resource eip need to be deleted
#Test case no 8
	Then User search or create environment for Eip and see message as environment created successfully
	When User click eip resource and drag on the dashboard
	And User enter eip resource name
	Then Message should display resource created successfully
	And User click on dont delete if resource need to be deleted for eip
	And User double refresh the page
	Then User delete eip environment and see message environment deleted sucessfully
@P2
Scenario: Validate save button when resource name is edited on resource name popup
#Test case no 9
	Then User search or create environment for Eip and see message as environment created successfully
	When User click eip resource and drag on the dashboard
	And User enter eip resource name
	Then Message should display resource created successfully
	When User click on eip resource
	Then User click on resource name on rightsidebar
	When User click the name text box to edit resource name "Eip"
	When User click save button on pop up of resource name link
	And User double refresh the page
	Then User delete eip environment and see message environment deleted sucessfully
@P3 
Scenario: Validate save button when resource name is passed blank on resource name popup
#Test case no 10
	Then User search or create environment for Eip and see message as environment created successfully
	When User click eip resource and drag on the dashboard
	And User enter eip resource name
	Then Message should display resource created successfully
	When User click on eip resource
	Then User click on resource name on rightsidebar
	When User click the name text box to edit resource name ""
	Then User click save button on pop up of resource name link
	Then User click close button on pop up of resource name link
	And User double refresh the page
	Then User delete eip environment and see message environment deleted sucessfully
@P3  	
Scenario: Validate close button on resource name popup is clickable 
#Test case no 11
	Then User search or create environment for Eip and see message as environment created successfully
	When User click eip resource and drag on the dashboard
	And User enter eip resource name
	Then Message should display resource created successfully
	When User click on eip resource
	Then User click on resource name on rightsidebar
	Then User click close button on pop up of resource name link
	And User double refresh the page
	Then User delete eip environment and see message environment deleted sucessfully
@P3	  
Scenario: Validate cross button on resource name popup is clickable 
#Test case no 12
	Then User search or create environment for Eip and see message as environment created successfully
	When User click eip resource and drag on the dashboard
	And User enter eip resource name
	Then Message should display resource created successfully
	When User click on eip resource
	Then User click on resource name on rightsidebar
	Then User click cross button on pop up of resource name link
	And User double refresh the page
	Then User delete eip environment and see message environment deleted sucessfully
	
@P1	@Suite2    
Scenario: Validate redeploy button on dashboard for EIP
#Test case no 13
	Then User search or create environment for Eip and see message as environment created successfully
	When User click eip resource and drag on the dashboard
	And User enter eip resource name
	Then Message should display resource created successfully
	When User click on eip resource
	Then User enter attributes for eip
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	Then User click redeploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	And User double refresh the page
	Then User delete eip environment and see message environment deleted sucessfully
	
@P1	@Suite2  
Scenario: Validate Yes destroy it after destroy for EIP
#Test case no 14
	Then User search or create environment for Eip and see message as environment created successfully
	When User click eip resource and drag on the dashboard
	And User enter eip resource name
	Then Message should display resource created successfully
	When User click on eip resource
	Then User enter attributes for eip
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	And User double refresh the page
	Then User delete eip environment and see message environment deleted sucessfully
@P3
Scenario: Validate dont destroy it button on destroy popup
#Test case no 15
	Then User search or create environment for Eip and see message as environment created successfully
	When User click eip resource and drag on the dashboard
	And User enter eip resource name
	Then Message should display resource created successfully
	When User click on eip resource
	Then User enter attributes for eip
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on destroy button
	Then User click on dont destroy button
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	And User double refresh the page
	Then User delete eip environment and see message environment deleted sucessfully 
@P3
Scenario: Validate save button on SSH AWS dashboard
#Test case no 16 
	Then User search or create environment for Eip and see message as environment created successfully
	When User click eip resource and drag on the dashboard
	And User enter eip resource name
	Then Message should display resource created successfully
	When User click on eip resource
	Then User enter attributes for eip
	Then User should see message environment saved successfully
	And User double refresh the page
	Then User delete eip environment and see message environment deleted sucessfully
@P2   
Scenario: Validate deploy button on SSH AWS dashboard
#Test case no 17
	Then User search or create environment for Eip and see message as environment created successfully
	When User click eip resource and drag on the dashboard
	And User enter eip resource name
	Then Message should display resource created successfully
	When User click on eip resource
	Then User enter attributes for eip
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	And User double refresh the page
	Then User delete eip environment and see message environment deleted sucessfully
@P2   
Scenario: Validate close button on Resource log popup
#Test case no 18
	Then User search or create environment for Eip and see message as environment created successfully
	When User click eip resource and drag on the dashboard
	And User enter eip resource name
	Then Message should display resource created successfully
	When User click on eip resource
	Then User enter attributes for eip
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on logs button on dash board
	Then User click on close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	And User double refresh the page
	Then User delete eip environment and see message environment deleted sucessfully 
@P3   
Scenario: Validate refresh button on Resource log popup
#Test case no 19
	Then User search or create environment for Eip and see message as environment created successfully
	When User click eip resource and drag on the dashboard
	And User enter eip resource name
	Then Message should display resource created successfully
	When User click on eip resource
	Then User enter attributes for eip
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on logs button on dash board
	Then User click on refresh button on logs window
	Then User click on close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	And User double refresh the page
	Then User delete eip environment and see message environment deleted sucessfully 
@P3 
Scenario: Validate search bar under resource for EIP
#Test case no 20
	Then User search or create environment for Eip and see message as environment created successfully
	When User click eip resource and drag on the dashboard
	And User enter eip resource name
	Then Message should display resource created successfully
	When User click on eip resource
	Then User enter attributes for eip
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on canvas
	When User click on eip resource
	And User click on resource link on the attribute section
	Then User search for attributes in the resource section "Connection"
	When User click on canvas
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	And User double refresh the page
	Then User delete eip environment and see message environment deleted sucessfully
@P3 
Scenario: Validate search bar of resource details for EIP
#Test case no 21
	Then User search or create environment for Eip and see message as environment created successfully
	When User click eip resource and drag on the dashboard
	And User enter eip resource name
	Then Message should display resource created successfully
	When User click on eip resource
	Then User enter attributes for eip
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on canvas
	When User click on eip resource
	And User click on resource details link on the attribute section
	Then User search for attributes in the resource details "Connection"
	When User click on canvas
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	And User double refresh the page
	Then User delete eip environment and see message environment deleted sucessfully
