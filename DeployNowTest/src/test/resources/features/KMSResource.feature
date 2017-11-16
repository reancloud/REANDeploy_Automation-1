@RegressionTest 
Feature:Test on KMS Resource


Background:
	Given User direct to deploy now application
	When User log in
	Then Login sucessfully should display
	
       
            
             
@P1 
Scenario: Selecting an environment and add the KMS Resource and deploy the environment
            
      When User search or create environment for Kms resource and see message as environment created successfully
      Then User click kmskey resource and drag on the dashboard
      And User enter resource name for kmskey resource
      Then Message should display resource created successfully
      Then User click kmsAlias resource and drag on the dashboard
      And User enter resource name for kmsalias resource
      Then Message should display resource created successfully
      When User click on kmsalias resource
      And enter the targetkeyid of kmsalias resource
      And enter name of the kmsalias resource
      Then User should see message environment saved successfully
      When User click on canvas
        Then User click deploy button and should see message environment deployed successfully  
          When User click on destroy button
	      Then User should see message environment destroyed sucessfully
          Then User delete Kms environment and see message environment deleted sucessfully
    
 @P1  
Scenario:Negative test case to check the functionality of KMS Resource
            
       When User search or create environment for Kms resource and see message as environment created successfully
      Then User click kmskey resource and drag on the dashboard
      And User enter resource name for kmskey resource
      Then Message should display resource created successfully
      Then User click kmsAlias resource and drag on the dashboard
      And User enter resource name for kmsalias resource
      Then Message should display resource created successfully
      When User click on kmsalias resource
      Then User should see message environment saved successfully
      When User click on canvas
        Then User click deploy button and should see message environment deployed successfully  
      When User click on canvas
      Then User delete Kms environment and see message environment deleted sucessfully
    	
@P1         
Scenario: To check the functionality of Redeploy Button 

           When User search or create environment for Kms resource and see message as environment created successfully
      Then User click kmskey resource and drag on the dashboard
      And User enter resource name for kmskey resource
      Then Message should display resource created successfully
      Then User click kmsAlias resource and drag on the dashboard
      And User enter resource name for kmsalias resource
      Then Message should display resource created successfully
      When User click on kmsalias resource
      And enter the targetkeyid of kmsalias resource
      And enter name of the kmsalias resource
      Then User should see message environment saved successfully
      When User click on canvas
        Then User click deploy button and should see message environment deployed successfully  
         Then User click redeploy button and should see message environment deployed successfully
            When User click on destroy button
	        Then User should see message environment destroyed sucessfully
	         Then User delete Kms environment and see message environment deleted sucessfully

@P2   
Scenario: To check the functionality of save button if user edits  resource name for KMS

          When User search or create environment for Kms resource and see message as environment created successfully
      Then User click kmskey resource and drag on the dashboard
      And User enter resource name for kmskey resource
      Then Message should display resource created successfully
      Then User click kmsAlias resource and drag on the dashboard
      And User enter resource name for kmsalias resource
      Then Message should display resource created successfully
       When User click on kmsalias resource
      And enter the targetkeyid of kmsalias resource
      And enter name of the kmsalias resource
      Then User should see message environment saved successfully
      Then User click on resource name on rightsidebar
	When User click the name text box to edit resource name "test-rajakms"
	When User click save button on pop up of resource name link
	Then User should see message environment saved successfully
    	When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on destroy button
	Then User should see message environment destroyed sucessfully
     Then User delete Kms environment and see message environment deleted sucessfully 
      
      
@P3  
Scenario: To check the functionality of create button if resource name is duplicate for KMS
      
          When User search or create environment for Kms resource and see message as environment created successfully
          Then User click kmsAlias resource and drag on the dashboard
      And User enter resource name for kmsalias resource
      Then Message should display resource created successfully
      Then User click kmsAlias resource and drag on the dashboard
      And User enter resource name for kmsalias resource
      Then Message should display resource created successfully
      Then User delete Kms environment and see message environment deleted sucessfully 
      
@P3		
Scenario:To check the functionality of create button if resource name is blank for KMS
   
          When User search or create environment for Kms resource and see message as environment created successfully
          Then User click kmsAlias resource and drag on the dashboard
           Then Message should display resource created successfully
           Then User delete Kms environment and see message environment deleted sucessfully 
           
@P2	    
Scenario:To check the functionality of delete cross button Please delete button 
if user wants to delete resource for KMS      
      
       When User search or create environment for Kms resource and see message as environment created successfully
          Then User click kmsAlias resource and drag on the dashboard
          And User enter resource name for kmsalias resource
           Then Message should display resource created successfully
           And User delete the resource by clicking the cross button on Kms Resource
           Then User delete Kms environment and see message environment deleted sucessfully 
      
@P3	 
Scenario:To check the functionality of delete cross button Please don't delete button 
if user wants to delete resource for KMS
      
       When User search or create environment for Kms resource and see message as environment created successfully
          Then User click kmsAlias resource and drag on the dashboard
          And User enter resource name for kmsalias resource
           Then Message should display resource created successfully
           And User dont delete the resource by clicking the cross button on Kms Resource
           Then User delete Kms environment and see message environment deleted sucessfully 

@P3    
Scenario: To check the functionality of Close button if user clicks on resource name link for KMS

             When User search or create environment for Kms resource and see message as environment created successfully
            Then User click kmsAlias resource and drag on the dashboard
      And User enter resource name for kmsalias resource
      Then Message should display resource created successfully
       When User click on kmsalias resource
           Then User click on resource name on rightsidebar
	       Then User click close button on pop up of resource name link
	        Then User delete Kms environment and see message environment deleted sucessfully  
	            
	@P3	 
Scenario: To check the functionality of Cross button if user clicks on resource name link for KMS

             
             When User search or create environment for Kms resource and see message as environment created successfully
            Then User click kmsAlias resource and drag on the dashboard
      And User enter resource name for kmsalias resource
      Then Message should display resource created successfully
       When User click on kmsalias resource
           Then User click on resource name on rightsidebar
	       Then User click cross button on pop up of resource name link
	        Then User delete Kms environment and see message environment deleted sucessfully  
	            
          
@P3	  
Scenario: To check the functionality of Cross close button when user drags the resource 
from resource section for KMS

	
	 When User search or create environment for Kms resource and see message as environment created successfully
            Then User click kmsAlias resource and drag on the dashboard
	Then User click on the cross close button when user drags the resource from resource section
	 Then User delete Kms environment and see message environment deleted sucessfully  


	
@P3	  
Scenario:To check the functionality of close button when user drags the resource from resource section for KMS

	
	
	When User search or create environment for Kms resource and see message as environment created successfully
            Then User click kmsAlias resource and drag on the dashboard
	Then User click on the close button when user drags the resource from resource section
	Then User delete Kms environment and see message environment deleted sucessfully  


	
@P3	
Scenario: To check the functionality of text box when user clicks on resource name link and edits the name for KMS

	
	 When User search or create environment for Kms resource and see message as environment created successfully
            Then User click kmsAlias resource and drag on the dashboard
      And User enter resource name for kmsalias resource
      Then Message should display resource created successfully
       When User click on kmsalias resource
		Then User click on resource name on rightsidebar
	When User click the name text box to edit resource name "testkms"
	Then User click close button on pop up of resource name link
	Then User delete Kms environment and see message environment deleted sucessfully  
	

@P2   
Scenario: To check the functionality of Resource Logs button after the successful deployment of the resource for KMS
	
	 When User search or create environment for Kms resource and see message as environment created successfully
      Then User click kmskey resource and drag on the dashboard
      And User enter resource name for kmskey resource
      Then Message should display resource created successfully
      Then User click kmsAlias resource and drag on the dashboard
      And User enter resource name for kmsalias resource
      Then Message should display resource created successfully
      When User click on kmsalias resource
      And enter the targetkeyid of kmsalias resource
      And enter name of the kmsalias resource
      Then User should see message environment saved successfully
      When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on logs button on dash board
	And User click on close button on logs window
	When User click on destroy button
	    	Then User should see message environment destroyed sucessfully
		 Then User delete Kms environment and see message environment deleted sucessfully  


@P3  
Scenario: To check the functionality of Close button on logs window after the successful 
deployment of the resource for KMS

	
	
	When User search or create environment for Kms resource and see message as environment created successfully
      Then User click kmskey resource and drag on the dashboard
      And User enter resource name for kmskey resource
      Then Message should display resource created successfully
      Then User click kmsAlias resource and drag on the dashboard
      And User enter resource name for kmsalias resource
      Then Message should display resource created successfully
      When User click on kmsalias resource
      And enter the targetkeyid of kmsalias resource
      And enter name of the kmsalias resource
      Then User should see message environment saved successfully
      When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on logs button on dash board
	And User click on close button on logs window
	When User click on destroy button
	    	Then User should see message environment destroyed sucessfully
		  Then User delete Kms environment and see message environment deleted sucessfully  
	

@P3 
Scenario: To check the functionality of Cross Close button on logs window after the successful 
deployment of the resource for KMS

	When User search or create environment for Kms resource and see message as environment created successfully
      Then User click kmskey resource and drag on the dashboard
      And User enter resource name for kmskey resource
      Then Message should display resource created successfully
      Then User click kmsAlias resource and drag on the dashboard
      And User enter resource name for kmsalias resource
      Then Message should display resource created successfully
      When User click on kmsalias resource
      And enter the targetkeyid of kmsalias resource
      And enter name of the kmsalias resource
      Then User should see message environment saved successfully
      When User click on canvas
	Then User click deploy button and should see message environment deployed successfully
	When User click on logs button on dash board
	And User click on cross close button on logs window
	When User click on destroy button
  		Then User should see message environment destroyed sucessfully
		 Then User delete Kms environment and see message environment deleted sucessfully  
	
@P3	  
Scenario: To check the functionality of destroy don't destroy it button for KMS

		
	When User search or create environment for Kms resource and see message as environment created successfully
      Then User click kmskey resource and drag on the dashboard
      And User enter resource name for kmskey resource
      Then Message should display resource created successfully
      Then User click kmsAlias resource and drag on the dashboard
      And User enter resource name for kmsalias resource
      Then Message should display resource created successfully
      When User click on kmsalias resource
      And enter the targetkeyid of kmsalias resource
      And enter name of the kmsalias resource
      Then User should see message environment saved successfully
      When User click on canvas
	    	Then User click deploy button and should see message environment deployed successfully
	    	When User click on destroy button
  		Then User click on dont destroy button
  		When User click on destroy button
  		Then User should see message environment destroyed sucessfully
	    Then User delete Kms environment and see message environment deleted sucessfully  
	


@P3	 
Scenario: To check the functionality of Search bar if user wants to search for attributes after 
deployment of the resource for KMS

	When User search or create environment for Kms resource and see message as environment created successfully
      Then User click kmskey resource and drag on the dashboard
      And User enter resource name for kmskey resource
      Then Message should display resource created successfully
      Then User click kmsAlias resource and drag on the dashboard
      And User enter resource name for kmsalias resource
      Then Message should display resource created successfully
      When User click on kmsalias resource
      And enter the targetkeyid of kmsalias resource
      And enter name of the kmsalias resource
      Then User should see message environment saved successfully
      When User click on canvas
    Then User click deploy button and should see message environment deployed successfully	
		 When User click on kmsalias resource
	 	When User click on resource details link on the attribute section
		Then User search for attributes in the resource details "id"
		When User click on destroy button
	    	Then User should see message environment destroyed sucessfully
		Then User delete Kms environment and see message environment deleted sucessfully  
	

@P3	   
Scenario: To check the functionality of Search bar if user wants to search for attributes after 
deployment under resource for KMS	


		When User search or create environment for Kms resource and see message as environment created successfully
      Then User click kmskey resource and drag on the dashboard
      And User enter resource name for kmskey resource
      Then Message should display resource created successfully
      Then User click kmsAlias resource and drag on the dashboard
      And User enter resource name for kmsalias resource
      Then Message should display resource created successfully
      When User click on kmsalias resource
      And enter the targetkeyid of kmsalias resource
      And enter name of the kmsalias resource
      Then User should see message environment saved successfully
      When User click on canvas
	    	Then User click deploy button and should see message environment deployed successfully
		When User click on kmsalias resource
	 	When User click on resource link on the attribute section
		Then User search for attributes in the resource section "Connection"
		When User click on destroy button
	    	Then User should see message environment destroyed sucessfully
		 Then User delete Kms environment and see message environment deleted sucessfully  
	
	 	

	      
      
      
      
        

