@RegressionTest @Suite2 @IMIPAll @IMI
Feature: Automate IAMInstanceProfile resource using SSH connention & AWS provider

Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	
@P1 @Suite2 
Scenario: Validate yes destroy after destroy for IAMInstanceProfile
#Test case no:19

	Then User search or create environment for IAMInstanceProfile and see message as environment created successfully
	And User drag iamrole resource and enter mandatory attributes for IAMInstanceProfile
	When User click IAMInstanceProfile resource and drag on the dashboard
	And User enter IAMInstanceProfile resource name
	Then Message should display resource created successfully
	And User enter role for IAMInstanceProfile
	And User enter dependsOn for IAMInstanceProfile
	And User enter connection for IAMInstanceProfile
	And User enter name for IAMInstanceProfile
	And User enter name prifix for IAMInstanceProfile
	And User enter path for IAMInstanceProfile	
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	And User double refresh the page
	Then User delete IAMInstanceProfile environment and see message environment deleted sucessfully 
	
	
@P1 @Suite2	
Scenario: Validate redeploy button on dashboard for IAMInstanceProfile
#Test case no:17
	Then User search or create environment for IAMInstanceProfile and see message as environment created successfully
	And User drag iamrole resource and enter mandatory attributes for IAMInstanceProfile
	When User click IAMInstanceProfile resource and drag on the dashboard
	And User enter IAMInstanceProfile resource name
	Then Message should display resource created successfully
	And User enter role for IAMInstanceProfile
	And User enter dependsOn for IAMInstanceProfile
	And User enter connection for IAMInstanceProfile
	And User enter name for IAMInstanceProfile
	And User enter name prifix for IAMInstanceProfile
	And User enter path for IAMInstanceProfile	
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	Then User click redeploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	And User double refresh the page
	Then User delete IAMInstanceProfile environment and see message environment deleted sucessfully  

@P3
Scenario: Negative test case to check the functionality of save Button and deploy without providing the mandatory fields for IAMinstanceprofile
#Test case no 2
	Then User search or create environment for IAMInstanceProfile and see message as environment created successfully
	And User drag iamrole resource and enter mandatory attributes for IAMInstanceProfile
	When User click IAMInstanceProfile resource and drag on the dashboard
	And User enter IAMInstanceProfile resource name
	Then Message should display resource created successfully
	Then User enter blank role for IAMInstanceProfile
	And User enter path for IAMInstanceProfile	
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status without providing mandatory fields
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	And User double refresh the page
	Then User delete IAMInstanceProfile environment and see message environment deleted sucessfully 

@P3
Scenario: To check the functionality of create button if resource name is blank for IAMInstanceProfile
#Test case no:3
	Then User search or create environment for IAMInstanceProfile and see message as environment created successfully
	When User click IAMInstanceProfile resource and drag on the dashboard
	And User enter blank IAMInstanceProfile resource name
	Then Message should display resource created successfully 
	And User double refresh the page
	Then User delete IAMInstanceProfile environment and see message environment deleted sucessfully  
	
@P3	
Scenario: To check the functionality of create button if resource name is duplicate for IAMInstanceProfile
#Test case no:4
    Then User search or create environment for IAMInstanceProfile and see message as environment created successfully
	When User click IAMInstanceProfile resource and drag on the dashboard
	And User enter IAMInstanceProfile resource name
	Then Message should display resource created successfully
    When User click IAMInstanceProfile resource and drag on the dashboard
	And User enter IAMInstanceProfile resource name
	Then Message should display resource created successfully
	And User double refresh the page
	Then User delete IAMInstanceProfile environment and see message environment deleted sucessfully 

@P2	
Scenario: To check the functionality of save button on dashboard for IAMInstanceProfile
#Test Case no:5
    Then User search or create environment for IAMInstanceProfile and see message as environment created successfully
	And User drag iamrole resource and enter mandatory attributes for IAMInstanceProfile
	When User click IAMInstanceProfile resource and drag on the dashboard
	And User enter IAMInstanceProfile resource name
	Then Message should display resource created successfully
	And User enter role for IAMInstanceProfile
	And User enter dependsOn for IAMInstanceProfile
	And User enter connection for IAMInstanceProfile
	And User enter name for IAMInstanceProfile
	And User enter name prifix for IAMInstanceProfile
	And User enter path for IAMInstanceProfile	
	Then User should see message environment saved successfully
	And User double refresh the page
    Then User delete IAMInstanceProfile environment and see message environment deleted sucessfully
 
@P2   
Scenario: To check the functionality of save button and Deploy button when user enter mandatory fields for IAMInstanceProfile
#Test case no 6
	 
	Then User search or create environment for IAMInstanceProfile and see message as environment created successfully
	And User drag iamrole resource and enter mandatory attributes for IAMInstanceProfile
	When User click IAMInstanceProfile resource and drag on the dashboard
	And User enter IAMInstanceProfile resource name
	Then Message should display resource created successfully
	And User enter role for IAMInstanceProfile
	And User enter dependsOn for IAMInstanceProfile
	And User enter connection for IAMInstanceProfile
	And User enter name for IAMInstanceProfile
	And User enter name prifix for IAMInstanceProfile
	And User enter path for IAMInstanceProfile	
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	And User double refresh the page
	Then User delete IAMInstanceProfile environment and see message environment deleted sucessfully  
	
@P2  
Scenario: To check the functionality of delete button if user wants to delete IamInstanceProfile resource
#Test Case no:7
   Then User search or create environment for IAMInstanceProfile and see message as environment created successfully
	When User click IAMInstanceProfile resource and drag on the dashboard
	And User enter IAMInstanceProfile resource name
	Then Message should display resource created successfully  
   	And User click on please delete it resource cross button popup for IAMInstanceProfile
   	And User double refresh the page
	Then User delete IAMInstanceProfile environment and see message environment deleted sucessfully 

@P3	
Scenario: To check the functionality of please don't delete button if user clicks cross button to delete resource for IamInstanceProfile
#Test Case no:8
    Then User search or create environment for IAMInstanceProfile and see message as environment created successfully
	When User click IAMInstanceProfile resource and drag on the dashboard
	And User enter IAMInstanceProfile resource name
	Then Message should display resource created successfully  
    And User click on please dont delete it resource cross button popup for IAMInstanceProfile
    And User double refresh the page
	Then User delete IAMInstanceProfile environment and see message environment deleted sucessfully 
	
@P2
Scenario: To check the functionality of Close button if user clicks on resource name link for IAMInstanceProfile
#Test Case no:9
   	Then User search or create environment for IAMInstanceProfile and see message as environment created successfully
	And User drag iamrole resource and enter mandatory attributes for IAMInstanceProfile
	When User click IAMInstanceProfile resource and drag on the dashboard
	And User enter IAMInstanceProfile resource name
	Then Message should display resource created successfully
	Then User click on resource name on rightsidebar
	Then User click close button on pop up of resource name link
	And User double refresh the page
    Then User delete IAMInstanceProfile environment and see message environment deleted sucessfully 
	
@P3	
Scenario: To check the functionality of Cross Close button if user clicks on resource name link for IAMInstanceProfile
#Test Case no:10
    Then User search or create environment for IAMInstanceProfile and see message as environment created successfully
	When User click IAMInstanceProfile resource and drag on the dashboard
	And User enter IAMInstanceProfile resource name
	Then Message should display resource created successfully
	When User click on resource IAMInstanceProfile
   	Then User click on resource name on rightsidebar
	Then User click cross button on pop up of resource name link
	And User double refresh the page
    Then User delete IAMInstanceProfile environment and see message environment deleted sucessfully 
      
@P2
Scenario: To check the functionality of text box under resource name link and edits the name for IAMInstanceProfile
#Test Case no:11
    Then User search or create environment for IAMInstanceProfile and see message as environment created successfully
	When User click IAMInstanceProfile resource and drag on the dashboard
	And User enter IAMInstanceProfile resource name
	Then Message should display resource created successfully
	When User click on resource IAMInstanceProfile
    Then User click on resource name on rightsidebar
	When User click the name text box to edit resource name "IAM Profile"
	When User click save button on pop up of resource name link
	When User click on canvas
	And User double refresh the page
    Then User delete IAMInstanceProfile environment and see message environment deleted sucessfully 

@P3	   
Scenario: To check the functionality of Cross Close button when user drags the resource from resource section for IAMInstanceProfile
#Test Case no:12
    Then User search or create environment for IAMInstanceProfile and see message as environment created successfully
	When User click IAMInstanceProfile resource and drag on the dashboard
	And User enter IAMInstanceProfile resource name
	Then User click on the cross close button when user drags the resource from resource section
	And User double refresh the page
   Then User delete IAMInstanceProfile environment and see message environment deleted sucessfully
    
@P2 
Scenario: To check the functionality of Close button when user drags the resource from resource section for IAMInstanceProfile
#Test Case no:13
    Then User search or create environment for IAMInstanceProfile and see message as environment created successfully
	When User click IAMInstanceProfile resource and drag on the dashboard
	And User enter IAMInstanceProfile resource name
	Then User click on the close button when user drags the resource from resource section
	And User double refresh the page
   Then User delete IAMInstanceProfile environment and see message environment deleted sucessfully    

@P2
Scenario: To check the functionality of Resource Logs button after the successful deployment of IAMInstanceProfile resource
#Test case no:14
	Then User search or create environment for IAMInstanceProfile and see message as environment created successfully
	And User drag iamrole resource and enter mandatory attributes for IAMInstanceProfile
	When User click IAMInstanceProfile resource and drag on the dashboard
	And User enter IAMInstanceProfile resource name
	Then Message should display resource created successfully
	And User enter role for IAMInstanceProfile
	And User enter dependsOn for IAMInstanceProfile
	And User enter connection for IAMInstanceProfile
	And User enter name for IAMInstanceProfile
	And User enter name prifix for IAMInstanceProfile
	And User enter path for IAMInstanceProfile	
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on logs button on dash board
	And User click on close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	And User double refresh the page
	Then User delete IAMInstanceProfile environment and see message environment deleted sucessfully 

@P3	
Scenario: To check the functionality of Close button when user clicks on resource logs button for IAMInstanceProfile
#Test case no:15
	Then User search or create environment for IAMInstanceProfile and see message as environment created successfully
	And User drag iamrole resource and enter mandatory attributes for IAMInstanceProfile
	When User click IAMInstanceProfile resource and drag on the dashboard
	And User enter IAMInstanceProfile resource name
	Then Message should display resource created successfully
	And User enter role for IAMInstanceProfile
	And User enter dependsOn for IAMInstanceProfile
	And User enter connection for IAMInstanceProfile
	And User enter name for IAMInstanceProfile
	And User enter name prifix for IAMInstanceProfile
	And User enter path for IAMInstanceProfile	
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on logs button on dash board
	And User click on close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	And User double refresh the page
	Then User delete IAMInstanceProfile environment and see message environment deleted sucessfully 	

@P3	
Scenario: To check the functionality of refresh button when user clicks on Resource Logs button for IAMInstanceProfile
#Test case no:16
	Then User search or create environment for IAMInstanceProfile and see message as environment created successfully
	And User drag iamrole resource and enter mandatory attributes for IAMInstanceProfile
	When User click IAMInstanceProfile resource and drag on the dashboard
	And User enter IAMInstanceProfile resource name
	Then Message should display resource created successfully
	And User enter role for IAMInstanceProfile
	And User enter dependsOn for IAMInstanceProfile
	And User enter connection for IAMInstanceProfile
	And User enter name for IAMInstanceProfile
	And User enter name prifix for IAMInstanceProfile
	And User enter path for IAMInstanceProfile	
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on logs button on dash board
	And User click on refresh button on logs window
	And User click on close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	And User double refresh the page
	Then User delete IAMInstanceProfile environment and see message environment deleted sucessfully 

@P3		
Scenario: To check the functionality of Cross Close button when user clicks on resource logs Link for IAMInstanceProfile
#Test case no:18
	Then User search or create environment for IAMInstanceProfile and see message as environment created successfully
	And User drag iamrole resource and enter mandatory attributes for IAMInstanceProfile
	When User click IAMInstanceProfile resource and drag on the dashboard
	And User enter IAMInstanceProfile resource name
	Then Message should display resource created successfully
	And User enter role for IAMInstanceProfile
	And User enter dependsOn for IAMInstanceProfile
	And User enter connection for IAMInstanceProfile
	And User enter name for IAMInstanceProfile
	And User enter name prifix for IAMInstanceProfile
	And User enter path for IAMInstanceProfile	
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on logs button on dash board
	And User click on cross close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	And User double refresh the page
	Then User delete IAMInstanceProfile environment and see message environment deleted sucessfully 
	
@P3		
Scenario: To check the functionality of DONT DESTROY IT Button when user clicks on Destroy button for IAMInstanceProfile
#Test case no:20	
	Then User search or create environment for IAMInstanceProfile and see message as environment created successfully
	And User drag iamrole resource and enter mandatory attributes for IAMInstanceProfile
	When User click IAMInstanceProfile resource and drag on the dashboard
	And User enter IAMInstanceProfile resource name
	Then Message should display resource created successfully
	And User enter role for IAMInstanceProfile
	And User enter dependsOn for IAMInstanceProfile
	And User enter connection for IAMInstanceProfile
	And User enter name for IAMInstanceProfile
	And User enter name prifix for IAMInstanceProfile
	And User enter path for IAMInstanceProfile	
	Then User should see message environment saved successfully
	When User click on canvas
	Then User click on deploy button and check deployment status
	And User click on destroy button
	Then User click on dont destroy button
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	And User double refresh the page
	Then User delete IAMInstanceProfile environment and see message environment deleted sucessfully 
	
@P3	 
Scenario: To check the functionality of Search bar if user wants to search for attributes after deployment under resource for IAMInstanceProfile
#Test case no 21
	Then User search or create environment for IAMInstanceProfile and see message as environment created successfully
	And User drag iamrole resource and enter mandatory attributes for IAMInstanceProfile
	When User click IAMInstanceProfile resource and drag on the dashboard
	And User enter IAMInstanceProfile resource name
	Then Message should display resource created successfully
	And User enter role for IAMInstanceProfile
	And User enter dependsOn for IAMInstanceProfile
	And User enter connection for IAMInstanceProfile
	And User enter name for IAMInstanceProfile
	And User enter name prifix for IAMInstanceProfile
	And User enter path for IAMInstanceProfile	
	Then User should see message environment saved successfully
	Then User click on deploy button and check deployment status
	And User click on resource link on the attribute section
	Then User search for attributes in the resource section "name"
	Then User click on destroy button
	Then User should see message environment destroyed sucessfully
	And User double refresh the page
	Then User delete IAMInstanceProfile environment and see message environment deleted sucessfully 
	
@P3	
Scenario: To check the functionality of Search bar if user wants to search for attributes after deployment under resource detail for IAMInstanceProfile
#Test Case no:21	 
	Then User search or create environment for IAMInstanceProfile and see message as environment created successfully
	And User drag iamrole resource and enter mandatory attributes for IAMInstanceProfile
	When User click IAMInstanceProfile resource and drag on the dashboard
	And User enter IAMInstanceProfile resource name
	Then Message should display resource created successfully
	And User enter role for IAMInstanceProfile
	And User enter dependsOn for IAMInstanceProfile
	And User enter connection for IAMInstanceProfile
	And User enter name for IAMInstanceProfile
	And User enter name prifix for IAMInstanceProfile
	And User enter path for IAMInstanceProfile	
	Then User should see message environment saved successfully
	Then User click on deploy button and check deployment status
	And User click on resource details link on the attribute section
	Then User search for attributes in the resource details "name"
	When User click on canvas
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	And User double refresh the page
	Then User delete IAMInstanceProfile environment and see message environment deleted sucessfully 
            





    
