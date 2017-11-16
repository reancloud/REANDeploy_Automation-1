@RegressionTest @ServercertificateAll
Feature:Test on AWS SSH IAM Server certificate Resource


Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	

@P1 
Scenario: To check the functionality of  Redeploy button

         
            Then User search or create environment for IAM server certificate and see message as environment created successfully
            When User click IAM server certificate resource and drag on the dashboard
            And User enter resource name for IAM server certificate resource
            Then Message should display resource created successfully
            When User click on IAM server certificate resource
            And User enter certificate body for IAM server certificate resource
            And User enter private key for IAM server certificate resource
            And User enter depends on for IAM server certificate resource
            And User enter connection for IAM server certificate resource
            And User enter name for IAM server certificate resource
            And User enter name prefix for IAM server certificate resource
            And User enter path for IAM server certificate resource
            Then User should see message environment saved successfully
            Then User click deploy button and should see message environment deployed successfully
            Then User click redeploy button and should see message environment deployed successfully
            When User click on destroy button
	        Then User should see message environment destroyed sucessfully
            Then User delete IAM server certificate environment and see message environment deleted sucessfully                      
@P3 
Scenario: Negative test case to check the functionality of AWS  IAM Server Certificate resource 

          
            Then User search or create environment for IAM server certificate and see message as environment created successfully
            When User click IAM server certificate resource and drag on the dashboard
            And User enter resource name for IAM server certificate resource
            Then Message should display resource created successfully
            When User click on IAM server certificate resource
            And User put all the values blank for IAM server certificate resource
            Then User should see message environment saved successfully
            Then User delete IAM server certificate environment and see message environment deleted sucessfully
 @P3        
Scenario: To check the functionality of create button if resource name is duplicate in IAM server certificate
#Test Case no:		 
           Then User search or create environment for IAM server certificate and see message as environment created successfully
            When User click IAM server certificate resource and drag on the dashboard
            And User enter resource name for IAM server certificate resource
            Then Message should display resource created successfully
            When User click IAM server certificate resource and drag on the dashboard
            And User enter resource name for IAM server certificate resource
            Then Message should display resource created successfully
            Then User delete IAM server certificate environment and see message environment deleted sucessfully
	                 
@P3 
Scenario:  To check the functionality of create button 

            Then User search or create environment for IAM server certificate and see message as environment created successfully
            When User click IAM server certificate resource and drag on the dashboard
            And User enter resource name for IAM server certificate resource
            Then Message should display resource created successfully
            Then User delete IAM server certificate environment and see message environment deleted sucessfully
           
@P3 
Scenario: To check the functionality of Save button for IAM Server certificate
          
            Then User search or create environment for IAM server certificate and see message as environment created successfully
            When User click IAM server certificate resource and drag on the dashboard
            And User enter resource name for IAM server certificate resource
            Then Message should display resource created successfully
            When User click on IAM server certificate resource
            And User enter certificate body for IAM server certificate resource
            And User enter private key for IAM server certificate resource
            And User enter depends on for IAM server certificate resource
            And User enter connection for IAM server certificate resource
            And User enter name for IAM server certificate resource
            And User enter name prefix for IAM server certificate resource
            And User enter path for IAM server certificate resource
            Then User should see message environment saved successfully
            Then User delete IAM server certificate environment and see message environment deleted sucessfully
            
@P3                 
Scenario: To check the functionality of please delete button if user clicks on cross button to delete resource

            Then User search or create environment for IAM server certificate and see message as environment created successfully
            When User click IAM server certificate resource and drag on the dashboard
            And User enter resource name for IAM server certificate resource
            Then Message should display resource created successfully
            When User click on canvas
            Then User delete IAM server certificate resource
            Then User delete IAM server certificate environment and see message environment deleted sucessfully
            
@P3                   
Scenario: To check the functionality of please don't delete button if user clicks on cross button to delete resource

            Then User search or create environment for IAM server certificate and see message as environment created successfully
            When User click IAM server certificate resource and drag on the dashboard
            And User enter resource name for IAM server certificate resource
            Then Message should display resource created successfully
            When User click on canvas
            Then User not delete IAM server certificate resource
            Then User delete IAM server certificate environment and see message environment deleted sucessfully
            
@P3 
Scenario: To check the functionality of resource name link

            Then User search or create environment for IAM server certificate and see message as environment created successfully
            When User click IAM server certificate resource and drag on the dashboard
            And User enter resource name for IAM server certificate resource
            Then Message should display resource created successfully
            When User click on IAM server certificate resource
            Then User click on resource name on rightsidebar
            Then User click close button on pop up of resource name link
            Then User delete IAM server certificate environment and see message environment deleted sucessfully
@P3 
Scenario: To check the functionality of Close button if user clicks on resource name link

            Then User search or create environment for IAM server certificate and see message as environment created successfully
            When User click IAM server certificate resource and drag on the dashboard
            And User enter resource name for IAM server certificate resource
            Then Message should display resource created successfully
            When User click on IAM server certificate resource
            Then User click on resource name on rightsidebar
            Then User click close button on pop up of resource name link
            Then User delete IAM server certificate environment and see message environment deleted sucessfully
            
@P3
Scenario: To check the functionality of Cross Close button if user clicks on resource name link

            Then User search or create environment for IAM server certificate and see message as environment created successfully
            When User click IAM server certificate resource and drag on the dashboard
            And User enter resource name for IAM server certificate resource
            Then Message should display resource created successfully
            When User click on IAM server certificate resource
            Then User click on resource name on rightsidebar
            Then User click cross button on pop up of resource name link
            Then User delete IAM server certificate environment and see message environment deleted sucessfully
            
@P2	          
Scenario: To check the functionality of save button if user edits resource name 

            Then User search or create environment for IAM server certificate and see message as environment created successfully
            When User click IAM server certificate resource and drag on the dashboard
            And User enter resource name for IAM server certificate resource
            Then Message should display resource created successfully
            When User click on IAM server certificate resource
	        Then User click on resource name on rightsidebar
            When User click the name text box to edit resource name "Connection"
            When User click save button on pop up of resource name link
	        Then User delete IAM server certificate environment and see message environment deleted sucessfully
	        
 @P3 	         
Scenario: To check the functionality of close button when user drags the resource

            Then User search or create environment for IAM server certificate and see message as environment created successfully
            When User click IAM server certificate resource and drag on the dashboard
            And User enter resource name for IAM server certificate resource
            Then User click on the close button when user drags the resource from resource section
            Then User delete IAM server certificate environment and see message environment deleted sucessfully

@P3	         
Scenario: To check the functionality of cross close button when user drags the resource

            Then User search or create environment for IAM server certificate and see message as environment created successfully
            When User click IAM server certificate resource and drag on the dashboard
            And User enter resource name for IAM server certificate resource
            Then User click on the cross close button when user drags the resource from resource section
            Then User delete IAM server certificate environment and see message environment deleted sucessfully 
@P3        
Scenario: To check the functionality Close button of Resource Logs button after the successful deployment of the resource	 
	       		 
	        Then User search or create environment for IAM server certificate and see message as environment created successfully
            When User click IAM server certificate resource and drag on the dashboard
            And User enter resource name for IAM server certificate resource
            Then Message should display resource created successfully
            When User click on IAM server certificate resource
            And User enter certificate body for IAM server certificate resource
            And User enter private key for IAM server certificate resource
            And User enter depends on for IAM server certificate resource
            And User enter connection for IAM server certificate resource
            And User enter name for IAM server certificate resource
            And User enter name prefix for IAM server certificate resource
            And User enter path for IAM server certificate resource
            Then User should see message environment saved successfully
            Then User click on deploy button and check deployment status
            When User click on canvas
            When User click on logs button on dash board
			And User click on close button on logs window
	        When User click on destroy button
			Then User should see message environment destroyed sucessfully
	        Then User delete IAM server certificate environment and see message environment deleted sucessfully
@P3  	
Scenario: To check the functionality Refresh button of Resource Logs button after the successful deployment of the resource	 
	       		 
	        Then User search or create environment for IAM server certificate and see message as environment created successfully
            When User click IAM server certificate resource and drag on the dashboard
            And User enter resource name for IAM server certificate resource
            Then Message should display resource created successfully
            When User click on IAM server certificate resource
            And User enter certificate body for IAM server certificate resource
            And User enter private key for IAM server certificate resource
            And User enter depends on for IAM server certificate resource
            And User enter connection for IAM server certificate resource
            And User enter name for IAM server certificate resource
            And User enter name prefix for IAM server certificate resource
            And User enter path for IAM server certificate resource
            Then User should see message environment saved successfully
            Then User click on deploy button and check deployment status
            When User click on canvas
            When User click on logs button on dash board
            And User click on refresh button on logs window
            And User click on close button on logs window
	        When User click on destroy button
			Then User should see message environment destroyed sucessfully
	        Then User delete IAM server certificate environment and see message environment deleted sucessfully
	                
@P3	         
Scenario: To check the functionality Cross Close button of Resource Logs button after the successful deployment of the resource

	        Then User search or create environment for IAM server certificate and see message as environment created successfully
            When User click IAM server certificate resource and drag on the dashboard
            And User enter resource name for IAM server certificate resource
            Then Message should display resource created successfully
            When User click on IAM server certificate resource
            And User enter certificate body for IAM server certificate resource
            And User enter private key for IAM server certificate resource
            And User enter depends on for IAM server certificate resource
            And User enter connection for IAM server certificate resource
            And User enter name for IAM server certificate resource
            And User enter name prefix for IAM server certificate resource
            And User enter path for IAM server certificate resource
            Then User should see message environment saved successfully
            Then User click on deploy button and check deployment status
	        When User click on canvas
            When User click on logs button on dash board
            And User click on cross close button on logs window
	        When User click on destroy button
			Then User should see message environment destroyed sucessfully
	        Then User delete IAM server certificate environment and see message environment deleted sucessfully
	        
	     
@P3 	     
Scenario: To check the functionality of  DONT DESTROY IT Button when user clicks on Destroy button for IAM Server certificate

            Then User search or create environment for IAM server certificate and see message as environment created successfully
            When User click IAM server certificate resource and drag on the dashboard
            And User enter resource name for IAM server certificate resource
            Then Message should display resource created successfully
            When User click on IAM server certificate resource
            And User enter certificate body for IAM server certificate resource
            And User enter private key for IAM server certificate resource
            And User enter depends on for IAM server certificate resource
            And User enter connection for IAM server certificate resource
            And User enter name for IAM server certificate resource
            And User enter name prefix for IAM server certificate resource
            And User enter path for IAM server certificate resource
            Then User should see message environment saved successfully
            Then User click on deploy button and check deployment status
            When User click on destroy button
            Then User click on dont destroy button
            When User click on destroy button
	        Then User should see message environment destroyed sucessfully
            Then User delete IAM server certificate environment and see message environment deleted sucessfully
            
@P3	      
Scenario: To check the functionality of Search bar if user wants to search for attributes after deployment under resource 

      	    Then User search or create environment for IAM server certificate and see message as environment created successfully
            When User click IAM server certificate resource and drag on the dashboard
            And User enter resource name for IAM server certificate resource
            Then Message should display resource created successfully
            When User click on IAM server certificate resource
            And User enter certificate body for IAM server certificate resource
            And User enter private key for IAM server certificate resource
            And User enter depends on for IAM server certificate resource
            And User enter connection for IAM server certificate resource
            And User enter name for IAM server certificate resource
            And User enter name prefix for IAM server certificate resource
            And User enter path for IAM server certificate resource
            Then User should see message environment saved successfully
            Then User click on deploy button and check deployment status
            When User click on resource link on the attribute section
            Then User search for attributes in the resource section "Connection"
	        When User click on destroy button
			Then User should see message environment destroyed sucessfully
	        Then User delete IAM server certificate environment and see message environment deleted sucessfully
	        

@P3	          
Scenario: To check the functionality of Search bar if user wants to search for attributes after deployment under resource detail 
	 
	        Then User search or create environment for IAM server certificate and see message as environment created successfully
            When User click IAM server certificate resource and drag on the dashboard
            And User enter resource name for IAM server certificate resource
            Then Message should display resource created successfully
            When User click on IAM server certificate resource
            And User enter certificate body for IAM server certificate resource
            And User enter private key for IAM server certificate resource
            And User enter depends on for IAM server certificate resource
            And User enter connection for IAM server certificate resource
            And User enter name for IAM server certificate resource
            And User enter name prefix for IAM server certificate resource
            And User enter path for IAM server certificate resource
            Then User should see message environment saved successfully
            Then User click on deploy button and check deployment status
	        When User click on resource details link on the attribute section
            Then User search for attributes in the resource details "id"
	        When User click on destroy button
			Then User should see message environment destroyed sucessfully
	        Then User delete IAM server certificate environment and see message environment deleted sucessfully
	                    
@P1  
Scenario: To check the functionality of  yes destroy button button

            Then User search or create environment for IAM server certificate and see message as environment created successfully
            When User click IAM server certificate resource and drag on the dashboard
            And User enter resource name for IAM server certificate resource
            Then Message should display resource created successfully
            When User click on IAM server certificate resource
            And User enter certificate body for IAM server certificate resource
            And User enter private key for IAM server certificate resource
            And User enter depends on for IAM server certificate resource
            And User enter connection for IAM server certificate resource
            And User enter name for IAM server certificate resource
            And User enter name prefix for IAM server certificate resource
            And User enter path for IAM server certificate resource
            Then User should see message environment saved successfully
            Then User click deploy button and should see message environment deployed successfully
            When User click on destroy button
	        Then User should see message environment destroyed sucessfully
            Then User delete IAM server certificate environment and see message environment deleted sucessfully                             

