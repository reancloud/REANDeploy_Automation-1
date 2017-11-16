package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class InternetGatewayAttributes {


	String igw_vpc_id;
	String igw_Depends_on;
	String igw_vpc_cidr_block;
	String igw_vpc_rname;
	String igw_envname;
	String igw_connection;
	String igw_blankdata;
	String igw_rname;

	public String getIgw_envname(){
		return igw_envname;
	}
	public void setIgw_envname(String igw_envname) {
		this.igw_envname = igw_envname;
	}
	public String getIgw_rname(){
		return igw_rname;
	}
	public void setIgw_rname(String igw_rname) {
		this.igw_rname = igw_rname;
	}
	public String getIgw_blankdata(){
		return igw_blankdata;
	}
	public void setIgw_blankdata(String igw_blankdata) {
		this.igw_blankdata = igw_blankdata;
	}
	public String getIgw_connection(){
		return igw_connection;
	}
	public void setIgw_connection(String igw_connection) {
		this.igw_connection = igw_connection;
	}
	public String getIgw_vpc_id(){
		return igw_vpc_id;
	}
	public void setIgw_vpc_id(String igw_vpc_id) {
		this.igw_vpc_id = igw_vpc_id;
	}
	
	public String getIgw_DependsOn() {
		return igw_Depends_on;
	}
	public void setIgw_DependsOn(String igw_Depends_on) {
		this.igw_Depends_on = igw_Depends_on;
	}
	
	public String getIgw_vpc_cidr_block() {
		return igw_vpc_cidr_block;
	}
	public void setIgw_vpc_cidr_block(String igw_vpc_cidr_block) {
		this.igw_vpc_cidr_block = igw_vpc_cidr_block;
	}
	
	public String getIgw_vpc_rname(){
		return igw_vpc_rname;
	}
	public void setIgw_vpc_rname(String igw_vpc_rname) {
		this.igw_vpc_rname = igw_vpc_rname;
	}
	
	private static Properties properties;
	private static InternetGatewayAttributes igwAttributes = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String IGW_VPC_ID = "igw_vpc_id";
	private static final String IGW_DEPENDS_ON = "igw_Depends_On";
	private static final String IGW_VPC_CIDR_BLOCK = "igw_vpc_cidr_block";
	private static final String VPC_RESOURCE_NAME = "igw_vpc_rname";
	private static final String IGW_ENV_NAME = "igw_envname";
	private static final String IGW_RNAME = "igw_rname";
	private static final String IGW_CONNECTION = "igw_connection";
	private static final String IGW_BLANKDATA =  "igw_blankdata";
	
	public static InternetGatewayAttributes getInternetGatewayAttributesFromProperties() {
		
		igwAttributes.getReadPropertiesFile();
		
		String igw_vpc_id = properties.getProperty(IGW_VPC_ID);
		String igw_Depends_on = properties.getProperty(IGW_DEPENDS_ON);
		String igw_vpc_cidr_block = properties.getProperty(IGW_VPC_CIDR_BLOCK);
		String igw_vpc_rname = properties.getProperty(VPC_RESOURCE_NAME);
		String igw_envname = properties.getProperty(IGW_ENV_NAME);
		String igw_rname = properties.getProperty(IGW_RNAME);
		String igw_connection = properties.getProperty(IGW_CONNECTION);
		String igw_blankdata = properties.getProperty(IGW_BLANKDATA);
		igwAttributes = new InternetGatewayAttributes();
		igwAttributes.setIgw_vpc_id(igw_vpc_id);
		igwAttributes.setIgw_DependsOn(igw_Depends_on);
		igwAttributes.setIgw_vpc_cidr_block(igw_vpc_cidr_block);
		igwAttributes.setIgw_vpc_rname(igw_vpc_rname);
		igwAttributes.setIgw_connection(igw_connection);
		igwAttributes.setIgw_envname(igw_envname);
		igwAttributes.setIgw_rname(igw_rname);
		igwAttributes.setIgw_blankdata(igw_blankdata);
		
		return igwAttributes;
	}
	
	public static void getReadPropertiesFile() {
		if(igwAttributes == null){
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
