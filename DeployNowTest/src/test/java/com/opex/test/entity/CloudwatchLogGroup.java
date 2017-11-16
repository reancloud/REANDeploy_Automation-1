package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class CloudwatchLogGroup {

	String cloud_name;
	String cloud_depends_on;
	String cloud_retention_in_days;
	
	public String getcloud_name() {
		return cloud_name ;
	}
	public void setcloud_name(String cloud_name) {
		this.cloud_name  = cloud_name ;
	}
	public String getcloud_depends_on() {
		return cloud_depends_on ;
	}
	public void setcloud_depends_on(String cloud_depends_on) {
		this.cloud_depends_on  = cloud_depends_on ;
	}
	public String getcloud_retention_in_days() {
		return cloud_retention_in_days ;
	}
	public void setcloud_retention_in_days(String cloud_retention_in_days ) {
		this.cloud_retention_in_days  = cloud_retention_in_days ;
	}
	
	private static Properties properties;
	private static CloudwatchLogGroup cloudAttributes = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String NAME = "cloud_name";
	private static final String CLOUD_DEPENDS_ON = "cloud_depends_on";
	private static final String RETENTION_IN_DAYS = "cloud_retention_in_days";
	
public static CloudwatchLogGroup getCloudwatch_log_groupFromProperties(){
		
	    CloudwatchLogGroup.getReadPropertiesFile();
		String cloud_name = properties.getProperty(NAME);
		String cloud_depends_on = properties.getProperty(CLOUD_DEPENDS_ON);
		String cloud_retention_in_days = properties.getProperty(RETENTION_IN_DAYS);
		cloudAttributes = new CloudwatchLogGroup();
		cloudAttributes.setcloud_name(cloud_name);
		cloudAttributes.setcloud_depends_on(cloud_depends_on);
		cloudAttributes.setcloud_retention_in_days(cloud_retention_in_days);
		return cloudAttributes;
	}
	public static void getReadPropertiesFile() {
		if(cloudAttributes == null || cloudAttributes == null){
			InputStream is = null;
			try{
				is = FileUtils.readFileFromClassPath(TEST_PARAMETER_PROPERTIES);
				properties = new Properties();
				properties.load(is);
				
			}catch(Exception e){
				e.printStackTrace();
				throw new RuntimeException(e);
			}finally{
				FileUtils.close(is);
			}	
		}
	}
}
