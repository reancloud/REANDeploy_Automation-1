@RegressionTest @Suite1
Feature: Test on AWS SSH Subnet Resource


Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
       
            
             
@P1 
Scenario: To check the functionality of  YES DESTROY IT Button when user clicks on Destroy button
#Test case no:1
          
            Then User search or create environment for Subnet and see message as environment created successfully
            When User click Subnet resource and drag on the dashboard
            And User enter Subnet resource name
            Then Message should display resource created successfully
            When User click on Subnet resource
            Then User entered all attributes values under resource
            Then User should see message environment saved successfully
            When User click VPC resource and drag on the dashboard
            And User enter vpc resource name for subnet
            Then Message should display resource created successfully
            And User enter cidr_block range for subnet
            Then User should see message environment saved successfully
            When User click on canvas
            Then User click deploy button and should see message environment deployed successfully
            And User double refresh the page
            When User click on destroy button
	        Then User should see message environment destroyed sucessfully
	        Then User delete subnet environment and see message environment deleted sucessfully
            
 @P1 @TC_2  
Scenario: To check the functionality of  Redeploy button
#Test case no:2
         
            Then User search or create environment for Subnet and see message as environment created successfully
            When User click Subnet resource and drag on the dashboard
            And User enter Subnet resource name
            Then Message should display resource created successfully
            When User click on Subnet resource
            Then User entered all attributes values under resource
            Then User should see message environment saved successfully
            When User click VPC resource and drag on the dashboard
            And User enter vpc resource name for subnet
            Then Message should display resource created successfully
            And User enter cidr_block range for subnet
            Then User should see message environment saved successfully
            When User click on canvas
            Then User click deploy button and should see message environment deployed successfully
            Then User click redeploy button and should see message environment deployed successfully
            And User double refresh the page
            When User click on destroy button
	        Then User should see message environment destroyed sucessfully
	        Then User delete subnet environment and see message environment deleted sucessfully
     
@P3 @TC_2         
Scenario: Negative Test case to check the functionality of save Button and deploy without providing the mandatory fields for Subnet
#Test case no:3
            Then User search or create environment for Subnet and see message as environment created successfully
	           When User click Subnet resource and drag on the dashboard
               And User enter Subnet resource name
               Then Message should display resource created successfully
               When User click on Subnet resource
               Then User entered blank attributes values under resource
               Then User should see message environment saved successfully
	           When User click VPC resource and drag on the dashboard
	           And User enter vpc resource name for subnet
	           Then Message should display resource created successfully
	           #When User click on Vpc resource for subnet
	           And User enter cidr_block range for subnet
               Then User should see message environment saved successfully
              #Then User click deploy button and should see message environment deployed successfully
               Then User delete subnet environment and see message environment deleted sucessfully
              
@P3 @TC_1      
Scenario: Negative Test case to check the functionality of save and deploy button if subnet cidr is not within the range of vpc cidr
#Test case no:4
            Then User search or create environment for Subnet and see message as environment created successfully
            When User click Subnet resource and drag on the dashboard
             And User enter Subnet resource name
              Then Message should display resource created successfully
             When User click on Subnet resource
             Then User entered cidr block attribute values not in range under resource
             Then User should see message environment saved successfully
             When User click VPC resource and drag on the dashboard
             And User enter vpc resource name for subnet
             Then Message should display resource created successfully
             And User enter cidr_block range for subnet
             Then User should see message environment saved successfully
             Then User click on deploy button and check deployment status
             When User click on destroy button
             Then User should see message environment destroyed sucessfully
             Then User delete subnet environment and see message environment deleted sucessfully
 @P3 @TC_2          
Scenario: To check the functionality of save and deploy button if vpc id is not valid
#Test case no:5
             Then User search or create environment for Subnet and see message as environment created successfully
             When User click Subnet resource and drag on the dashboard
             And User enter Subnet resource name
             Then Message should display resource created successfully
             When User click on Subnet resource
             Then User entered invalid vpcid attribute values under resource
             When User click VPC resource and drag on the dashboard
             And User enter vpc resource name for subnet
             Then Message should display resource created successfully
             And User enter cidr_block range for subnet
             Then User should see message environment saved successfully
             Then User click on deploy button and check deployment status
             When User click on destroy button
             Then User should see message environment destroyed sucessfully
             Then User delete subnet environment and see message environment deleted sucessfully
            

@P3 @TC_2   
Scenario: To check the functionality of create button if resource name empty
#Test case no:6
               Then User search or create environment for Subnet and see message as environment created successfully
	           When User click Subnet resource and drag on the dashboard
               Then User enter blank resource name
               Then Message should display resource created successfully
               Then User delete subnet environment and see message environment deleted sucessfully
             
@P3  @TC_2     
Scenario: To check the functionality of create button if resource name is duplicate
#Test case no:7
               Then User search or create environment for Subnet and see message as environment created successfully
               When User click Subnet resource and drag on the dashboard
               And User enter Subnet resource name
               Then Message should display resource created successfully
               When User click Subnet resource and drag on the dashboard
               And User enter Subnet resource name
               Then Message should display resource created successfully
               Then User delete subnet environment and see message environment deleted sucessfully
 
             
@P2  @TC_2          
Scenario: To check the functionality of save button if user edits resource name
#Test case no:8
               Then User search or create environment for Subnet and see message as environment created successfully
               When User click Subnet resource and drag on the dashboard
               And User enter Subnet resource name
               Then Message should display resource created successfully
               When User click on Subnet resource
               Then User click on resource name on rightsidebar
               When User click save button on pop up of resource name link
               Then User delete subnet environment and see message environment deleted sucessfully
                           
@P2 @TC_2   
Scenario: To check the delete button functionality if user wants to delete resource
#Test case no:9
                Then User search or create environment for Subnet and see message as environment created successfully
	             When User click Subnet resource and drag on the dashboard
	             And User enter Subnet resource name
	             Then Message should display resource created successfully
	             When User click on canvas
                 Then User delete subnet resource
                 Then User delete subnet environment and see message environment deleted sucessfully
             
@P3   @TC_2                 
Scenario: To check the functionality of please don't delete button if user clicks on cross button to delete resource
#Test case no:10
                 Then User search or create environment for Subnet and see message as environment created successfully
	             When User click Subnet resource and drag on the dashboard
	             And User enter Subnet resource name
	             Then Message should display resource created successfully
	             When User click on canvas
                 Then User please don't delete subnet resource button
                 Then User delete subnet environment and see message environment deleted sucessfully
             

              
@P3 @TC_2 
Scenario: To check the functionality of Close button if user clicks on resource name link
#Test case no:11
              Then User search or create environment for Subnet and see message as environment created successfully
               When User click Subnet resource and drag on the dashboard
               And User enter Subnet resource name
               Then Message should display resource created successfully
               When User click on Subnet resource
               Then User click on resource name on rightsidebar
               Then User click close button on pop up of resource name link
               Then User delete subnet environment and see message environment deleted sucessfully
             
@P3  @TC_2    
Scenario: To check the functionality of Cross Close button if user clicks on resource name link
#Test case no:12
	           Then User search or create environment for Subnet and see message as environment created successfully
	           When User click Subnet resource and drag on the dashboard
	           And User enter Subnet resource name
	           Then Message should display resource created successfully
	           When User click on Subnet resource
	           Then User click on resource name on rightsidebar
	           Then User click cross button on pop up of resource name link
	          Then User delete subnet environment and see message environment deleted sucessfully
	     
@P3  @TC_2          
Scenario: To check the functionality of  crossclose button when user drags the resource from resource section
#Test case no:12
               Then User search or create environment for Subnet and see message as environment created successfully
               When User click Subnet resource and drag on the dashboard
               And User enter Subnet resource name
               Then User click on the cross close button when user drags the resource from resource section
               Then User delete subnet environment and see message environment deleted sucessfully
              	           
@P3 @TC_2         
Scenario: To check the functionality of  close button when user drags the resource from resource section
#Test case no:13
              Then User search or create environment for Subnet and see message as environment created successfully
               When User click Subnet resource and drag on the dashboard
               And User enter Subnet resource name
               Then User click on the close button when user drags the resource from resource section
               Then User delete subnet environment and see message environment deleted sucessfully

@P3 @TC_2  
Scenario: To check the functionality of text box when clicks on resource name link and edits the name
#Test case no:14
               Then User search or create environment for Subnet and see message as environment created successfully
               When User click Subnet resource and drag on the dashboard
               And User enter Subnet resource name
               Then Message should display resource created successfully
               When User click on Subnet resource
               Then User click on resource name on rightsidebar
               When User click the name text box to edit resource name "tsubnet"
               When User click save button on pop up of resource name link
               Then User delete subnet environment and see message environment deleted sucessfully
@P2  @TC_2    
Scenario: To check the functionality of  Resource Logs button after the successful deployment of the resource
#Test case no:15
           Then User search or create environment for Subnet and see message as environment created successfully
           When User click Subnet resource and drag on the dashboard
           And User enter Subnet resource name
           Then Message should display resource created successfully
           When User click on Subnet resource
            Then User entered all attributes values under resource
            Then User should see message environment saved successfully
            When User click VPC resource and drag on the dashboard
           And User enter vpc resource name for subnet
             Then Message should display resource created successfully
            And User enter cidr_block range for subnet  
            Then User should see message environment saved successfully
            Then User click deploy button and should see message environment deployed successfully
             When User click on canvas
            When User click on logs button on dash board
			And User click on close button on logs window
              When User click on destroy button
             Then User should see message environment destroyed sucessfully
             Then User delete subnet environment and see message environment deleted sucessfully	     
 
 @P3  @TC_2     
Scenario: To check the functionality of  Close button when user clicks on resource logs button
#Test case no:16
         
            Then User search or create environment for Subnet and see message as environment created successfully
            When User click Subnet resource and drag on the dashboard
            And User enter Subnet resource name
             Then Message should display resource created successfully
            When User click on Subnet resource
            Then User entered all attributes values under resource
            Then User should see message environment saved successfully
            When User click VPC resource and drag on the dashboard
           And User enter vpc resource name for subnet
            Then Message should display resource created successfully
            And User enter cidr_block range for subnet          
            Then User should see message environment saved successfully
            Then User click deploy button and should see message environment deployed successfully
             When User click on canvas
            When User click on logs button on dash board
            And User click on close button on logs window
             When User click on destroy button
             Then User should see message environment destroyed sucessfully
             Then User delete subnet environment and see message environment deleted sucessfully
@P3  @TC_2        
Scenario: To check the functionality of  Refresh button when user clicks on resource logs Link
#Test case no:17
         
            Then User search or create environment for Subnet and see message as environment created successfully
            When User click Subnet resource and drag on the dashboard
            And User enter Subnet resource name
            Then Message should display resource created successfully
            When User click on Subnet resource
            Then User entered all attributes values under resource
            Then User should see message environment saved successfully
            When User click VPC resource and drag on the dashboard
            And User enter vpc resource name for subnet
            Then Message should display resource created successfully
            And User enter cidr_block range for subnet         
            Then User should see message environment saved successfully
             Then User click deploy button and should see message environment deployed successfully
             When User click on canvas
            When User click on logs button on dash board
            And User click on refresh button on logs window
            And User click on close button on logs window
             When User click on destroy button
             Then User should see message environment destroyed sucessfully
             Then User delete subnet environment and see message environment deleted sucessfully
            
@P3  @TC_2       
Scenario: To check the functionality of  crossclose button when user clicks on resource logs Link
#Test case no:18
         
           Then User search or create environment for Subnet and see message as environment created successfully
            When User click Subnet resource and drag on the dashboard
            And User enter Subnet resource name
             Then Message should display resource created successfully
            When User click on Subnet resource
            Then User entered all attributes values under resource
            Then User should see message environment saved successfully
            When User click VPC resource and drag on the dashboard
           And User enter vpc resource name for subnet
             Then Message should display resource created successfully
            And User enter cidr_block range for subnet  
            Then User should see message environment saved successfully
             Then User click deploy button and should see message environment deployed successfully
             When User click on canvas
            When User click on logs button on dash board
            And User click on cross close button on logs window
             When User click on destroy button
             Then User should see message environment destroyed sucessfully
             Then User delete subnet environment and see message environment deleted sucessfully        
            
@P3  @TC_2     
Scenario: To check the functionality of  DONT DESTROY IT Button when user clicks on Destroy button
#Test case no:19
          
            Then User search or create environment for Subnet and see message as environment created successfully
            When User click Subnet resource and drag on the dashboard
            And User enter Subnet resource name
             Then Message should display resource created successfully
            When User click on Subnet resource
            Then User entered all attributes values under resource
            When User click VPC resource and drag on the dashboard
            And User enter vpc resource name for subnet
             Then Message should display resource created successfully
            And User enter cidr_block range for subnet            
            Then User should see message environment saved successfully
            When User click on canvas
            Then User click deploy button and should see message environment deployed successfully
            And User click on destroy button
	        Then User click on dont destroy button
	         When User click on destroy button
	         Then User should see message environment destroyed sucessfully
             Then User delete subnet environment and see message environment deleted sucessfully  

@P2 @TC_2        
Scenario: To check AWS Subnet resource can be added to the environment
#Test case no:20
            Then User search or create environment for Subnet and see message as environment created successfully
            When User click Subnet resource and drag on the dashboard
            And User enter Subnet resource name
             Then Message should display resource created successfully
            When User click on Subnet resource
            Then User entered all attributes values under resource
            Then User should see message environment saved successfully
            When User click VPC resource and drag on the dashboard
           And User enter vpc resource name for subnet
            Then Message should display resource created successfully
            And User enter cidr_block range for subnet
           Then User should see message environment saved successfully
           When User click on canvas
           Then User click deploy button and should see message environment deployed successfully
             When User click on destroy button
             Then User should see message environment destroyed sucessfully
             Then User delete subnet environment and see message environment deleted sucessfully

@P3 @TC_2      
Scenario: To check the functionality of Search bar under resource details
#Test case no:21
            Then User search or create environment for Subnet and see message as environment created successfully
            When User click Subnet resource and drag on the dashboard
            And User enter Subnet resource name
            Then Message should display resource created successfully
            When User click on Subnet resource
            Then User entered all attributes values under resource
            Then User should see message environment saved successfully
            When User click VPC resource and drag on the dashboard
            And User enter vpc resource name for subnet
            Then Message should display resource created successfully
            And User enter cidr_block range for subnet            
            Then User should see message environment saved successfully
            When User click on canvas
            Then User click deploy button and should see message environment deployed successfully
            When User click on canvas
            When User click on Vpc resource for subnet
            When User click on resource details link on the attribute section
            Then User search for attributes in the resource details "id"
            When User click on canvas
            When User click on destroy button
            Then User should see message environment destroyed sucessfully
            Then User delete subnet environment and see message environment deleted sucessfully
 @P3  @TC_2       
Scenario: To check the functionality of Search bar under resource
#Test case no:22
             Then User search or create environment for Subnet and see message as environment created successfully
            When User click Subnet resource and drag on the dashboard
            And User enter Subnet resource name
             Then Message should display resource created successfully
            When User click on Subnet resource
            Then User entered all attributes values under resource
            Then User should see message environment saved successfully
            When User click VPC resource and drag on the dashboard
           And User enter vpc resource name for subnet
             Then Message should display resource created successfully
            And User enter cidr_block range for subnet            
            Then User should see message environment saved successfully
            When User click on canvas
           Then User click deploy button and should see message environment deployed successfully
           When User click on canvas
            When User click on Vpc resource for subnet
            When User click on resource link on the attribute section
            Then User search for attributes in the resource section "Connection"
             When User click on canvas
            When User click on destroy button
              Then User should see message environment destroyed sucessfully
             Then User delete subnet environment and see message environment deleted sucessfully

