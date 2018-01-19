package com.opex.test.step_definitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.opex.test.entity.AddUserAttribute;
import com.opex.test.entity.WebUrl;
import com.opex.test.helpers.DataHelper;



public class SuperUsedDefinition 
{
	public WebDriver driver;
	public static List<HashMap<String,String>> datamap = null;
	public static String url = null;
	public static AddUserAttribute dnowUser = null;
	
	
     public SuperUsedDefinition() {
		// initializing driver
		driver = Hooks.driver;
		// adding list to map
		datamap = new ArrayList<HashMap<String,String>>();
		WebUrl dnowUrl = DataHelper.getUrlFromPropertiesFile();
		url = dnowUrl.getTarget_url();
		dnowUser = AddUserAttribute.getUserDetailsFromProperties();

		
		
		
		
		


		


		
	}

}
