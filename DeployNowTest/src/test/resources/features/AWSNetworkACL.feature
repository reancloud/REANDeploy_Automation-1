@RegressionTest @NACLall @Suite1 @Network 
Feature: Test on AWS SSH NetworkACL Resource 

Background:
           Given User direct to deploy now application
	 	   When User log in
	       Then Login sucessfully should display
	       
@P3 @Network        
Scenario: Negative test case to check the functionality of save Button and deploy without providing the mandatory fields for NetworkACL
#Test case no:02
          Then User search or create environment for NACL and see message as environment created successfully
            Then User click on subnet resource and entered all the attribute values
            Then User click on subnet2 resources and entered all the attribute values
		    Then User click on VPC resources and entered all attribute values
			Then User should see message environment saved successfully
            When User click NetworkACL resource and drag on the dashboard
		    And User enter NetworkACL resource name 
		    Then Message should display resource created successfully  
           #When User click on NetworkACL resource
           Then User enter blank attribute values under for NetworkACL
           Then User should see message environment saved successfully
           Then User click on deploy button without providing mandatory fields
           Then User delete NetworkACL environment and see message environment deleted sucessfully
 
           			  
 @P1 @Network 
Scenario: To check the functionality of  YES DESTROY IT Button when user clicks on Destroy button on NetworkACL 
#Test case no:19
            Then User search or create environment for NACL and see message as environment created successfully
		    Then User click on subnet resource and entered all the attribute values
		    Then User click on subnet2 resources and entered all the attribute values
		    Then User click on VPC resources and entered all attribute values
	        Then User should see message environment saved successfully   
	        When User click NetworkACL resource and drag on the dashboard
            And User enter NetworkACL resource name 
            Then Message should display resource created successfully
            And User click on egress on NetworkACL resource
            And User click on ingress on NetworkACL resource
            And User enter vpc_id on NetworkACL resource
            And User enter depends_on NetworkACL resource
            And User select connection on NetworkACL resource
            And User click on subnet_id on NetworkACL resource
            Then User should see message environment saved successfully
            When User click on canvas
            Then User click deploy button and should see message environment deployed successfully
            When User click on destroy button
            Then User should see message environment destroyed sucessfully
            Then User delete NetworkACL environment and see message environment deleted sucessfully
            
@P1  @Network   
Scenario: To check the functionality of Redeploy button of the NetworkACL resource
#Test case no:17
            Then User search or create environment for NACL and see message as environment created successfully
            Then User click on subnet resource and entered all the attribute values
			Then User click on subnet2 resources and entered all the attribute values
		    Then User click on VPC resources and entered all attribute values
			Then User should see message environment saved successfully
            When User click NetworkACL resource and drag on the dashboard
		    And User enter NetworkACL resource name 
		    Then Message should display resource created successfully   
            #When User click on NetworkACL resource
            And User click on egress on NetworkACL resource
            And User click on ingress on NetworkACL resource
            And User enter vpc_id on NetworkACL resource
            And User enter depends_on NetworkACL resource
            And User select connection on NetworkACL resource
            And User click on subnet_id on NetworkACL resource
            Then User should see message environment saved successfully
            When User click on canvas
            Then User click deploy button and should see message environment deployed successfully
            Then User click redeploy button and should see message environment deployed successfully
            When User click on destroy button 
            Then User should see message environment destroyed sucessfully
            And User double refresh the page
            Then User delete NetworkACL environment and see message environment deleted sucessfully

@P3 @Network	         
Scenario: To check the functionality of create button if resource name is blank in NetworkACL resource
#Test Case no:03
	         Then User search or create environment for NACL and see message as environment created successfully
	         When User click NetworkACL resource and drag on the dashboard
	         Then User enter blank NetworkACL resource name
	         Then Message should display resource created successfully
	         And User double refresh the page
	         Then User delete NetworkACL environment and see message environment deleted sucessfully
@P3 @Network      
Scenario: To check the functionality of create button if resource name is duplicate in NetworkACL
#Test Case no:04		 
	         	Then User search or create environment for NACL and see message as environment created successfully
	            When User click NetworkACL resource and drag on the dashboard
		        And User enter NetworkACL resource name 
		        Then Message should display resource created successfully
	            When User click NetworkACL resource and drag on the dashboard
		        And User enter NetworkACL resource name 
		        Then Message should display resource created successfully
		        And User double refresh the page 
	            Then User delete NetworkACL environment and see message environment deleted sucessfully
@P2 @Network		            
Scenario: To check the functionality of save button if user edits resource name in NetworkACL
#Test Case no:05
                Then User search or create environment for NACL and see message as environment created successfully
	            When User click NetworkACL resource and drag on the dashboard
		        And User enter NetworkACL resource name 
		        Then Message should display resource created successfully  
	            When User click on NetworkACL resource
	            Then User click on resource name on rightsidebar
	            When User click save button on pop up of resource name link
	            And User double refresh the page
	            Then User delete NetworkACL environment and see message environment deleted sucessfully
		  
@P2 @Network			  
Scenario: To check the functionality of delete button if user wants to delete NetworkACL resource
#Test Case no:06
	         Then User search or create environment for NACL and see message as environment created successfully
	         When User click NetworkACL resource and drag on the dashboard
             And User enter NetworkACL resource name 
             Then Message should display resource created successfully
	         Then User click on cross and click on please delete it button on NetworkACL
	         And User double refresh the page
	         Then User delete NetworkACL environment and see message environment deleted sucessfully
@P2 @Network	         
Scenario: To check the functionality of please don't delete button if user clicks on cross button to delete on NetworkACL resource
#Test Case no:07
	         Then User search or create environment for NACL and see message as environment created successfully
	         When User click NetworkACL resource and drag on the dashboard
             And User enter NetworkACL resource name 
             Then Message should display resource created successfully
	         Then User click on cross and click on please dont delete it button on NetworkACL
	         And User double refresh the page
	         Then User delete NetworkACL environment and see message environment deleted sucessfully

@P3  @Network         
Scenario: To check the functionality of Close button if user clicks on resource name link in NetworkACL
#Test Case no:08
              Then User search or create environment for NACL and see message as environment created successfully
              When User click NetworkACL resource and drag on the dashboard
		      And User enter NetworkACL resource name 
		      Then Message should display resource created successfully 
		      When User click on NetworkACL resource
	          Then User click on resource name on rightsidebar
	          Then User click close button on pop up of resource name link
	          And User double refresh the page
              Then User delete NetworkACL environment and see message environment deleted sucessfully
@P3 @Network	            
Scenario: To check the functionality of Cross Close button if user clicks on resource name link in NetworkACL
#Test Case no:09
              Then User search or create environment for NACL and see message as environment created successfully
              When User click NetworkACL resource and drag on the dashboard
		      And User enter NetworkACL resource name 
		      Then Message should display resource created successfully  
	          When User click on NetworkACL resource
	          Then User click on resource name on rightsidebar
	          Then User click cross button on pop up of resource name link
	          And User double refresh the page
              Then User delete NetworkACL environment and see message environment deleted sucessfully
@P3 @Network             
Scenario: To check the functionality of  cross close button when user drags the NetworkACL resource 
#Test case no:10
             Then User search or create environment for NACL and see message as environment created successfully
             When User click NetworkACL resource and drag on the dashboard
             Then User click on the cross close button when user drags the resource from resource section
             And User double refresh the page
             Then User delete NetworkACL environment and see message environment deleted sucessfully
             
@P3 @Network
Scenario: To check the functionality of close button when user drags the NetworkACL resource 
#Test case no:11
             Then User search or create environment for NACL and see message as environment created successfully
             When User click NetworkACL resource and drag on the dashboard
             Then User click on the close button when user drags the resource from resource section
             And User double refresh the page
             Then User delete NetworkACL environment and see message environment deleted sucessfully
@P2 @Network          
Scenario: To check the functionality of text box when clicks on resource name link and edits the name on NetworkACL
#Test case no:12
            Then User search or create environment for NACL and see message as environment created successfully
            When User click NetworkACL resource and drag on the dashboard
		    And User enter NetworkACL resource name 
		    Then Message should display resource created successfully   
            When User click on NetworkACL resource
            Then User click on resource name on rightsidebar
            When User click the name text box to edit resource name "Connection"
            When User click save button on pop up of resource name link
            And User double refresh the page
	        Then User delete NetworkACL environment and see message environment deleted sucessfully
	        
 @P2 @Network           
Scenario: To check the functionality of  Resource Logs button after the successful deployment of the NetworkACL resource
#Test case no:13
            Then User search or create environment for NACL and see message as environment created successfully
            Then User click on subnet resource and entered all the attribute values
			Then User click on subnet2 resources and entered all the attribute values
		    Then User click on VPC resources and entered all attribute values
			Then User should see message environment saved successfully
            When User click NetworkACL resource and drag on the dashboard
		    And User enter NetworkACL resource name 
		    Then Message should display resource created successfully   
            #When User click on NetworkACL resource
            And User click on egress on NetworkACL resource
            And User click on ingress on NetworkACL resource
            And User enter vpc_id on NetworkACL resource
            And User enter depends_on NetworkACL resource
            And User select connection on NetworkACL resource
            And User click on subnet_id on NetworkACL resource
            Then User should see message environment saved successfully
            When User click on canvas
            #Then User click on deploy button and check deployment status
            Then User click deploy button and should see message environment deployed successfully
	        When User click on logs button on dash board
            And User click on close button on logs window
            When User click on destroy button 
            Then User should see message environment destroyed sucessfully
            And User double refresh the page
            Then User delete NetworkACL environment and see message environment deleted sucessfully
            
 @P3 @Network	            
Scenario: To check the functionality of  Close button when user clicks on resource logs button of the NetworkACL resource
#Test case no:14
           Then User search or create environment for NACL and see message as environment created successfully
            Then User click on subnet resource and entered all the attribute values
			Then User click on subnet2 resources and entered all the attribute values
		    Then User click on VPC resources and entered all attribute values
			Then User should see message environment saved successfully
            When User click NetworkACL resource and drag on the dashboard
		    And User enter NetworkACL resource name 
		    Then Message should display resource created successfully   
            #When User click on NetworkACL resource
            And User click on egress on NetworkACL resource
            And User click on ingress on NetworkACL resource
            And User enter vpc_id on NetworkACL resource
            And User enter depends_on NetworkACL resource
            And User select connection on NetworkACL resource
            And User click on subnet_id on NetworkACL resource
            Then User should see message environment saved successfully
            When User click on canvas
            #Then User click on deploy button and check deployment status
            Then User click deploy button and should see message environment deployed successfully
	         When User click on logs button on dash board
            And User click on close button on logs window
            When User click on destroy button 
            Then User should see message environment destroyed sucessfully
            Then User delete NetworkACL environment and see message environment deleted sucessfully
            
 @P3 @Network	            
Scenario: To check the functionality of  refresh button when user clicks on resource logs button of the NetworkACL resource
#Test case no:15
            Then User search or create environment for NACL and see message as environment created successfully
            Then User click on subnet resource and entered all the attribute values
			Then User click on subnet2 resources and entered all the attribute values
		    Then User click on VPC resources and entered all attribute values
			Then User should see message environment saved successfully
            When User click NetworkACL resource and drag on the dashboard
		    And User enter NetworkACL resource name 
		    Then Message should display resource created successfully   
            #When User click on NetworkACL resource
            And User click on egress on NetworkACL resource
            And User click on ingress on NetworkACL resource
            And User enter vpc_id on NetworkACL resource
            And User enter depends_on NetworkACL resource
            And User select connection on NetworkACL resource
            And User click on subnet_id on NetworkACL resource
            Then User should see message environment saved successfully
            When User click on canvas
            Then User click deploy button and should see message environment deployed successfully
	        When User click on logs button on dash board
            And User click on refresh button on logs window
            And User click on close button on logs window
            When User click on destroy button 
            Then User should see message environment destroyed sucessfully
            Then User delete NetworkACL environment and see message environment deleted sucessfully
            
 @P3  @Network      
Scenario: To check the functionality of  Cross Close button when user clicks on resource logs button of the NetworkACL resource
#Test case no:16
            Then User search or create environment for NACL and see message as environment created successfully
            Then User click on subnet resource and entered all the attribute values
			Then User click on subnet2 resources and entered all the attribute values
		    Then User click on VPC resources and entered all attribute values
			Then User should see message environment saved successfully
            When User click NetworkACL resource and drag on the dashboard
		    And User enter NetworkACL resource name 
		    Then Message should display resource created successfully   
            #When User click on NetworkACL resource
            And User click on egress on NetworkACL resource
            And User click on ingress on NetworkACL resource
            And User enter vpc_id on NetworkACL resource
            And User enter depends_on NetworkACL resource
            And User select connection on NetworkACL resource
            And User click on subnet_id on NetworkACL resource
            Then User should see message environment saved successfully
            When User click on canvas
            Then User click deploy button and should see message environment deployed successfully
	        When User click on logs button on dash board
            And User click on cross close button on logs window
            When User click on destroy button 
            Then User should see message environment destroyed sucessfully
            And User double refresh the page
            Then User delete NetworkACL environment and see message environment deleted sucessfully
            
@P3 @Network	            
Scenario: To check the functionality of  Dont DESTROY IT Button when user clicks on Destroy button on NetworkACL 
#Test case no:18
            Then User search or create environment for NACL and see message as environment created successfully
            Then User click on subnet resource and entered all the attribute values
			Then User click on subnet2 resources and entered all the attribute values
		    Then User click on VPC resources and entered all attribute values
			Then User should see message environment saved successfully
            When User click NetworkACL resource and drag on the dashboard
		    And User enter NetworkACL resource name 
		    Then Message should display resource created successfully   
            #When User click on NetworkACL resource
            And User click on egress on NetworkACL resource
            And User click on ingress on NetworkACL resource
            And User enter vpc_id on NetworkACL resource
            And User enter depends_on NetworkACL resource
            And User select connection on NetworkACL resource
            And User click on subnet_id on NetworkACL resource
            Then User should see message environment saved successfully
            When User click on canvas
            Then User click deploy button and should see message environment deployed successfully
            And User click on destroy button
	        Then User click on dont destroy button
	        When User click on destroy button
	        Then User should see message environment destroyed sucessfully
	        Then User delete NetworkACL environment and see message environment deleted sucessfully
            
@P3 @Network        
Scenario: To check the functionality of Search bar if user wants to search for attributes after deployment of the resource
#Test case no:22

            Then User search or create environment for NACL and see message as environment created successfully
            Then User click on subnet resource and entered all the attribute values
			Then User click on subnet2 resources and entered all the attribute values
		    Then User click on VPC resources and entered all attribute values
			Then User should see message environment saved successfully
            When User click NetworkACL resource and drag on the dashboard
		    And User enter NetworkACL resource name 
		    Then Message should display resource created successfully   
            #When User click on NetworkACL resource
            And User click on egress on NetworkACL resource
            And User click on ingress on NetworkACL resource
            And User enter vpc_id on NetworkACL resource
            And User enter depends_on NetworkACL resource
            And User select connection on NetworkACL resource
            And User click on subnet_id on NetworkACL resource
            Then User should see message environment saved successfully
            Then User click deploy button and should see message environment deployed successfully
            When User click on canvas
            When User click on NetworkACL resource
            When User click on resource link on the attribute section
            Then User search for attributes in the resource section "Connection"
            When User click on canvas
            When User click on destroy button
            Then User should see message environment destroyed sucessfully
            And User double refresh the page
            Then User delete NetworkACL environment and see message environment deleted sucessfully
            
	        
@P2 @Network          
Scenario: To check Add NACL to the Environment,fill all the Mandatory details and optional of resource and deploy
#Test case no:25
			Then User search or create environment for NACL and see message as environment created successfully
            Then User click on subnet resource and entered all the attribute values
			Then User click on subnet2 resources and entered all the attribute values
		    Then User click on VPC resources and entered all attribute values
			Then User should see message environment saved successfully
            When User click NetworkACL resource and drag on the dashboard
		    And User enter NetworkACL resource name 
		    Then Message should display resource created successfully   
            #When User click on NetworkACL resource
            And User click on egress on NetworkACL resource
            And User click on ingress on NetworkACL resource
            And User enter vpc_id on NetworkACL resource
            And User enter depends_on NetworkACL resource
            And User select connection on NetworkACL resource
            And User click on subnet_id on NetworkACL resource
            Then User should see message environment saved successfully
            When User click on canvas
            Then User click deploy button and should see message environment deployed successfully
            When User click on destroy button 
            Then User should see message environment destroyed sucessfully
            And User double refresh the page
            Then User delete NetworkACL environment and see message environment deleted sucessfully
            
             
 
            

