package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class ProfileAttributes {
	
	
String profileName;
String profileEmail;
String profilePassword;
String profileRePassword;
String profileCompany;
	
	public String getProfileName() {
		return profileName ;
	}
	public void setProfileName(String profileName) {
		this.profileName  = profileName ;
	}
	
	public String getProfileEmail() {
		return profileEmail ;
	}
	public void setProfileEmail(String profileEmail) {
		this.profileEmail  = profileEmail ;
	}
	public String getProfilePassword() {
		return profilePassword ;
	}
	public void setProfilePassword(String profilePassword) {
		this.profilePassword  = profilePassword ;
	}
	public String getProfileRePassword() {
		return profileRePassword;
	}
	public void setProfileRePassword(String profileRePassword) {
		this.profileRePassword  = profileRePassword ;
	}
	public String getProfileCompany() {
		return profileCompany ;
	}
	public void setProfileCompany(String profileCompany) {
		this.profileCompany  = profileCompany ;
	}
	
	private static Properties properties;
	private static ProfileAttributes profileAttributes = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String PROFILENAME = "profileName";
	private static final String PROFILEEMAIL = "profileEmail";
	private static final String PROFILEPASSWORD = "profilePassword";
	private static final String PROFILEREPASSWORD = "profileRePassword";
	private static final String PROFILECOMPANY = "profileCompany";
	
	public static ProfileAttributes getProfileFromProperties(){
		
		profileAttributes.getReadPropertiesFile();
		
		String profileName = properties.getProperty(PROFILENAME);
		String profileEmail = properties.getProperty(PROFILEEMAIL); 
		String profilePassword = properties.getProperty(PROFILEPASSWORD);
		String profileRePassword = properties.getProperty(PROFILEREPASSWORD);
		String profileCompany = properties.getProperty(PROFILECOMPANY);
		
		profileAttributes = new ProfileAttributes();
		
		profileAttributes.setProfileName(profileName);
		profileAttributes.setProfileEmail(profileEmail);
		profileAttributes.setProfilePassword(profilePassword);
		profileAttributes.setProfileRePassword(profileRePassword);
		profileAttributes.setProfileCompany(profileCompany);
		
		return profileAttributes;
		}
		public static void getReadPropertiesFile() {
			if(profileAttributes == null){
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
