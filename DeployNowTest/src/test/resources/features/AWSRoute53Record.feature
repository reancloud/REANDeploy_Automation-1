@RegressionTest @RouterecordAll 
Feature: Test on AWS SSH Route Record Resource 

Background:
			Given User direct to deploy now application
	   		When User log in
			Then Login sucessfully should display
			
@P1 @Suite1
Scenario: To check the functionality of re deploy button for Route Record

          Then User search or create environment for Route Record and see message as environment created successfully
          When User click Route Record resource and drag on the dashboard
          And User enter Route Record resource name
          Then Message should display resource created successfully
          When User click on Route Record resource
          Then User click on set array for Route Record
          And User enter ttl for Route Record
          And User enter type for Route Record
          And User enter zone id for Route Record
          And User enter depends on for Route Record
          Then User select connection from dropdown
          And User enter alias for Route Record
          And User enter continent for Route Record
          And User enter country for Route Record
          And User enter evaluate_target_health for Route Record
          And User enter failover_routing_policy for Route Record
          And User enter geolocation_routing_policy for Route Record
          And User enter health_check_id for Route Record
          And User enter latency_routing_policy for Route Record
          And User enter region for Route Record
          And User enter set_identifier for Route Record
          And User enter subdivision for Route Record
          And User enter weight for Route Record
          And User enterweighted_routing_policy for Route Record
          Then User should see message environment saved successfully
          When User click on canvas
          Then User click deploy button and should see message environment deployed successfully
          Then User click redeploy button and should see message environment deployed successfully
          When User click on destroy button
	      Then User should see message environment destroyed sucessfully
          Then User delete Route Record environment and see message environment deleted sucessfully
	      
@P1  @Suite1 
Scenario: To check the functionality of  YES DESTROY IT Button when user clicks on DESTROY button for Route Record 
Test Case no:28
         Then User search or create environment for Route Record and see message as environment created successfully
          When User click Route Record resource and drag on the dashboard
          And User enter Route Record resource name
         Then Message should display resource created successfully
         When User click on Route Record resource
          Then User click on set array for Route Record
          And User enter ttl for Route Record
          And User enter type for Route Record
          And User enter zone id for Route Record
          And User enter depends on for Route Record
          Then User select connection from dropdown
          And User enter alias for Route Record
          And User enter continent for Route Record
          And User enter country for Route Record
          And User enter evaluate_target_health for Route Record
          And User enter failover_routing_policy for Route Record
          And User enter geolocation_routing_policy for Route Record
          And User enter health_check_id for Route Record
          And User enter latency_routing_policy for Route Record
          And User enter region for Route Record
          And User enter set_identifier for Route Record
          And User enter subdivision for Route Record
          And User enter weight for Route Record
          And User enterweighted_routing_policy for Route Record
          Then User should see message environment saved successfully
          When User click on canvas
          Then User click deploy button and should see message environment deployed successfully
          When User click on destroy button
	      Then User should see message environment destroyed sucessfully
         Then User delete Route Record environment and see message environment deleted sucessfully