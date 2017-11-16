package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class MultilayerAPPAttributes {
	
String app_file_name;
	
	public String getApp_file_name() {
		return app_file_name ;
	}
	public void setApp_file_name(String app_file_name) {
		this.app_file_name = app_file_name ;
	}
	
	private static Properties properties;
	private static MultilayerAPPAttributes appAttributes = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String APP_FILE_NAME = "app_file_name";
	
	
	public static MultilayerAPPAttributes getMultilayerAPPFromProperties(){
		
		MultilayerAPPAttributes.getReadPropertiesFile();
		
		String app_file_name = properties.getProperty(APP_FILE_NAME);
		
		appAttributes = new MultilayerAPPAttributes();
		
		appAttributes.setApp_file_name(app_file_name);
		
		
		return appAttributes;
	}
	public static void getReadPropertiesFile() {
		if(appAttributes == null){
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
