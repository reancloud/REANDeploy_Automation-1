@RegressionTest @EcsClusterAll @Suite4
Feature: Automation testing on Ecs Cluster Resource

Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	Then User create or search an environment for EcsCluster and see message as environment created successfully

@P1  @ecsCluster1
Scenario: To check the functionality of yes destroy button for EcsCluster
#Test case no:


	When User click EcsCluster resource and drag on the dashboard
	And User enter the resource name for EcsCluster
	Then Message should display resource created successfully
	When User click on EcsCluster resource
	And User fill the connection for EcsCluster
	And User fill the dependsOn for EcsCluster
	And User fill the name for EcsCluster
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for EcsCluster and see message environment deleted successfully

@P1  @ecsCluster2
Scenario: To check the functionality of re deploy button for EcsCluster
#Test case no:

	When User click EcsCluster resource and drag on the dashboard
	And User enter the resource name for EcsCluster
	Then Message should display resource created successfully
	When User click on EcsCluster resource
	And User fill the connection for EcsCluster
	And User fill the dependsOn for EcsCluster
	And User fill the name for EcsCluster
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	Then User click redeploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for EcsCluster and see message environment deleted successfully

@P2		
Scenario: To check the functionality of don't destroy button for EcsCluster
#Test case no:

	When User click EcsCluster resource and drag on the dashboard
	And User enter the resource name for EcsCluster
	Then Message should display resource created successfully
	When User click on EcsCluster resource
	And User fill the connection for EcsCluster
	And User fill the dependsOn for EcsCluster
	And User fill the name for EcsCluster
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on destroy button
	Then User click on dont destroy button
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for EcsCluster and see message environment deleted successfully

@P2		
Scenario: To check the functionality of logs button for EcsCluster
#Test case no:

	When User click EcsCluster resource and drag on the dashboard
	And User enter the resource name for EcsCluster
	Then Message should display resource created successfully
	When User click on EcsCluster resource
	And User fill the connection for EcsCluster
	And User fill the dependsOn for EcsCluster
	And User fill the name for EcsCluster
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on logs button on dash board
	Then User click on close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for EcsCluster and see message environment deleted successfully

@P2	
Scenario: To check the functionality of logs close button for EcsCluster
#Test case no:

	When User click EcsCluster resource and drag on the dashboard
	And User enter the resource name for EcsCluster
	Then Message should display resource created successfully
	When User click on EcsCluster resource
	And User fill the connection for EcsCluster
	And User fill the dependsOn for EcsCluster
	And User fill the name for EcsCluster
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on logs button on dash board
	Then User click on close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for EcsCluster and see message environment deleted successfully

@P2		
Scenario: To check the functionality of logs cross close button for EcsCluster
#Test case no:

	When User click EcsCluster resource and drag on the dashboard
	And User enter the resource name for EcsCluster
	Then Message should display resource created successfully
	When User click on EcsCluster resource
	And User fill the connection for EcsCluster
	And User fill the dependsOn for EcsCluster
	And User fill the name for EcsCluster
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on logs button on dash board
	Then User click on cross close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for EcsCluster and see message environment deleted successfully

@P2	
Scenario: To check the functionality of logs refresh button for EcsCluster
#Test case no:

	When User click EcsCluster resource and drag on the dashboard
	And User enter the resource name for EcsCluster
	Then Message should display resource created successfully
	When User click on EcsCluster resource
	And User fill the connection for EcsCluster
	And User fill the dependsOn for EcsCluster
	And User fill the name for EcsCluster
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on logs button on dash board
	Then User click on refresh button on logs window
	Then User click on cross close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for EcsCluster and see message environment deleted successfully

@P3
Scenario: To check the functionality of cross close button on drag pop up for EcsCluster
#Test case no:

	When User click EcsCluster resource and drag on the dashboard
	And User enter the resource name for EcsCluster
	Then User click on the cross close button when user drags the resource from resource section
	Then User delete the environment for EcsCluster and see message environment deleted successfully

@P3		
Scenario: To check the functionality of close button on drag pop up for EcsCluster
#Test case no:

	When User click EcsCluster resource and drag on the dashboard
	And User enter the resource name for EcsCluster
	Then User click on the close button when user drags the resource from resource section
	Then User delete the environment for EcsCluster and see message environment deleted successfully

@P2
Scenario: To check the functionality of create button on drag pop up for EcsCluster
#Test case no:

	When User click EcsCluster resource and drag on the dashboard
	And User enter the resource name for EcsCluster
	Then Message should display resource created successfully
	Then User delete the environment for EcsCluster and see message environment deleted successfully

@P3	
Scenario: To check the functionality of duplicate resource for EcsCluster
#Test case no:

	When User click EcsCluster resource and drag on the dashboard
	And User enter the resource name for EcsCluster
	Then Message should display resource created successfully
	When User click EcsCluster resource and drag on the dashboard
	And User enter the resource name for EcsCluster
	Then Message should display resource created successfully
	Then User delete the environment for EcsCluster and see message environment deleted successfully
	
@P2
Scenario: To check the functionality of resource link for EcsCluster
#Test case no:

	When User click EcsCluster resource and drag on the dashboard
	And User enter the resource name for EcsCluster
	Then Message should display resource created successfully
	When User click on EcsCluster resource
	Then User click on resource name on rightsidebar
	Then User click close button on pop up of resource name link
	Then User delete the environment for EcsCluster and see message environment deleted successfully

@P3	
Scenario: To check the functionality of resource link close button for EcsCluster
#Test case no:

	When User click EcsCluster resource and drag on the dashboard
	And User enter the resource name for EcsCluster
	Then Message should display resource created successfully
	When User click on EcsCluster resource
	Then User click on resource name on rightsidebar
	Then User click close button on pop up of resource name link
	Then User delete the environment for EcsCluster and see message environment deleted successfully

@P3	
Scenario: To check the functionality of resource link cross close button for EcsCluster
#Test case no:

	When User click EcsCluster resource and drag on the dashboard
	And User enter the resource name for EcsCluster
	Then Message should display resource created successfully
	When User click on EcsCluster resource
	Then User click on resource name on rightsidebar
	Then User click close button on pop up of resource name link
	Then User delete the environment for EcsCluster and see message environment deleted successfully
	
@P2
Scenario: To check the functionality of search bar under resource section after deployment for EcsCluster
#Test case no:

	When User click EcsCluster resource and drag on the dashboard
	And User enter the resource name for EcsCluster
	Then Message should display resource created successfully
	When User click on EcsCluster resource
	And User fill the connection for EcsCluster
	And User fill the dependsOn for EcsCluster
	And User fill the name for EcsCluster
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on EcsCluster resource
	When User click on resource link on the attribute section
	Then User search for attributes in the resource section "Connection"
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for EcsCluster and see message environment deleted successfully
	
@P2  
Scenario: To check the functionality of search bar under resource details after deployment for EcsCluster
#Test case no:

	When User click EcsCluster resource and drag on the dashboard
	And User enter the resource name for EcsCluster
	Then Message should display resource created successfully
	When User click on EcsCluster resource
	And User fill the connection for EcsCluster
	And User fill the dependsOn for EcsCluster
	And User fill the name for EcsCluster
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on EcsCluster resource
	When User click on resource details link on the attribute section
	Then User search for attributes in the resource details "id"
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for EcsCluster and see message environment deleted successfully

@P3
Scenario: To check the functionality of resource name as blank for EcsCluster
#Test case no:

	When User click EcsCluster resource and drag on the dashboard
	And User enter the resource name as blank for EcsCluster
	Then Message should display resource created successfully
	Then User delete the environment for EcsCluster and see message environment deleted successfully
	
@P3
Scenario: Negative test case - filling mandatory attributes as blank for EcsCluster
#Test case no:

	When User click EcsCluster resource and drag on the dashboard
	And User enter the resource name for EcsCluster
	Then Message should display resource created successfully
	When User click on EcsCluster resource
	And User fill the connection for EcsCluster
	And User fill the dependsOn for EcsCluster
	And User fill the name as blank for EcsCluster
	Then User should see message environment saved successfully
	Then User delete the environment for EcsCluster and see message environment deleted successfully
	
@P2	
Scenario: To check the functionality of edit resource name on right side bar for EcsCluster
#Test case no:

	When User click EcsCluster resource and drag on the dashboard
	And User enter the resource name for EcsCluster
	Then Message should display resource created successfully
	When User click on EcsCluster resource
	Then User click on resource name on rightsidebar
	Then User enter the edit resource name for EcsCluster
	When User click save button on pop up of resource name link
	Then User delete the environment for EcsCluster and see message environment deleted successfully


