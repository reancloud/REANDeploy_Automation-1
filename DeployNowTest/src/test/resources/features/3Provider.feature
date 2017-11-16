@RegressionTest @Smoke @Sanity 
Feature: Access Provider

Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	When User click dropdown link on dashboard
	
@Suite4 @Smoke @Sanity   
Scenario: To check the functionality of provider link
#Test case no 1 
	And  User click provider link on welcome dropdown
 	Then User should see provider page

@Suite4 @Smoke @Sanity
 Scenario: To check the functionality of provider Name text box
 #Test case no 2 
 	And User click provider link on welcome dropdown
 	Then User should see provider page
 	And User enter provider name aws 
    Then User click save button and validate messagebox on provider page
    
@Suite4 @Smoke @Sanity
 Scenario: To check the functionality of provider type when all the fields are left bank
 #Test case no 3
 	And User click provider link on welcome dropdown
 	Then User should see provider page
    And User enter provider type aws
    Then User click save button and validate messagebox on provider page
     
 @Suite4 @Smoke @Sanity
 Scenario: To check the functionality of compact button on provider page 
 #Test case no 4
 	And User click provider link on welcome dropdown
 	Then User should see provider page
    And User enter provider type aws
    Then User validate compact button on provider page
  
 @Suite4 @Smoke @Sanity
 Scenario: To check the functionality of format button on provider page
 #Test case no 5
 	And User click provider link on welcome dropdown
 	Then User should see provider page
    And User enter provider type aws
    Then User validate format button on provider page 

 @Suite4 @Smoke @Sanity
Scenario: Validate save button on provider page when all fields are left blank.
 #Test case no 17
 	And User click provider link on welcome dropdown
 	Then User should see provider page
    Then User click save button and validate messagebox on provider page
  
 @Suite0 @Smoke @Sanity
Scenario: Validate save button when provider name,type,details is entered for aws
#Test case no 18
	And User click provider link on welcome dropdown
 	Then User should see provider page
   	And User enter provider name aws 
   	And User enter provider type aws
   	And User edit provider details
    Then User click save button and validate messagebox on provider page
   	
@Suite4 @Smoke @Sanity
Scenario: Validate provider type DigitalOcean on provider page 
#Test case no 19
	And User click provider link on welcome dropdown
 	Then User should see provider page
   	Then User enter provider name digitaOcean
    And User enter provider type digitalOcean
    Then User click save button and validate messagebox on provider page
    #And User delete digitalOcean provider 
    

@Suite4 @Smoke @Sanity
Scenario: Validate provider type Azure on provider page 
#Test case no 20
	And User click provider link on welcome dropdown
 	Then User should see provider page
   	And User enter provider name azure
    And User enter provider type azure
    Then User click save button and validate messagebox on provider page
    #And User delete azure provider
    

@Suite4 @Smoke @Sanity
Scenario: Validate the provider type Docker on provider page 
#Test case no 21
	And User click provider link on welcome dropdown
 	Then User should see provider page
   	And User enter provider name docker
    And User enter provider type docker
    Then User click save button and validate messagebox on provider page
    #And User delete docker provider
    
    
 @Suite4 @Smoke @Sanity
 Scenario: Validate provider type vShere on provider page 
 #Test case no 22
 	And User click provider link on welcome dropdown
 	Then User should see provider page
   	And User enter provider name vsphere
    And User enter provider type vsphere
    Then User click save button and validate messagebox on provider page
    #And User delete vsphere provider
    
@Suite4 @Smoke @Sanity
Scenario: Validate the click functionality of New button on provider page
#Test case no 23
	And User click provider link on welcome dropdown
 	Then User should see provider page
   	And User enter provider name aws 
    And User enter provider type aws
    And User edit provider details
    Then User click new button on provider page
    
 @Suite4 @Smoke @Sanity
Scenario: Validate the delete button on provider page when vspher is selected
#Test case no 24
    And User click provider link on welcome dropdown
 	Then User should see provider page
   	And User enter provider name vsphere
    And User enter provider type vsphere
    Then User click save button and validate messagebox on provider page
    #And User delete vsphere provider
    
@Suite4 @Smoke @Sanity
Scenario: Validate the Edit button when Provider name is changed
#Test case no 25
	And User click provider link on welcome dropdown
 	Then User should see provider page
	Then User click new button on provider page
    And User enter provider name azure
    And User enter provider type azure
    Then User click save button and validate messagebox on provider page
    When User click on edit button on provider page
    And User edit provider name  
   Then User click update button and validate messagebox on provider page
    #And User delete edited provider
    
   	
#@Suite4 @Smoke @Sanity
# Scenario: Validate the Edit button when Provider type is changed
# #Test case no 26
# 	And  User click provider link on welcome dropdown
# 	Then User should see provider page
# 	Then User click new button on provider page
#   	And User enter provider name azure
#    And User enter provider type azure
#    Then User click save button and validate messagebox on provider page
#    When User click on edit button on provider page
#    And User edit provider type
#   Then User click update button and validate messagebox on provider page
#    #And User delete edited provider
    
   	
@Suite4 @Smoke @Sanity
Scenario: Validate the Edit button when Provider detail is changed
    #Test case no 27
	And User click provider link on welcome dropdown
 	Then User should see provider page
	And User enter provider name azure
    And User enter provider type azure
    Then User click save button and validate messagebox on provider page
    When User click on edit button on provider page
    Then User click new button on provider page
    And User enter provider name azure
    #And User enter provider type azure
    And User enter provider details 
    Then User click save button and validate messagebox on provider page
   	#And User delete edited provider
	
	
			#@P3  @Suite4 @ProviderAll 
			#Scenario: Validate scroll bar on provider page under provider list section 
			#Test case no 28
				#And User click provider link on welcome dropdown
			 	#Then User should see provider page
			    #Then User validate scroll bar on provider page
@Suite4 @Smoke @Sanity
Scenario: Validate click functionality of edit button on provider page
#Test case no 29
 	And User click provider link on welcome dropdown
 	Then User should see provider page
	And User enter provider name azure
    And User enter provider type azure
    Then User click save button and validate messagebox on provider page
    When User click on edit button on provider page
    #And User delete edited provider

@Suite4 @Smoke @Sanity
Scenario: Validate the click functionality of delete button on provider page
#Test case no 30
	And User click provider link on welcome dropdown
 	Then User should see provider page
	And User enter provider name azure
    And User enter provider type azure
    Then User click save button and validate messagebox on provider page
    #And User delete azure provider
 
