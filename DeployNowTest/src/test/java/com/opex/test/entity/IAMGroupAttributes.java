package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class IAMGroupAttributes {
	

	String iamGroup_envname;
	String iamGroup_rname;
	String iamGroup_depends_on;
	String iamGroup_con;
	String iamGroup_path;
	String iamGroup_blankData;
	
	public String getIamGroup_envname() {
		return iamGroup_envname ;
	}
	public void setIamGroup_envname(String iamGroup_envname) {
		this.iamGroup_envname  = iamGroup_envname ;
	}
	public String getIamGroup_rname() {
		return iamGroup_rname ;
	}
	public void setIamGroup_rname(String iamGroup_rname) {
		this.iamGroup_rname  = iamGroup_rname ;
	}
	public String getIamGroup_depends_on() {
		return iamGroup_depends_on ;
	}
	public void setIamGroup_depends_on(String iamGroup_depends_on) {
		this.iamGroup_depends_on  = iamGroup_depends_on ;
	}
	public String getIamGroup_con() {
		return iamGroup_con ;
	}
	public void setiamGroup_con(String iamGroup_con ) {
		this.iamGroup_con  = iamGroup_con ;
	}
	
	public String getIamGroup_path() {
		return iamGroup_path;
	}
	public void setiamGroup_path(String iamGroup_path) {
		this.iamGroup_path  = iamGroup_path ;
	}
	
	public String getIamGroup_blankData() {
		return iamGroup_blankData;
	}
	public void setIamGroup_blankData(String iamGroup_blankData) {
		this.iamGroup_blankData  = iamGroup_blankData ;
	}
	
	private static Properties properties;
	private static IAMGroupAttributes iamGroupDetails = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String IAM_GROUP_ENVNAME = "iamGroup_envname";
	private static final String IAM_GROUP_RNAME = "iamGroup_rname";
	private static final String IAM_GROUP_DEPENDS_ON = "iamGroup_depends_on";
	private static final String IAM_GROUP_CON = "iamGroup_con";
	private static final String IAM_GROUP_PATH = "iamGroup_path";
	private static final String IAM_GROUP_BLANK_DATA = "iamGroup_blankData";
	
	
public static IAMGroupAttributes getIAM_groupFromProperties(){
		
		IAMGroupAttributes.getReadPropertiesFile();
		String iamGroup_envname = properties.getProperty(IAM_GROUP_ENVNAME);
		String iamGroup_rname = properties.getProperty(IAM_GROUP_RNAME);
		String iamGroup_depends_on = properties.getProperty(IAM_GROUP_DEPENDS_ON);
		String iamGroup_con = properties.getProperty(IAM_GROUP_CON);
		String iamGroup_path = properties.getProperty(IAM_GROUP_PATH);
		String iamGroup_blankData = properties.getProperty(IAM_GROUP_BLANK_DATA);
		iamGroupDetails = new IAMGroupAttributes();
		iamGroupDetails.setIamGroup_envname(iamGroup_envname);
		iamGroupDetails.setIamGroup_rname(iamGroup_rname);
		iamGroupDetails.setIamGroup_depends_on(iamGroup_depends_on);
		iamGroupDetails.setiamGroup_con(iamGroup_con);
		iamGroupDetails.setiamGroup_path(iamGroup_path);
		iamGroupDetails.setIamGroup_blankData(iamGroup_blankData);
		return iamGroupDetails;
	}
	public static void getReadPropertiesFile() {
		if(iamGroupDetails == null){
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
