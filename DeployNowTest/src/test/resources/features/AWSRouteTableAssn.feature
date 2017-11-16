@RegressionTest @RTAAll @Suite4 @RTA
Feature: Test on AWS SSH Route table Association Resource 

Background:
           Given User direct to deploy now application
		   When User log in
	       Then Login sucessfully should display
		   
@P1 @RTA         
Scenario: To check the functionality Redeploy buttonafter the successful deployment of the RTA resource
#Test Case no:19		 
	       		 
	         Then User search or create environment for RTA and see message as environment created successfully
		     Then User click on VPC resource and entered all the attribute values for Route table Association
		     Then User click on subnet resource and entered all the attribute values for Route table Association
		     Then User click on IGW resource and entered all the attribute values for RTA
		     Then User click on route table resource and entered all the attribute values for Route table Association 
		     Then User should see message environment saved successfully
	         When User click RTA resource and drag on the dashboard
             And User enter RTA resource name 
             Then Message should display resource created successfully
	         And User enter route table id on Route table Association
	         And User enter subnet id on Route table Association
	         And User select connection on Route table Association resource
	         Then User should see message environment saved successfully
	         When User click on canvas
	         Then User click deploy button and should see message environment deployed successfully
             Then User click redeploy button and should see message environment deployed successfully
	         When User click on destroy button
			 Then User should see message environment destroyed sucessfully
	         Then User delete RTA environment and see message environment deleted sucessfully
	         
@P1   
Scenario: To check the functionality of  YES DESTROY IT Button when user clicks onDestroy button  of the RTA resource
#Test Case no:21		 
	       		 
	         Then User search or create environment for RTA and see message as environment created successfully
		     Then User click on  VPC resource and entered all the attribute values for Route table Association
		     Then User click on subnet resource and entered all the attribute values for Route table Association
		     Then User click on IGW resource and entered all the attribute values for RTA
		     Then User click on  route table resource and entered all the attribute values for Route table Association
		     Then User should see message environment saved successfully
	         When User click RTA resource and drag on the dashboard
             And User enter RTA resource name 
             Then Message should display resource created successfully
	         And User enter route table id on Route table Association
	         And User enter subnet id on Route table Association
	         And User select connection on Route table Association resource
	         Then User should see message environment saved successfully
	         When User click on canvas
	         Then User click deploy button and should see message environment deployed successfully
	         When User click on destroy button
			 Then User should see message environment destroyed sucessfully
	         Then User delete RTA environment and see message environment deleted sucessfully
           
@P3		  
Scenario: Negative test case to check the functionality of Route table association
#Test Case no:02		 
	       		 
	         Then User search or create environment for RTA and see message as environment created successfully
	         Then User click on VPC resource and entered all the attribute values for Route table Association
		     Then User click on subnet resource and entered all the attribute values for Route table Association
		     Then User click on IGW resource and entered all the attribute values for RTA
		     Then User click on route table resource and entered all the attribute values for Route table Association
		     Then User should see message environment saved successfully
	         When User click RTA resource and drag on the dashboard
             And User enter RTA resource name 
             Then Message should display resource created successfully
             Then User enter blank attribute values under for RTA
             Then User should see message environment saved successfully
	         #Then User click deploy button and should see message environment deployed successfully
	         Then User delete RTA environment and see message environment deleted sucessfully
	         
@P2	        			  
Scenario: To check the functionality of delete button if user wants to delete Route table Association resource
#Test Case no:06
	          Then User search or create environment for RTA and see message as environment created successfully
	          When User click RTA resource and drag on the dashboard
              And User enter RTA resource name 
              Then Message should display resource created successfully
              When User click on canvas
	          Then User click on cross and click on please delete it button on Route table Association
	          Then User delete RTA environment and see message environment deleted sucessfully
@P3	         
Scenario: To check the functionality of please don't delete button if user clicks on cross button to delete on Route table Association resource
#Test Case no:07
	         Then User search or create environment for RTA and see message as environment created successfully
	         When User click RTA resource and drag on the dashboard
             And User enter RTA resource name 
             Then Message should display resource created successfully
	         Then User click on cross and click on please dont delete it button on Route table Association
	         Then User delete RTA environment and see message environment deleted sucessfully
@P3	      
Scenario: To check the functionality of create button if resource name is blank in Route table Association
#Test Case no:03
	         Then User search or create environment for RTA and see message as environment created successfully
	         When User click RTA resource and drag on the dashboard
	         Then User enter blank Route table Association resource name
	         Then Message should display resource created successfully
	         Then User delete RTA environment and see message environment deleted sucessfully
@P3	         
Scenario: To check the functionality of create button if resource name is duplicate in Route table Association
#Test Case no:04		 
	         Then User search or create environment for RTA and see message as environment created successfully
	         When User click RTA resource and drag on the dashboard
             And User enter RTA resource name 
            Then Message should display resource created successfully
	         When User click RTA resource and drag on the dashboard
             And User enter RTA resource name 
            Then Message should display resource created successfully
	         Then User delete RTA environment and see message environment deleted sucessfully
	         
@P2	          
Scenario: To check Add Route table Association to the Environment,fill all the Mandatory details and optional of resource and deploy
#Test Case no:14		 
	       		 
	         Then User search or create environment for RTA and see message as environment created successfully
		     Then User click on VPC resource and entered all the attribute values for Route table Association
		     Then User click on subnet resource and entered all the attribute values for Route table Association
		     Then User click on IGW resource and entered all the attribute values for RTA
		    Then User click on route table resource and entered all the attribute values for Route table Association
		     Then User should see message environment saved successfully
	         When User click RTA resource and drag on the dashboard
             And User enter RTA resource name 
             Then Message should display resource created successfully
	         And User enter route table id on Route table Association
	         And User enter subnet id on Route table Association
	         And User select connection on Route table Association resource
	         Then User should see message environment saved successfully
	         When User click on canvas
	        Then User click deploy button and should see message environment deployed successfully
	         When User click on destroy button
			 Then User should see message environment destroyed sucessfully
	         Then User delete RTA environment and see message environment deleted sucessfully
	         
@P2	   
Scenario: To check the functionality of save button from edits resource name in Route table Association
#Test Case no:05
             Then User search or create environment for RTA and see message as environment created successfully
	         When User click RTA resource and drag on the dashboard
             And User enter RTA resource name 
             Then Message should display resource created successfully
             When User click on RTA resource
	         Then User click on resource name on rightsidebar
	          Then User click close button on pop up of resource name link
	         Then User delete RTA environment and see message environment deleted sucessfully
    
 @P3          
Scenario: To check the functionality of  Close button if user clicks on resource name link in RTA
#Test Case no:09
			Then User search or create environment for RTA and see message as environment created successfully	
	         When User click RTA resource and drag on the dashboard
             And User enter RTA resource name 
             Then Message should display resource created successfully
             When User click on RTA resource
	         Then User click on resource name on rightsidebar
	          Then User click close button on pop up of resource name link
             Then User delete RTA environment and see message environment deleted sucessfully    
 @P3        
Scenario: To check the functionality of Cross Close button if user clicks on resource name link in RTA
#Test Case no:10
			Then User search or create environment for RTA and see message as environment created successfully	
	         When User click RTA resource and drag on the dashboard
             And User enter RTA resource name 
             Then Message should display resource created successfully
             When User click on RTA resource
	         Then User click on resource name on rightsidebar
	          Then User click close button on pop up of resource name link
             Then User delete RTA environment and see message environment deleted sucessfully  
@P3            
Scenario: To check the functionality of text box when clicks on resource name link and edits the name in Route table Association
#Test Case no:11
             Then User search or create environment for RTA and see message as environment created successfully
	         When User click RTA resource and drag on the dashboard
             And User enter RTA resource name 
             Then Message should display resource created successfully
             When User click on RTA resource
	         Then User click on resource name on rightsidebar
             When User click the name text box to edit resource name "Connection"
	         When User click save button on pop up of resource name link
	         Then User delete RTA environment and see message environment deleted sucessfully
	         
 @P3 	         
Scenario: To check the functionality of close button when user drags the for Route table Association 
#Test case no:28
            Then User search or create environment for RTA and see message as environment created successfully
	         When User click RTA resource and drag on the dashboard
             Then User click on the close button when user drags the resource from resource section
             Then User delete RTA environment and see message environment deleted sucessfully
             
 @P3          
Scenario: To check the functionality of cross close button when user drags thefor Route table Association 
#Test case no:12
            Then User search or create environment for RTA and see message as environment created successfully
	         When User click RTA resource and drag on the dashboard
            Then User click on the cross close button when user drags the resource from resource section
             Then User delete RTA environment and see message environment deleted sucessfully
 @P2            
Scenario: To check the functionality of save button on dashboard on RTA
#Test Case no:13	 
	       		 
	         Then User search or create environment for RTA and see message as environment created successfully
		     Then User click on  VPC resource and entered all the attribute values for Route table Association
		     Then User click on subnet resource and entered all the attribute values for Route table Association
		     Then User click on IGW resource and entered all the attribute values for RTA
		     Then User click on  route table resource and entered all the attribute values for Route table Association
		     Then User should see message environment saved successfully
	         When User click RTA resource and drag on the dashboard
             And User enter RTA resource name 
             Then Message should display resource created successfully
	         And User enter route table id on Route table Association
	         And User enter subnet id on Route table Association
	         And User select connection on Route table Association resource
	         Then User should see message environment saved successfully
	         Then User delete RTA environment and see message environment deleted sucessfully
	         
@P2	 @RTAtest        
Scenario: To check the functionality of  Resource Logs button after the successful deployment of the RTA resource
#Test Case no:15		 
	       		 
	         Then User search or create environment for RTA and see message as environment created successfully
		     Then User click on  VPC resource and entered all the attribute values for Route table Association
		     Then User click on subnet resource and entered all the attribute values for Route table Association
		     Then User click on IGW resource and entered all the attribute values for RTA
		     Then User click on  route table resource and entered all the attribute values for Route table Association
		     Then User should see message environment saved successfully
	         When User click RTA resource and drag on the dashboard
             And User enter RTA resource name 
             Then Message should display resource created successfully
	         And User enter route table id on Route table Association
	         And User enter subnet id on Route table Association
	         And User select connection on Route table Association resource
	         Then User should see message environment saved successfully
	        Then User click on deploy button and check deployment status
	         When User click on canvas
             When User click on logs button on dash board
             Then User click on close button on logs window
	         When User click on destroy button
			Then User should see message environment destroyed sucessfully
	         Then User delete RTA environment and see message environment deleted sucessfully
	         
@P3	          
Scenario: To check the functionality Close button of Resource Logs button after the successful deployment of the RTA resource
#Test Case no:16		 
	       	Then User search or create environment for RTA and see message as environment created successfully
		     Then User click on  VPC resource and entered all the attribute values for Route table Association
		     Then User click on subnet resource and entered all the attribute values for Route table Association
		     Then User click on IGW resource and entered all the attribute values for RTA
		     Then User click on  route table resource and entered all the attribute values for Route table Association
		     Then User should see message environment saved successfully
	         When User click RTA resource and drag on the dashboard
             And User enter RTA resource name 
             Then Message should display resource created successfully
	         And User enter route table id on Route table Association
	         And User enter subnet id on Route table Association
	         And User select connection on Route table Association resource
	         Then User should see message environment saved successfully
	         When User click on canvas
	         Then User click on deploy button and check deployment status
             When User click on logs button on dash board
             Then User click on close button on logs window
	         When User click on destroy button
			Then User should see message environment destroyed sucessfully
	         Then User delete RTA environment and see message environment deleted sucessfully
	         
@P3	       
Scenario: To check the functionality Refresh button of Resource Logs button after the successful deployment of the RTA resource
#Test Case no:17		 
	       		 
	         Then User search or create environment for RTA and see message as environment created successfully
		     Then User click on  VPC resource and entered all the attribute values for Route table Association
		     Then User click on subnet resource and entered all the attribute values for Route table Association
		     Then User click on IGW resource and entered all the attribute values for RTA
		     Then User click on  route table resource and entered all the attribute values for Route table Association
		     Then User should see message environment saved successfully
	         When User click RTA resource and drag on the dashboard
             And User enter RTA resource name 
            Then Message should display resource created successfully
	         And User enter route table id on Route table Association
	         And User enter subnet id on Route table Association
	         And User select connection on Route table Association resource
	         Then User should see message environment saved successfully
	         When User click on canvas
	         Then User click on deploy button and check deployment status
             When User click on logs button on dash board
             And User click on refresh button on logs window
             And User click on close button on logs window
	         When User click on destroy button
			 Then User should see message environment destroyed sucessfully
	         Then User delete RTA environment and see message environment deleted sucessfully
	         
@P3	           
Scenario: To check the functionality Cross Close button of Resource Logs button after the successful deployment of the RTA resource
#Test Case no:18		 
	       		 
	         Then User search or create environment for RTA and see message as environment created successfully
		     Then User click on  VPC resource and entered all the attribute values for Route table Association
		     Then User click on subnet resource and entered all the attribute values for Route table Association
		     Then User click on IGW resource and entered all the attribute values for RTA
		     Then User click on  route table resource and entered all the attribute values for Route table Association
		     Then User should see message environment saved successfully
	         When User click RTA resource and drag on the dashboard
             And User enter RTA resource name 
             Then Message should display resource created successfully
	         And User enter route table id on Route table Association
	         And User enter subnet id on Route table Association
	         And User select connection on Route table Association resource
	         Then User should see message environment saved successfully
	        Then User click on deploy button and check deployment status
	         When User click on canvas
             When User click on logs button on dash board
            And User click on cross close button on logs window
	         When User click on destroy button
			Then User should see message environment destroyed sucessfully
	         Then User delete RTA environment and see message environment deleted sucessfully
	         
@P3	        
Scenario: To check the functionality of  DONT DESTROY IT Button when user clicks onDestroy button  of the RTA resource
#Test Case no:20		 
	       		 
	         Then User search or create environment for RTA and see message as environment created successfully
		     Then User click on  VPC resource and entered all the attribute values for Route table Association
		     Then User click on subnet resource and entered all the attribute values for Route table Association
		     Then User click on IGW resource and entered all the attribute values for RTA
		     Then User click on  route table resource and entered all the attribute values for Route table Association
		     Then User should see message environment saved successfully
	         When User click RTA resource and drag on the dashboard
             And User enter RTA resource name 
            Then Message should display resource created successfully
	         And User enter route table id on Route table Association
	         And User enter subnet id on Route table Association
	         And User select connection on Route table Association resource
	         Then User should see message environment saved successfully
	        Then User click on deploy button and check deployment status
	         When User click on destroy button
	         Then User click on dont destroy button
	         When User click on destroy button
			Then User should see message environment destroyed sucessfully
	         Then User delete RTA environment and see message environment deleted sucessfully
	         
@P3	          
Scenario: To check the functionality of Search bar if user wants to search for attributes after deployment under resource on RTA
#Test Case no:24		 
	       		 
	         Then User search or create environment for RTA and see message as environment created successfully
		     Then User click on VPC resource and entered all the attribute values for Route table Association
		     Then User click on subnet resource and entered all the attribute values for Route table Association
		     Then User click on IGW resource and entered all the attribute values for RTA
		     Then User click on route table resource and entered all the attribute values for Route table Association
		     Then User should see message environment saved successfully
	         When User click RTA resource and drag on the dashboard
             And User enter RTA resource name 
            Then Message should display resource created successfully
	         And User enter route table id on Route table Association
	         And User enter subnet id on Route table Association
	         And User select connection on Route table Association resource
	         Then User should see message environment saved successfully
	        Then User click on deploy button and check deployment status
             When User click on resource link on the attribute section
            Then User search for attributes in the resource section "Connection"
	         When User click on destroy button
			Then User should see message environment destroyed sucessfully
	         Then User delete RTA environment and see message environment deleted sucessfully
	         
@P3	        
Scenario: To check the functionality of Search bar if user wants to search for attributes after deployment under resource detail on RTA
#Test Case no:25		 
	       		 
	         Then User search or create environment for RTA and see message as environment created successfully
		     Then User click on VPC resource and entered all the attribute values for Route table Association
		     Then User click on subnet resource and entered all the attribute values for Route table Association
		     Then User click on IGW resource and entered all the attribute values for RTA
		     Then User click on route table resource and entered all the attribute values for Route table Association
		     Then User should see message environment saved successfully
	         When User click RTA resource and drag on the dashboard
             And User enter RTA resource name 
            Then Message should display resource created successfully
	         And User enter route table id on Route table Association
	         And User enter subnet id on Route table Association
	         And User select connection on Route table Association resource
	         Then User should see message environment saved successfully
	        Then User click on deploy button and check deployment status
             When User click on resource details link on the attribute section
		     Then User search for attributes in the resource details "id"
	         When User click on destroy button
			Then User should see message environment destroyed sucessfully
	         Then User delete RTA environment and see message environment deleted sucessfully
