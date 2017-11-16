package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class IAMInstanceProfileAttributes {

	//IAM_Instance_profile
	String iamInstanceProfile_rname;
	String iamInstanceProfile_role;
	String iamInstanceProfile_dependsOn;
	String iamInstanceProfile_connection;
	String iamInstanceProfile_name;
	String iamInstanceProfile_name_prifix;
	String iamInstanceProfile_path;
	//IAM_Instance_profile-IAMRole
	String iamInstanceProfile_iamRole_rname;
	String iamInstanceProfile_iamRole_assume_role_policy; 

	public String getIAMInstanceProfile_rname() {
		return iamInstanceProfile_rname;
	}
	public void setIAMInstanceProfile_rname(String iamInstanceProfile_rname) {
		this.iamInstanceProfile_rname =iamInstanceProfile_rname;
	}
	
	public String getIAMInstanceProfile_role() {
		return iamInstanceProfile_role;
	}
	public void setIAMInstanceProfile_role(String iamInstanceProfile_role) {
		this.iamInstanceProfile_role =iamInstanceProfile_role;
	}
	
	public String getIAMInstanceProfile_dependsOn() {
		return iamInstanceProfile_dependsOn;
	}
	public void setIAMInstanceProfile_dependsOn(String iamInstanceProfile_dependsOn) {
		this.iamInstanceProfile_dependsOn =iamInstanceProfile_dependsOn;
	}
	
	public String getIAMInstanceProfile_connection() {
		return iamInstanceProfile_connection;
	}
	public void setIAMInstanceProfile_connection(String iamInstanceProfile_connection) {
		this.iamInstanceProfile_connection =iamInstanceProfile_connection;
	}
	
	public String getIAMInstanceProfile_name() {
		return iamInstanceProfile_name;
	}
	public void setIAMInstanceProfile_name(String iamInstanceProfile_name) {
		this.iamInstanceProfile_name =iamInstanceProfile_name;
	}
	
	public String getIAMInstanceProfile_name_prifix() {
		return iamInstanceProfile_name_prifix;
	}
	public void setIAMInstanceProfile_name_prifix(String iamInstanceProfile_name_prifix) {
		this.iamInstanceProfile_name_prifix =iamInstanceProfile_name_prifix;
	}
	
	public String getIAMInstanceProfile_path() {
		return iamInstanceProfile_path;
	}
	public void setIAMInstanceProfile_path(String iamInstanceProfile_path) {
		this.iamInstanceProfile_path =iamInstanceProfile_path;
	}
	//IAM_Instance_profile-IAMRole
	public String getIAMInstanceProfile_iamRole_rname() {
		return iamInstanceProfile_iamRole_rname;
	}
	public void setIAMInstanceProfile_iamRole_rname(String iamInstanceProfile_iamRole_rname) {
		this.iamInstanceProfile_iamRole_rname =iamInstanceProfile_iamRole_rname;
	}
	
	public String getIAMInstanceProfile_iamRole_assume_role_policy() {
		return iamInstanceProfile_iamRole_assume_role_policy;
	}
	public void setIAMInstanceProfile_iamRole_assume_role_policy(String iamInstanceProfile_iamRole_assume_role_policy) {
		this.iamInstanceProfile_iamRole_assume_role_policy =iamInstanceProfile_iamRole_assume_role_policy;
	}
	
	
	private static Properties properties;
	private static IAMInstanceProfileAttributes IAMInstanceProfileAttributes= null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String IAMINSTANCEPROFILE_RNAME="iamInstanceProfile_rname";
	private static final String IAMINSTANCEPROFILE_ROLE="iamInstanceProfile_role";
	private static final String IAMINSTANCEPROFILE_DEPENDSON="iamInstanceProfile_dependsOn";
	private static final String IAMINSTANCEPROFILE_CONNECTION="iamInstanceProfile_connection";
	private static final String IAMINSTANCEPROFILE_NAME="iamInstanceProfile_name";
	private static final String IAMINSTANCEPROFILE_NAME_PRIFIX="iamInstanceProfile_name_prifix";
	private static final String IAMINSTANCEPROFILE_PATH="iamInstanceProfile_path";
	//IAM_Instance_profile-IAMRole
	private static final String IAMINSTANCEPROFILE_IAMROLE_RNAME="iamInstanceProfile_iamRole_rname";
	private static final String IAMINSTANCEPROFILE_IAMROLE_ASSUME_ROLE_POLICY="iamInstanceProfile_iamRole_assume_role_policy"; 

	public static IAMInstanceProfileAttributes  getIAMInstanceProfileAttributesFromProperties(){

		IAMInstanceProfileAttributes.getReadPropertiesFile();
		
		String iamInstanceProfile_rname= properties.getProperty(IAMINSTANCEPROFILE_RNAME);
		String iamInstanceProfile_role= properties.getProperty(IAMINSTANCEPROFILE_ROLE);
		String iamInstanceProfile_dependsOn= properties.getProperty(IAMINSTANCEPROFILE_DEPENDSON);
		String iamInstanceProfile_connection= properties.getProperty(IAMINSTANCEPROFILE_CONNECTION);
		String iamInstanceProfile_name= properties.getProperty(IAMINSTANCEPROFILE_NAME);
		String iamInstanceProfile_name_prifix= properties.getProperty(IAMINSTANCEPROFILE_NAME_PRIFIX);
		String iamInstanceProfile_path= properties.getProperty(IAMINSTANCEPROFILE_PATH);
		//IAM_Instance_profile-IAMRole
		String iamInstanceProfile_iamRole_rname= properties.getProperty(IAMINSTANCEPROFILE_IAMROLE_RNAME);
		String iamInstanceProfile_iamRole_assume_role_policy= properties.getProperty(IAMINSTANCEPROFILE_IAMROLE_ASSUME_ROLE_POLICY);
		


		IAMInstanceProfileAttributes = new IAMInstanceProfileAttributes();
		IAMInstanceProfileAttributes.setIAMInstanceProfile_rname(iamInstanceProfile_rname);
		IAMInstanceProfileAttributes.setIAMInstanceProfile_role(iamInstanceProfile_role);
		IAMInstanceProfileAttributes.setIAMInstanceProfile_dependsOn(iamInstanceProfile_dependsOn);
		IAMInstanceProfileAttributes.setIAMInstanceProfile_connection(iamInstanceProfile_connection);
		IAMInstanceProfileAttributes.setIAMInstanceProfile_name(iamInstanceProfile_name);
		IAMInstanceProfileAttributes.setIAMInstanceProfile_name_prifix(iamInstanceProfile_name_prifix);
		IAMInstanceProfileAttributes.setIAMInstanceProfile_path(iamInstanceProfile_path);
		//IAM_Instance_profile-IAMRole
		IAMInstanceProfileAttributes.setIAMInstanceProfile_iamRole_rname(iamInstanceProfile_iamRole_rname);
		IAMInstanceProfileAttributes.setIAMInstanceProfile_iamRole_assume_role_policy(iamInstanceProfile_iamRole_assume_role_policy);
		return IAMInstanceProfileAttributes;


	}

	public static void getReadPropertiesFile() {
		if(IAMInstanceProfileAttributes == null){
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


