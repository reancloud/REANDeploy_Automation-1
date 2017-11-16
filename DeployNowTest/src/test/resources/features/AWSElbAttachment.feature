@RegressionTest
Feature: Automation test on ELB Attachment Resource
	
	Background: 
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display 


@tested @PR
	Scenario: Adding Attributes to ELB Atttachment Resource and Deploy
	#Test Case No:1
	 Then User search or create environment for elb Attachment and see message as environment created successfully
	 And User dragdrop vpc and enter attribute for elbAttachment
	 And User dragdrop subnet and enter attribute for elbAttachment
	 And User dragdrop routetable and enter attribute for elbAttachment
	 And User dragdrop igw and enter attribute for elbAttachment
	 And User dragdrop security group and enter attribute for Instance elbAttachment
	 And User dragdrop RTA and enter attribute for elbAttachment
	 And User dragdrop ELB and enter attribute for elbAttachment
	 And User dragdrop instance and enter attribute for elbAttachment
	 When User click elbAttachment resource and drag on the dashboard
	 And User enter elbAttachment resource name
	 Then Message should display resource created successfully
	 And User fill the elb attribute for elb Attachment Resource
	 And User fill the instance attribute for elb Attachment Resource
	 And User fill the Depends on attribute for elb Attachment Resource
	 And User fill the connection attribute for elb Attachment Resource
	 Then User should see message environment saved successfully
	 When User click on canvas
	 Then User click deploy button and should see message environment deployed successfully
	 When User click on destroy button
	 Then User should see message environment destroyed sucessfully
	 Then User delete elb Attachment environment and see message environment deleted successfully
	 
 @negativeTest @tested
 	Scenario: Negative test case for ELB Attachmnet resource functionality
	#Test Case No:2
	 Then User search or create environment for elb Attachment and see message as environment created successfully
	 And User dragdrop vpc and enter attribute for elbAttachment
	 And User dragdrop subnet and enter attribute for elbAttachment
	 And User dragdrop routetable and enter attribute for elbAttachment
	 And User dragdrop igw and enter attribute for elbAttachment
	  And User dragdrop security group and enter attribute for Instance elbAttachment
	 And User dragdrop RTA and enter attribute for elbAttachment
	 And User dragdrop ELB and enter attribute for elbAttachment
	 And User dragdrop instance and enter attribute for elbAttachment
	 When User click elbAttachment resource and drag on the dashboard
	 And User enter elbAttachment resource name
	 Then Message should display resource created successfully
	 And User enters the elb attribute for elb Attachment Resource as empty
	 And User fill the instance attribute for elb Attachment Resource
	 And User fill the Depends on attribute for elb Attachment Resource
	 And User fill the connection attribute for elb Attachment Resource
	 Then User should see message environment saved successfully
	 Then User click deploy button and should see popup error message
	 Then User delete elb Attachment environment and see message environment deleted successfully
	
	@tested
 	Scenario: Checking Functionality of Create button if Resource name is empty
	#Test Case No:3 
	 Then User search or create environment for elb Attachment and see message as environment created successfully
	 And User dragdrop vpc and enter attribute for elbAttachment
	 And User dragdrop subnet and enter attribute for elbAttachment
	 And User dragdrop routetable and enter attribute for elbAttachment
	 And User dragdrop igw and enter attribute for elbAttachment
	  And User dragdrop security group and enter attribute for Instance elbAttachment
	 And User dragdrop RTA and enter attribute for elbAttachment
	 And User dragdrop ELB and enter attribute for elbAttachment
	 And User dragdrop instance and enter attribute for elbAttachment
	 When User click elbAttachment resource and drag on the dashboard
	 And User enter elbAttachment resource name as empty
	 Then click on create btn and displays error message
	 Then User delete elb Attachment environment and see message environment deleted successfully
	 
	 @tested 
	 Scenario: Checking Functionality of Create button if Resource name is same as existing resource
	#Test Case No:4
	 Then User search or create environment for elb Attachment and see message as environment created successfully
	 And User dragdrop vpc and enter attribute for elbAttachment
	 And User dragdrop subnet and enter attribute for elbAttachment
	 And User dragdrop routetable and enter attribute for elbAttachment
	 And User dragdrop igw and enter attribute for elbAttachment
	 And User dragdrop security group and enter attribute for Instance elbAttachment
	 And User dragdrop RTA and enter attribute for elbAttachment
	 And User dragdrop ELB and enter attribute for elbAttachment
	 And User dragdrop instance and enter attribute for elbAttachment
	 When User click elbAttachment resource and drag on the dashboard
	 And User enter elbAttachment resource name as existing resource name
	 Then click on create btn and displays error message
	 Then User delete elb Attachment environment and see message environment deleted successfully
	 
	

 
   @tested
  Scenario: Checking Delete button and Please delete button functionality after creation of resource
  #Test Case No:6
	Then User search or create environment for elb Attachment and see message as environment created successfully
	And User dragdrop vpc and enter attribute for elbAttachment
	And User dragdrop subnet and enter attribute for elbAttachment
	And User dragdrop routetable and enter attribute for elbAttachment
	And User dragdrop igw and enter attribute for elbAttachment
	And User dragdrop security group and enter attribute for Instance elbAttachment
	And User dragdrop RTA and enter attribute for elbAttachment
	And User dragdrop ELB and enter attribute for elbAttachment
	And User dragdrop instance and enter attribute for elbAttachment
	When User click elbAttachment resource and drag on the dashboard
	And User enter elbAttachment resource name
	Then Message should display resource created successfully
	When User click on canvas
	And User click on please delete if resource need to be deleted for elba
	Then User delete elb Attachment environment and see message environment deleted successfully
	
	@tested
	Scenario: Checking Delete button and Dont delete button functionality after creation of resource
  #Test Case No:7
  Then User search or create environment for elb Attachment and see message as environment created successfully
	And User dragdrop vpc and enter attribute for elbAttachment
	And User dragdrop subnet and enter attribute for elbAttachment
	And User dragdrop routetable and enter attribute for elbAttachment
	And User dragdrop igw and enter attribute for elbAttachment
	And User dragdrop security group and enter attribute for Instance elbAttachment
	And User dragdrop RTA and enter attribute for elbAttachment
	And User dragdrop ELB and enter attribute for elbAttachment
	And User dragdrop instance and enter attribute for elbAttachment
	 When User click elbAttachment resource and drag on the dashboard
	 And User enter elbAttachment resource name
	 Then Message should display resource created successfully
	 When User click on canvas
	 And User click on dont delete if resource need to be deleted for elba
	Then User delete elb Attachment environment and see message environment deleted successfully
	 
	 @tested @Rname
   Scenario: Checking Save button functionality after editing name which is already created
  #Test Case No:5 
   Then User search or create environment for elb Attachment and see message as environment created successfully
	And User dragdrop vpc and enter attribute for elbAttachment
	 And User dragdrop subnet and enter attribute for elbAttachment
	 And User dragdrop routetable and enter attribute for elbAttachment
	 And User dragdrop igw and enter attribute for elbAttachment
	  And User dragdrop security group and enter attribute for Instance elbAttachment
	 And User dragdrop RTA and enter attribute for elbAttachment
	 And User dragdrop ELB and enter attribute for elbAttachment
 	  And User dragdrop instance and enter attribute for elbAttachment
	 When User click elbAttachment resource and drag on the dashboard
	 And User enter elbAttachment resource name
	 Then Message should display resource created successfully
	 When User click on canvas
	 When User click on elbAttachment resource
	 Then User click on resource name on rightsidebar
	 When User click the name text box to edit elbaresource name "adn-ELBA"
	 When User click save button on pop up of resource name link
	  Then User should see message environment saved successfully
	  Then User delete elb Attachment environment and see message environment deleted successfully 
  
	@tested
	Scenario: Checking the functionality of Resource name link on right sidebar
	#Test Case No:8
    Then User search or create environment for elb Attachment and see message as environment created successfully
	And User dragdrop vpc and enter attribute for elbAttachment
  	And User dragdrop subnet and enter attribute for elbAttachment
	And User dragdrop routetable and enter attribute for elbAttachment
	And User dragdrop igw and enter attribute for elbAttachment
	And User dragdrop security group and enter attribute for Instance elbAttachment
	And User dragdrop RTA and enter attribute for elbAttachment
	And User dragdrop ELB and enter attribute for elbAttachment
	And User dragdrop instance and enter attribute for elbAttachment
	When User click elbAttachment resource and drag on the dashboard
	And User enter elbAttachment resource name
	Then Message should display resource created successfully
	When User click on canvas
	When User click on elbAttachment resource
	Then User click on resource name on rightsidebar
	
	@tested
	 Scenario: Checking Close button functionality on resource edit name pop up
  #Test Case No:9
   Then User search or create environment for elb Attachment and see message as environment created successfully
	 And User dragdrop vpc and enter attribute for elbAttachment
	 And User dragdrop subnet and enter attribute for elbAttachment
	 And User dragdrop routetable and enter attribute for elbAttachment
	 And User dragdrop igw and enter attribute for elbAttachment
	 And User dragdrop security group and enter attribute for Instance elbAttachment
	 And User dragdrop RTA and enter attribute for elbAttachment
	 And User dragdrop ELB and enter attribute for elbAttachment
	 And User dragdrop instance and enter attribute for elbAttachment
	 When User click elbAttachment resource and drag on the dashboard
	 And User enter elbAttachment resource name
	 Then Message should display resource created successfully
	 When User click on canvas
	 When User click on elbAttachment resource
	 Then User click on resource name on rightsidebar
	 Then User click close button on pop up of resource name link
	 
	 @tested
	 Scenario: Checking Cross button functionality on resource edit name pop up
  #Test Case No:10
   Then User search or create environment for elb Attachment and see message as environment created successfully
	 And User dragdrop vpc and enter attribute for elbAttachment
	 And User dragdrop subnet and enter attribute for elbAttachment
	 And User dragdrop routetable and enter attribute for elbAttachment
	 And User dragdrop igw and enter attribute for elbAttachment
	 And User dragdrop security group and enter attribute for Instance elbAttachment
	 And User dragdrop RTA and enter attribute for elbAttachment
	 And User dragdrop ELB and enter attribute for elbAttachment
	 And User dragdrop instance and enter attribute for elbAttachment
	 When User click elbAttachment resource and drag on the dashboard
	 And User enter elbAttachment resource name
	 Then Message should display resource created successfully
	 When User click on canvas
	 When User click on elbAttachment resource
	 Then User click on resource name on rightsidebar
	 Then User click cross button on pop up of resource name link
	 	
		@tested 
		Scenario: Checking Save button functionality on Resource name pop up
		 #Test Case No:11 
     Then User search or create environment for elb Attachment and see message as environment created successfully
	 And User dragdrop vpc and enter attribute for elbAttachment
	 And User dragdrop subnet and enter attribute for elbAttachment
	 And User dragdrop routetable and enter attribute for elbAttachment
	 And User dragdrop igw and enter attribute for elbAttachment
	 And User dragdrop security group and enter attribute for Instance elbAttachment
	 And User dragdrop RTA and enter attribute for elbAttachment
	 And User dragdrop ELB and enter attribute for elbAttachment
	 And User dragdrop instance and enter attribute for elbAttachment
	 When User click elbAttachment resource and drag on the dashboard
	 And User enter elbAttachment resource name
	 Then Message should display resource created successfully
	 When User click on canvas
	 When User click on elbAttachment resource
	 Then User click on resource name on rightsidebar
	 When User click the name text box to edit elbaresource name ""
	 Then User click save button on pop up of resource name link
	 
	 @tested
	 Scenario: Checking Cross close button functionality on naming resource after drag and drop
	 #Test Case No:12
	 Then User search or create environment for elb Attachment and see message as environment created successfully
	 When User click elbAttachment resource and drag on the dashboard
	 Then User click on the cross close button when user drags the resource from resource section
	 
	 @tested
	 Scenario: Checking Close button functionality on naming resource after drag and drop
	 #Test Case No:13
	 Then User search or create environment for elb Attachment and see message as environment created successfully
	 When User click elbAttachment resource and drag on the dashboard
	 Then User click on the close button when user drags the resource from resource section
	 	 
	 @tested 
	 Scenario: Checking save button functionality  on dashboard.
	 #Test Case No:14
	  Then User search or create environment for elb Attachment and see message as environment created successfully
	 And User dragdrop vpc and enter attribute for elbAttachment
	 And User dragdrop subnet and enter attribute for elbAttachment
	 And User dragdrop routetable and enter attribute for elbAttachment
	 And User dragdrop igw and enter attribute for elbAttachment
	 And User dragdrop security group and enter attribute for Instance elbAttachment
	 And User dragdrop RTA and enter attribute for elbAttachment
	 And User dragdrop ELB and enter attribute for elbAttachment
	 And User dragdrop instance and enter attribute for elbAttachment
	 When User click elbAttachment resource and drag on the dashboard
	 And User enter elbAttachment resource name
	 Then Message should display resource created successfully
	 And User fill the elb attribute for elb Attachment Resource
	 And User fill the instance attribute for elb Attachment Resource
	 And User fill the Depends on attribute for elb Attachment Resource
	 And User fill the connection attribute for elb Attachment Resource
	 
	 Then User should see message environment saved successfully
	 
	 @tested
	 Scenario: Checking Deploy button functionality on dashboard.
	 #Test Case No:15
		 Then User search or create environment for elb Attachment and see message as environment created successfully
		 And User dragdrop vpc and enter attribute for elbAttachment
		 And User dragdrop subnet and enter attribute for elbAttachment
		 And User dragdrop routetable and enter attribute for elbAttachment
		 And User dragdrop igw and enter attribute for elbAttachment
		 And User dragdrop security group and enter attribute for Instance elbAttachment
		 And User dragdrop RTA and enter attribute for elbAttachment
		 And User dragdrop ELB and enter attribute for elbAttachment
		 And User dragdrop instance and enter attribute for elbAttachment
		 When User click elbAttachment resource and drag on the dashboard
		 And User enter elbAttachment resource name
		 Then Message should display resource created successfully
		 And User fill the elb attribute for elb Attachment Resource
		 And User fill the instance attribute for elb Attachment Resource
		 And User fill the Depends on attribute for elb Attachment Resource
		 And User fill the connection attribute for elb Attachment Resource
		 Then User should see message environment saved successfully
		 When User click on canvas
		 Then User click deploy button and should see message environment deployed successfully
		 
		 @tested
	 Scenario: Check Close button functionality when user clicks on resource logs button
	 #Test Case No:16
	  Then User search or create environment for elb Attachment and see message as environment created successfully
		 And User dragdrop vpc and enter attribute for elbAttachment
		 And User dragdrop subnet and enter attribute for elbAttachment
		 And User dragdrop routetable and enter attribute for elbAttachment
		 And User dragdrop igw and enter attribute for elbAttachment
		 And User dragdrop security group and enter attribute for Instance elbAttachment
		 And User dragdrop RTA and enter attribute for elbAttachment
		 And User dragdrop ELB and enter attribute for elbAttachment
		 And User dragdrop instance and enter attribute for elbAttachment
		 When User click elbAttachment resource and drag on the dashboard
		 And User enter elbAttachment resource name
		 Then Message should display resource created successfully
		 And User fill the elb attribute for elb Attachment Resource
		 And User fill the instance attribute for elb Attachment Resource
		 And User fill the Depends on attribute for elb Attachment Resource
		 And User fill the connection attribute for elb Attachment Resource
		 Then User should see message environment saved successfully
		 When User click on canvas
		 Then User click deploy button and should see message environment deployed successfully
     When User click on logs button on dash board
	   And User click on close button on logs window		
	 
	 @tested
	 Scenario: Check Refresh button functionality when user clicks on resource logs button
	 #Test Case No:17
	  Then User search or create environment for elb Attachment and see message as environment created successfully
		 And User dragdrop vpc and enter attribute for elbAttachment
		 And User dragdrop subnet and enter attribute for elbAttachment
		 And User dragdrop routetable and enter attribute for elbAttachment
		 And User dragdrop igw and enter attribute for elbAttachment
		 And User dragdrop security group and enter attribute for Instance elbAttachment
		 And User dragdrop RTA and enter attribute for elbAttachment
		 And User dragdrop ELB and enter attribute for elbAttachment
		 And User dragdrop instance and enter attribute for elbAttachment
		 When User click elbAttachment resource and drag on the dashboard
		 And User enter elbAttachment resource name
		 Then Message should display resource created successfully
		 And User fill the elb attribute for elb Attachment Resource
		 And User fill the instance attribute for elb Attachment Resource
		 And User fill the Depends on attribute for elb Attachment Resource
		 And User fill the connection attribute for elb Attachment Resource
		 Then User should see message environment saved successfully
		 When User click on canvas
		 Then User click deploy button and should see message environment deployed successfully
     When User click on logs button on dash board
	   And User click on refresh button on logs window
	 
	  @tested 
	 	 Scenario: Check Cross close button functionality when user clicks on resource logs button
	 #Test Case No:18
	  Then User search or create environment for elb Attachment and see message as environment created successfully
		 And User dragdrop vpc and enter attribute for elbAttachment
		 And User dragdrop subnet and enter attribute for elbAttachment
		 And User dragdrop routetable and enter attribute for elbAttachment
		 And User dragdrop igw and enter attribute for elbAttachment
		 And User dragdrop security group and enter attribute for Instance elbAttachment
		 And User dragdrop RTA and enter attribute for elbAttachment
		 And User dragdrop ELB and enter attribute for elbAttachment
		 And User dragdrop instance and enter attribute for elbAttachment
		 When User click elbAttachment resource and drag on the dashboard
		 And User enter elbAttachment resource name
		 Then Message should display resource created successfully
		 And User fill the elb attribute for elb Attachment Resource
		 And User fill the instance attribute for elb Attachment Resource
		 And User fill the Depends on attribute for elb Attachment Resource
		 And User fill the connection attribute for elb Attachment Resource
		 Then User should see message environment saved successfully
		 When User click on canvas
		 Then User click deploy button and should see message environment deployed successfully
     When User click on logs button on dash board
     And User click on cross close button on logs window
	     
	   @tested
	   Scenario: Check Redeploy button functionality on the dashboard
	 #Test Case No:19
	  Then User search or create environment for elb Attachment and see message as environment created successfully
		 And User dragdrop vpc and enter attribute for elbAttachment
		 And User dragdrop subnet and enter attribute for elbAttachment
		 And User dragdrop routetable and enter attribute for elbAttachment
		 And User dragdrop igw and enter attribute for elbAttachment
		 And User dragdrop security group and enter attribute for Instance elbAttachment
		 And User dragdrop RTA and enter attribute for elbAttachment
		 And User dragdrop ELB and enter attribute for elbAttachment
		 And User dragdrop instance and enter attribute for elbAttachment
		 When User click elbAttachment resource and drag on the dashboard
		 And User enter elbAttachment resource name
		 Then Message should display resource created successfully
		 And User fill the elb attribute for elb Attachment Resource
		 And User fill the instance attribute for elb Attachment Resource
		 And User fill the Depends on attribute for elb Attachment Resource
		 And User fill the connection attribute for elb Attachment Resource
		 Then User should see message environment saved successfully
		 When User click on canvas
		 Then User click deploy button and should see message environment deployed successfully
     Then User click redeploy button and should see message environment deployed successfully
     
     @tested 
     Scenario: Checking YES DESTROY IT Button functionality when user clicks on Destroy button
     #Test Case No:20
     Then User search or create environment for elb Attachment and see message as environment created successfully
		 And User dragdrop vpc and enter attribute for elbAttachment
		 And User dragdrop subnet and enter attribute for elbAttachment
		 And User dragdrop routetable and enter attribute for elbAttachment
		 And User dragdrop igw and enter attribute for elbAttachment
		 And User dragdrop security group and enter attribute for Instance elbAttachment
		 And User dragdrop RTA and enter attribute for elbAttachment
		 And User dragdrop ELB and enter attribute for elbAttachment
		 And User dragdrop instance and enter attribute for elbAttachment
		 When User click elbAttachment resource and drag on the dashboard
		 And User enter elbAttachment resource name
		 Then Message should display resource created successfully
		 And User fill the elb attribute for elb Attachment Resource
		 And User fill the instance attribute for elb Attachment Resource
		 And User fill the Depends on attribute for elb Attachment Resource
		 And User fill the connection attribute for elb Attachment Resource
		 Then User should see message environment saved successfully
		 When User click on canvas
		 Then User click deploy button and should see message environment deployed successfully
    	 When User click on destroy button
	  	 Then User should see message environment destroyed sucessfully
     
     @tested
     Scenario: Checking DONT DESTROY IT Button functionality when user clicks on Destroy button
     #Test Case No:21
     Then User search or create environment for elb Attachment and see message as environment created successfully
		 And User dragdrop vpc and enter attribute for elbAttachment
		 And User dragdrop subnet and enter attribute for elbAttachment
		 And User dragdrop routetable and enter attribute for elbAttachment
		 And User dragdrop igw and enter attribute for elbAttachment
		 And User dragdrop security group and enter attribute for Instance elbAttachment
		 And User dragdrop RTA and enter attribute for elbAttachment
		 And User dragdrop ELB and enter attribute for elbAttachment
		 And User dragdrop instance and enter attribute for elbAttachment
		 When User click elbAttachment resource and drag on the dashboard
		 And User enter elbAttachment resource name
		 Then Message should display resource created successfully
		 And User fill the elb attribute for elb Attachment Resource
		 And User fill the instance attribute for elb Attachment Resource
		 And User fill the Depends on attribute for elb Attachment Resource
		 And User fill the connection attribute for elb Attachment Resource
		 Then User should see message environment saved successfully
		 When User click on canvas
		 Then User click deploy button and should see message environment deployed successfully
    	 When User click on destroy button
    	 Then User click on dont destroy button
     
     @tested
     Scenario: Check Search functionality under Resource link on RightSide after deployment
     #Test Case No:22
	   Then User search or create environment for elb Attachment and see message as environment created successfully
		 And User dragdrop vpc and enter attribute for elbAttachment
		 And User dragdrop subnet and enter attribute for elbAttachment
		 And User dragdrop routetable and enter attribute for elbAttachment
		 And User dragdrop igw and enter attribute for elbAttachment
		 And User dragdrop security group and enter attribute for Instance elbAttachment
		 And User dragdrop RTA and enter attribute for elbAttachment
		 And User dragdrop ELB and enter attribute for elbAttachment
		 And User dragdrop instance and enter attribute for elbAttachment
		 When User click elbAttachment resource and drag on the dashboard
		 And User enter elbAttachment resource name
		 Then Message should display resource created successfully
		 And User fill the elb attribute for elb Attachment Resource
		 And User fill the instance attribute for elb Attachment Resource
		 And User fill the Depends on attribute for elb Attachment Resource
		 And User fill the connection attribute for elb Attachment Resource
		 Then User should see message environment saved successfully
		 Then User click deploy button and should see message environment deployed successfully
       	 And User click on resource link on the attribute section
		 Then User search for attributes in the resource section "Connection"
		 Then User select connection from dropdown
     
     @tested
     Scenario: Check Search functionality under Resource Details link on RightSide after deployment
     #Test Case No:23 
         Then User search or create environment for elb Attachment and see message as environment created successfully
		 And User dragdrop vpc and enter attribute for elbAttachment
		 And User dragdrop subnet and enter attribute for elbAttachment
		 And User dragdrop routetable and enter attribute for elbAttachment
		 And User dragdrop igw and enter attribute for elbAttachment
		 And User dragdrop security group and enter attribute for Instance elbAttachment
		 And User dragdrop RTA and enter attribute for elbAttachment
		 And User dragdrop ELB and enter attribute for elbAttachment
		 And User dragdrop instance and enter attribute for elbAttachment
		 When User click elbAttachment resource and drag on the dashboard
		 And User enter elbAttachment resource name
		 Then Message should display resource created successfully
		 And User fill the elb attribute for elb Attachment Resource
		 And User fill the instance attribute for elb Attachment Resource
		 And User fill the Depends on attribute for elb Attachment Resource
		 And User fill the connection attribute for elb Attachment Resource
		 Then User should see message environment saved successfully
		 Then User click on deploy button and check deployment status
	  	 When User click on canvas
		 When User click on elb Attachment resource
		 When User click on resource details link on the attribute section
		 Then User search for ELBA attributes in the resource details "id"
     	 When User click on destroy button
	     Then User should see message environment destroyed sucessfully
		 Then User delete elb Attachment environment and see message environment deleted successfully
      