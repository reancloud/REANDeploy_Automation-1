@RegressionTest @subnetgroupall @Suite1
Feature: Automation of AWS Subnet Group Resource 

Background:
           Given User direct to deploy now application
	 	   When User log in
	       Then Login sucessfully should display
@P3 @TC_3	  
Scenario: Negative test case to check the functionality of save Button and deploy without providing the mandatory fields for Subnet group
#Test case no:02
          Then User search or create environment for SubnetGroup and see message as environment created successfully
          Then User drag drop subnet resource and fill all the attribute values for subnetgroup
		  Then User again drag drop subnet resource and fill all the attribute values for subnetgroup
		  Then User drag drop VPC resource and fill all the attribute values for subnetgroup
		  Then User should see message environment saved successfully
          When User click SubnetGroup resource and drag on the dashboard
          And User enter SubnetGroup resource name 
          Then Message should display resource created successfully
          Then User enter blank attribute values under for subnetgroup
          Then User should see message environment saved successfully
          When User click on canvas
          Then User click deploy button without providing the mandatory fields for Subnet group and should see message environment deployed successfully
          Then User delete subnetgroup environment and see message environment deleted sucessfully
         
@P3	 @TC_3              
Scenario: To check the functionality of create button if resource name is blank in subnetgroup
#Test Case no:03
	         Then User search or create environment for SubnetGroup and see message as environment created successfully
	          When User click SubnetGroup resource and drag on the dashboard
	         Then User enter blank subnetgroup resource name
	         Then Message should display resource created successfully
	         Then User delete subnetgroup environment and see message environment deleted sucessfully  
	         
@P3  @TC_3  
 Scenario: To check the functionality of create button if resource name is duplicate in subnetgroup
#Test Case no:04		 
         	Then User search or create environment for SubnetGroup and see message as environment created successfully
             When User click SubnetGroup resource and drag on the dashboard
            And User enter SubnetGroup resource name 
            Then Message should display resource created successfully 
             When User click SubnetGroup resource and drag on the dashboard
            And User enter SubnetGroup resource name 
            Then Message should display resource created successfully 
            Then User delete subnetgroup environment and see message environment deleted sucessfully 
            
@P2  @TC_3   
Scenario: To check the functionality of save button if user edits resource name in subnetgroup
#Test Case no:05
           Then User search or create environment for SubnetGroup and see message as environment created successfully
            When User click SubnetGroup resource and drag on the dashboard
           And User enter SubnetGroup resource name 
           Then Message should display resource created successfully
           When User click on subnetgroup resource
           Then User click on resource name on rightsidebar
           When User click save button on pop up of resource name link
           Then User delete subnetgroup environment and see message environment deleted sucessfully
           
          
@P2 @TC_3	
Scenario: To check the functionality of delete button if user wants to delete resource
#Test Case no:06
	         Then User search or create environment for SubnetGroup and see message as environment created successfully
	         When User click SubnetGroup resource and drag on the dashboard
             And User enter SubnetGroup resource name 
             Then Message should display resource created successfully 
             Then User click on cross and click on please delete it button on subnetgroup
             Then User delete subnetgroup environment and see message environment deleted sucessfully
          
@P3 @TC_3
Scenario: To check the functionality of please don't delete button if user clicks on cross button to delete resource
#Test Case no:07
	         Then User search or create environment for SubnetGroup and see message as environment created successfully
	          When User click SubnetGroup resource and drag on the dashboard
             And User enter SubnetGroup resource name 
             Then Message should display resource created successfully 
	         Then User click on cross and click on please dont delete it button on subnetgroup
			 Then User delete subnetgroup environment and see message environment deleted sucessfully
	         
@P3 @TC_3
 Scenario: To check the functionality of Close button if user clicks on resource name link in subnetgroup
#Test Case no:08
           Then User search or create environment for SubnetGroup and see message as environment created successfully
            When User click SubnetGroup resource and drag on the dashboard
           And User enter SubnetGroup resource name 
           Then Message should display resource created successfully     
           When User click on subnetgroup resource
            Then User click on resource name on rightsidebar
           Then User click close button on pop up of resource name link
           Then User delete subnetgroup environment and see message environment deleted sucessfully
           
 @P3 @TC_3         
Scenario: To check the functionality of CrossClose button if user clicks on resource name link in subnetgroup
#Test Case no:09
           Then User search or create environment for SubnetGroup and see message as environment created successfully
            When User click SubnetGroup resource and drag on the dashboard
           And User enter SubnetGroup resource name 
           Then Message should display resource created successfully    
           When User click on subnetgroup resource
            Then User click on resource name on rightsidebar
           Then User click cross button on pop up of resource name link
			Then User delete subnetgroup environment and see message environment deleted sucessfully
@P3  @TC_3         
Scenario: To check the functionality of  cross close button when user drags the subnetgroup resource 
#Test case no:10
            Then User search or create environment for SubnetGroup and see message as environment created successfully
             When User click SubnetGroup resource and drag on the dashboard
            Then User click on the cross close button when user drags the resource from resource section
			Then User delete subnetgroup environment and see message environment deleted sucessfully
            
 @P3 @TC_3         
Scenario: To check the functionality of  close button when user drags the subnetgroup resource 
#Test case no:11
            Then User search or create environment for SubnetGroup and see message as environment created successfully
             When User click SubnetGroup resource and drag on the dashboard
            Then User click on the close button when user drags the resource from resource section
			 Then User delete subnetgroup environment and see message environment deleted sucessfully
 @P2 @TC_3      
Scenario: To check the functionality of text box when clicks on resource name link and edits the name on subnetgroup
#Test case no:12
           Then User search or create environment for SubnetGroup and see message as environment created successfully
            When User click SubnetGroup resource and drag on the dashboard
           And User enter SubnetGroup resource name 
           Then Message should display resource created successfully   
           When User click on subnetgroup resource
           Then User click on resource name on rightsidebar
           When User click the name text box to edit resource name "connection"
           When User click save button on pop up of resource name link
			Then User delete subnetgroup environment and see message environment deleted sucessfully

@P2  @TC_3        
Scenario: To check the functionality of Resource Logs button after the successful deployment of the subnetgroupresource
#Test case no:13
          Then User search or create environment for SubnetGroup and see message as environment created successfully
          Then User drag drop subnet resource and fill all the attribute values for subnetgroup
		  Then User again drag drop subnet resource and fill all the attribute values for subnetgroup
		  Then User drag drop VPC resource and fill all the attribute values for subnetgroup
          When User click SubnetGroup resource and drag on the dashboard
          And User enter SubnetGroup resource name 
          Then Message should display resource created successfully
          And User enter description for subnetgroup
         And User enter subnetId for subnetgroup
          Then User should see message environment saved successfully
		  Then User click deploy button and should see message environment deployed successfully
          When User click on canvas
          When User click on logs button on dash board 
          And User click on close button on logs window 
          When User click on destroy button
          Then User should see message environment destroyed sucessfully
          Then User delete subnetgroup environment and see message environment deleted sucessfully
          
@P3 @TC_3         
Scenario: To check the functionality of  Close button when user clicks on resource logs button of the subnetgroupresource
#Test case no:14
          Then User search or create environment for SubnetGroup and see message as environment created successfully
          Then User drag drop subnet resource and fill all the attribute values for subnetgroup
		  Then User again drag drop subnet resource and fill all the attribute values for subnetgroup
		  Then User drag drop VPC resource and fill all the attribute values for subnetgroup
          When User click SubnetGroup resource and drag on the dashboard
          And User enter SubnetGroup resource name 
          Then Message should display resource created successfully
          And User enter description for subnetgroup
          And User enter subnetId for subnetgroup
          Then User should see message environment saved successfully
		  Then User click deploy button and should see message environment deployed successfully
          When User click on canvas
          When User click on logs button on dash board   
          And User click on close button on logs window 
          When User click on destroy button
		  Then User should see message environment destroyed sucessfully
          Then User delete subnetgroup environment and see message environment deleted sucessfully
          
@P3  @TC_3        
Scenario: To check the functionality of  Refresh button when user clicks on resource logs button of the subnetgroupresource
#Test case no:15
          Then User search or create environment for SubnetGroup and see message as environment created successfully
          Then User drag drop subnet resource and fill all the attribute values for subnetgroup
		  Then User again drag drop subnet resource and fill all the attribute values for subnetgroup
		  Then User drag drop VPC resource and fill all the attribute values for subnetgroup
          When User click SubnetGroup resource and drag on the dashboard
          And User enter SubnetGroup resource name 
          Then Message should display resource created successfully
          And User enter description for subnetgroup
          And User enter subnetId for subnetgroup
          Then User should see message environment saved successfully
		  Then User click deploy button and should see message environment deployed successfully
          When User click on canvas
          When User click on logs button on dash board
          And User click on refresh button on logs window
          And User click on close button on logs window
           When User click on destroy button
		  Then User should see message environment destroyed sucessfully
		   Then User delete subnetgroup environment and see message environment deleted sucessfully
          
@P3 @TC_3          
Scenario: To check the functionality of  cross Close button when user clicks on resource logs button of the subnetgroupresource
#Test case no:16
          Then User search or create environment for SubnetGroup and see message as environment created successfully
          Then User drag drop subnet resource and fill all the attribute values for subnetgroup
		  Then User again drag drop subnet resource and fill all the attribute values for subnetgroup
		  Then User drag drop VPC resource and fill all the attribute values for subnetgroup
          When User click SubnetGroup resource and drag on the dashboard
          And User enter SubnetGroup resource name 
          Then Message should display resource created successfully
          And User enter description for subnetgroup
          And User enter subnetId for subnetgroup
          Then User should see message environment saved successfully
		   Then User click deploy button and should see message environment deployed successfully
          When User click on canvas
          When User click on logs button on dash board   
          And User click on cross close button on logs window
          When User click on destroy button
		   Then User should see message environment destroyed sucessfully
           Then User delete subnetgroup environment and see message environment deleted sucessfully

          
@P1 @TC_3       
Scenario: To check the functionality of Redeploy button  of the subnetgroupresource
#Test case no:17
           Then User search or create environment for SubnetGroup and see message as environment created successfully
          Then User drag drop subnet resource and fill all the attribute values for subnetgroup
		  Then User again drag drop subnet resource and fill all the attribute values for subnetgroup
		  Then User drag drop VPC resource and fill all the attribute values for subnetgroup
          When User click SubnetGroup resource and drag on the dashboard
          And User enter SubnetGroup resource name 
          Then Message should display resource created successfully
          And User enter description for subnetgroup
          And User enter subnetId for subnetgroup
          Then User should see message environment saved successfully
		  When User click on canvas
		  Then User click deploy button and should see message environment deployed successfully
		  Then User click redeploy button and should see message environment deployed successfully
		  When User click on destroy button
		  Then User should see message environment destroyed sucessfully
		  Then User delete subnetgroup environment and see message environment deleted sucessfully
		  
    
@P3  @TC_3     
Scenario: To check the functionality of  DONT DESTROY IT Button when user clicks on Destroy button
#Test case no:18
         Then User search or create environment for SubnetGroup and see message as environment created successfully
          Then User drag drop subnet resource and fill all the attribute values for subnetgroup
		  Then User again drag drop subnet resource and fill all the attribute values for subnetgroup
		  Then User drag drop VPC resource and fill all the attribute values for subnetgroup
          When User click SubnetGroup resource and drag on the dashboard
          And User enter SubnetGroup resource name 
          Then Message should display resource created successfully
          And User enter description for subnetgroup
          And User enter subnetId for subnetgroup
          Then User should see message environment saved successfully
          When User click on canvas
		  Then User click deploy button and should see message environment deployed successfully
          When User click on destroy button
          Then User click on dont destroy button
          When User click on destroy button
          Then User should see message environment destroyed sucessfully
          Then User delete subnetgroup environment and see message environment deleted sucessfully        
	  
@P1  @TC_3       
Scenario: To check the functionality of  YES DESTROY IT Button when user clicks on Destroy button of subnetgroup
#Test case no:19
          Then User search or create environment for SubnetGroup and see message as environment created successfully
          Then User drag drop subnet resource and fill all the attribute values for subnetgroup
		  Then User again drag drop subnet resource and fill all the attribute values for subnetgroup
		  Then User drag drop VPC resource and fill all the attribute values for subnetgroup
          When User click SubnetGroup resource and drag on the dashboard
          And User enter SubnetGroup resource name 
          Then Message should display resource created successfully
          And User enter description for subnetgroup
          And User enter subnetId for subnetgroup
          Then User should see message environment saved successfully
		  When User click on canvas
		  Then User click deploy button and should see message environment deployed successfully
		  When User click on destroy button
		  Then User should see message environment destroyed sucessfully
		  Then User delete subnetgroup environment and see message environment deleted sucessfully
          
 
 
