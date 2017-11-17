package com.opex.test.step_definitions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		//plugin = {"pretty", "html:target/cucumber-html-report"},
		plugin = {"pretty", "html:target/reports/", "json:target/reports/index.json"},

		
		//tags = {"@RegressionTest"}
			tags = {"@app_test"}
				//tags = {"@P1"}
				//tags = {"@P2"}
				//tags = {"@P3"}
				  
				
		
		
		)
public class RunCukesTest{
	
}
