package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class EnvironmentListAttributes {
	
	String newEnv;
	
	public String getNewEnv() {
		return newEnv ;
	}
	public void setNewEnv(String newEnv) {
		this.newEnv  = newEnv ;
	}
	
	private static Properties properties;
	private static EnvironmentListAttributes envListAttributes = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String NEW_ENV = "newEnv";
	
	public static EnvironmentListAttributes getEnvListFromProperties(){
		
		envListAttributes.getReadPropertiesFile();
		
		String newEnv = properties.getProperty(NEW_ENV);
		
		envListAttributes = new EnvironmentListAttributes();
		
		envListAttributes.setNewEnv(newEnv);
		
		return envListAttributes;
		}
		public static void getReadPropertiesFile() {
			if(envListAttributes == null){
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
