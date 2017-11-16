package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.helpers.DataHelper;
import com.opex.test.utils.FileUtils;

public class EnvironmentAttributes {

	String env_name;
	String env_region;
	String env_description;
	String env_edit_name;
	String env_edit_description;
	String env_copy_name;
	String env_import_resource_name;
	String env_copy_description;
	String env_export_rname;
	String env_import_name;
	
	public String getEnv_name() {
		return env_name;
	}
	public void setEnv_name(String env_name) {
		this.env_name = env_name;
	}

	public String getEnv_region() {
		return env_region;
	}
	public void setEnv_region(String env_region) {
		this.env_region = env_region;
	}
	public String getEnv_description() {
		return env_description;
	}
	public void setEnv_description(String env_description) {
		this.env_description = env_description;
	}
	public String getEnv_edit_name() {
		return env_edit_name;
	}
	public void setEnv_edit_name(String env_edit_name) {
		this.env_edit_name = env_edit_name;
	}
	public String getEnv_edit_description() {
		return env_edit_description;
	}
	public void setEnv_edit_description(String env_edit_description) {
		this.env_edit_description = env_edit_description;
	}
	public String getEnv_copy_description() {
		return env_copy_description;
	}
	public void setEnv_copy_description(String env_copy_description) {
		this.env_copy_description = env_copy_description;
	}
	public String getEnv_copy_name() {
		return env_copy_name;
	}
	public void setEnv_copy_name(String env_copy_name) {
		this.env_copy_name = env_copy_name;
	}
	
	public String getEnv_import_resource_name() {
		return env_import_resource_name;
	}
	public void setEnv_import_resource_name(String env_import_resource_name) {
		this.env_import_resource_name = env_import_resource_name;
	}

	public String getEnv_export_rname() {
		return env_export_rname;
	}
	public void setEnv_export_rname(String env_export_rname) {
		this.env_export_rname= env_export_rname;
	}
	public String getEnv_import_name() {
		return env_import_name;
	}
	public void setEnv_import_name(String env_import_name) {
		this.env_import_name= env_import_name;
	}
	private static EnvironmentAttributes envDetails = null;
	private static Properties properties;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String ENV_NAME = "env_name";
	private static final String ENV_REGION = "env_region";
	private static final String ENV_DESCRIPTION = "env_description";
	private static final String ENV_CONNECTION = "env_connection";
	private static final String ENV_COPY_NAME = "env_copy_name";
	private static final String ENV_IMPORT_RESOURCE_NAME = "env_import_resource_name";
	private static final String ENV_COPY_DESCRIPTION = "env_copy_description";
	private static final String ENV_EXPORT_RNAME = "env_export_rname";
	private static final String ENV_IMPORT_NAME = "env_import_name";
	private static final String ENV_EDIT = "env_edit_name";
	private static final String ENV_EDIT_DESC = "env_edit_description";
	
	public static EnvironmentAttributes getEnvDetailsFromPropertiesFile() {
		EnvironmentAttributes.getReadPropertiesFile();
		String name = properties.getProperty(ENV_NAME);
		String description = properties.getProperty(ENV_DESCRIPTION);
		String region = properties.getProperty(ENV_REGION);
		String connection = properties.getProperty(ENV_CONNECTION);
		String env_edit_name = properties.getProperty(ENV_EDIT);
		String env_edit_description = properties.getProperty(ENV_EDIT_DESC);
		String env_copy_name = properties.getProperty(ENV_COPY_NAME);
		String env_copy_description = properties.getProperty(ENV_COPY_DESCRIPTION);
		String env_export_rname = properties.getProperty(ENV_EXPORT_RNAME);
		String env_import_name = properties.getProperty(ENV_IMPORT_NAME);
		String env_import_resource_name = properties.getProperty(ENV_IMPORT_RESOURCE_NAME);
		envDetails = new EnvironmentAttributes();
		envDetails.setEnv_name(name);
		envDetails.setEnv_description(description);
		envDetails.setEnv_region(region);
		envDetails.setEnv_edit_name(env_edit_name);
		envDetails.setEnv_edit_description(env_edit_description);
		envDetails.setEnv_copy_name(env_copy_name);
		envDetails.setEnv_copy_description(env_copy_description);
		envDetails.setEnv_export_rname(env_export_rname);
		envDetails.setEnv_import_name(env_import_name);
		envDetails.setEnv_import_resource_name(env_import_resource_name);
		return envDetails;
	}
	public static void getReadPropertiesFile() {
		if(envDetails == null ){
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