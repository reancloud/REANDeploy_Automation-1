@RegressionTest @Suite1 @Smoke @Sanity 
Feature: Environment Module Testing
 
Background: 
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	
@Smoke @Sanity   
Scenario: Validate the click functionality of import button on create environment dropdown.
#Test case no 31
	When User click on import button
	
@Smoke @Sanity  
Scenario: Validate the click functionality of Upload file button on import environment popup.
#Test case no 33
	When User click on import button
	Then User click on upload button on import popup
	And User click on start import button

@Smoke @Sanity
Scenario: Validate the click functionality of Cancel button on import environment popup.
#Test case no 34
	When User click on import button
	Then User click on cancel button on import popup	
	

@Smoke @Sanity 
Scenario: Validate the click functionality of Cross Close button on import environment popup.
#Test case no 35
	When User click on import button
	Then User click on cross button on import popup

@Smoke @Sanity
Scenario: Validate the click functionality of Cancel button on edit environment popup.
#Test case no 34
    Then User create or search an environment for Instance and see message as environment created successfully
	When User click on edit button
	Then User click on cancel button on edit popup


@Smoke @Sanity 
Scenario: Validate the click functionality of Cross Close button on edit environment popup.
#Test case no 35
    Then User create or search an environment for Instance and see message as environment created successfully
	When User click on edit button
	Then User click on cross button on edit popup

@Smoke @Sanity @RegressionTest @envTEST 
Scenario: Validate the click functionality of Update button on edit environment popup for new Environment.
#Test case no
	Then User creates/sees another ssh connection
	Then User creates/sees another aws provider
	Then User search or create environment for VPC and see message as environment created successfully
	When User click on edit button
	Then User enters environment name for edit
	Then User enters environment description for edit
	Then User selects another ssh connection for edit
	Then User selects another aws provider for edit
	And User click on update button on edit popup
	Then User should see message environment updated successfully
	Then User delete "Edit" environment

@Smoke @Sanity @envTEST
Scenario: Validate the click functionality of Update button on edit environment popup for ProviderType change.
#Test case no
	And User create digitalocean provider for environment
	Then User search or create environment for VPC and see message as environment created successfully
	Then User click kmskey resource and drag on the dashboard
	And User enter resource name for kmskey resource
	Then Message should display resource created successfully
	When User click on edit button
	Then User selects Digital Ocean provider for edit
	And User click on update button on edit popup
	Then User should see message environment can not be updated
	Then User delete vpc environment and see message environment deleted sucessfully

@Smoke @Sanity
Scenario: Validate the display of Provider/region in edit environment popup for DEPLOYED Environment.
#Test case no
	Then User search or create environment for VPC and see message as environment created successfully
	Then User click kmskey resource and drag on the dashboard
	And User enter resource name for kmskey resource
	Then Message should display resource created successfully
	Then User click deploy button and should see message environment deployed successfully
	When User click on edit button
	Then User should not see provider in edit popup
	Then User click on cancel button on edit popup
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete "" environment
	
@Smoke @Sanity
Scenario: Validate No button on export environment prompt window
#Test case no 28
	Then User search or create environment for export test 
	When User click on canvas	
	Then User click on export button
	Then User click on export file no button
	Then User delete Export Test environment and see message environment deleted sucessfully
	
@Smoke @Sanity
Scenario: Validate No button on export environment as Blueprint prompt window
#Test case no 29 
	Then User search or create environment for export test 
	When User click on canvas	
	Then User click on export button
	Then User click on export file yes button
	Then User click on export as blueprint no button
	Then User delete Export Test environment and see message environment deleted sucessfully

@Smoke @Sanity
Scenario: Validate yes button on export environment as Blueprint prompt window 
#Test case no 30
	Then User search or create environment for export test 
	Then User click on export button
	Then User click on export file yes button
	Then User click on export as blueprint yes button
	Then User delete Export Test environment and see message environment deleted sucessfully
	

@Smoke @Sanity @Suite0 
Scenario: To check the SSH connection when AWS provider is selected from provider drop down on create environment pop up page  
 #Test Data:Name: PX_SSH_AWS , Description: I am using SSH connection and AWS provider, Connection:PX_SSH, Provider:Auto_AWS
 #Test case no 12
    And  User create connection for environment
    And User create provider for environment	
	And User enter details in environment window for AWS provider SSH connection
	Then User delete "" environment

@Smoke @Sanity @RegressionTest @envTEST 
Scenario: To check the if environment region is used for Deploy when AWS provider is selected from provider drop down on create environment pop up and region is selected  
 #Test Data:Name: PX_SSH_AWS , Description: I am using SSH connection and AWS provider, Connection:PX_SSH, Provider:Auto_AWS, Region: us-east-2
 #Test case no
	And  User create connection for environment
	And User create provider for environment
	And User enter details in environment window for AWS provider And region And SSH connection
	Then User click kmskey resource and drag on the dashboard
	And User enter resource name for kmskey resource
	Then Message should display resource created successfully
	Then User click deploy button and should see message environment deployed successfully
	Then User checks arn of kms key for environment region
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete "Kms" environment
	
@Smoke @Sanity @RegressionTest 
Scenario: To check if provider region is used for Deploy when AWS provider is selected from provider drop down on create environment pop up page  
 #Test Data:Name: PX_SSH_AWS , Description: I am using SSH connection and AWS provider, Connection:PX_SSH, Provider:Auto_AWS, Region: us-east-2
 #Test case no
	And  User create connection for environment
	And User create provider for environment
	And User enter details in environment window for AWS provider SSH connection
	Then User click kmskey resource and drag on the dashboard
	And User enter resource name for kmskey resource
	Then Message should display resource created successfully
	Then User click deploy button and should see message environment deployed successfully
	Then User checks arn of kms key for AWS provider region
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
	Then User delete "" environment
	
#@Smoke @Sanity
#Scenario: To check the copy button functionality on create environment drop down
# #Test case no:21
#	And  User search and copy environment for AWS provider SSH connection

@Smoke @Sanity
Scenario: Validate close button on copy environment page.
 #Test case no:22
    And user search and delete copy enviornment
    And User enter details in environment window for AWS provider SSH connection
	Then User click on copy button in environment page
	Then User click on close on the pop up

@Smoke @Sanity
Scenario: Validate the create button on copy environment popup when name is entered.
 #Test case no:23
     And user search and delete copy enviornment
     And  User enter details in environment window for AWS provider SSH connection
	 Then User click on copy button in environment page
	 And User enter name to be copied 
	 Then User click on create environment button on the pop up
	 
@Smoke @Sanity
Scenario: Validate create button on copy environment popup when description is entered.
 #Test case no:24
     And user search and delete copy enviornment
     And User enter details in environment window for AWS provider SSH connection
	 Then User click on copy button in environment page
	 And User enter name to be copied
	 And User enter descrption to be copied 
	 Then User click on create environment button on the pop up	
	
@Smoke @Sanity 	  	
Scenario: Validate create button on create environment popup when provider is selected.
 #Test case no:25
   And user search and delete copy enviornment
   And User enter details in environment window for AWS provider SSH connection
   Then User click on copy button in environment page
   And User enter name to be copied
   And User select provider to be copied 
  Then User click on create environment button on the pop up

@Smoke @Sanity 
Scenario: Validate create button on create environment popup when connection is selected.
 #Test case no:25
   And user search and delete copy enviornment
  Then User search or create environment for export test
	 Then User click on copy button in environment page
	 And User enter name to be copied
	 And User select connection to be copied 
	 Then User click on create environment button on the pop up
	 
@Smoke @Sanity 
Scenario: Validate the click functionality of create button if environment name is duplicate on create environment dropdown . 
 #Test case no 26
    And User create connection for environment
    And User create provider for environment
	And User enter details in environment window for AWS provider SSH connection
    Then User again create environment to verify duplicate on create environment dropdown

	
@Smoke @Sanity   
Scenario: To check the click functionality of drop down button under create environment section
 #Test case no 1
	 Then User click the drop down in environment page
	 And User refresh the page
	  Then User log out
	 
@Smoke @Sanity
Scenario: To check the click functionality of create button on environment page
 #Test case no 2
	 Then User click on create button in environment page
	 Then User click on close on the pop up
	 Then User log out
	
@Smoke @Sanity
Scenario: To check the click functionality of close button on environment pop up
 #Test case no 3
	 Then User click on create button in environment page
	 Then User click on close on the pop up
	 Then User log out
	 
@Smoke @Sanity
Scenario: To check the click functionality of create button on create environment pop up when all field are left blank
 #Test case no 4
	 When User enter blank details in the environment field
	 
@Smoke @Sanity
Scenario: To check the Create button functionality on Create environment pop up page when name is entered
 #Test case no 5
	 Then User click on create button in environment page
	 When User enter only name in environment pop up
	 Then User click on create environment button on the pop up
	 
@Smoke @Sanity
Scenario: To check the Create button functionality on Create environment pop up when name and description is entered
 #Test case no 6	
	 Then User click on create button in environment page
	 When User enter name description in environment pop up
	 Then User click on create environment button on the pop up
	 
@Smoke @Sanity
Scenario: To check the create button functionality on create environment pop up when Name description connection is entered
 #Test case no 7
	 Then User click on create button in environment page
	 When User enter name description connection in environment pop up
	 Then User click on create environment button on the pop up
	 
@Smoke @Sanity
Scenario: To check the search box functionality on create environment  drop down  for environment search
 #Test case no 8
	 Then User search for environment
	 
@Smoke @Sanity
Scenario: To check the SSH connection when Azure provider is selected from provider drop down on create environment pop up page
 #Test case no 9
    And User create connection for environment
    And User create Azure provider for environment
	When User enter details in environment window for azure provider SSH connection
	 
@Smoke @Sanity
Scenario: To check the SSH connection when Docker provider is selected from provider drop down on create environment pop up page
 #Test case no 11 
   	 And User create connection for environment
     And User create Docker provider for environment
	 When User enter details in environment window for Docker provider SSH connection
	 
@Smoke @Sanity
Scenario: To check the SSH connection when DigitalOcean provider is selected from provider drop down on create environment pop up page
 #Test Data:Name: PX_SSH_DigitalOcean , Description: I am using SSH connection and DegitalOcean provider, Connection:PX_SSH, Provider:PX_DigitalOcean	
 #Test case no 13
     And User create connection for environment
     And User create digitalocean provider for environment
	 When User enter details in environment window for Digital Ocean provider SSH connection
	
	 
@Smoke @Sanity
Scenario: To check the SSH connection when V sphere provider is selected  from provider drop down on create environment pop up page
 #Test Data:Name: PX_SSH_Vsphere, Description: I am using SSH connection and V sphere provider, Connection:PX_SSH, Provider:PX_Vsphere
 #Test case no 14
     And User create connection for environment
     And User create Vsphere provider for environment
	 When User enter details in environment window for V sphere provider SSH connection
	
@Smoke @Sanity  
Scenario: To check the WinRM connection when Azure provider from provider is selected drop down on create environment pop up page
 #Test Data:Name: PX_WinRM_Azure , Description: I am using WinRM connection and Azure provider, Connection:PX_WinRM, Provider:PX_Azure
 #Test case no 15
     Then User create winrm connection for environment
     And User create Azure provider for environment
	 When User enter details in environment window for azure provider WinRM connection
	
@Smoke @Sanity
Scenario: To check the WinRM connection when Docker provider is selected from provider drop down on create environment pop up page
 #Test case no 16
     Then User create winrm connection for environment
     And User create Docker provider for environment
	 When User enter details in environment window for Docker provider WinRM connection
	
@Smoke @Sanity
Scenario: To check the WinRM connection when AWS provider is selected from provider drop down on create environment pop up page  
 #Test Data:Name: PX_WinRM_AWS , Description: I am using WinRM connection and AWS provider, Connection:PX_WinRM, Provider:Auto_AWS
 #Test case no 17
     Then User create winrm connection for environment
     And User create provider for environment	
	 When User enter details in environment window for AWS provider WinRM connection
	 
	 
@Smoke @Sanity
Scenario: To check the WinRM connection when DigitalOcean provider is selected from provider drop down on create environment pop up page
 #Test Data:Name: PX_WinRM_DigitalOcean , Description: I am using WinRM connection and DegitalOcean provider, Connection:PX_WinRM, Provider:PX_DigitalOcean	
 #Test case no 18
     Then User create winrm connection for environment
     And User create digitalocean provider for environment
	 When User enter details in environment window for Digital Ocean provider WinRM connection
	 
@Smoke @Sanity 
Scenario: To check the WinRM connection when V sphere provider is selected  from provider drop down on create environment pop up page
 #Test Data:Name: PX_WinRM_Vsphere, Description: I am using WinRM connection and V sphere provider, Connection:PX_WinRM, Provider:PX_Vsphere
 #Test case no 19
    Then User create winrm connection for environment
    And User create Vsphere provider for environment
	 When User enter details in environment window for V sphere provider WinRM connection
	
@Smoke @Sanity	
Scenario: To check the delete button functionality on create environment  drop down for searched environment
 #Test case no 10
	And User create connection for environment
    And User create provider for environment
	And User enter details in environment window for AWS provider SSH connection
	Then User delete "" environment