@RegressionTest @RoutezoneAll @Suite4
Feature: Test on AWS SSH Route 53 Zone Resource 

Background:
         Given User direct to deploy now application
	 	   When User log in
	       Then Login sucessfully should display
           
@P1                                 
Scenario: To check the functionality of  YES DESTROY IT Button when user clicks on Destroy button for Route zone 
#Test Case no:21
             Then User search or create environment for Route zone and see message as environment created successfully
		     Then User click on VPC resource and entered all the attribute values for Route zone
	         When User click Route zone resource and drag on the dashboard
             And User enter Route zone resource name 
             Then Message should display resource created successfully
	         And User enter name for Route zone resource
	         And User enter depends on for Route zone resource
	         And User select connection for Route zone resource
	         And User enter comments for Route zone resource
	         And User enter delegation set id on for Route zone resource
	         And User enter tags for Route zone resource
	         And User enter vpc id for Route zone resource
	         And User enter vpc region for Route zone resource
	         Then User should see message environment saved successfully
	         When User click on canvas
	         Then User click deploy button and should see message environment deployed successfully
	         When User click on destroy button
			 Then User should see message environment destroyed sucessfully
             Then User delete Route Zone environment and see message environment deleted sucessfully
	    
	     
@P1   
Scenario: To check the functionality of Redeploy button for Route zone 
#Test Case no:19
             Then User search or create environment for Route zone and see message as environment created successfully
            
		     Then User click on VPC resource and entered all the attribute values for Route zone
	         When User click Route zone resource and drag on the dashboard
             And User enter Route zone resource name
             Then Message should display resource created successfully  
             #When User click on Route zone resource
	    	 And User enter name for Route zone resource
	     	 And User select connection for Route zone resource
	      	 And User enter vpc id for Route zone resource
	        Then User should see message environment saved successfully
	        When User click on canvas
	        Then User click deploy button and should see message environment deployed successfully
	        Then User click redeploy button and should see message environment deployed successfully
	        When User click on destroy button
			Then User should see message environment destroyed sucessfully
             Then User delete Route Zone environment and see message environment deleted sucessfully
	     
 @P3 
Scenario: To check the functionality of save and deploy button if vpc id is not valid for Route zone
#Test Case no:2
             Then User search or create environment for Route zone and see message as environment created successfully       
		     Then User click on VPC resource and entered all the attribute values for Route zone
	         When User click Route zone resource and drag on the dashboard
             And User enter Route zone resource name
             Then Message should display resource created successfully
	         And User enter name for Route zone resource
	         And User select connection for Route zone resource
	         Then User enter invalid vpc id for Route zone resource
	         Then User should see message environment saved successfully
	         When User click on canvas
	         Then User click on deploy button and check deployment status
	         When User click on destroy button
	 		 Then User should see message environment destroyed sucessfully
             Then User delete Route Zone environment and see message environment deleted sucessfully
 @P3                  
Scenario: To check the functionality of create button if resource name is blank for Route53 zone
#Test Case no:03
	         Then User search or create environment for Route zone and see message as environment created successfully
	         When User click Route zone resource and drag on the dashboard
	         Then User enter blank Route zone resource name
	         Then Message should display resource created successfully
	         Then User delete Route Zone environment and see message environment deleted sucessfully
@P3   	        
Scenario: To check the functionality of create button if resource name is duplicate for Route53 zone
#Test Case no:04
             Then User search or create environment for Route zone and see message as environment created successfully		 
	         When User click Route zone resource and drag on the dashboard
             And User enter Route zone resource name
             Then Message should display resource created successfully
             When User click Route zone resource and drag on the dashboard
             And User enter Route zone resource name
             Then Message should display resource created successfully
	         Then User delete Route Zone environment and see message environment deleted sucessfully
	         
@P3	         
 Scenario: To check the functionality of save button fuctionality when edit the resource name  for Route53 zone resource
#Test Case no:05
             Then User search or create environment for Route zone and see message as environment created successfully
	         When User click Route zone resource and drag on the dashboard
             And User enter Route zone resource name
             Then Message should display resource created successfully 
             When User click on Route zone resource
	         Then User click on resource name on rightsidebar
             When User click save button on pop up of resource name link
             Then User delete Route Zone environment and see message environment deleted sucessfully 
@P2                    
Scenario: To check the functionality of delete button if user wants to delete for Route53 zone resource
#Test Case no:06
	         Then User search or create environment for Route zone and see message as environment created successfully 
	         When User click Route zone resource and drag on the dashboard
             And User enter Route zone resource name
              Then Message should display resource created successfully
              When User click on canvas 
	          Then User click on cross and click on please delete it button for Route zone 
	          Then User delete Route Zone environment and see message environment deleted sucessfully
@P3	          
Scenario: To check the functionality of please don't delete button if user clicks on cross button to delete for Route53 zone resource
#Test Case no:07
             Then User search or create environment for Route zone and see message as environment created successfully      
	         When User click Route zone resource and drag on the dashboard
             And User enter Route zone resource name
              Then Message should display resource created successfully
              When User click on canvas  
	          Then User click on cross and click on please dont delete it button for Route zone
	         Then User delete Route Zone environment and see message environment deleted sucessfully
@P3	 	        
Scenario: To check the functionality of Resource name link on right sidebar for Route53 zone resource
#Test Case no:08
             Then User search or create environment for Route zone and see message as environment created successfully
	         When User click Route zone resource and drag on the dashboard
             And User enter Route zone resource name
             Then Message should display resource created successfully
             When User click on Route zone resource
	         Then User click on resource name on rightsidebar
	         Then User click close button on pop up of resource name link
             Then User delete Route Zone environment and see message environment deleted sucessfully
@P3           
Scenario: To check the functionality of Cross Close button if user clicks on resource name link for Route53 zone resource
#Test Case no:09
             Then User search or create environment for Route zone and see message as environment created successfully
	         When User click Route zone resource and drag on the dashboard
             And User enter Route zone resource name
             Then Message should display resource created successfully
             When User click on Route zone resource
	         Then User click on resource name on rightsidebar
	         Then User click cross button on pop up of resource name link
             Then User delete Route Zone environment and see message environment deleted sucessfully
@P3 	             
Scenario: To check the functionality of Close button if user clicks on resource name link for Route53 zone resource
#Test Case no:10
             Then User search or create environment for Route zone and see message as environment created successfully
	         When User click Route zone resource and drag on the dashboard
             And User enter Route zone resource name
             Then Message should display resource created successfully 
             When User click on Route zone resource
	         Then User click on resource name on rightsidebar
	         Then User click close button on pop up of resource name link
             Then User delete Route Zone environment and see message environment deleted sucessfully
 @P3 	          
Scenario: To check the functionality of Cross Close button if user drag the resource for Route53 zone resource
#Test Case no:11
             Then User search or create environment for Route zone and see message as environment created successfully
	         When User click Route zone resource and drag on the dashboard
             Then User click on the cross close button when user drags the resource from resource section
             Then User delete Route Zone environment and see message environment deleted sucessfully
             
 @P3           
Scenario: To check the functionality of Close button if user drag the resource for Route53 zone resource
#Test Case no:12
             Then User search or create environment for Route zone and see message as environment created successfully    
	         When User click Route zone resource and drag on the dashboard
             Then User click on the close button when user drags the resource from resource section
             Then User delete Route Zone environment and see message environment deleted sucessfully
 @P3 
 Scenario: Negative test case to check the functionality for Route53 zone resource
#Test Case no:13
             Then User search or create environment for Route zone and see message as environment created successfully           
		     Then User click on VPC resource and entered all the attribute values for Route zone
	         When User click Route zone resource and drag on the dashboard
             And User enter Route zone resource name
             Then Message should display resource created successfully  
	         And User enter blank name for Route zone resource
	         Then User should see message environment saved successfully
	         #Then User click deploy button and should see message environment deployed successfully
             Then User delete Route Zone environment and see message environment deleted sucessfully
 @P3                      
Scenario: To check the functionality of save button if Resource name  is passed blank in edit popup for Route53 zone resource
#Test Case no:14
             Then User search or create environment for Route zone and see message as environment created successfully
	         When User click Route zone resource and drag on the dashboard
             And User enter Route zone resource name
             Then Message should display resource created successfully
             When User click on Route zone resource
	         Then User click on resource name on rightsidebar
	         When User click the name text box to edit resource name " "
	         When User click save button on pop up of resource name link
	         Then User click close button on pop up of resource name link
             Then User delete Route Zone environment and see message environment deleted sucessfully

@P2             
Scenario: To check the functionality of  Resource Logs button after the successful deployment of the resource for Route zone 
#Test Case no:15
             Then User search or create environment for Route zone and see message as environment created successfully
		     Then User click on VPC resource and entered all the attribute values for Route zone
	         When User click Route zone resource and drag on the dashboard
             And User enter Route zone resource name
             Then Message should display resource created successfully
	         And User enter name for Route zone resource
	         And User select connection for Route zone resource
	          And User enter vpc id for Route zone resource
	         And User enter vpc region for Route zone resource
	         Then User should see message environment saved successfully
	         Then User click on deploy button and check deployment status
	         When User click on canvas
	         When User click on logs button on dash board
			And User click on close button on logs window
	         When User click on destroy button
			 Then User should see message environment destroyed sucessfully
             Then User delete Route Zone environment and see message environment deleted sucessfully

@P3             
Scenario: To check the functionality of  Close button when user clicks on resource logs button for Route zone 
#Test Case no:16
             Then User search or create environment for Route zone and see message as environment created successfully
		     Then User click on VPC resource and entered all the attribute values for Route zone
	         When User click Route zone resource and drag on the dashboard
             And User enter Route zone resource name
             Then Message should display resource created successfully
	         And User enter name for Route zone resource
	         And User select connection for Route zone resource
	          And User enter vpc id for Route zone resource
	         And User enter vpc region for Route zone resource
	         Then User should see message environment saved successfully
	         Then User click on deploy button and check deployment status
	         When User click on canvas
	         When User click on logs button on dash board
			And User click on close button on logs window
	         When User click on destroy button
			 Then User should see message environment destroyed sucessfully
             Then User delete Route Zone environment and see message environment deleted sucessfully
             
@P3             
Scenario: To check the functionality of  Cross Close button when user clicks on resource logs button for Route zone 
#Test Case no:17
             Then User search or create environment for Route zone and see message as environment created successfully       
		     Then User click on VPC resource and entered all the attribute values for Route zone
	         When User click Route zone resource and drag on the dashboard
             And User enter Route zone resource name
             Then Message should display resource created successfully
	         And User enter name for Route zone resource
	         And User select connection for Route zone resource
	          And User enter vpc id for Route zone resource
	         And User enter vpc region for Route zone resource
	         Then User should see message environment saved successfully
	         Then User click on deploy button and check deployment status
	         When User click on canvas
	        When User click on logs button on dash board
			And User click on cross close button on logs window
	         When User click on destroy button
			 Then User should see message environment destroyed sucessfully
             Then User delete Route Zone environment and see message environment deleted sucessfully
             
@P3              
Scenario: To check the functionality of  Refresh button when user clicks on resource logs button for Route zone 
#Test Case no:18
             Then User search or create environment for Route zone and see message as environment created successfully    
		     Then User click on VPC resource and entered all the attribute values for Route zone
	         When User click Route zone resource and drag on the dashboard
             And User enter Route zone resource name
             Then Message should display resource created successfully
	         And User enter name for Route zone resource
	         And User select connection for Route zone resource
	          And User enter vpc id for Route zone resource
	         And User enter vpc region for Route zone resource
	         Then User should see message environment saved successfully
	        Then User click on deploy button and check deployment status
	         When User click on canvas
	         When User click on logs button on dash board
             And User click on refresh button on logs window
             And User click on close button on logs window
	         When User click on destroy button
			 Then User should see message environment destroyed sucessfully
             Then User delete Route Zone environment and see message environment deleted sucessfully
 
@P3                             
Scenario: To check the functionality of  DONT DESTROY IT Button when user clicks on Destroy button for Route zone 
#Test Case no:20
             Then User search or create environment for Route zone and see message as environment created successfully
		     Then User click on VPC resource and entered all the attribute values for Route zone
	         When User click Route zone resource and drag on the dashboard
             And User enter Route zone resource name
             Then Message should display resource created successfully
	         And User enter name for Route zone resource
	         And User select connection for Route zone resource
	          And User enter vpc id for Route zone resource
	         And User enter vpc region for Route zone resource
	         Then User should see message environment saved successfully
	         Then User click on deploy button and check deployment status
	         When User click on canvas
	        When User click on destroy button
			 Then User click on dont destroy button
	         When User click on destroy button
	         Then User should see message environment destroyed sucessfully
             Then User delete Route Zone environment and see message environment deleted sucessfully

             
@P2          
Scenario: Add  Route53 zone   & Vpc to the  Environment,fill all the details of resource and deploy
#Test Case no:22
             Then User search or create environment for Route zone and see message as environment created successfully           
		     Then User click on VPC resource and entered all the attribute values for Route zone
	         When User click Route zone resource and drag on the dashboard
             And User enter Route zone resource name
             Then Message should display resource created successfully
	         And User enter name for Route zone resource
	         And User select connection for Route zone resource
	          And User enter vpc id for Route zone resource
	         And User enter vpc region for Route zone resource
	         Then User should see message environment saved successfully
	        Then User click deploy button and should see message environment deployed successfully
	        When User click on destroy button
			Then User should see message environment destroyed sucessfully
             Then User delete Route Zone environment and see message environment deleted sucessfully
@P2        
Scenario: To check the functionality of save button on dashboard for Route zone
#Test Case no:23
             Then User search or create environment for Route zone and see message as environment created successfully
		     Then User click on VPC resource and entered all the attribute values for Route zone
	         When User click Route zone resource and drag on the dashboard
             And User enter Route zone resource name
             Then Message should display resource created successfully
	         And User enter name for Route zone resource
	         And User select connection for Route zone resource
	          And User enter vpc id for Route zone resource
	         And User enter vpc region for Route zone resource
	         Then User should see message environment saved successfully
             Then User delete Route Zone environment and see message environment deleted sucessfully
@P3     
 Scenario: To check the functionality of Search bar if user wants to search for attributes after deployment under resource detail for Route zone
#Test Case no:24		 

             Then User search or create environment for Route zone and see message as environment created successfully      
		     Then User click on VPC resource and entered all the attribute values for Route zone
	         When User click Route zone resource and drag on the dashboard
             And User enter Route zone resource name
             Then Message should display resource created successfully
	         And User enter name for Route zone resource
	         And User select connection for Route zone resource
	          And User enter vpc id for Route zone resource
	         And User enter vpc region for Route zone resource
	         Then User should see message environment saved successfully
	        Then User click on deploy button and check deployment status
	         #When User click on Route zone resource
             And User click on resource details link on the attribute section
		     Then User search for attributes in the resource details "id"
	         When User click on destroy button
			 Then User should see message environment destroyed sucessfully
	          Then User delete Route Zone environment and see message environment deleted sucessfully 
	          
 @P3    
Scenario: To check the functionality of Search bar if user wants to search for attributes after deployment under resource for Route zone
#Test Case no:25		 

            Then User search or create environment for Route zone and see message as environment created successfully
		     Then User click on VPC resource and entered all the attribute values for Route zone
	         When User click Route zone resource and drag on the dashboard
             And User enter Route zone resource name
             Then Message should display resource created successfully 
             #When User click on Route zone resource
	         And User enter name for Route zone resource
	         And User select connection for Route zone resource
	          And User enter vpc id for Route zone resource
	         And User enter vpc region for Route zone resource
	         Then User should see message environment saved successfully
	        Then User click on deploy button and check deployment status
	        # When User click on Route zone resource
             And User click on resource link on the attribute section
		    Then User search for attributes in the resource section "Connection" 
	         When User click on destroy button
			 Then User should see message environment destroyed sucessfully
	          Then User delete Route Zone environment and see message environment deleted sucessfully 
      
	
