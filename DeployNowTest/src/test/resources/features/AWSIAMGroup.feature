@RegressionTest @IamgroupAll @Suite3 
Feature: Automating IAM group resource

Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	Then User create or search an environment for IAM group and see message as environment created successfully

@P1  @iamgroup2 
Scenario: To check the functionality of Re deploy button for IAM group
#Test case no 17

		When User click IAM group resource and drag on the dashboard
		And User enter IAM group resource name
		Then Message should display resource created successfully
		When User click on IAM group resource
		And User enter the connection attribute for IAM group
		And User enter the depends on attribute for IAM group
		And User enter the path attribute for IAM group
		Then User should see message environment saved successfully
        	When User click on canvas
		Then User click deploy button and should see message environment deployed successfully
		Then User click redeploy button and should see message environment deployed successfully
	    	When User click on destroy button
	    	Then User should see message environment destroyed sucessfully
		Then User delete the environment for IAM Group and see message environment deleted successfully
  	
@P1 @iamgroup1
Scenario: To check the functionality of destroy yes destroy it button for IAM group
#Test case no 19
		
		
		When User click IAM group resource and drag on the dashboard
		And User enter IAM group resource name
		Then Message should display resource created successfully
		When User click on IAM group resource
		And User enter the connection attribute for IAM group
		And User enter the depends on attribute for IAM group
		And User enter the path attribute for IAM group
		Then User should see message environment saved successfully
        	When User click on canvas
		Then User click deploy button and should see message environment deployed successfully
		When User click on destroy button
	    Then User should see message environment destroyed sucessfully
		Then User delete the environment for IAM Group and see message environment deleted successfully
	
@P3   
Scenario: Negative test case to check the functionality of save Button and deploy without 
providing the mandatory fields for IAM group
#Test case no 2
	
	When User click IAM group resource and drag on the dashboard
	And User enter IAM group resource name
	Then Message should display resource created successfully
	When User click on IAM group resource
	Then User fill the attributes as blank for IAM group
	#Then User fill the attributes as blank under resource section
	Then User should see message environment saved successfully
    	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for IAM Group and see message environment deleted successfully
	
@P2	   
Scenario: To check the functionality of save button if user edits IAM group resource name for IAM group
#Test case no 5
	
	When User click IAM group resource and drag on the dashboard
	And User enter IAM group resource name
	Then Message should display resource created successfully
	When User click on IAM group resource
	Then User click on resource name on rightsidebar
	When User click the name text box to edit resource name "test-iam"
	When User click save button on pop up of resource name link
	Then User should see message environment saved successfully
    	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete the environment for IAM Group and see message environment deleted successfully
	
	

@P3   
Scenario: To check the functionality of create button if resource name is duplicate for IAM group
#Test case no 4
	
	
	When User click IAM group resource and drag on the dashboard
	And User enter IAM group resource name
	Then Message should display resource created successfully
	When User click IAM group resource and drag on the dashboard
	And User enter IAM group resource name
	Then Message should display resource created successfully
	Then User delete the environment for IAM Group and see message environment deleted successfully
	
@P3	   	
Scenario: To check the functionality of create button if resource name is blank for IAM group
#Test case no 3
	
	When User click IAM group resource and drag on the dashboard
	Then User enter the blank resource name for IAM group
	Then Message should display resource created successfully
	#When User click on create button on resource pop up
	Then User delete the environment for IAM Group and see message environment deleted successfully
	

@P2	 
Scenario: To check the functionality of delete cross button Please delete button 
if user wants to delete resource for IAM group
#Test case no 6
	
	When User click IAM group resource and drag on the dashboard
	And User enter IAM group resource name
	Then Message should display resource created successfully
	And User delete the resource by clicking the cross button on IAM group
	Then User delete the environment for IAM Group and see message environment deleted successfully
	

@P3	  
Scenario: To check the functionality of delete cross button Please don't delete button 
if user wants to delete resource for IAM group
#Test case no 7
	
	When User click IAM group resource and drag on the dashboard
	And User enter IAM group resource name
	Then Message should display resource created successfully
	And User dont delete the resource by clicking the cross button on IAM group
	Then User delete the environment for IAM Group and see message environment deleted successfully
	

@P3   
Scenario: To check the functionality of Close button if user clicks on resource name link for IAM group
#Test case no 8
	
	When User click IAM group resource and drag on the dashboard
	And User enter IAM group resource name
	Then Message should display resource created successfully
	When User click on IAM group resource
	Then User click on resource name on rightsidebar
	Then User click close button on pop up of resource name link
	Then User delete the environment for IAM Group and see message environment deleted successfully
	
	
@P3	  
Scenario: To check the functionality of Cross button if user clicks on resource name link for IAM group
#Test case no 9
	
	When User click IAM group resource and drag on the dashboard
	And User enter IAM group resource name
	Then Message should display resource created successfully
	When User click on IAM group resource
	Then User click on resource name on rightsidebar
	Then User click cross button on pop up of resource name link
	Then User delete the environment for IAM Group and see message environment deleted successfully
	

@P3	  
Scenario: To check the functionality of Cross close button when user drags the resource 
from resource section for IAM group
#Test case no 10
	
	When User click IAM group resource and drag on the dashboard
	Then User click on the cross close button when user drags the resource from resource section
	Then User delete the environment for IAM Group and see message environment deleted successfully
	

@P3	 
Scenario: To check the functionality of close button when user drags the resource from resource section for IAM group
#Test case no 11
	
	When User click IAM group resource and drag on the dashboard
	Then User click on the close button when user drags the resource from resource section
	Then User delete the environment for IAM Group and see message environment deleted successfully
	

@P3	  
Scenario: To check the functionality of text box when user clicks on resource name link and edits the name for IAM group
#Test case no 12
	
	When User click IAM group resource and drag on the dashboard
	And User enter IAM group resource name
	Then Message should display resource created successfully
	When User click on IAM group resource
	Then User click on resource name on rightsidebar
	When User click the name text box to edit resource name "adn"
	Then User click close button on pop up of resource name link
	Then User delete the environment for IAM Group and see message environment deleted successfully
	

@P2  
Scenario: To check the functionality of Resource Logs button after the successful deployment of the resource for IAM group
#Test case no 13
	
	When User click IAM group resource and drag on the dashboard
	And User enter IAM group resource name
	Then Message should display resource created successfully
	When User click on IAM group resource
	And User enter the connection attribute for IAM group
	And User enter the depends on attribute for IAM group
	And User enter the path attribute for IAM group
	Then User should see message environment saved successfully
    	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on logs button on dash board
	And User click on close button on logs window
	When User click on destroy button
	    	Then User should see message environment destroyed sucessfully
		Then User delete the environment for IAM Group and see message environment deleted successfully
	
	
@P3 
Scenario: To check the functionality of Close button on logs window after the successful 
deployment of the resource for IAM group
#Test case no 14
	
	When User click IAM group resource and drag on the dashboard
	And User enter IAM group resource name
	Then Message should display resource created successfully
	When User click on IAM group resource
	And User enter the connection attribute for IAM group
	And User enter the depends on attribute for IAM group
	And User enter the path attribute for IAM group
	Then User should see message environment saved successfully
    	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on logs button on dash board
	And User click on close button on logs window
	When User click on destroy button
	    	Then User should see message environment destroyed sucessfully
		Then User delete the environment for IAM Group and see message environment deleted successfully
	
	
@P3 
Scenario: To check the functionality of Refresh button on logs button after the successful 
deployment of the resource for IAM group
#Test case no 15
	
	When User click IAM group resource and drag on the dashboard
	And User enter IAM group resource name
	Then Message should display resource created successfully
	When User click on IAM group resource
	And User enter the connection attribute for IAM group
	And User enter the depends on attribute for IAM group
	And User enter the path attribute for IAM group
	Then User should see message environment saved successfully
    	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on logs button on dash board
	And User click on close button on logs window
	When User click on destroy button
  		Then User should see message environment destroyed sucessfully
		Then User delete the environment for IAM Group and see message environment deleted successfully
	
	
@P3 @iamgroup3
Scenario: To check the functionality of Cross Close button on logs window after the successful 
deployment of the resource for IAM group
#Test case no 16
	
	When User click IAM group resource and drag on the dashboard
	And User enter IAM group resource name
	Then Message should display resource created successfully
	When User click on IAM group resource
	And User enter the connection attribute for IAM group
	And User enter the depends on attribute for IAM group
	And User enter the path attribute for IAM group
	Then User should see message environment saved successfully
    	When User click on canvas
	Then User click on deploy button and check deployment status
	When User click on logs button on dash board
	And User click on cross close button on logs window
	When User click on destroy button
  		Then User should see message environment destroyed sucessfully
		Then User delete the environment for IAM Group and see message environment deleted successfully
	
			
@P3	   
Scenario: To check the functionality of destroy don't destroy it button for IAM group
#Test case no 18

		When User click IAM group resource and drag on the dashboard
	    	And User enter IAM group resource name
	    	Then Message should display resource created successfully
	    	When User click on IAM group resource
		And User enter the connection attribute for IAM group
		And User enter the depends on attribute for IAM group
		And User enter the path attribute for IAM group
		Then User should see message environment saved successfully
        	When User click on canvas
	    	Then User click deploy button and should see message environment deployed successfully
	    	When User click on destroy button
  		Then User click on dont destroy button
  		When User click on destroy button
  		Then User should see message environment destroyed sucessfully
	    	Then User delete the environment for IAM Group and see message environment deleted successfully
		
		
@P2    
Scenario: To check the functionality of deploy button for IAM group
#Test case no 22

	When User click IAM group resource and drag on the dashboard
	And User enter IAM group resource name
	Then Message should display resource created successfully
	When User click on IAM group resource
	And User enter the connection attribute for IAM group
	And User enter the depends on attribute for IAM group
	And User enter the path attribute for IAM group
	Then User should see message environment saved successfully
    	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
    	Then User should see message environment destroyed sucessfully
	Then User delete the environment for IAM Group and see message environment deleted successfully
	

@P3	  
Scenario: To check the functionality of Search bar if user wants to search for attributes after 
deployment of the resource for IAM group
#Test case no 23

	 	When User click IAM group resource and drag on the dashboard
	    And User enter IAM group resource name
	    Then Message should display resource created successfully
	    When User click on IAM group resource
		And User enter the connection attribute for IAM group
		And User enter the depends on attribute for IAM group
		And User enter the path attribute for IAM group
		Then User should see message environment saved successfully
        When User click on canvas
	    Then User click deploy button and should see message environment deployed successfully
		When User click on IAM group resource
	 	When User click on resource details link on the attribute section
		Then User search for attributes in the resource details "id"
		When User click on canvas
		When User click on destroy button
	    Then User should see message environment destroyed sucessfully
		Then User delete the environment for IAM Group and see message environment deleted successfully
	 	
		

@P3	  	
Scenario: To check the functionality of Search bar if user wants to search for attributes after 
deployment under resource for IAM group	
#Test case no 26

		When User click IAM group resource and drag on the dashboard
	    And User enter IAM group resource name
	    Then Message should display resource created successfully
	    When User click on IAM group resource
		And User enter the connection attribute for IAM group
		And User enter the depends on attribute for IAM group
		And User enter the path attribute for IAM group
		Then User should see message environment saved successfully
        When User click on canvas
	    Then User click deploy button and should see message environment deployed successfully
		When User click on IAM group resource
	 	When User click on resource link on the attribute section
		Then User search for attributes in the resource section "Connection"
		When User click on canvas
		When User click on destroy button
	    Then User should see message environment destroyed sucessfully
		Then User delete the environment for IAM Group and see message environment deleted successfully
		
	 	
		

	

	
