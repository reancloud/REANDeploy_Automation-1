package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class IAMRolePolicyAttributes {
	//IAM Role Policy
	String iamRolePolicy_Rname;
	String iamRolePolicy_name;
	String iamRolePolicy_policy;
	String iamRolePolicy_role;
	String iamRolePolicy_dependson;
	String iamRolePolicy_connection;
	//IAM Role Policy- IAM Role
	String iamRolePolicy_iamRole_rname;
	String iamRolePolicy_iamRole_assume_role_policy;

	//IAM Role Policy
	public String getIamRolePolicy_Rname() {
		return iamRolePolicy_Rname;
	}
	public void setIamRolePolicy_Rname(String iamRolePolicy_Rname) {
		this.iamRolePolicy_Rname = iamRolePolicy_Rname;
	}

	public String getIamRolePolicy_name() {
		return iamRolePolicy_name;

	}
	public void setIamRolePolicy_name(String iamRolePolicy_name) {
		this.iamRolePolicy_name = iamRolePolicy_name;
	}

	public String getIamRolePolicy_policy() {
		return iamRolePolicy_policy;
	}
	public void setIamRolePolicy_policy(String iamRolePolicy_policy) {
		this.iamRolePolicy_policy = iamRolePolicy_policy;
	}

	public String getIamRolePolicy_role() {
		return iamRolePolicy_role;
	}
	public void setIamRolePolicy_role(String iamRolePolicy_role) {
		this.iamRolePolicy_role = iamRolePolicy_role;
	}

	public String getIamRolePolicy_dependson() {
		return iamRolePolicy_dependson;
	}
	public void setIamRolePolicy_dependson(String iamRolePolicy_dependson) {
		this.iamRolePolicy_dependson = iamRolePolicy_dependson;
	}

	public String getIamRolePolicy_connection() {
		return iamRolePolicy_connection;
	}
	public void setIamRolePolicy_connection(String iamRolePolicy_connection) {
		this.iamRolePolicy_connection = iamRolePolicy_connection;
	}
	
	//IAM Role Policy- IAM Role

	public String getIamRolePolicy_iamRole_rname() {
		return iamRolePolicy_iamRole_rname;
	}
	public void setIamRolePolicy_iamRole_rname(String iamRolePolicy_iamRole_rname) {
		this.iamRolePolicy_iamRole_rname = iamRolePolicy_iamRole_rname;
	}

	public String getIamRolePolicy_iamRole_assume_role_policy() {
		return iamRolePolicy_iamRole_assume_role_policy;
	}
	public void setIamRolePolicy_iamRole_assume_role_policy(String iamRolePolicy_iamRole_assume_role_policy) {
		this.iamRolePolicy_iamRole_assume_role_policy = iamRolePolicy_iamRole_assume_role_policy;
	}
	
	private static Properties properties;
	private static IAMRolePolicyAttributes IAMRolePolicyAttributes = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	
	//IAM Role Policy
	private static final String IAMROLEPOLICY_RNAME="iamRolePolicy_Rname";
	private static final String IAMROLEPOLICY_NAME="iamRolePolicy_name";
	private static final String IAMROLEPOLICY_POLICY="iamRolePolicy_policy";
	private static final String	IAMROLEPOLICY_ROLE="iamRolePolicy_role";
	private static final String IAMROLEPOLICY_DEPENDSON="iamRolePolicy_dependson";
	private static final String IAMROLEPOLICY_CONNECTION="iamRolePolicy_connection";
		//IAM Role Policy- IAM Role
	private static final String IAMROLEPOLICY_IAMROLE_RNAME="iamRolePolicy_iamRole_rname";
	private static final String IAMROLEPOLICY_IAMROLE_POLICY="iamRolePolicy_iamRole_assume_role_policy";
	
	public static IAMRolePolicyAttributes getIAMRolePolicyAttributesFromProperties(){
		
		IAMRolePolicyAttributes.getReadPropertiesFile();
		
		String iamRolePolicy_Rname= properties.getProperty(IAMROLEPOLICY_RNAME);
		String iamRolePolicy_name= properties.getProperty(IAMROLEPOLICY_NAME);
		String iamRolePolicy_policy= properties.getProperty(IAMROLEPOLICY_POLICY);
		String iamRolePolicy_role= properties.getProperty(IAMROLEPOLICY_ROLE);
		String iamRolePolicy_dependson= properties.getProperty(IAMROLEPOLICY_DEPENDSON);
		String iamRolePolicy_connection= properties.getProperty(IAMROLEPOLICY_CONNECTION);
		//IAM Role Policy- IAM Role
		String iamRolePolicy_iamRole_rname= properties.getProperty(IAMROLEPOLICY_IAMROLE_RNAME);
		String iamRolePolicy_iamRole_assume_role_policy= properties.getProperty(IAMROLEPOLICY_IAMROLE_POLICY);
		
		IAMRolePolicyAttributes = new IAMRolePolicyAttributes();
		//ELB-VPC
		IAMRolePolicyAttributes.setIamRolePolicy_Rname(iamRolePolicy_Rname);
		IAMRolePolicyAttributes.setIamRolePolicy_name(iamRolePolicy_name);
		IAMRolePolicyAttributes.setIamRolePolicy_policy(iamRolePolicy_policy);
		IAMRolePolicyAttributes.setIamRolePolicy_role(iamRolePolicy_role);
		IAMRolePolicyAttributes.setIamRolePolicy_dependson(iamRolePolicy_dependson);
		IAMRolePolicyAttributes.setIamRolePolicy_connection(iamRolePolicy_connection);
		//IAM Role Policy- IAM Role
		IAMRolePolicyAttributes.setIamRolePolicy_iamRole_rname(iamRolePolicy_iamRole_rname);
		IAMRolePolicyAttributes.setIamRolePolicy_iamRole_assume_role_policy(iamRolePolicy_iamRole_assume_role_policy);
		return IAMRolePolicyAttributes;
	}
	
	public static void getReadPropertiesFile() {
		if(IAMRolePolicyAttributes == null){
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



		
		