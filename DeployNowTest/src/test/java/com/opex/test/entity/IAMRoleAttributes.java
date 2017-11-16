package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class IAMRoleAttributes {
		
		String iamRole_rname;
		String iamRole_name_prefix;
		String iamRole_con;
		String iamRole_depends_on;
		String iamRole_path;
		String iamRole_assume_role_policy;
		String iamRole_blankData;
	
		
		
		public String getIamRole_rname() {
			return iamRole_rname ;
		}
		public void setIamRole_rname(String iamRole_rname) {
			this.iamRole_rname  = iamRole_rname ;
		}
		public String getIamRole_depends_on() {
			return 	iamRole_depends_on ;
		}
		public void setIamRole_depends_on(String iamRole_depends_on) {
			this.iamRole_depends_on  = iamRole_depends_on ;
		}
		public String getIamRole_con() {
			return iamRole_con ;
		}
		public void setIamRole_con(String iamRole_con ) {
			this.iamRole_con  = iamRole_con ;
		}
		
		public String getIamRole_path() {
			return iamRole_path;
		}
		public void setIamRole_path(String iamRole_path) {
			this.iamRole_path  = iamRole_path ;
		}
		
		public String getIamRole_name_prefix() {
			return iamRole_name_prefix ;
		}
		public void setIamRole_name_prefix(String iamRole_name_prefix ) {
			this.iamRole_name_prefix  = iamRole_name_prefix;
		}
		
		public String getIamRole_assume_role_policy() {
			return iamRole_assume_role_policy;
		}
		public void setIamRole_assume_role_policy(String iamRole_assume_role_policy) {
			this.iamRole_assume_role_policy  = iamRole_assume_role_policy ;
		}
		
		public String getIamRole_blankData() {
			return iamRole_blankData;
		}
		public void setIamRole_blankData(String iamRole_blankData) {
			this.iamRole_blankData = iamRole_blankData ;
		}
		
		private static Properties properties;
		private static IAMRoleAttributes iamRoleDetails = null;
		private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
		private static final String IAMROLE_RNAME = "iamRole_rname";
		private static final String IAMROLE_DEPENDS_ON = "iamRole_depends_on";
		private static final String IAMROLE_CON = "iamRole_con";
		private static final String IAMROLE_BLANK_DATA = "iamRole_blankData";
		private static final String IAMROLE_NAME_PREFIX = "iamRole_name_prefix";
		private static final String IAMROLE_ASSUME_ROLE_POLICY = "iamRole_assume_role_policy";
		private static final String IAMROLE_PATH = "iamRole_path";
		
		public static IAMRoleAttributes getIAM_RoleFromProperties(){
			
			IAMRoleAttributes.getReadPropertiesFile();
			
			String iamRole_rname = properties.getProperty(IAMROLE_RNAME);
			String iamRole_name_prefix = properties.getProperty(IAMROLE_NAME_PREFIX);
			String iamRole_con = properties.getProperty(IAMROLE_CON);
			String iamRole_depends_on = properties.getProperty(IAMROLE_DEPENDS_ON);
			String iamRole_path = properties.getProperty(IAMROLE_PATH);
			String iamRole_assume_role_policy = properties.getProperty(IAMROLE_ASSUME_ROLE_POLICY);
			String iamRole_blankData = properties.getProperty(IAMROLE_BLANK_DATA);
			
			iamRoleDetails = new IAMRoleAttributes();
		
			iamRoleDetails.setIamRole_rname(iamRole_rname);
			iamRoleDetails.setIamRole_name_prefix(iamRole_name_prefix);
			iamRoleDetails.setIamRole_assume_role_policy(iamRole_assume_role_policy);
			iamRoleDetails.setIamRole_blankData(iamRole_blankData);
			iamRoleDetails.setIamRole_con(iamRole_con);
			iamRoleDetails.setIamRole_depends_on(iamRole_depends_on);
			iamRoleDetails.setIamRole_path(iamRole_path);
			
			return iamRoleDetails;
		}
		public static void getReadPropertiesFile() {
			if(iamRoleDetails == null){
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
