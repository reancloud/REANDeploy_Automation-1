package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class CommonFunctionalityAttributes {
	
	
	String Resource_name;
	
	//Method returns resource name
	public String getResource_name() {
		return Resource_name;
	}
	//Method set resource name
	public void setResource_name(String Resource_name) {
		this.Resource_name = Resource_name;
	}
	
	
	private static Properties properties;
	private static CommonFunctionalityAttributes commonDetails= null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String Resource_NAME = "Resource_name";
	
	//Method to set attributes 
	public static CommonFunctionalityAttributes getCommanDetailsFromPropertiesFile() {
	
		CommonFunctionalityAttributes.getReadPropertiesFile();
		String R_name =properties.getProperty(Resource_NAME);//Accessing element using obj.getProperty(key)
		commonDetails = new CommonFunctionalityAttributes();
		commonDetails.setResource_name(R_name);;
		return commonDetails;
	}
	
	//Method to get attributes from property file
	public static void getReadPropertiesFile() {
		if(commonDetails == null){
			InputStream is = null;
			try{
				is = FileUtils.readFileFromClassPath(TEST_PARAMETER_PROPERTIES); //Create Object of FileInputStream Class. Pass file path.
				properties = new Properties(); //Create Object of Properties Class.
				properties.load(is); //Pass object reference objfile to load method of Properties object.
				
			}catch(Exception e){
				e.printStackTrace();
				throw new RuntimeException(e);
			}finally{
				FileUtils.close(is);
			}	
		}
	}

}

