@RegressionTest  
Feature: Automating IAM policy resource

Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	Then User create or search an environment for IAM policy and see message as environment created successfully
	
	
	
Scenario: To check the functionality of destroy yes destroy it button for IAM policy
#Test case no 1
		
		When User click IAM policy resource and drag on the dashboard
		And User enter the resource name for IAM Policy
		Then Message should display resource created successfully
		When User click on IAM policy resource
		And User fill the connection for IAM policy
		And User fill the policy for IAM policy
		And User fill the dependsOn for IAM policy
		And User fill the description for IAM policy
		And User fill the path for IAM policy
		Then User should see message environment saved successfully
        When User click on canvas
		Then User click deploy button and should see message environment deployed successfully
	    When User click on destroy button
	    Then User should see message environment destroyed sucessfully
	  	Then User delete the environment for IAM Policy and see message environment deleted successfully


Scenario: To check the functionality of Re deploy button for IAM policy
#Test case no 2

		When User click IAM policy resource and drag on the dashboard
		And User enter the resource name for IAM Policy
		Then Message should display resource created successfully
		When User click on IAM policy resource
		And User fill the connection for IAM policy
		And User fill the policy for IAM policy
		And User fill the dependsOn for IAM policy
		And User fill the description for IAM policy
		And User fill the path for IAM policy
		Then User should see message environment saved successfully
        	When User click on canvas
		Then User click deploy button and should see message environment deployed successfully
		Then User click redeploy button and should see message environment deployed successfully
	    	When User click on destroy button
	    	Then User should see message environment destroyed sucessfully
	  	Then User delete the environment for IAM Policy and see message environment deleted successfully
	
 
Scenario: To check the functionality of deploy button for IAM policy
#Test case no 3
	
		When User click IAM policy resource and drag on the dashboard
		And User enter the resource name for IAM Policy
		Then Message should display resource created successfully
		When User click on IAM policy resource
		And User fill the connection for IAM policy
		And User fill the policy for IAM policy
		And User fill the dependsOn for IAM policy
		And User fill the description for IAM policy
		And User fill the path for IAM policy
		Then User should see message environment saved successfully
        	When User click on canvas
		Then User click deploy button and should see message environment deployed successfully
	    	When User click on destroy button
	    	Then User should see message environment destroyed sucessfully
	  	Then User delete the environment for IAM Policy and see message environment deleted successfully
	
		
 
Scenario: Negative test case to check the functionality of save Button and deploy 
without providing the mandatory fields for IAM Policy
#Test case no 4
	
		When User click IAM policy resource and drag on the dashboard
		And User enter the resource name for IAM Policy
		Then Message should display resource created successfully
		When User click on IAM policy resource
		And User fill the mandatory fields as blank for IAM policy
		Then User should see message environment saved successfully
        	When User click on canvas
		Then User click on deploy button and check deployment status
	    	When User click on destroy button
	    	Then User should see message environment destroyed sucessfully
	  	Then User delete the environment for IAM Policy and see message environment deleted successfully
	

 
Scenario: To check the functionality of create button if resource name is blank for IAM Policy
#Test case no 5
		
		When User click IAM policy resource and drag on the dashboard
		Then User enter the IAM policy resource name as blank
		Then Message should display resource created successfully
		Then User delete the environment for IAM Policy and see message environment deleted successfully
		
 
Scenario: To check the functionality of create button if resource name is duplicate for IAM Policy
#Test case no 6
	
		When User click IAM policy resource and drag on the dashboard
		And User enter the resource name for IAM Policy
		Then Message should display resource created successfully
		When User click IAM policy resource and drag on the dashboard
		And User enter the resource name for IAM Policy
		Then Message should display resource created successfully
		Then User delete the environment for IAM Policy and see message environment deleted successfully
		
   
Scenario: To check the functionality of save button if user edits IAM policy resource name for IAM Policy
#Test case no 7
		
		When User click IAM policy resource and drag on the dashboard
		And User enter the resource name for IAM Policy
		Then Message should display resource created successfully
		When User click on IAM policy resource
		Then User click on resource name on rightsidebar
		When User click the name text box to edit resource name "test-iam-policy"
		When User click save button on pop up of resource name link
		Then User delete the environment for IAM Policy and see message environment deleted successfully
		
	
Scenario: To check the functionality of delete cross button Please delete button 
if user wants to delete resource for IAM Policy
#Test case no 8
		 
		When User click IAM policy resource and drag on the dashboard
		And User enter the resource name for IAM Policy
		Then Message should display resource created successfully
		And User delete the resource by clicking the cross button on resource for IAM policy
		Then User delete the environment for IAM Policy and see message environment deleted successfully
		
	
				
Scenario: To check the functionality of delete cross button Please don't delete button 
if user wants to delete resource IAM Policy
#Test case no 9
		
		When User click IAM policy resource and drag on the dashboard
		And User enter the resource name for IAM Policy
		Then Message should display resource created successfully
		When User dont delete the resource by clicking the cross button on resource for IAM policy
		Then User delete the environment for IAM Policy and see message environment deleted successfully
		

	
Scenario: To check the functionality of Close button if user clicks on resource name link for IAM policy
#Test case no 10
		
		When User click IAM policy resource and drag on the dashboard
		And User enter the resource name for IAM Policy
		Then Message should display resource created successfully
		When User click on IAM policy resource
		Then User click on resource name on rightsidebar
		Then User click close button on pop up of resource name link
		Then User delete the environment for IAM Policy and see message environment deleted successfully
		

		
Scenario: To check the functionality of Cross button if user clicks on resource name link for IAM policy
#Test case no 11
		
		When User click IAM policy resource and drag on the dashboard
		And User enter the resource name for IAM Policy
		Then Message should display resource created successfully
		When User click on IAM policy resource
		Then User click on resource name on rightsidebar
		Then User click cross button on pop up of resource name link
		Then User delete the environment for IAM Policy and see message environment deleted successfully
		

	   
Scenario: To check the functionality of Cross close button 
when user drags the resource from resource section for IAM policy
#Test case no 12
		
		When User click IAM policy resource and drag on the dashboard
		Then User click on the cross close button when user drags the resource from resource section
		Then User delete the environment for IAM Policy and see message environment deleted successfully
		
	
   
Scenario: To check the functionality of close button 
when user drags the resource from resource section for IAM policy
#Test case no 13
		
		When User click IAM policy resource and drag on the dashboard
		Then User click on the close button when user drags the resource from resource section
		Then User delete the environment for IAM Policy and see message environment deleted successfully
		
		 
Scenario: To check the functionality of text box when user clicks on resource name link and 
edits the name for IAM policy
#Test case no 14
	
		When User click IAM policy resource and drag on the dashboard
		And User enter the resource name for IAM Policy
		Then Message should display resource created successfully
		When User click on IAM policy resource
		Then User click on resource name on rightsidebar
		When User click the name text box to edit resource name "test-iam-policy"
		Then User click close button on pop up of resource name link
		Then User delete the environment for IAM Policy and see message environment deleted successfully
		
		
Scenario: To check the functionality of Resource Logs button after the successful deployment of the resource for IAM Policy
#Test case no 15
	
	    	When User click IAM policy resource and drag on the dashboard
		And User enter the resource name for IAM Policy
		Then Message should display resource created successfully
		When User click on IAM policy resource
	    	And User fill the connection for IAM policy
	    	And User fill the policy for IAM policy
	    	And User fill the dependsOn for IAM policy
	    	And User fill the description for IAM policy
	    	And User fill the path for IAM policy
	    	Then User should see message environment saved successfully
        	When User click on canvas
		Then User click deploy button and should see message environment deployed successfully
		When User click on logs button on dash board
	    	And User click on cross close button on logs window
	    	When User click on destroy button
	    	Then User should see message environment destroyed sucessfully
	    	Then User delete the environment for IAM Policy and see message environment deleted successfully
	    
	  
Scenario: To check the functionality of Close button after the successful deployment of the resource for IAM Policy
#Test case no 16

	   	When User click IAM policy resource and drag on the dashboard
		And User enter the resource name for IAM Policy
		Then Message should display resource created successfully
		When User click on IAM policy resource
	    	And User fill the connection for IAM policy
	    	And User fill the policy for IAM policy
	    	And User fill the dependsOn for IAM policy
	    	And User fill the description for IAM policy
	    	And User fill the path for IAM policy
	    	Then User should see message environment saved successfully
        	When User click on canvas
		Then User click deploy button and should see message environment deployed successfully
		When User click on logs button on dash board
	    	And User click on close button on logs window
	    	When User click on destroy button
	    	Then User should see message environment destroyed sucessfully
	    	Then User delete the environment for IAM Policy and see message environment deleted successfully
	    
	      
Scenario: To check the functionality of Refresh button after the successful deployment of the resource for IAM Policy
#Test case no 17
	
	When User click IAM policy resource and drag on the dashboard
	And User enter the resource name for IAM Policy
	Then Message should display resource created successfully
	When User click on IAM policy resource
	And User fill the connection for IAM policy
	And User fill the policy for IAM policy
	And User fill the dependsOn for IAM policy
	And User fill the description for IAM policy
	And User fill the path for IAM policy
	Then User should see message environment saved successfully
    	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on logs button on dash board
	And User click on refresh button on logs window
	And User click on cross close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for IAM Policy and see message environment deleted successfully
	   
Scenario: To check the functionality of Cross Close button after the successful deployment of the resource for IAM Policy
#Test case no 18
	
	When User click IAM policy resource and drag on the dashboard
	And User enter the resource name for IAM Policy
	Then Message should display resource created successfully
	When User click on IAM policy resource
	And User fill the connection for IAM policy
	And User fill the policy for IAM policy
	And User fill the dependsOn for IAM policy
	And User fill the description for IAM policy
	And User fill the path for IAM policy
	Then User should see message environment saved successfully
    	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on logs button on dash board
	And User click on cross close button on logs window
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for IAM Policy and see message environment deleted successfully
	  	
	  	
 
Scenario: To check the functionality of destroy don't destroy it button for IAM policy
#Test case no 19
	
	When User click IAM policy resource and drag on the dashboard
	And User enter the resource name for IAM Policy
	Then Message should display resource created successfully
	When User click on IAM policy resource
	And User fill the connection for IAM policy
	And User fill the policy for IAM policy
	And User fill the dependsOn for IAM policy
	And User fill the description for IAM policy
	And User fill the path for IAM policy
	Then User should see message environment saved successfully
    	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User click on dont destroy button
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for IAM Policy and see message environment deleted successfully
	

  
Scenario: To check the functionality of Search bar at resource details if user wants to search for attributes after 
deployment of the resource for IAM policy
#Test case no 20
	
	When User click IAM policy resource and drag on the dashboard
	And User enter the resource name for IAM Policy
	Then Message should display resource created successfully
	When User click on IAM policy resource
	And User fill the connection for IAM policy
	And User fill the policy for IAM policy
	And User fill the dependsOn for IAM policy
	And User fill the description for IAM policy
	And User fill the path for IAM policy
	Then User should see message environment saved successfully
	Then User click deploy button and should see message environment deployed successfully
	When User click on resource details link on the attribute section
	Then User search for attributes in the resource details "name" for IAM policy
	Then User delete the environment for IAM Policy and see message environment deleted successfully
	
	

Scenario: To check the functionality of Search bar at resource section if user wants to search for attributes after 
deployment of the resource for IAM policy
#Test case no 21
	
	When User click IAM policy resource and drag on the dashboard
	And User enter the resource name for IAM Policy
	Then Message should display resource created successfully
	When User click on IAM policy resource
	And User fill the connection for IAM policy
	And User fill the policy for IAM policy
	And User fill the dependsOn for IAM policy
	And User fill the description for IAM policy
	And User fill the path for IAM policy
	Then User should see message environment saved successfully
	Then User click deploy button and should see message environment deployed successfully
	When User click on resource link on the attribute section
	Then User search for attributes in the resource section "name" for IAM policy
	Then User delete the environment for IAM Policy and see message environment deleted successfully
	
	
