package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.helpers.DataHelper;
import com.opex.test.utils.FileUtils;

public class TomcatAttributes{
	
	String tomcat_key_name;
	String tomcat_security_name;
	String tomcat_instance_name;
	//String tomcat_instance_keyname;
	//String tomcat_instancesecurity;
		public String getTomcatKey_name() {
			return tomcat_key_name;
		}
		public void setTomcatKey_name(String tomcat_key_name) {
			this.tomcat_key_name = tomcat_key_name;
		}
		

		public String getTomcat_security_name() {
			return tomcat_security_name;
		}
		public void setTomcat_security_name(String tomcat_security_name) {
			this.tomcat_security_name = tomcat_security_name;
		}
		public String getTomcat_instance_name() {
			return tomcat_instance_name;
		}
		public void setTomcat_instance_name(String tomcat_instance_name) {
			this.tomcat_instance_name = tomcat_instance_name;
		}
		/*public String getTomcat_instancekeyname() {
			return tomcat_instance_keyname;
		}
		public void setTomcat_instancekeyname(String tomcat_instance_keyname) {
			this.tomcat_instance_keyname = tomcat_instance_keyname;
		}
		public String getTomcat_instancesecurity() {
			return tomcat_instancesecurity;
		}
		public void setTomcat_instancesecurity(String tomcat_instancesecurity) {
			this.tomcat_instancesecurity = tomcat_instancesecurity;
		}*/
		private static Properties properties;
		private static TomcatAttributes tomcat_attribute = null;
		private static final String TOMCAT_KEY_NAME = "tomcat_key_name";
		private static final String TOMCAT_SECURITY_NAME ="tomcat_security_name";
		private static final String TOMCAT_INSTANCE_NAME ="tomcat_instance_name";
		//private static final String TOMCAT_INSTANCE_KEYNAME ="tomcat_instance_keyname";
		//private static final String TOMCAT_INSTANCE_SECURITY ="tomcat_instancesecurity";
		private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
		
		public static TomcatAttributes getTomcat_DetailsFromProperties(){
			TomcatAttributes.getReadPropertiesFile();
			String tomcatkey_name = properties.getProperty(TOMCAT_KEY_NAME);
			String tomcatsecurity_name = properties.getProperty(TOMCAT_SECURITY_NAME);
			String tomcatinstance_name = properties.getProperty(TOMCAT_INSTANCE_NAME);
			//String tomcatinstancekeyname = properties.getProperty(TOMCAT_INSTANCE_KEYNAME);
			//String tomcatinstancesecurity=properties.getProperty(TOMCAT_INSTANCE_SECURITY);
			TomcatAttributes tomcat_attribute=new TomcatAttributes();
			tomcat_attribute.setTomcatKey_name(tomcatkey_name);
			tomcat_attribute.setTomcat_security_name(tomcatsecurity_name);
			tomcat_attribute.setTomcat_instance_name(tomcatinstance_name);
			//tomcat_attribute.setTomcat_instancekeyname(tomcatinstancekeyname);
			//tomcat_attribute.setTomcat_instancesecurity(tomcatinstancesecurity);
			return tomcat_attribute;
		}
		public static void getReadPropertiesFile() {
			if(tomcat_attribute == null){
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
