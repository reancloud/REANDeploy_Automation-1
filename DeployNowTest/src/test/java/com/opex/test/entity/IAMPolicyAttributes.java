package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class IAMPolicyAttributes {

	String iamPolicy_envname;
	String iamPolicy_rname;
	String iamPolicy_depends_on;
	String iamPolicy_con;
	String iamPolicy_path;
	String iamPolicy_blankData;
	String iamPolicy_policy;
	String iamPolicy_description;
	
	public String getIamPolicy_envname() {
		return iamPolicy_envname ;
	}
	public void setIamPolicy_envname(String iamPolicy_envname) {
		this.iamPolicy_envname  = iamPolicy_envname ;
	}
	public String getIamPolicy_rname() {
		return iamPolicy_rname ;
	}
	public void setIamPolicy_rname(String iamPolicy_rname) {
		this.iamPolicy_rname  = iamPolicy_rname ;
	}
	public String getIamPolicy_depends_on() {
		return iamPolicy_depends_on ;
	}
	public void setIamPolicy_depends_on(String iamPolicy_depends_on) {
		this.iamPolicy_depends_on  = iamPolicy_depends_on ;
	}
	public String getIamPolicy_con() {
		return iamPolicy_con ;
	}
	public void setIamPolicy_con(String iamPolicy_con ) {
		this.iamPolicy_con  = iamPolicy_con ;
	}
	
	public String getIamPolicy_path() {
		return iamPolicy_path;
	}
	public void setIamPolicy_path(String iamPolicy_path) {
		this.iamPolicy_path  = iamPolicy_path ;
	}
	
	public String getIamPolicy_blankData() {
		return iamPolicy_blankData;
	}
	public void setIamPolicy_blankData(String iamPolicy_blankData) {
		this.iamPolicy_blankData  = iamPolicy_blankData ;
	}
	
	public String getIamPolicy_description() {
		return iamPolicy_description;
	}
	public void setIamPolicy_description(String iamPolicy_description) {
		this.iamPolicy_description  = iamPolicy_description ;
	}
	
	public String getIamPolicy_policy() {
		return iamPolicy_policy;
	}
	public void setIamPolicy_policy(String iamPolicy_policy) {
		this.iamPolicy_policy  = iamPolicy_policy ;
	}
	
	private static Properties properties;
	private static IAMPolicyAttributes iamPolicyDetails = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String IAM_POLICY_ENVNAME = "iamPolicy_envname";
	private static final String IAM_POLICY_RNAME = "iamPolicy_rname";
	private static final String IAM_POLICY_DEPENDS_ON = "iamPolicy_depends_on";
	private static final String IAM_POLICY_CON = "iamPolicy_con";
	private static final String IAM_POLICY_PATH = "iamPolicy_path";
	private static final String IAM_POLICY_BLANK_DATA = "iamPolicy_blankData";
	private static final String IAM_POLICY_POLICY = "iamPolicy_policy";
	private static final String IAM_POLICY_DESCRIPTION = "iamPolicy_description";
	
	public static IAMPolicyAttributes getIAM_PolicyFromProperties(){
		
		IAMPolicyAttributes.getReadPropertiesFile();
		String iamPolicy_envname = properties.getProperty(IAM_POLICY_ENVNAME);
		String iamPolicy_rname = properties.getProperty(IAM_POLICY_RNAME);
		String iamPolicy_depends_on = properties.getProperty(IAM_POLICY_DEPENDS_ON);
		String iamPolicy_con = properties.getProperty(IAM_POLICY_CON);
		String iamPolicy_path = properties.getProperty(IAM_POLICY_PATH);
		String iamPolicy_blankData = properties.getProperty(IAM_POLICY_BLANK_DATA);
		String iamPolicy_policy = properties.getProperty(IAM_POLICY_POLICY);
		String iamPolicy_description = properties.getProperty(IAM_POLICY_DESCRIPTION);
		
		iamPolicyDetails = new IAMPolicyAttributes();
		iamPolicyDetails.setIamPolicy_envname(iamPolicy_envname);
		iamPolicyDetails.setIamPolicy_rname(iamPolicy_rname);
		iamPolicyDetails.setIamPolicy_depends_on(iamPolicy_depends_on);
		iamPolicyDetails.setIamPolicy_con(iamPolicy_con);
		iamPolicyDetails.setIamPolicy_path(iamPolicy_path);
		iamPolicyDetails.setIamPolicy_blankData(iamPolicy_blankData);
		iamPolicyDetails.setIamPolicy_policy(iamPolicy_policy);
		iamPolicyDetails.setIamPolicy_description(iamPolicy_description);
		return iamPolicyDetails;
	}
	public static void getReadPropertiesFile() {
		if(iamPolicyDetails == null){
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
