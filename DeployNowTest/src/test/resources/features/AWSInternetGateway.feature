@RegressionTest @Suite3 @Sanity
Feature: Automating Internet Gateway resource with AWS and SSH

Background:

		Given User direct to deploy now application
		When User log in
		Then Login sucessfully should display
		Then User create or search an environment for Internet Gateway and see message as environment created successfully
		
		
	

@Sanity      
Scenario: To check the functionality of destroy button yes destroy it button for Internet Gateway
#Test case no 22

		
		When User click VPC resource and drag on the dashboard for Internet Gateway
		And User enter VPC resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
		And User enter the resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click on IGW resource
		And User fill the vpc id attribute for Internet Gateway
		And User enter the depends on attribute for IAM group
		And User fill connection for Internet Gateway
		Then User should see message environment saved successfully
        When User click on canvas
		Then User click deploy button and should see message environment deployed successfully
	    When User click on destroy button
	    Then User should see message environment destroyed sucessfully
	  	Then User delete the environment for Internet Gateway and see message environment deleted successfully
		
		
@Sanity   
Scenario: To check the functionality of re deploy button for Internet Gateway
#Test case no 20
		
		
		When User click VPC resource and drag on the dashboard for Internet Gateway
		And User enter VPC resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
		And User enter the resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click on IGW resource
		And User fill the vpc id attribute for Internet Gateway
		And User enter the depends on attribute for IAM group
		And User fill connection for Internet Gateway
		Then User should see message environment saved successfully
        When User click on canvas
		Then User click deploy button and should see message environment deployed successfully
		Then User click redeploy button and should see message environment deployed successfully
	    When User click on destroy button
	    Then User should see message environment destroyed sucessfully
	  	Then User delete the environment for Internet Gateway and see message environment deleted successfully	
		
	
@Sanity   
Scenario: Negative test case to check the functionality of save Button and 
deploy without providing the mandatory fields for Internet Gateway
#Test case no 2

		
		When User click VPC resource and drag on the dashboard for Internet Gateway
		And User enter VPC resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
		And User enter the resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click on IGW resource
		And User fill the attribute as blank for Internet Gateway
		Then User should see message environment saved successfully
        When User click on canvas
		Then User click on deploy button and check deployment status
	    When User click on destroy button
	    Then User should see message environment destroyed sucessfully
	  	Then User delete the environment for Internet Gateway and see message environment deleted successfully
		 
@Sanity	 
Scenario: To check the functionality of create button after dragging the resource for Internet Gateway
#Test case no 3

		When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
		And User enter the resource name for Internet Gateway
		Then Message should display resource created successfully
		Then User delete the environment for Internet Gateway and see message environment deleted successfully
		
@Sanity   
Scenario: To check the functionality of create button if resource name is blank for Internet Gateway
#Test case no 4

		When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
		And User enter the Internet Gateway resource name as blank
		Then Message should display resource created successfully
		Then User delete the environment for Internet Gateway and see message environment deleted successfully
		 
@Sanity  
Scenario: To check the functionality of create button if resource name is duplicate for Internet Gateway
#Test case no 5

		
		When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
		And User enter the resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
		And User enter the resource name for Internet Gateway
		Then Message should display resource created successfully
		Then User delete the environment for Internet Gateway and see message environment deleted successfully
		 

@Sanity  
Scenario: To check the functionality of edit resource name and save button on resource name link for Internet Gateway
#Test case no 6

		
		When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
		And User enter the resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click on IGW resource
		Then User click on resource name on rightsidebar
		When User click the name text box to edit resource name "adn-test-igw"
		When User click save button on pop up of resource name link
		Then User delete the environment for Internet Gateway and see message environment deleted successfully
		 

@Sanity 
Scenario: To check the functionality of Please delete it button for Internet Gateway
#Test case no 7

		
		When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
		And User enter the resource name for Internet Gateway
		Then Message should display resource created successfully
		And User delete the resource by clicking the cross button on resource for Internet Gateway
		And User refresh the page
		Then User delete the environment for Internet Gateway and see message environment deleted successfully
		 
	
@Sanity  
Scenario: To check the functionality of Please don't delete button for Internet Gateway
#Test case no 8

		
		When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
		And User enter the resource name for Internet Gateway
		Then Message should display resource created successfully
		When User dont delete the resource by clicking the cross button on resource for Internet Gateway
		Then User delete the environment for Internet Gateway and see message environment deleted successfully
		 

@Sanity   
Scenario: To check the functionality of resource name link for Internet Gateway
#Test case no 9

		
		When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
		And User enter the resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click on IGW resource
		Then User click on resource name on rightsidebar
		Then User click cross button on pop up of resource name link	
		Then User delete the environment for Internet Gateway and see message environment deleted successfully
		 	

@Sanity   
Scenario: To check the functionality of cross close button of resource name link pop up for Internet Gateway
#Test case no 10
	
		
		When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
		And User enter the resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click on IGW resource
		Then User click on resource name on rightsidebar
		Then User click cross button on pop up of resource name link	
		Then User delete the environment for Internet Gateway and see message environment deleted successfully
		 
@Sanity  
Scenario: To check the functionality of close button of resource name link pop up for Internet Gateway
#Test case no 11

		
		When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
		And User enter the resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click on IGW resource
		Then User click on resource name on rightsidebar
		Then User click close button on pop up of resource name link	
		Then User delete the environment for Internet Gateway and see message environment deleted successfully
		 

@Sanity   
Scenario: To check the functionality of resource name as blank and save button on resource name link pop up for Internet Gateway
#Test case no 12

		
		When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
		And User enter the resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click on IGW resource
		Then User click on resource name on rightsidebar
		When User click the name text box to edit resource name " "
		When User click save button on pop up of resource name link
		Then User click close button on pop up of resource name link
		Then User delete the environment for Internet Gateway and see message environment deleted successfully
		 

@Sanity   
Scenario: To check the functionality of cross close button when resource is dragged for Internet Gateway
#Test case no 13

		
		When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
		And User enter the resource name for Internet Gateway
		Then User click on the cross close button when user drags the resource from resource section
		Then User delete the environment for Internet Gateway and see message environment deleted successfully
		 

@Sanity   
Scenario: To check the functionality of close button when resource is dragged for Internet Gateway
#Test case no 25

		
		When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
		And User enter the resource name for Internet Gateway
		Then User click on the close button when user drags the resource from resource section
		Then User delete the environment for Internet Gateway and see message environment deleted successfully
		 

@Sanity   
Scenario: To check the functionality of save button on dash board for Internet Gateway
#Test case no 14

		
		When User click VPC resource and drag on the dashboard for Internet Gateway
		And User enter VPC resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
		And User enter the resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click on IGW resource
		And User fill the vpc id attribute for Internet Gateway
		And User enter the depends on attribute for IAM group
		And User fill connection for Internet Gateway
		Then User should see message environment saved successfully
		Then User delete the environment for Internet Gateway and see message environment deleted successfully
		 

@Sanity	  
Scenario: To check the functionality deploy button for Internet Gateway
#Test case no 15

		
		When User click VPC resource and drag on the dashboard for Internet Gateway
		And User enter VPC resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
		And User enter the resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click on IGW resource
		And User fill the vpc id attribute for Internet Gateway
		And User enter the depends on attribute for IAM group
		And User fill connection for Internet Gateway
		Then User should see message environment saved successfully
        When User click on canvas
		Then User click deploy button and should see message environment deployed successfully
	    When User click on destroy button
	    Then User should see message environment destroyed sucessfully
	  	Then User delete the environment for Internet Gateway and see message environment deleted successfully
		 

@Sanity   
Scenario: To check the functionality of Resource Logs button after the successful deployment of the resource for Internet Gateway
#Test case no 16

		
		When User click VPC resource and drag on the dashboard for Internet Gateway
		And User enter VPC resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
		And User enter the resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click on IGW resource
		And User fill the vpc id attribute for Internet Gateway
		And User enter the depends on attribute for IAM group
		And User fill connection for Internet Gateway
		Then User should see message environment saved successfully
        When User click on canvas
		Then User click deploy button and should see message environment deployed successfully
		When User click on logs button on dash board
		Then User click on close button on logs window
	    When User click on destroy button
	    Then User should see message environment destroyed sucessfully
	  	Then User delete the environment for Internet Gateway and see message environment deleted successfully
		 

@Sanity  
Scenario: To check the functionality of close button at Resource Logs after deployment for Internet Gateway
#Test case no 17

		
		When User click VPC resource and drag on the dashboard for Internet Gateway
		And User enter VPC resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
		And User enter the resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click on IGW resource
		And User fill the vpc id attribute for Internet Gateway
		And User enter the depends on attribute for IAM group
		And User fill connection for Internet Gateway
		Then User should see message environment saved successfully
        When User click on canvas
		Then User click deploy button and should see message environment deployed successfully
		When User click on logs button on dash board
		Then User click on close button on logs window
	    When User click on destroy button
	    Then User should see message environment destroyed sucessfully
	  	Then User delete the environment for Internet Gateway and see message environment deleted successfully
		 

@Sanity  
Scenario: To check the functionality of refresh button at Resource Logs after deployment for Internet Gateway
#Test case no 18

		
		When User click VPC resource and drag on the dashboard for Internet Gateway
		And User enter VPC resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
		And User enter the resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click on IGW resource
		And User fill the vpc id attribute for Internet Gateway
		And User enter the depends on attribute for IAM group
		And User fill connection for Internet Gateway
		Then User should see message environment saved successfully
        When User click on canvas
		Then User click deploy button and should see message environment deployed successfully
		When User click on logs button on dash board
		Then User click on refresh button on logs window
		Then User click on close button on logs window
	    When User click on destroy button
	    Then User should see message environment destroyed sucessfully
	  	Then User delete the environment for Internet Gateway and see message environment deleted successfully
		
		 

@Sanity 
Scenario: To check the functionality of cross close button at Resource Logs after deployment for Internet Gateway
#Test case no 19

		
		When User click VPC resource and drag on the dashboard for Internet Gateway
		And User enter VPC resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
		And User enter the resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click on IGW resource
		And User fill the vpc id attribute for Internet Gateway
		And User enter the depends on attribute for IAM group
		And User fill connection for Internet Gateway
		Then User should see message environment saved successfully
        When User click on canvas
		Then User click deploy button and should see message environment deployed successfully
		When User click on logs button on dash board
		Then User click on cross close button on logs window
		When User click on destroy button
	    Then User should see message environment destroyed sucessfully
	  	Then User delete the environment for Internet Gateway and see message environment deleted successfully
		 


		 

@Sanity  
Scenario: To check the functionality of destroy don't destroy it button for Internet Gateway
#Test case no 21

		
		When User click VPC resource and drag on the dashboard for Internet Gateway
		And User enter VPC resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
		And User enter the resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click on IGW resource
		And User fill the vpc id attribute for Internet Gateway
		And User enter the depends on attribute for IAM group
		And User fill connection for Internet Gateway
		Then User should see message environment saved successfully
        When User click on canvas
		Then User click deploy button and should see message environment deployed successfully
		When User click on destroy button
	  	Then User click on dont destroy button
	  	When User click on destroy button
	    Then User should see message environment destroyed sucessfully
	  	Then User delete the environment for Internet Gateway and see message environment deleted successfully
		 


@Sanity   
Scenario: To check the functionality of Search bar on side bar under resource details if user wants to 
search for attributes after deployment of the resource for Internet Gateway
#Test case no 28

		
		When User click VPC resource and drag on the dashboard for Internet Gateway
		And User enter VPC resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
		And User enter the resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click on IGW resource
		And User fill the vpc id attribute for Internet Gateway
		And User enter the depends on attribute for IAM group
		And User fill connection for Internet Gateway
		Then User should see message environment saved successfully
		Then User click deploy button and should see message environment deployed successfully
		When User click on resource details link on the attribute section
		Then User search for attributes in the resource details "id"
		When User click on canvas
		When User click on destroy button
	    Then User should see message environment destroyed sucessfully
	  	Then User delete the environment for Internet Gateway and see message environment deleted successfully
		 

@Sanity 
Scenario: To check the functionality of Search bar on side bar under resource if user wants to search 
for attributes after deployment of the resource for Internet Gateway
#Test case no 29

		When User click VPC resource and drag on the dashboard for Internet Gateway
		And User enter VPC resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
		And User enter the resource name for Internet Gateway
		Then Message should display resource created successfully
		When User click on IGW resource
		And User fill the vpc id attribute for Internet Gateway
		And User enter the depends on attribute for IAM group
		And User fill connection for Internet Gateway
		Then User should see message environment saved successfully
		Then User click deploy button and should see message environment deployed successfully
		When User click on resource link on the attribute section
		Then User search for attributes in the resource section "Connection"
		When User click on canvas
		When User click on destroy button
	    Then User should see message environment destroyed sucessfully
	  	Then User delete the environment for Internet Gateway and see message environment deleted successfully
	
	
 
