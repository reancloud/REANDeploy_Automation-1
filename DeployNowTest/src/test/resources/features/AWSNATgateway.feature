@RegressionTest @Suite4 @Sanity 
Feature: Test on AWS SSH NAT gateway Resource 

Background:
			Given User direct to deploy now application
			When User log in
			Then Login sucessfully should display
			
@Sanity
Scenario: To check the functionality of Yes destroy button when user click on Destroy button for NAT gateway
#Test case no 16

          Then User search or create environment for NAT Gateway and see message as environment created successfully
          Then User click on VPC resource and entered all the attribute values for natgateway
          Then User click on subnet resource and entered all the attribute values for natgateway
          Then User again click on subnet resource and entered all the attribute values for natgateway
          When User click route table resource and drag on the dashboard for natgateway 
          And User enter route table resource name for NAT Gateway
	      Then Message should display resource created successfully
          And User enter route table vpc id for natgateway
          And User set json for route for natgateway
          When User click route table resource and drag on the dashboard for natgateway
          And User again enter route table resource name for NAT Gateway
          Then Message should display resource created successfully
          And User again enter route table vpc id for natgateway
          And User again set json for route for natgateway
          When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
          And User enter internet gateway resource name for NAT Gateway
          Then Message should display resource created successfully
          And User enter route table vpc id for natgateway
          When User click EIP resource and drag on the dashboard for natgateway 
          And User enter EIP resource name for NAT Gateway
          Then Message should display resource created successfully
          When User click RTA resource and drag on the dashboard for natgateway
          And User enter RTA resource name for NAT Gateway 
          Then Message should display resource created successfully
          And User enter route table id of Route table Association for natgateway
	      And User enter subnet id of Route table Association for natgateway
          When User click NAT Gateway resource and drag on the dashboard
          And User enter NAT Gateway resource name for NAT Gateway 
     	  Then Message should display resource created successfully
          And User enter allocation id for NAT gateway resource
          And User enter subnet id of Route table Association for natgateway
          And User enter natgateway dependson value
          And User select connection from dropdown
          And User enter natgateway networkinterfaceID value
          And User enter natgateway privateIp value
          And User enter natgateway publicIp value
          Then User should see message environment saved successfully
          When User click on canvas
	      Then User click deploy button and should see message environment deployed successfully
          When User click on destroy button
		  Then User should see message environment destroyed sucessfully
	      Then User delete NAT Gateway environment and see message environment deleted sucessfully
	      
@Sanity  
Scenario: To check the functionality of Redeploy button  for NAT gateway
#Test case no 14

          Then User search or create environment for NAT Gateway and see message as environment created successfully
          Then User click on VPC resource and entered all the attribute values for natgateway
          Then User click on subnet resource and entered all the attribute values for natgateway
          Then User again click on subnet resource and entered all the attribute values for natgateway
          When User click route table resource and drag on the dashboard for natgateway 
          And User enter route table resource name for NAT Gateway
	      Then Message should display resource created successfully
          And User enter route table vpc id for natgateway
          And User set json for route for natgateway
          When User click route table resource and drag on the dashboard for natgateway
          And User again enter route table resource name for NAT Gateway
          Then Message should display resource created successfully
          And User again enter route table vpc id for natgateway
          And User again set json for route for natgateway
          When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
          And User enter internet gateway resource name for NAT Gateway
          Then Message should display resource created successfully
          And User enter route table vpc id for natgateway
          When User click EIP resource and drag on the dashboard for natgateway 
          And User enter EIP resource name for NAT Gateway
          Then Message should display resource created successfully
          When User click RTA resource and drag on the dashboard for natgateway
          And User enter RTA resource name for NAT Gateway 
          Then Message should display resource created successfully
          And User enter route table id of Route table Association for natgateway
	      And User enter subnet id of Route table Association for natgateway
          When User click NAT Gateway resource and drag on the dashboard
          And User enter NAT Gateway resource name for NAT Gateway 
     	  Then Message should display resource created successfully
          And User enter allocation id for NAT gateway resource
          And User enter subnet id of Route table Association for natgateway
          And User enter natgateway dependson value
          And User select connection from dropdown
          And User enter natgateway networkinterfaceID value
          And User enter natgateway privateIp value
          And User enter natgateway publicIp value
          Then User should see message environment saved successfully
          When User click on canvas
	      Then User click deploy button and should see message environment deployed successfully
	      Then User click redeploy button and should see message environment deployed successfully
          When User click on destroy button
		  Then User should see message environment destroyed sucessfully
	      Then User delete NAT Gateway environment and see message environment deleted sucessfully

@Sanity   
Scenario: To check the functionality of create button if resource name is duplicate in NAT
#Test Case no:		 
          Then User search or create environment for NAT Gateway and see message as environment created successfully
	      When User click NAT Gateway resource and drag on the dashboard
          And User enter NAT Gateway resource name for NAT Gateway 
     	  Then Message should display resource created successfully
	      When User click NAT Gateway resource and drag on the dashboard
          And User enter NAT Gateway resource name for NAT Gateway 
     	  Then Message should display resource created successfully
	      Then User delete NAT Gateway environment and see message environment deleted sucessfully
	          	      
@Sanity 
Scenario: Validate cross button when resource is dragged for natgateway
#Test case no 3
          Then User search or create environment for NAT Gateway and see message as environment created successfully
          When User click NAT Gateway resource and drag on the dashboard
          Then User click on the cross close button when user drags the resource from resource section
	      Then User delete NAT Gateway environment and see message environment deleted sucessfully

@Sanity 
Scenario: Validate close button when resource is dragged for natgateway
#Test case no 4
          Then User search or create environment for NAT Gateway and see message as environment created successfully
          When User click NAT Gateway resource and drag on the dashboard
          Then User click on the close button when user drags the resource from resource section
	      Then User delete NAT Gateway environment and see message environment deleted sucessfully
@Sanity     
Scenario: Validate create button when resource name is blank for natgateway
#Test case no 5
		  Then User search or create environment for NAT Gateway and see message as environment created successfully
		  When User click NAT Gateway resource and drag on the dashboard
          Then User enter blank resource name for NAT gateway resource
          Then Message should display resource created successfully
        
@Sanity	      
Scenario: Validate please delete it when resource need to be deleted for natgateway
#Test case no 6
		Then User search or create environment for NAT Gateway and see message as environment created successfully
		When User click NAT Gateway resource and drag on the dashboard
       	And User enter NAT Gateway resource name for NAT Gateway 
        Then Message should display resource created successfully
        When User click on canvas
        Then User click on please delete it button if resource need to be deleted for Natgateway
	    Then User delete NAT Gateway environment and see message environment deleted sucessfully
        
@Sanity  
Scenario: Validate dont delete it when resource need to be deleted for natgateway
#Test case no 7
		Then User search or create environment for NAT Gateway and see message as environment created successfully
		When User click NAT Gateway resource and drag on the dashboard
       	And User enter NAT Gateway resource name for NAT Gateway 
        Then Message should display resource created successfully
        When User click on canvas
        Then User click on dont delete it button if resource need to be deleted for Natgateway
	    Then User delete NAT Gateway environment and see message environment deleted sucessfully

@Sanity	   
Scenario: Validate Save and deploy button on dashboard for NAT gateway
#Test case no 8
		Then User search or create environment for NAT Gateway and see message as environment created successfully
        Then User click on VPC resource and entered all the attribute values for natgateway
        Then User click on subnet resource and entered all the attribute values for natgateway
        Then User again click on subnet resource and entered all the attribute values for natgateway
        When User click route table resource and drag on the dashboard for natgateway 
        And User enter route table resource name for NAT Gateway
	    Then Message should display resource created successfully
        And User enter route table vpc id for natgateway
        And User set json for route for natgateway
        When User click route table resource and drag on the dashboard for natgateway
        And User again enter route table resource name for NAT Gateway
        Then Message should display resource created successfully
        And User again enter route table vpc id for natgateway
        And User again set json for route for natgateway
        When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
        And User enter internet gateway resource name for NAT Gateway
        Then Message should display resource created successfully
        And User enter route table vpc id for natgateway
        When User click EIP resource and drag on the dashboard for natgateway 
        And User enter EIP resource name for NAT Gateway
        Then Message should display resource created successfully
        When User click RTA resource and drag on the dashboard for natgateway
        And User enter RTA resource name for NAT Gateway 
        Then Message should display resource created successfully
        And User enter route table id of Route table Association for natgateway
	    And User enter subnet id of Route table Association for natgateway
        When User click NAT Gateway resource and drag on the dashboard
        And User enter NAT Gateway resource name for NAT Gateway 
     	Then Message should display resource created successfully
        And User enter allocation id for NAT gateway resource
        And User enter subnet id of Route table Association for natgateway
        And User enter natgateway dependson value
        And User select connection from dropdown
        And User enter natgateway networkinterfaceID value
        And User enter natgateway privateIp value
        And User enter natgateway publicIp value
        Then User should see message environment saved successfully
        When User click on canvas
	    Then User click deploy button and should see message environment deployed successfully
        When User click on destroy button
		Then User should see message environment destroyed sucessfully
	    Then User delete NAT Gateway environment and see message environment deleted sucessfully

@Sanity	      
Scenario: Validate Close button if user clicks on resource name link for Natgateway
#Test Case no:9
	 	  Then User search or create environment for NAT Gateway and see message as environment created successfully
          When User click NAT Gateway resource and drag on the dashboard
          And User enter NAT Gateway resource name for NAT Gateway 
          Then Message should display resource created successfully
          When User click on NAT Gateway resource
          Then User click on resource name on rightsidebar
		  Then User click close button on pop up of resource name link
		  Then User delete NAT Gateway environment and see message environment deleted sucessfully
		  
@Sanity     
Scenario: Validate save button when resource name is edited under resource name link for Natgateway
#Test Case no:10	
		  Then User search or create environment for NAT Gateway and see message as environment created successfully
          When User click NAT Gateway resource and drag on the dashboard
          And User enter NAT Gateway resource name for NAT Gateway 
          Then Message should display resource created successfully
          When User click on NAT Gateway resource
          Then User click on resource name on rightsidebar
		  When User click the name text box to edit resource name "Natgateway"
		  When User click save button on pop up of resource name link
		  Then User delete NAT Gateway environment and see message environment deleted sucessfully		      


@Sanity      
Scenario: Validate Cross button if user clicks on resource name link for Natgateway
#Test Case no:11	
		  Then User search or create environment for NAT Gateway and see message as environment created successfully
          When User click NAT Gateway resource and drag on the dashboard
          And User enter NAT Gateway resource name for NAT Gateway 
          Then Message should display resource created successfully
          When User click on NAT Gateway resource
          Then User click on resource name on rightsidebar
		  Then User click cross button on pop up of resource name link
		  Then User delete NAT Gateway environment and see message environment deleted sucessfully	
		  
@Sanity	  
Scenario: To check the functionality of Resource Logs button after the successful deployment of the NAT gateway resource
#Test Case no:12
		  Then User search or create environment for NAT Gateway and see message as environment created successfully
          Then User click on VPC resource and entered all the attribute values for natgateway
          Then User click on subnet resource and entered all the attribute values for natgateway
          Then User again click on subnet resource and entered all the attribute values for natgateway
          When User click route table resource and drag on the dashboard for natgateway 
          And User enter route table resource name for NAT Gateway
	      Then Message should display resource created successfully
          And User enter route table vpc id for natgateway
          And User set json for route for natgateway
          When User click route table resource and drag on the dashboard for natgateway
          And User again enter route table resource name for NAT Gateway
          Then Message should display resource created successfully
          And User again enter route table vpc id for natgateway
          And User again set json for route for natgateway
          When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
          And User enter internet gateway resource name for NAT Gateway
          Then Message should display resource created successfully
          And User enter route table vpc id for natgateway
          When User click EIP resource and drag on the dashboard for natgateway 
          And User enter EIP resource name for NAT Gateway
          Then Message should display resource created successfully
          When User click RTA resource and drag on the dashboard for natgateway
          And User enter RTA resource name for NAT Gateway 
          Then Message should display resource created successfully
          And User enter route table id of Route table Association for natgateway
	      And User enter subnet id of Route table Association for natgateway
          When User click NAT Gateway resource and drag on the dashboard
          And User enter NAT Gateway resource name for NAT Gateway 
     	  Then Message should display resource created successfully
          And User enter allocation id for NAT gateway resource
          And User enter subnet id of Route table Association for natgateway
          And User enter natgateway dependson value
          And User select connection from dropdown
          And User enter natgateway networkinterfaceID value
          And User enter natgateway privateIp value
          And User enter natgateway publicIp value
          Then User should see message environment saved successfully
          When User click on canvas
	      Then User click deploy button and should see message environment deployed successfully
          When User click on logs button on dash board
		  And User click on close button on logs window
          When User click on destroy button
		  Then User should see message environment destroyed sucessfully
	      Then User delete NAT Gateway environment and see message environment deleted sucessfully	
@Sanity	  
Scenario: Validate close button under resource log for Natgateway
#Test Case no:12
		  Then User search or create environment for NAT Gateway and see message as environment created successfully
          Then User click on VPC resource and entered all the attribute values for natgateway
          Then User click on subnet resource and entered all the attribute values for natgateway
          Then User again click on subnet resource and entered all the attribute values for natgateway
          When User click route table resource and drag on the dashboard for natgateway 
          And User enter route table resource name for NAT Gateway
	      Then Message should display resource created successfully
          And User enter route table vpc id for natgateway
          And User set json for route for natgateway
          When User click route table resource and drag on the dashboard for natgateway
          And User again enter route table resource name for NAT Gateway
          Then Message should display resource created successfully
          And User again enter route table vpc id for natgateway
          And User again set json for route for natgateway
          When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
          And User enter internet gateway resource name for NAT Gateway
          Then Message should display resource created successfully
          And User enter route table vpc id for natgateway
          When User click EIP resource and drag on the dashboard for natgateway 
          And User enter EIP resource name for NAT Gateway
          Then Message should display resource created successfully
          When User click RTA resource and drag on the dashboard for natgateway
          And User enter RTA resource name for NAT Gateway 
          Then Message should display resource created successfully
          And User enter route table id of Route table Association for natgateway
	      And User enter subnet id of Route table Association for natgateway
	      When User click NAT Gateway resource and drag on the dashboard
          And User enter NAT Gateway resource name for NAT Gateway 
     	  Then Message should display resource created successfully
          And User enter allocation id for NAT gateway resource
          And User enter subnet id of Route table Association for natgateway
          And User enter natgateway dependson value
          And User select connection from dropdown
          And User enter natgateway networkinterfaceID value
          And User enter natgateway privateIp value
          And User enter natgateway publicIp value
          Then User should see message environment saved successfully
          When User click on canvas
	      Then User click deploy button and should see message environment deployed successfully
	      When User click on logs button on dash board
		  And User click on close button on logs window
          When User click on destroy button
		  Then User should see message environment destroyed sucessfully
	      Then User delete NAT Gateway environment and see message environment deleted sucessfully	      

@Sanity	
Scenario: Validate refresh button under resource log for Natgateway
#Test Case no:13
		  Then User search or create environment for NAT Gateway and see message as environment created successfully
          Then User click on VPC resource and entered all the attribute values for natgateway
          Then User click on subnet resource and entered all the attribute values for natgateway
          Then User again click on subnet resource and entered all the attribute values for natgateway
          When User click route table resource and drag on the dashboard for natgateway 
          And User enter route table resource name for NAT Gateway
	      Then Message should display resource created successfully
          And User enter route table vpc id for natgateway
          And User set json for route for natgateway
          When User click route table resource and drag on the dashboard for natgateway
          And User again enter route table resource name for NAT Gateway
          Then Message should display resource created successfully
          And User again enter route table vpc id for natgateway
          And User again set json for route for natgateway
          When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
          And User enter internet gateway resource name for NAT Gateway
          Then Message should display resource created successfully
          And User enter route table vpc id for natgateway
          When User click EIP resource and drag on the dashboard for natgateway 
          And User enter EIP resource name for NAT Gateway
          Then Message should display resource created successfully
          When User click RTA resource and drag on the dashboard
          And User enter RTA resource name for NAT Gateway 
          Then Message should display resource created successfully
          And User enter route table id of Route table Association for natgateway
	      And User enter subnet id of Route table Association for natgateway
          When User click NAT Gateway resource and drag on the dashboard
          And User enter NAT Gateway resource name for NAT Gateway 
     	  Then Message should display resource created successfully
          And User enter allocation id for NAT gateway resource
          And User enter subnet id of Route table Association for natgateway
          And User enter natgateway dependson value
          And User select connection from dropdown
          And User enter natgateway networkinterfaceID value
          And User enter natgateway privateIp value
          And User enter natgateway publicIp value
          Then User should see message environment saved successfully
          When User click on canvas
	      Then User click on deploy button and check deployment status
          When User click on canvas
          When User click on logs button on dash board
		  And User click on refresh button on logs window
	      And User click on cross close button on logs window 
          When User click on destroy button
		  Then User should see message environment destroyed sucessfully
	      Then User delete NAT Gateway environment and see message environment deleted sucessfully
	      
@Sanity 
Scenario: Validate cross close button under resource log for Natgateway
#Test Case no:13
		  Then User search or create environment for NAT Gateway and see message as environment created successfully
          Then User click on VPC resource and entered all the attribute values for natgateway
          Then User click on subnet resource and entered all the attribute values for natgateway
          Then User again click on subnet resource and entered all the attribute values for natgateway
          When User click route table resource and drag on the dashboard for natgateway 
          And User enter route table resource name for NAT Gateway
	      Then Message should display resource created successfully
          And User enter route table vpc id for natgateway
          And User set json for route for natgateway
          When User click route table resource and drag on the dashboard for natgateway
          And User again enter route table resource name for NAT Gateway
          Then Message should display resource created successfully
          And User again enter route table vpc id for natgateway
          And User again set json for route for natgateway
          When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
          And User enter internet gateway resource name for NAT Gateway
          Then Message should display resource created successfully
          And User enter route table vpc id for natgateway
          When User click EIP resource and drag on the dashboard for natgateway 
          And User enter EIP resource name for NAT Gateway
          Then Message should display resource created successfully
          When User click RTA resource and drag on the dashboard
          And User enter RTA resource name for NAT Gateway 
          Then Message should display resource created successfully
          And User enter route table id of Route table Association for natgateway
	      And User enter subnet id of Route table Association for natgateway
          When User click NAT Gateway resource and drag on the dashboard
          And User enter NAT Gateway resource name for NAT Gateway 
     	  Then Message should display resource created successfully
          And User enter allocation id for NAT gateway resource
          And User enter subnet id of Route table Association for natgateway
          And User enter natgateway dependson value
          And User select connection from dropdown
          And User enter natgateway networkinterfaceID value
          And User enter natgateway privateIp value
          And User enter natgateway publicIp value
          Then User should see message environment saved successfully
          When User click on canvas
	      Then User click on deploy button and check deployment status
          When User click on canvas
          When User click on logs button on dash board
	      And User click on cross close button on logs window 
          When User click on destroy button
		  Then User should see message environment destroyed sucessfully
	      Then User delete NAT Gateway environment and see message environment deleted sucessfully	  

@Sanity     
Scenario: Validate dont destroy after destroy for Natgateway
#Test Case no:15
		  Then User search or create environment for NAT Gateway and see message as environment created successfully
          Then User click on VPC resource and entered all the attribute values for natgateway
          Then User click on subnet resource and entered all the attribute values for natgateway
          Then User again click on subnet resource and entered all the attribute values for natgateway
          When User click route table resource and drag on the dashboard for natgateway 
          And User enter route table resource name for NAT Gateway
	      Then Message should display resource created successfully
          And User enter route table vpc id for natgateway
          And User set json for route for natgateway
          When User click route table resource and drag on the dashboard for natgateway
          And User again enter route table resource name for NAT Gateway
          Then Message should display resource created successfully
          And User again enter route table vpc id for natgateway
          And User again set json for route for natgateway
          When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
          And User enter internet gateway resource name for NAT Gateway
          Then Message should display resource created successfully
          And User enter route table vpc id for natgateway
          When User click EIP resource and drag on the dashboard for natgateway 
          And User enter EIP resource name for NAT Gateway
          Then Message should display resource created successfully
          When User click RTA resource and drag on the dashboard for natgateway
          And User enter RTA resource name for NAT Gateway 
          Then Message should display resource created successfully
          And User enter route table id of Route table Association for natgateway
	      And User enter subnet id of Route table Association for natgateway
          When User click NAT Gateway resource and drag on the dashboard
          And User enter NAT Gateway resource name for NAT Gateway 
     	  Then Message should display resource created successfully
          And User enter allocation id for NAT gateway resource
          And User enter subnet id of Route table Association for natgateway
          And User enter natgateway dependson value
          And User select connection from dropdown
          And User enter natgateway networkinterfaceID value
          And User enter natgateway privateIp value
          And User enter natgateway publicIp value
          Then User should see message environment saved successfully
		  Then User click on deploy button and check deployment status
          When User click on destroy button
	      Then User click on dont destroy button
          When User click on destroy button
		  Then User should see message environment destroyed sucessfully
	      Then User delete NAT Gateway environment and see message environment deleted sucessfully	  

@Sanity   
Scenario: Validate search box on right sidebar under resource details for Natgateway
#Test Case no:17
		  Then User search or create environment for NAT Gateway and see message as environment created successfully
          Then User click on VPC resource and entered all the attribute values for natgateway
          Then User click on subnet resource and entered all the attribute values for natgateway
          Then User again click on subnet resource and entered all the attribute values for natgateway
          When User click route table resource and drag on the dashboard for natgateway 
          And User enter route table resource name for NAT Gateway
	      Then Message should display resource created successfully
          And User enter route table vpc id for natgateway
          And User set json for route for natgateway
          When User click route table resource and drag on the dashboard for natgateway
          And User again enter route table resource name for NAT Gateway
          Then Message should display resource created successfully
          And User again enter route table vpc id for natgateway
          And User again set json for route for natgateway
          When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
          And User enter internet gateway resource name for NAT Gateway
          Then Message should display resource created successfully
          And User enter route table vpc id for natgateway
          When User click EIP resource and drag on the dashboard for natgateway 
          And User enter EIP resource name for NAT Gateway
          Then Message should display resource created successfully
          When User click RTA resource and drag on the dashboard for natgateway
          And User enter RTA resource name for NAT Gateway 
          Then Message should display resource created successfully
          And User enter route table id of Route table Association for natgateway
	      And User enter subnet id of Route table Association for natgateway
          When User click NAT Gateway resource and drag on the dashboard
          And User enter NAT Gateway resource name for NAT Gateway 
     	  Then Message should display resource created successfully
          And User enter allocation id for NAT gateway resource
          And User enter subnet id of Route table Association for natgateway
          And User enter natgateway dependson value
          And User select connection from dropdown
          And User enter natgateway networkinterfaceID value
          And User enter natgateway privateIp value
          And User enter natgateway publicIp value
          Then User should see message environment saved successfully
		  Then User click on deploy button and check deployment status
          When User click on resource details link on the attribute section
		  Then User search for attributes in the resource details "role"
	      When User click on canvas
          When User click on destroy button
		  Then User should see message environment destroyed sucessfully
	      Then User delete NAT Gateway environment and see message environment deleted sucessfully

@Sanity   
Scenario: Validate search box on right sidebar under resource for Natgateway
#Test Case no:18
		  Then User search or create environment for NAT Gateway and see message as environment created successfully
          Then User click on VPC resource and entered all the attribute values for natgateway
          Then User click on subnet resource and entered all the attribute values for natgateway
          Then User again click on subnet resource and entered all the attribute values for natgateway
          When User click route table resource and drag on the dashboard for natgateway 
          And User enter route table resource name for NAT Gateway
	      Then Message should display resource created successfully
          And User enter route table vpc id for natgateway
          And User set json for route for natgateway
          When User click route table resource and drag on the dashboard for natgateway
          And User again enter route table resource name for NAT Gateway
          Then Message should display resource created successfully
          And User again enter route table vpc id for natgateway
          And User again set json for route for natgateway
          When User click Internet Gateway resource and drag on the dashboard for Internet Gateway
          And User enter internet gateway resource name for NAT Gateway
          Then Message should display resource created successfully
          And User enter route table vpc id for natgateway
          When User click EIP resource and drag on the dashboard for natgateway 
          And User enter EIP resource name for NAT Gateway
          Then Message should display resource created successfully
          When User click RTA resource and drag on the dashboard for natgateway
          And User enter RTA resource name for NAT Gateway 
          Then Message should display resource created successfully
          And User enter route table id of Route table Association for natgateway
	      And User enter subnet id of Route table Association for natgateway
          When User click NAT Gateway resource and drag on the dashboard
          And User enter NAT Gateway resource name for NAT Gateway 
     	  Then Message should display resource created successfully
          And User enter allocation id for NAT gateway resource
          And User enter subnet id of Route table Association for natgateway
          And User enter natgateway dependson value
          And User select connection from dropdown
          And User enter natgateway networkinterfaceID value
          And User enter natgateway privateIp value
          And User enter natgateway publicIp value
          Then User should see message environment saved successfully
		  Then User click on deploy button and check deployment status
          When User click on resource link on the attribute section
		  Then User search for attributes in the resource section "vpc"
          When User click on destroy button
		  Then User should see message environment destroyed sucessfully
	      Then User delete NAT Gateway environment and see message environment deleted sucessfully
	      
	      

 
