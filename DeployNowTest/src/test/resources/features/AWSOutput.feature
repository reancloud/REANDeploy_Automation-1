@RegressionTest @Suite2 @Smoke @Sanity
Feature: Resource output using SSH connention & AWS provider

Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	Then User search or create environment for output and see message as environment created successfully

@Smoke @Sanity 
Scenario: Validate Output resource can be added to environment and deployed successfully 
#Test case no 1	
	And User drag vpc resource and enter mandatory attributes for output
	When User click output resource and drag on the dashboard
	And User enter dependson for Output
	And User select connection from output 
	And User set json for Output resource
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete output environment and see message environment deleted sucessfully	

@Smoke @Sanity 
Scenario:  Validate please delete it button if Output resource need to be deleted 
#Test case no 2	
	When User click output resource and drag on the dashboard
	And User click on please delete it resource cross button popup for output
	Then User delete output environment and see message environment deleted sucessfully	 

@Smoke @Sanity  
Scenario:  Validate please dont delete it button if Output resource need to be deleted for output
#Test case no 3	
	When User click output resource and drag on the dashboard
	And User click on please dont delete it resource cross button popup for output
	Then User delete output environment and see message environment deleted sucessfully
	
@Smoke @Sanity 
Scenario: Validate Close button under Output resource name link 
#Test case no 4	 
	When User click output resource and drag on the dashboard
	When User click on output resource
	Then User click on resource name on rightsidebar
	Then User click close button on pop up of resource name link
	Then User delete output environment and see message environment deleted sucessfully	 

@Smoke @Sanity	
Scenario: Validate Save button under Output resource name link if resource name is passed as blank  
#Test case no 5	 
	When User click output resource and drag on the dashboard
	When User click on output resource
	Then User click on resource name on rightsidebar
	When User click the name text box to edit resource name ""
	When User click save button on pop up of resource name link
	Then User click cross button on pop up of resource name link
	Then User delete output environment and see message environment deleted sucessfully

@Smoke @Sanity 
Scenario: Validate text box under Output resource name link when user edit resource name 
#Test case no 6	 
	When User click output resource and drag on the dashboard
	When User click on output resource
	Then User click on resource name on rightsidebar
	When User click the name text box to edit resource name "Output"
	When User click save button on pop up of resource name link
	Then User delete output environment and see message environment deleted sucessfully	 
 
@Smoke @Sanity
Scenario: Validate cross button under Output resource name link 
#Test case no 7	 
	When User click output resource and drag on the dashboard
	When User click on output resource
	Then User click on resource name on rightsidebar
	Then User click cross button on pop up of resource name link
	Then User delete output environment and see message environment deleted sucessfully

@Smoke @Sanity	
Scenario: Validate save and deploy button when valid attributes are passed for Output resource 
#Test case no 8	
	And User drag vpc resource and enter mandatory attributes for output
	When User click output resource and drag on the dashboard
	And User enter dependson for Output
	And User select connection from output 
	And User set json for Output resource
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete output environment and see message environment deleted sucessfully

@Smoke @Sanity 
Scenario: Validate save and deploy button when invalid attributes are passed for Output resource
#Test case no 9
	And User drag vpc resource and enter mandatory attributes for output
	When User click output resource and drag on the dashboard
	And User enter dependson for Output
	And User select connection from output 
	And User set invalid json for Output resource
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	Then User delete output environment and see message environment deleted sucessfully
	
@Smoke @Sanity @Suite2 
Scenario: Validate re-deploy button on dashboard for Output resource 
#Test case no 10
	And User drag vpc resource and enter mandatory attributes for output
	When User click output resource and drag on the dashboard
	And User enter dependson for Output
	And User select connection from output 
	And User set json for Output resource
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	Then User click redeploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete output environment and see message environment deleted sucessfully


@Smoke @Sanity  
Scenario: Validate Close button under resource log popup for Output resource environment
#Test case no 11
	And User drag vpc resource and enter mandatory attributes for output
	When User click output resource and drag on the dashboard
	And User enter dependson for Output
	And User select connection from output 
	And User set json for Output resource
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on logs button on dash board
	And User click on close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete output environment and see message environment deleted sucessfully

@Smoke @Sanity 
Scenario: Validate Cross button under resource log popup for Output resource environment
#Test case no 12
	And User drag vpc resource and enter mandatory attributes for output
	When User click output resource and drag on the dashboard
	And User enter dependson for Output
	And User select connection from output 
	And User set json for Output resource
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on logs button on dash board
	And User click on cross close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete output environment and see message environment deleted sucessfully	 

@Smoke @Sanity	
Scenario: Validate Refresh button under resource log popup for Output resource environment
#Test case no 13
	And User drag vpc resource and enter mandatory attributes for output
	When User click output resource and drag on the dashboard
	And User enter dependson for Output
	And User select connection from output 
	And User set json for Output resource
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on logs button on dash board
	And User click on refresh button on logs window
	And User click on close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete output environment and see message environment deleted sucessfully
	
@Smoke @Sanity 
Scenario: Validate Dont destroy it button when user destroy Output environment
#Test case no 14
	And User drag vpc resource and enter mandatory attributes for output
	When User click output resource and drag on the dashboard
	And User enter dependson for Output
	And User select connection from output 
	And User set json for Output resource
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on destroy button
	Then User click on dont destroy button
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete output environment and see message environment deleted sucessfully
	
@Smoke @Sanity @Suite2 
Scenario: Validate Yes destroy it button when user destroy Output environment
#Test case no 15
	And User drag vpc resource and enter mandatory attributes for output
	When User click output resource and drag on the dashboard
	And User enter dependson for Output
	And User select connection from output 
	And User set json for Output resource
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete output environment and see message environment deleted sucessfully
  
@Smoke @Sanity   
Scenario: Validate Search bar under Resource tab on Right-hand Sidebar for Output resource
#Test case no 20
	And User drag vpc resource and enter mandatory attributes for output
	When User click output resource and drag on the dashboard
	And User enter dependson for Output
	And User select connection from output 
	And User set json for Output resource
	Then User should see message environment saved successfully
	Then User click on deploy button and check deployment status
	And User click on resource details link on the attribute section
	Then User search for attributes in the resource details "vpc-id"
	When User click on canvas
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete output environment and see message environment deleted sucessfully

@Smoke @Sanity 
Scenario: Validate Search bar under Resource Details tab on Right-hand Sidebar for Output resource
#Test case no 21
	And User drag vpc resource and enter mandatory attributes for output
	When User click output resource and drag on the dashboard
	And User enter dependson for Output
	And User select connection from output 
	And User set json for Output resource
	Then User should see message environment saved successfully
	Then User click on deploy button and check deployment status
	And User click on resource details link on the attribute section
	Then User search for attributes in the resource details "vpc-id"
	When User click on canvas
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete output environment and see message environment deleted sucessfully
	 
	
