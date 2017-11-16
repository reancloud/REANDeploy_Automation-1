@Smoke @Sanity 
Feature: Create network architecture similar to one used for Gigamon quickstart

Background:
	Given User direct to deploy now application
	When User logs in to deploynow
	
@Suite4 @Smoke @Sanity
 Scenario: Create Gigamon Quickstart environment Network Layer

       Then User create or search an environment for Gigamon_Quickstart_Network_Layer
        #VPC 
        
        Then Add VPC resource to environment and enter attribute values
      	#Subnet1
      	
   	  	Then Add subnet1 resource to the environment and enter attribute values
       
     	#subnet2
     	
     	Then Add subnet2 resource to the environment and enter attribute values
    	
     	#subnet3
     	
	  	Then Add subnet3 resource to the environment and enter attribute values
      	
      	#Internet Gateway
      	
    	Then User select Internet Gateway resource drags to the environment and enter attribute values
      	
      	#Nat Gateway
      	
      	Then User select NAT Gateway resource and drags to the environment and enter attribute values
      	
      	#EIP
      	
      	When User drag drop the EIP resource 
      	Then Enter resource name for EIP resource
      	Then Message should display resource created successfully
         
      	#Route table Association
      	
     	Then User drag and drop Route table Association resource
      	Then Enter resource name for Route table Association resource 
      	Then Message should display resource created successfully
      	Then Enter route table id for Route table Association
      	Then Enter subnet id for Route table Association
      	
      	#Route table 
      	Then Click on route table resource and drag on the dashboard
      	And  Enter route table1 resource name
      	Then Message should display resource created successfully
      	Then User click on the route table1 resource
      	And  User enters vpc id for route table resource
  	  	And Set json route for route table resource
      	
      	#Route table
      	
      	Then Click on route table resource and drag on the dashboard
     	And  Enter route table2 resource name
     	Then Message should display resource created successfully
     	Then User click on the route table2 resource
      	And  User enters vpc id for route table resource
        And  Set json route for route table2 resource
     	
      	#Route table Association2
      	
     	Then User drag and drop Route table Association resource
     	Then Enter resource name for Route_table_Association2 resource
      	Then Message should display resource created successfully
      	Then Enter route table id for Route table Association2
     	Then Enter subnet id for Route table Association2
      	
      	#Security group1
      	
      	Then User drag and drop security group resource
      	Then Enter resource name of security group1
      	Then Message should display resource created successfully
      	And  User click on security group1 resource
      	Then Enter egress value for security_group1
     	Then Enter ingress value for security_group1
      	And  User enters vpc id for route table resource
      	
      	#Security group2
      	
      	Then User drag and drop security group resource
      	Then Enter resource name of security group2
      	Then Message should display resource created successfully
      	Then Click on security group resource2
     	Then Enter egress value for security_group1
      	Then Enter ingress value for security_group1
     	And  User enters vpc id for route table resource
      	
      	#Security group3
      	
      	Then User drag and drop security group resource
     	Then Enter resource name of security group3
      	Then Message should display resource created successfully
      	Then Click on security group resource3
      	Then Enter egress value for security_group1
      	Then Enter ingress value for security_group1
      	And  User enters vpc id for route table resource
      
        # Input variable
        
      	When User click Input Variable resource and drag on the dashboard
      	When User click on Input Variable resource
	    And User enters input variables attribute for Input Variable
      		  	
    	 # Output variable
    	 
        When User click output resource and drag on the dashboard
	  	Then User click on output resource
	    And User set json for Output resource for Gigamon quickstart
        
    	# Key Pair resource
    	When User click Key Pair resource and drag on the dashboard
    	Then User enter the resource name for Key Pair
     	Then Message should display resource created successfully
    	Then User click on key pair resource
   	    And  User fill the key name for Key Pair
        And  User fill the public key for Key Pair
      	Then User should see message environment saved successfully
      	
      	 
      	 #Deploy Gigamon_Quickstart_Network_Layer without curl cmd
       Then User click deploy button and should see message environment deployed successfully
     	
      #create or search an environment for Gigamon_Quickstart_Instance_Layer
      
       #When User click on environment dropdown box 
       
      Then User create or search an environment for Gigamon_Quickstart_Instance_Layer
      #Instance resource
      
      When User click Instance resource and drag on the dashboard
      Then User enter the resource name for Instance
      Then Message should display resource created successfully
      Then User click on Instance resource
      And User fill the ami attribute for Instance
      And User fill the instance initiated attribute for Instance
      And User fill the availability zone attribute for Instance
      And User fill connection from dropdown for Instance
      And User fill the source dest check attribute for Instance
      And User fill the instance type attribute for Instance
      And User fill the subnet_id attribute for Instance
      
      #elb resources
     
	  When User click elb resource and drag on the dashboard
	  And User enter elb resource name
	  Then Message should display resource created successfully
	  When User click on elb resource
	  And User set listner for elb
	  And User set subnets array for elb for instance layer
	  And User set connection for elb
	  And User set accesslog for elb
	  And User set crossZoneLoadBalancing for elb
	  And User set healthCheck for elb
	  And User set idleTimeout for elb
	  And User set instances for elb
	  And User set internal for elb
	  And User set securityGroup for elb
	  And User set tags for elb
      
      #Input Variable for Gigamon quickstart instance layer
      
      When User click Input Variable resource and drag on the dashboard
      When User click on Input Variable resource
      And User set json for input resource for Gigamon quickstart instance layer
     
      
     #depends on
      
      When User select depends on resource and drags to the environment
      Then Enter resource name of Depends On
      Then Message should display resource created successfully
      Then Click on depends on resource
      Then Enter depends_on value for the depends on resource
      Then User should see message environment saved successfully
    

#      #Start the Deploy using copy deploy API
#      Then Start the Deploy using copy deploy API
#      Then user search an environment for test_env_instance1
#      When User click on destroy button
#      Then User should see message environment destroyed sucessfully
#      Then user search an environment test_env_instance1 for delete
#       
#      #destroy Gigamon_Quickstart_network_layer 
#       Then user search an environment for Gigamon_Quickstart_Network_Layer
#       When User click on destroy button
#       Then User should see message environment destroyed sucessfully
#       
#        

      
     #Deploy Gigamon_Quickstart_Instance_Layer without curl cmd
     
    Then User click deploy button and should see message environment deployed successfully
    
     #Destroy Gigamon_Quickstart_Instance_Layer
        
        When User click on destroy button
        Then User should see message environment destroyed sucessfully
        #Then user search an environment Gigamon_Quickstart_Instance_Layer for delete
      
      #destroy Gigamon_Quickstart_network_layer without curl cmd
      
       Then user search an environment for Gigamon_Quickstart_Network_Layer
       Then user search an environment Gigamon_Quickstart_Network_Layer for delete
       

            
       
       
       
      
    
      
