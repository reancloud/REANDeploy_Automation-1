package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class EcsClusterAttributes {
	
	String ecsCluster_rname;
	String ecsCluster_depends_on;
	String ecsCluster_con;
	String ecsCluster_name;
	String ecsCluster_blankData;
	
	public String getEcsCluster_rname() {
		return ecsCluster_rname ;
	}
	public void setEcsCluster_rname(String ecsCluster_rname) {
		this.ecsCluster_rname  = ecsCluster_rname ;
	}
	public String getEcsCluster_depends_on() {
		return 	ecsCluster_depends_on ;
	}
	public void setEcsCluster_depends_on(String ecsCluster_depends_on) {
		this.ecsCluster_depends_on  = ecsCluster_depends_on ;
	}
	public String getEcsCluster_con() {
		return ecsCluster_con ;
	}
	public void setEcsCluster_con(String ecsCluster_con ) {
		this.ecsCluster_con  = ecsCluster_con ;
	}
	
	public String getEcsCluster_name() {
		return ecsCluster_name;
	}
	public void setEcsCluster_name(String ecsCluster_name) {
		this.ecsCluster_name  = ecsCluster_name;
	}
	
	public String getEcsCluster_blankData() {
		return ecsCluster_blankData;
	}
	public void setEcsCluster_blankData(String ecsCluster_blankData) {
		this.ecsCluster_blankData  = ecsCluster_blankData ;
	}

	private static Properties properties;
	private static EcsClusterAttributes ecsClusterDetails = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String ECSCLUSTER_RNAME = "ecsCluster_rname";
	private static final String ECSCLUSTER_DEPENDS_ON = "ecsCluster_depends_on";
	private static final String ECSCLUSTER_CON = "ecsCluster_con";
	private static final String ECSCLUSTER_NAME = "ecsCluster_name";
	private static final String ECSCLUSTER_BLANK_DATA = "ecsCluster_blankData";
	
	public static EcsClusterAttributes getECSClusterFromProperties(){
		
		EcsClusterAttributes.getReadPropertiesFile();
		
		String ecsCluster_rname = properties.getProperty(ECSCLUSTER_RNAME);
		String ecsCluster_depends_on = properties.getProperty(ECSCLUSTER_DEPENDS_ON);
		String ecsCluster_con = properties.getProperty(ECSCLUSTER_CON);
		String ecsCluster_name = properties.getProperty(ECSCLUSTER_NAME);
		String ecsCluster_blankData = properties.getProperty(ECSCLUSTER_BLANK_DATA);
		
		ecsClusterDetails = new EcsClusterAttributes();
		
		ecsClusterDetails.setEcsCluster_rname(ecsCluster_rname);
		ecsClusterDetails.setEcsCluster_depends_on(ecsCluster_depends_on);
		ecsClusterDetails.setEcsCluster_con(ecsCluster_con);
		ecsClusterDetails.setEcsCluster_name(ecsCluster_name);
		ecsClusterDetails.setEcsCluster_blankData(ecsCluster_blankData);
		
		return ecsClusterDetails;
}
public static void getReadPropertiesFile() {
	if(ecsClusterDetails == null){
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

