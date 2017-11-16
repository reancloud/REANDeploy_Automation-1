@RegressionTest  @Suite3 @Smoke @Sanity
Feature: Profile Module Testing

Background:
	  	Given User direct to deploy now application
		When User log in
		Then Login sucessfully should display
      	Then User go to the profile page
      
@Smoke @Sanity      
Scenario: Email validation on profile page
       
       When User validate the email in profile page
	   Then User log out	
   
@Smoke @Sanity   
Scenario: To check functionality of Name text box in Profile page
    
	When User enter the name in profile page
  Then User click update button from profile page

@Smoke @Sanity 
Scenario: To check functionality of email text box in Profile page
    
	When User enter the email in profile page
    When User click update button from profile page    

@Smoke @Sanity    
Scenario: To check functionality of Company text box in Profile page
	
	When User enter the company name in profile page
    When User click update button from profile page

#@Smoke @Sanity
#Scenario: To check Password and Re-password text box are enabled
#   Then User go to the profile page
#   When User click on the toggle button from profile page
#   Then User check if password is enabled profile page
#   And User check if re password is enabled profile page
   
#@Smoke @Sanity
#Scenario: Action is performed on Toggle button of profile page 
#	When User click on the toggle button from profile page
#    Then User click off the toggle button from profile page
#    Then User log out

@Smoke @Sanity   
Scenario: To check if blank spaces are allowed in Name text box under Profile page
    
	When User enter blank data in name text box in profile page
	Then User click update button from profile page with blank space in name

@Smoke @Sanity    
Scenario: To check Password and Re-password text box are disabled
	Then User check if password is disabled profile page
    And User check if re password is disabled profile page

@Smoke @Sanity     
Scenario: To check mouse hover functionality on the update button in the profile window
    
	Then User check mouse hover functionality on update button    

@Smoke @Sanity 
Scenario: To check mouse hover functionality on the refer button in the profile window
	Then User check mouse hover functionality on refer button   
#	@Smoke @Sanity
#Scenario: Referring a friend in profile module
    #When User enter friends email
    #When User click update button from profile page
    #Then User refer a friend from profile page
    #Then User log out

#@Smoke @Sanity        
#Scenario: Friends Email validation on profile page
	  # When User validate the friends email in profile page
	  # Then User log out	
    
