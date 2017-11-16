Feature: Automation of Manage Users link

Background:
		Given User direct to deploy now application
		When User log in
		Then Login sucessfully should display
	
	@TC_1	
    Scenario: Check the manage users link
	When  User click on user icon
	And   User click on Manage users link
	When  User click on Assign Roles in action column
	#assign role to the user
	Then  Assign roles to the users
	And   User click on Assign roles button
	When  User click on Assign Roles in action column
	#assign multiple roles to the users
	Then  Multiple roles assign to the users
	And   User click on Assign roles button
	
	
	@TC_1
	Scenario: when user does not assign any roles
	When  User click on user icon
	And   User click on Manage users link
	When  User click on Assign Roles in action column
	# Deselect all roles
	Then   Deselect all roles assign to the users
	And    User click on Assign roles button1
	
	
	@TC_1
	Scenario: user search an account with Email and delete
	When  User click on user icon
	And   User click on Manage users link
	#search user by email
	When  Enter Email id into search users box
    Then  User log out 
    #create account
    When  User click on create account link and should see create account page
    And   User enter valid data to create new account1
    Then  User click on sign up button
    #Sign in
    When  User log in
	Then  Login sucessfully should display
	When  User click on user icon
	And   User click on Manage users link
	#delete user
    Then  user click on delete button to delete User



	
	
	
	  
	
	
	