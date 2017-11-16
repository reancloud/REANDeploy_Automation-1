@RegressionTest @Suite4 @Smoke @Sanity  
Feature: Test Automation for Instance Resource

Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	Then User create or search an environment for Instance and see message as environment created successfully
	
@Smoke @Sanity
Scenario: To check the functionality of yes destroy button for Instance
#Test case no 1 
    When User click Instance resource and drag on the dashboard
	And User enter the resource name for Instance
	Then Message should display resource created successfully
	When User click on Instance resource
	And User fill the ami attribute for Instance
	And User fill the instance type attribute for Instance
	And User fill connection from dropdown for Instance
	And User fill the source dest check attribute for Instance
	Then User should see message environment saved successfully
    When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for Instance and see message environment deleted successfully

@Smoke @Sanity
Scenario: To check the functionality of re deploy button for Instance
#Test case no 2 
    When User click Instance resource and drag on the dashboard
	And User enter the resource name for Instance
	Then Message should display resource created successfully
	When User click on Instance resource
	And User fill the ami attribute for Instance
	And User fill the instance type attribute for Instance
	And User fill connection from dropdown for Instance
	And User fill the source dest check attribute for Instance
	Then User should see message environment saved successfully
    When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	Then User click redeploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for Instance and see message environment deleted successfully

@Smoke @Sanity
Scenario: To check the functionality of all the attribute for instance resources
#Test case no 3 
    When User click Instance resource and drag on the dashboard
	And  User enter the resource name for Instance
	Then Message should display resource created successfully
	When User click on Instance resource
	And User fill the user data attribute for Instance
	And User fill the tenancy attribute for Instance
	And User fill the placement group attribute for Instance
	And User fill the private ip attribute for Instance
	And User fill the root block device attribute for Instance
	And User fill the tags attribute for Instance
	And User fill the associate public ip address for Instance
	And User fill the ebs block device attribute for Instance
	And User fill the disable api termination attribute for Instance
	And User fill the ebs optimized attribute for Instance
	And User fill the ephemeral block device attribute for Instance
	And User fill the monitoring attribute for Instance
	And User fill the placement group attribute for Instance
	And User fill the private ip attribute for Instance
	And User fill the root block device attribute for Instance
	And User fill the tags attribute for Instance
	And User fill the tenancy attribute for Instance
	And User fill the user data attribute for Instance
	And User fill the ami attribute for Instance
	And User fill the instance type attribute for Instance
	And User fill the availability zone attribute for Instance
	And User fill connection from dropdown for Instance
	And User fill the source dest check attribute for Instance
	Then User should see message environment saved successfully
    When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for Instance and see message environment deleted successfully

@Smoke @Sanity
Scenario: To check the functionality of resource without providing mandatory fields for Instance
#Test case no 4 
    When User click Instance resource and drag on the dashboard
	And User enter the resource name for Instance
	Then Message should display resource created successfully
	When User click on Instance resource
	And User fill the false ami attribute for Instance
	And User fill the instance type attribute for Instance
	And User fill connection from dropdown for Instance
	And User fill the source dest check attribute for Instance
	Then User should see message environment saved successfully
    When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for Instance and see message environment deleted successfully
		
@Smoke @Sanity
Scenario: To check the functionality of create button on resource pop up for Instance
#Test case no 5
		
		When User click Instance resource and drag on the dashboard
		And User enter the resource name for Instance
		Then Message should display resource created successfully
		Then User delete the environment for Instance and see message environment deleted successfully

@Smoke @Sanity	
Scenario: To check the functionality of cross close button on resource pop up for Instance
#Test case no 6 
		
		When User click Instance resource and drag on the dashboard
		And User enter the resource name for Instance
		Then User click on the cross close button when user drags the resource from resource section
		Then User delete the environment for Instance and see message environment deleted successfully		
		
@Smoke @Sanity	
Scenario: To check the functionality of close button on resource pop up for Instance
#Test case no 7 
		
		When User click Instance resource and drag on the dashboard
		And User enter the resource name for Instance
		Then User click on the close button when user drags the resource from resource section
		Then User delete the environment for Instance and see message environment deleted successfully
	

@Smoke @Sanity
Scenario: To check the functionality of blank resource name for Instance
#Test case no 8 
	
	When User click Instance resource and drag on the dashboard
	And User enter the Instance resource name as blank
	Then Message should display resource created successfully
	Then User delete the environment for Instance and see message environment deleted successfully


@Smoke @Sanity
Scenario: To check the functionality of don't delete the resource button for Instance
#Test case no 9 
	
	When User click Instance resource and drag on the dashboard
	And User enter the resource name for Instance
	Then Message should display resource created successfully
    When User dont delete the resource by clicking the cross button on resource for Instance
	Then User delete the environment for Instance and see message environment deleted successfully

	
@Smoke @Sanity	
Scenario: To check the functionality of delete the resource button for Instance
#Test case no 10 
	
	When User click Instance resource and drag on the dashboard
	And User enter the resource name for Instance
	Then Message should display resource created successfully
	When User delete the resource by clicking the cross button on resource for Instance	
	Then User delete the environment for Instance and see message environment deleted successfully
	
@Smoke @Sanity
Scenario: To check the functionality of save button if user edits Instance resource name
#Test case no 11
		
		When User click Instance resource and drag on the dashboard
		And User enter the resource name for Instance
		Then Message should display resource created successfully
		When User click on Instance resource
		Then User click on resource name on rightsidebar
		When User click the name text box to edit resource name "adn"
		When User click save button on pop up of resource name link
		Then User delete the environment for Instance and see message environment deleted successfully

		
@Smoke @Sanity		
Scenario: To check the functionality of close button for Instance resource name link
#Test case no 12
		
		When User click Instance resource and drag on the dashboard
		And User enter the resource name for Instance
		Then Message should display resource created successfully
		When User click on Instance resource
		Then User click on resource name on rightsidebar
		Then User click close button on pop up of resource name link
		Then User delete the environment for Instance and see message environment deleted successfully
		
		
@Smoke @Sanity
Scenario: To check the functionality of cross close button for Instance resource name link
#Test case no 13
		
		When User click Instance resource and drag on the dashboard
		And User enter the resource name for Instance
		Then Message should display resource created successfully
		When User click on Instance resource
		Then User click on resource name on rightsidebar
		Then User click cross button on pop up of resource name link
		Then User delete the environment for Instance and see message environment deleted successfully
		
		
		
@Smoke @Sanity			
Scenario: To check the functionality of save button on dash board for Instance
#Test case no 14
	When User click Instance resource and drag on the dashboard
	And User enter the resource name for Instance
	Then Message should display resource created successfully
	When User click on Instance resource
	And User fill the ami attribute for Instance
	And User fill the instance type attribute for Instance
	And User fill connection from dropdown for Instance
	And User fill the source dest check attribute for Instance
	#And User fill the key name attribute for Instance
	Then User should see message environment saved successfully
	Then User delete the environment for Instance and see message environment deleted successfully
	
	
@Smoke @Sanity
Scenario: To check the functionality of don't destroy button for Instance
#Test case no 15
	When User click Instance resource and drag on the dashboard
	And User enter the resource name for Instance
	Then Message should display resource created successfully
	When User click on Instance resource
	And User fill the ami attribute for Instance
	And User fill the instance type attribute for Instance
	And User fill connection from dropdown for Instance
	And User fill the source dest check attribute for Instance
	Then User should see message environment saved successfully
    When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	And User click on destroy button
	Then User click on dont destroy button
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for Instance and see message environment deleted successfully

	

@Smoke @Sanity
Scenario: To check the functionality of logs button for Instance
#Test case no 16
	When User click Instance resource and drag on the dashboard
	And User enter the resource name for Instance
	Then Message should display resource created successfully
	When User click on Instance resource
	And User fill the ami attribute for Instance
	And User fill the instance type attribute for Instance
	And User fill connection from dropdown for Instance
	And User fill the source dest check attribute for Instance
	Then User should see message environment saved successfully
    When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on logs button on dash board
	Then User click on close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for Instance and see message environment deleted successfully
	

@Smoke @Sanity
Scenario: To check the functionality of Search bar on side bar under resource details 
if user wants to search for attributes after deployment of the resource for Instance
#Test case no 17
	When User click Instance resource and drag on the dashboard
	And User enter the resource name for Instance
	Then Message should display resource created successfully
	When User click on Instance resource
	And User fill the ami attribute for Instance
	And User fill the instance type attribute for Instance
	And User fill connection from dropdown for Instance
	And User fill the source dest check attribute for Instance
	Then User should see message environment saved successfully
    When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on canvas
	When User click on Instance resource
	When User click on resource details link on the attribute section
	Then User search for attributes in the resource details "id"
	When User click on canvas
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for Instance and see message environment deleted successfully
	
@Smoke @Sanity
Scenario: To check the functionality of Search bar on side bar under resource 
if user wants to search for attributes after deployment of the resource for Instance
#Test case no 18
	When User click Instance resource and drag on the dashboard
	And User enter the resource name for Instance
	Then Message should display resource created successfully
	When User click on Instance resource
	And User fill the ami attribute for Instance
	And User fill the instance type attribute for Instance
	And User fill connection from dropdown for Instance
	And User fill the source dest check attribute for Instance
	Then User should see message environment saved successfully
    When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on canvas
	When User click on Instance resource
	Then User search for attributes in the resource section "Connection"
	When User click on canvas
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for Instance and see message environment deleted successfully
	
