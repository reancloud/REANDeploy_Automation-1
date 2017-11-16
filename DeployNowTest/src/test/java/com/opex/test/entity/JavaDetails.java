package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.helpers.DataHelper;
import com.opex.test.utils.FileUtils;

public class JavaDetails{
	
	String java_key_name;
	String java_security_name;
	String java_instance_name;
	/*String java_instance_keyname;
	String java_instancesecurity;*/
	String java_openjdk_version;
		public String getjavaKey_name() {
			return java_key_name;
		}
		public void setjavaKey_name(String java_key_name) {
			this.java_key_name = java_key_name;
		}
		

		public String getjava_security_name() {
			return java_security_name;
		}
		public void setjava_security_name(String java_security_name) {
			this.java_security_name = java_security_name;
		}
		public String getjava_instance_name() {
			return java_instance_name;
		}
		public void setjava_instance_name(String java_instance_name) {
			this.java_instance_name = java_instance_name;
		}
	/*	public String getjava_instancekeyname() {
			return java_instance_keyname;
		}
		public void setjava_instancekeyname(String java_instance_keyname) {
			this.java_instance_keyname = java_instance_keyname;
		}
		public String getjava_instancesecurity() {
			return java_instancesecurity;
		}
		public void setjava_instancesecurity(String java_instancesecurity) {
			this.java_instancesecurity = java_instancesecurity;
		}*/
		public String getjava_openjdk_version() {
			return java_openjdk_version;
		}
		public void setjava_openjdk_version(String java_openjdk_version) {
			this.java_openjdk_version = java_openjdk_version;
		}
		private static Properties properties;
		private static JavaDetails java_attribute = null;
		private static final String JAVA_KEY_NAME = "java_key_name";
		private static final String JAVA_SECURITY_NAME ="java_security_name";
		private static final String JAVA_INSTANCE_NAME ="java_instance_name";
		//private static final String JAVA_INSTANCE_KEYNAME ="java_instance_keyname";
		//private static final String JAVA_INSTANCE_SECURITY ="java_instancesecurity";
		private static final String JAVA_OPENJDK_VERSION ="java_openjdk_version";
		private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
		
		public static JavaDetails getjava_DetailsFromProperties(){
			JavaDetails.getReadPropertiesFile();
			String javakey_name = properties.getProperty(JAVA_KEY_NAME);
			String javasecurity_name = properties.getProperty(JAVA_SECURITY_NAME);
			String javainstance_name = properties.getProperty(JAVA_INSTANCE_NAME);
			//String javainstancekeyname = properties.getProperty(JAVA_INSTANCE_KEYNAME);
			//String javainstancesecurity=properties.getProperty(JAVA_INSTANCE_SECURITY);
			String javaopenjdk_version=properties.getProperty(JAVA_OPENJDK_VERSION);
			JavaDetails java_attribute=new JavaDetails();
			java_attribute.setjavaKey_name(javakey_name);
			java_attribute.setjava_security_name(javasecurity_name);
			java_attribute.setjava_instance_name(javainstance_name);
			//java_attribute.setjava_instancekeyname(javainstancekeyname);
			//java_attribute.setjava_instancesecurity(javainstancesecurity);
			java_attribute.setjava_openjdk_version(javaopenjdk_version);
			return java_attribute;
		}
		public static void getReadPropertiesFile() {
			if(java_attribute == null){
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
