@RegressionTest @Suite4 @Smoke @Sanity 
Feature: Test on Sign up


Background:
  Given User direct to deploy now application
  When User click on create account link and should see create account page

   		  
@Smoke @Suite0 @Sanity     
Scenario: Click on create an account link and perform action on create new account with valid credential
#Test scenario:14
   		  And User enter valid data to create new account
   		  Then User click on sign up button and should see verification message
   		 
 @Smoke @Sanity	 
Scenario: Click on create an account link and to check if  name is accepting blank spaces
#Test scenario:15
   		 And User enter blank space in name
   	 	
 @Smoke	 @Sanity		 
Scenario: Click on create an account link and perform action on name
#Test scenario:02
   		 Then User enter valid name  
@Smoke	@Sanity   
Scenario: Click on create an account link and perform action on email
#Test scenario:03
   	  	 Then User enter valid email
@Smoke 	@Sanity   
Scenario: Click on create an account link and perform action on password
#Test scenario:04
   		 Then User enter valid password
 @Smoke	 @Sanity  
Scenario: Click on create an account link and perform action on organization website url
#Test scenario:05
   	      Then User enter valid organization website url
   	      
 @Smoke @Sanity	   
Scenario: Click on create an account link and perform tick action of i agree checkbox
#Test scenario:6
   	  	 Then User click on i agree checkbox
@Smoke @Sanity 	   
Scenario: Click on create an account link and perform untick action on i agree checkbox
#Test scenario:7
   		  And User again click on i agree checkbox
@Smoke 	@Sanity   
Scenario: Click on create an account link and perform action on terms and condition
#Test scenario:8
   	  	 And User click on terms and conditions
@Smoke   @Sanity	   
Scenario: Click on create an account link and perform action on terms and condition close button
#Test scenario:9
   	      And click on close button in terms and condition
   	      
 @Smoke	 @Sanity  
Scenario: Click on create an account link and perform action on terms and condition scroll bar
#Test scenario:10   	   
   	  	 Then User click on scroll bar
 @Smoke  @Sanity 
Scenario: Click on create an account link and perform action on terms and condition cross close button
#Test scenario:11
   		  Then User click on cross close button in terms and condition
@Smoke  @Sanity  
Scenario: Click on create an account link and perform action on sign in link
#Test scenario:13
   		 Then User click on sign in link
@Smoke  @Sanity
Scenario: Click on create an account link and to check if  email is accepting blank spaces
#Test scenario:16
   		 Then User enter blank space in email
 @Smoke @Sanity		 
Scenario: Click on create an account link and to check if  organization website url is accepting blank spaces
#Test scenario:17
        	
        	Then User enter blank space in organization website url

@Smoke @Sanity
Scenario: Click on create an account link and to check if  password is accepting blank spaces
#Test scenario:18
        	
        	Then User enter blank space in password
 @Smoke	 @Sanity   
Scenario: Click on create an account link and to check if  password is encrypted form
#Test scenario:19
   		 Then User enter password
   		 
@Smoke  @Sanity	
Scenario: Click on create an account link and perform action To check for i agree terms & conditions checkbox is untick and all other fields are entered ,sign up button disabled
#Test scenario:20      
   		   Then User enter valid name
   		   Then User enter valid email
   		   Then User enter valid password
   		   Then User enter valid organization website url
 
@Smoke 	@Sanity 
Scenario: Click on create an account link and perform action To check mouse hover functionality on the sign up button on the sign up page
#Test scenario:12
   		 Then User move mouse pointer on sign up button
 @Smoke  @Sanity	 
Scenario: Click on create an account link and perform action To check for Creating a new account with invalid credential
#Test scenario:21
    	 		 Then User create new account with invalid credentials
 @Smoke @Sanity	 
Scenario: Click on create an account link and perform action to check if  name is accepting only capital letters.
#Test scenario:22
     		 Then User enter invalid name in capital
     		 Then User enter valid email
   		     Then User enter valid password
   		     Then User enter valid organization website url
   		     Then User click on i agree checkbox
 @Smoke  @Sanity 	 
Scenario: Click on create an account link and perform action to check if  name is accepting only small letters.
#Test scenario:23
     		 Then User enter invalid name in small letters
     		 Then User enter valid email
   		     Then User enter valid password
   		     Then User enter valid organization website url
   		     Then User click on i agree checkbox
 @Smoke  @Sanity	 
Scenario: Click on create an account link and perform action To check  name is accepting only special characters other than underscore & dot.
#Test scenario:24    	 
    		 Then User enter invalid name in special characters
    		 Then User enter valid email
   		     Then User enter valid password
   		     Then User enter valid organization website url
   		     Then User click on i agree checkbox
  @Smoke @Sanity 	 
Scenario: Click on create an account link and perform action To check  name is accepting only digits.
#Test scenario:25	 
     		 Then User enter invalid name in digits
     		 Then User enter valid email
   		     Then User enter valid password
   		     Then User enter valid organization website url
   		     Then User click on i agree checkbox
 @Smoke  @Sanity  	 
Scenario: Click on create an account link and perform action To check minimum criteria for name textbox..
#Test scenario:26
      	    Then User enter name minimum less than four character
      	    Then User enter valid email
   		     Then User enter valid password
   		     Then User enter valid organization website url
#   		     Then User click on i agree checkbox
@Smoke  @Sanity 	 
Scenario: Click on create an account link and perform action to check if email is accepting digits.
#Test scenario:27    	 
      	 Then User enter email in digits
   		
@Smoke   @Sanity	 
Scenario: Click on create an account link and perform action to check if email is accepting  special characters.
#Test scenario:29
      	  Then User enter email in special characters 
   	
 @Smoke  @Sanity	 
Scenario: Click on create an account link and perform action To check if sign not present in email.
#Test case no:30
      	  Then User enter email as at the rate sign not present
   		 
  @Smoke  @Sanity	 
Scenario: Click on create an account link and perform action To check if  dot not present in email.
#Test scenario:31
      	Then User enter email as dot not present 
   		  
 @Smoke  @Sanity  	 
Scenario: Click on create an account link and perform action To check if  username not present in email.
#Test scenario:32
      	  Then User enter email as username not present 
   		 
 @Smoke  @Sanity 	 
Scenario: Click on create an account link and perform action To check minimum criteria for email textbox.
#Test scenario:33
      	  Then User enter email as minimum less than four characters
   		
 @Smoke @Sanity   	 
Scenario: Click on create an account link and perform action To check if  password is accepting  only digits.
#Test scenario:34     	 
      	   Then User enter invalid password in digits
   		  
  @Smoke   @Sanity	 
Scenario: Click on create an account link and perform action To check if  password is accepting  only small letters.
#Test scenario:35
      	Then User enter invalid password in small letters
   		 

 @Smoke @Sanity
Scenario: Click on create an account link and perform action To check if  password is accepting  only capital letters.
#Test scenario:36
     	 Then User enter invalid password in capital letters
   		   
  @Smoke  @Sanity        	 
Scenario: Click on create an account link and perform action To check if  password is accepting  only special characters.
#Test scenario:37
      	Then User enter invalid password in special characters
   		 
   @Smoke  @Sanity   	 
Scenario: Click on create an account link and perform action To check minimum criteria for password textbox
#Test scenario:38
      	Then User enter invalid password minimum less than four character
   		   
 @Smoke  @Sanity 	   
Scenario: Click on create an account link and perform action Negative test To check password accepting combination ofcharacters,numbers, & one special character symbo
#Test scenario:39
     	Then User enter invalid password invalid characters
   		   
   @Smoke  @Sanity	 
Scenario: Click on create an account link and perform action To check minimum criteria for organization website url textbox
#Test scenario:40
      	Then User enter invalid organization website url minimum less than four character
   		 
 @Smoke   @Sanity	 
Scenario: Click on create an account link and perform action to check if organization website url accepting special characters.
#Test scenario:42
      	Then User enter organization website url in special characters
   		
  @Smoke @Sanity    	 
Scenario: Click on create an account link and perform action to check if organization website url accepting capital letters.
#Test scenario:43     	 
      	Then User enter organization website url in capital letters
   		  
   @Smoke	@Sanity 
Scenario: Click on create an account link and perform action To check maximum criteria for name textbox
#Test scenario:44   	 
			 Then User enter invalid name as more than 64 characters
   		   
   @Smoke @Sanity 	 
Scenario: Click on create an account link and perform action To check maximum criteria for email textbox
#Test scenario:45     	 
      	Then User enter invalid email as more than 64 characters
   		  
   @Smoke 	@Sanity 
Scenario: Click on create an account link and perform action To check maximum criteria for password textbox
#Test scenario:46  
     	 Then User enter invalid password as more than 64 characters

   @Smoke  @Sanity	 
Scenario: Click on create an account link and perform action To check maximum criteria for organization website url textbox
#Test scenario:47	 
      	Then User enter invalid organization website url as more than 64 characters
   		 
      	
