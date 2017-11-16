@RegressionTest @Sanity @Suite3
Feature: Input Variable Resource Testing
Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	Then User search or create an environment for Input Variable and see message as environment created successfully
	
	@Sanity 
Scenario: To check the functionality of re deploy button for Input Variable
#Test case no 13

		When User click VPC resource and drag on the dashboard for Input Variable
		When User click Input Variable resource and drag on the dashboard
		And User enter input variables attribute for Input Variable
		Then User should see message environment saved successfully
		When User click on canvas
		Then User click deploy button and should see message environment deployed successfully
		Then User click redeploy button and should see message environment deployed successfully
        	When User click on destroy button
	    	Then User should see message environment destroyed sucessfully
		Then User delete the environment for Input Variable and see message environment deleted successfully
		
@Sanity 
Scenario: To check the functionality of destroy and then Yes destroy it button for Input Variable
#Test case no 15
	
		When User click VPC resource and drag on the dashboard for Input Variable
		When User click Input Variable resource and drag on the dashboard
		And User enter input variables attribute for Input Variable
		Then User should see message environment saved successfully
		When User click on canvas
		Then User click deploy button and should see message environment deployed successfully
        	When User click on destroy button
	    	Then User should see message environment destroyed sucessfully
		Then User delete the environment for Input Variable and see message environment deleted successfully
		
@Sanity
Scenario: To check the functionality of deploy button for Input Variable
#Test case no 1
	
		When User click VPC resource and drag on the dashboard for Input Variable
		When User click Input Variable resource and drag on the dashboard
		And User enter input variables attribute for Input Variable
		Then User should see message environment saved successfully
		When User click on canvas
		Then User click deploy button and should see message environment deployed successfully
       	 	When User click on destroy button
	    	Then User should see message environment destroyed sucessfully
		Then User delete the environment for Input Variable and see message environment deleted successfully

	
@Sanity
Scenario: Deployment of Input variable with invalid Json value for Input Variable
#Test case no 2
	
		When User click VPC resource and drag on the dashboard for Input Variable
		When User click Input Variable resource and drag on the dashboard
		And User enter input variables attribute as invalid for Input Variable
		Then User should see message environment saved successfully
		When User click on canvas
		Then User click on deploy button and check deployment status
        	When User click on destroy button
	    	Then User should see message environment destroyed sucessfully
		Then User delete the environment for Input Variable and see message environment deleted successfully


@Sanity
Scenario: To check the functionality of save button on dash board for Input Variable
#Test case no 3
		
		When User click VPC resource and drag on the dashboard for Input Variable
		When User click Input Variable resource and drag on the dashboard
		And User enter input variables attribute for Input Variable
		Then User should see message environment saved successfully
		Then User delete the environment for Input Variable and see message environment deleted successfully

@Sanity
Scenario: To check the functionality of save button if user edits Input Variable resource name
#Test case no 4
		
		
		When User click Input Variable resource and drag on the dashboard
		When User click on Input Variable resource
		And User enter input variables attribute for Input Variable
		Then User should see message environment saved successfully
		Then User click on resource name on rightsidebar
		When User click the name text box for Input Variable to edit resource name "Input Variables"
		When User click save button on pop up of resource name link
		Then User should see message environment saved successfully
		Then User delete the environment for Input Variable and see message environment deleted successfully
	

@Sanity
Scenario: To check the functionality of please delete it button for Input variable
#Test case no 5
	
	When User click Input Variable resource and drag on the dashboard
	And User delete the resource by clicking the cross button on resource for Input Variable
	Then User delete the environment for Input Variable and see message environment deleted successfully
	
			
@Sanity
Scenario: To check the functionality of please don't delete it button for Input variable
#Test case no 6
	
	When User click Input Variable resource and drag on the dashboard
	When User dont delete the resource by clicking the cross button on resource for Input Variable
	Then User delete the environment for Input Variable and see message environment deleted successfully
	

@Sanity
Scenario: To check the functionality of close button of resource name link for Input Variable
#Test case no 7
		
		When User click Input Variable resource and drag on the dashboard
		When User click on Input Variable resource
		Then User click on resource name on rightsidebar
		Then User click close button on pop up of resource name link
		Then User delete the environment for Input Variable and see message environment deleted successfully
			

@Sanity
Scenario: To check the functionality of cross close button of resource name link for Input Variable
#Test case no 8
		
		When User click Input Variable resource and drag on the dashboard
		When User click on Input Variable resource
		Then User click on resource name on rightsidebar
		Then User click cross button on pop up of resource name link
		Then User delete the environment for Input Variable and see message environment deleted successfully
		
		
@Sanity 
Scenario: To check the functionality of Resource Logs button after the successful deployment of the resource for Input Variable
#Test case no 10

		
		
		When User click VPC resource and drag on the dashboard for Input Variable
		When User click Input Variable resource and drag on the dashboard
		And User enter input variables attribute for Input Variable
		Then User should see message environment saved successfully
		When User click on canvas
		Then User click on deploy button and check deployment status
		When User click on logs button on dash board
		Then User click on close button on logs window
		And User click on destroy button
		Then User should see message environment destroyed sucessfully
		Then User delete the environment for Input Variable and see message environment deleted successfully
		
@Sanity	
Scenario: To check the functionality of close button at Resource Logs after deployment for Input Variable
#Test case no 11

		When User click VPC resource and drag on the dashboard for Input Variable
		When User click Input Variable resource and drag on the dashboard
		And User enter input variables attribute for Input Variable
		Then User should see message environment saved successfully
		When User click on canvas
		Then User click on deploy button and check deployment status
		When User click on logs button on dash board
		Then User click on close button on logs window
		And User click on destroy button
		Then User should see message environment destroyed sucessfully
		Then User delete the environment for Input Variable and see message environment deleted successfully
		
		
@Sanity
Scenario: To check the functionality of refresh button at Resource Logs after deployment for Input Variable
#Test case no 12

		
		When User click VPC resource and drag on the dashboard for Input Variable
		When User click Input Variable resource and drag on the dashboard
		And User enter input variables attribute for Input Variable
		Then User should see message environment saved successfully
		When User click on canvas
		Then User click on deploy button and check deployment status
		When User click on logs button on dash board
		Then User click on refresh button on logs window
		Then User click on close button on logs window
		And User click on destroy button
		Then User should see message environment destroyed sucessfully
		Then User delete the environment for Input Variable and see message environment deleted successfully

@Sanity
Scenario: To check the functionality of destroy don't destroy it button for Input Variable
#Test case no 14
	
		
		When User click VPC resource and drag on the dashboard for Input Variable
		When User click Input Variable resource and drag on the dashboard
		And User enter input variables attribute for Input Variable
		Then User should see message environment saved successfully
		When User click on canvas
		Then User click on deploy button and check deployment status
		And User click on destroy button
		Then User click on dont destroy button
		And User click on destroy button
		Then User should see message environment destroyed sucessfully
		Then User delete the environment for Input Variable and see message environment deleted successfully
	

@Sanity		
Scenario: To check the functionality of Search bar on side bar under resource details if user wants to search 
for attributes after deployment of the resource for Input Variable
#Test case no 16

		
		When User click VPC resource and drag on the dashboard for Input Variable
		When User click Input Variable resource and drag on the dashboard
		And User enter input variables attribute for Input Variable
		Then User should see message environment saved successfully
		When User click on canvas
		Then User click on deploy button and check deployment status
		Then User click on Input Variable resource
		When User click on resource details link on the attribute section
		Then User search for attributes in the resource details "input" for Input Variable
		When User click on canvas
		And User click on destroy button
		Then User should see message environment destroyed sucessfully
		Then User delete the environment for Input Variable and see message environment deleted successfully
	
@Sanity		
Scenario: To check the functionality of cross close button at Resource Logs after deployment for Input Variable
#Test case no 17

		
		When User click VPC resource and drag on the dashboard for Input Variable
		When User click Input Variable resource and drag on the dashboard
		And User enter input variables attribute for Input Variable
		Then User should see message environment saved successfully
		When User click on canvas
		Then User click on deploy button and check deployment status
		When User click on logs button on dash board
		Then User click on cross close button on logs window
		And User click on destroy button
		Then User should see message environment destroyed sucessfully
		Then User delete the environment for Input Variable and see message environment deleted successfully

@Sanity
Scenario: To check the functionality of Search bar on side bar under resource if user wants to search
for attributes after deployment of the resource for Input Variable
#Test case no 22

		
		
		When User click VPC resource and drag on the dashboard for Input Variable
		When User click Input Variable resource and drag on the dashboard
		And User enter input variables attribute for Input Variable
		Then User should see message environment saved successfully
		When User click on canvas
		Then User click on deploy button and check deployment status
		Then User click on Input Variable resource
		When User click on resource link on the attribute section
		Then User search for attributes in the resource section "input"
		When User click on canvas
		And User click on destroy button
		Then User should see message environment destroyed sucessfully
		Then User delete the environment for Input Variable and see message environment deleted successfully

	  
