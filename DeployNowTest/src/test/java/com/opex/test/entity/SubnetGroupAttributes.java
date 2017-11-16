package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class SubnetGroupAttributes {
	
	String subnetGroup_rname;
	String subnetGroup_blankData;
	String subnetGroup_depends_on;
	String subnetGroup_con;
	String subnetGroup_description;
	String subnetGroup_subnetId;
	String subnetGroup_vpc_rname;
	String subnetGroup_vpc_cidrBlock;
	String subnetGroup_subnet1_rname;
	String subnetGroup_subnet1_cidrBlock;		
	String subnetGroup_subnet1_VpcId;
	String subnetGroup_subnet1_availabilityZone;
	String subnetGroup_subnet2_rname;
	String subnetGroup_subnet2_cidrBlock;		
	String subnetGroup_subnet2_VpcId;
	String subnetGroup_subnet2_availabilityZone;
	

	public String getSubnetGroup_rname() {
		return subnetGroup_rname ;
	}
	public void setSubnetGroup_rname(String subnetGroup_rname) {
		this.subnetGroup_rname  = subnetGroup_rname ;
	}
	public String getSubnetGroup_blankData() {
		return subnetGroup_blankData ;
	}
	public void setSubnetGroup_blankData(String subnetGroup_blankData ) {
		this.subnetGroup_blankData  = subnetGroup_blankData ;
	}
	public String getSubnetGroup_depends_on() {
		return 	subnetGroup_depends_on ;
	}
	public void setgetNSubnetGroup_depends_on(String subnetGroup_depends_on) {
		this.subnetGroup_depends_on  = subnetGroup_depends_on ;
	}
	public String getSubnetGroup_con() {
		return subnetGroup_con ;
	}
	public void setSubnetGroup_con(String subnetGroup_con ) {
		this.subnetGroup_con  = subnetGroup_con ;
	}
	
	public String getSubnetGroup_description() {
		return subnetGroup_description ;
	}
	public void setSubnetGroup_description(String subnetGroup_description) {
		this.subnetGroup_description  = subnetGroup_description ;
	}
	
	public String getSubnetGroup_subnetId() {
		return subnetGroup_subnetId ;
	}
	public void setSubnetGroup_subnetId(String subnetGroup_subnetId) {
		this.subnetGroup_subnetId  = subnetGroup_subnetId ;
	}
	public String getSubnetGroup_vpc_rname() {
		return subnetGroup_vpc_rname ;
	}
	public void setSubnetGroup_vpc_rname(String subnetGroup_vpc_rname) {
		this.subnetGroup_vpc_rname  = subnetGroup_vpc_rname ;
	}
	public String getSubnetGroup_vpc_cidrBlock() {
		return subnetGroup_vpc_cidrBlock;
	}
	public void setSubnetGroup_vpc_cidrBlock(String subnetGroup_vpc_cidrBlock) {
		this.subnetGroup_vpc_cidrBlock  = subnetGroup_vpc_cidrBlock ;
	}
	public String getSubnetGroup_subnet1_rname() {
		return subnetGroup_subnet1_rname ;
	}
	public void setSubnetGroup_subnet1_rname(String subnetGroup_subnet1_rname) {
		this.subnetGroup_subnet1_rname  = subnetGroup_subnet1_rname ;
	}
	public String getSubnetGroup_subnet1_cidrBlock() {
		return subnetGroup_subnet1_cidrBlock ;
	}
	public void setSubnetGroup_subnet1_cidrBlock(String subnetGroup_subnet1_cidrBlock) {
		this.subnetGroup_subnet1_cidrBlock  = subnetGroup_subnet1_cidrBlock ;
	}
	public String getSubnetGroup_subnet1_VpcId() {
		return subnetGroup_subnet1_VpcId ;
	}
	public void setSubnetGroup_subnet1_VpcId(String subnetGroup_subnet1_VpcId) {
		this.subnetGroup_subnet1_VpcId = subnetGroup_subnet1_VpcId ;
	}
	public String getSubnetGroup_subnet1_availabilityZone() {
		return subnetGroup_subnet1_availabilityZone ;
	}
	public void setSubnetGroup_subnet1_availabilityZone(String subnetGroup_subnet1_availabilityZone) {
		this.subnetGroup_subnet1_availabilityZone  = subnetGroup_subnet1_availabilityZone ;
	}
	
	public String getSubnetGroup_subnet2_rname() {
		return subnetGroup_subnet2_rname ;
	}
	public void setSubnetGroup_subnet2_rname(String subnetGroup_subnet2_rname) {
		this.subnetGroup_subnet2_rname  = subnetGroup_subnet2_rname ;
	}
	public String getSubnetGroup_subnet2_cidrBlock() {
		return subnetGroup_subnet2_cidrBlock ;
	}
	public void setSubnetGroup_subnet2_cidrBlock(String subnetGroup_subnet2_cidrBlock) {
		this.subnetGroup_subnet2_cidrBlock  = subnetGroup_subnet2_cidrBlock ;
	}
	public String getSubnetGroup_subnet2_VpcId() {
		return subnetGroup_subnet2_VpcId ;
	}
	public void setSubnetGroup_subnet2_VpcId(String subnetGroup_subnet2_VpcId) {
		this.subnetGroup_subnet2_VpcId = subnetGroup_subnet2_VpcId ;
	}
	public String getSubnetGroup_subnet2_availabilityZone() {
		return subnetGroup_subnet2_availabilityZone ;
	}
	public void setSubnetGroup_subnet2_availabilityZone(String subnetGroup_subnet2_availabilityZone) {
		this.subnetGroup_subnet2_availabilityZone  = subnetGroup_subnet2_availabilityZone ;
	}
	
	private static Properties properties;
	private static SubnetGroupAttributes subnetGroupDetails = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String SUBNETGROUP_RNAME = "subnetGroup_rname";
	private static final String SUBNETGROUP_BLANKDATA = "subnetGroup_blankData";
	private static final String SUBNETGROUP_DEPENDSON = "subnetGroup_depends_on";
	private static final String SUBNETGROUP_CON = "subnetGroup_con";
	private static final String SUBNETGROUP_DESCRIPTION = "subnetGroup_description";
	private static final String SUBNETGROUP_SUBNETID = "subnetGroup_subnetId";
	private static final String SUBNETGROUP_VPC_RNAME = "subnetGroup_vpc_rname";
	private static final String SUBNETGROUP_VPC_CIDRBLOCK = "subnetGroup_vpc_cidrBlock";
	private static final String SUBNETGROUP_SUBNET1_RNAME = "subnetGroup_subnet1_rname";
	private static final String SUBNETGROUP_SUBNET1_CIDRBLOCK = "subnetGroup_subnet1_cidrBlock";
	private static final String SUBNETGROUP_SUBNET1_VPCID = "subnetGroup_subnet1_VpcId";
	private static final String SUBNETGROUP_SUBNET1_AVAILABIITY_ZONE = "subnetGroup_subnet1_availabilityZone";
	private static final String SUBNETGROUP_SUBNET2_RNAME = "subnetGroup_subnet2_rname";
	private static final String SUBNETGROUP_SUBNET2_CIDRBLOCK = "subnetGroup_subnet2_cidrBlock";
	private static final String SUBNETGROUP_SUBNET2_VPCID = "subnetGroup_subnet2_VpcId";
	private static final String SUBNETGROUP_SUBNET2_AVAILABIITY_ZONE = "subnetGroup_subnet2_availabilityZone";

	public static SubnetGroupAttributes getSubnetGroupFromProperties(){
		
		SubnetGroupAttributes.getReadPropertiesFile();
		String subnetGroup_rname = properties.getProperty(SUBNETGROUP_RNAME);
		String subnetGroup_blankData = properties.getProperty(SUBNETGROUP_BLANKDATA);
		String subnetGroup_depends_on = properties.getProperty(SUBNETGROUP_DEPENDSON);
		String subnetGroup_con = properties.getProperty(SUBNETGROUP_CON);
		String subnetGroup_description = properties.getProperty(SUBNETGROUP_DESCRIPTION);
		String subnetGroup_subnetId = properties.getProperty(SUBNETGROUP_SUBNETID);
		String subnetGroup_vpc_rname = properties.getProperty(SUBNETGROUP_VPC_RNAME);
		String subnetGroup_vpc_cidrBlock = properties.getProperty(SUBNETGROUP_VPC_CIDRBLOCK);
		String subnetGroup_subnet1_rname = properties.getProperty(SUBNETGROUP_SUBNET1_RNAME);
		String subnetGroup_subnet1_cidrBlock = properties.getProperty(SUBNETGROUP_SUBNET1_CIDRBLOCK);		
		String subnetGroup_subnet1_VpcId = properties.getProperty(SUBNETGROUP_SUBNET1_VPCID);
		String subnetGroup_subnet1_availabilityZone = properties.getProperty(SUBNETGROUP_SUBNET1_AVAILABIITY_ZONE);
		String subnetGroup_subnet2_rname = properties.getProperty(SUBNETGROUP_SUBNET2_RNAME);
		String subnetGroup_subnet2_cidrBlock = properties.getProperty(SUBNETGROUP_SUBNET2_CIDRBLOCK);		
		String subnetGroup_subnet2_VpcId = properties.getProperty(SUBNETGROUP_SUBNET2_VPCID);
		String subnetGroup_subnet2_availabilityZone = properties.getProperty(SUBNETGROUP_SUBNET2_AVAILABIITY_ZONE);
		
		
		subnetGroupDetails = new SubnetGroupAttributes();
		subnetGroupDetails.setSubnetGroup_rname(subnetGroup_rname);
		subnetGroupDetails.setSubnetGroup_blankData(subnetGroup_blankData);
		subnetGroupDetails.setgetNSubnetGroup_depends_on(subnetGroup_depends_on);
		subnetGroupDetails.setSubnetGroup_con(subnetGroup_con);
		subnetGroupDetails.setSubnetGroup_description(subnetGroup_description);
		subnetGroupDetails.setSubnetGroup_subnetId(subnetGroup_subnetId);
		subnetGroupDetails.setSubnetGroup_vpc_rname(subnetGroup_vpc_rname);
		subnetGroupDetails.setSubnetGroup_vpc_cidrBlock(subnetGroup_vpc_cidrBlock);
		subnetGroupDetails.setSubnetGroup_subnet1_rname(subnetGroup_subnet1_rname);
		subnetGroupDetails.setSubnetGroup_subnet1_cidrBlock(subnetGroup_subnet1_cidrBlock);
		subnetGroupDetails.setSubnetGroup_subnet1_VpcId(subnetGroup_subnet1_VpcId);
		subnetGroupDetails.setSubnetGroup_subnet1_availabilityZone(subnetGroup_subnet1_availabilityZone);
		subnetGroupDetails.setSubnetGroup_subnet2_rname(subnetGroup_subnet2_rname);
		subnetGroupDetails.setSubnetGroup_subnet2_cidrBlock(subnetGroup_subnet2_cidrBlock);
		subnetGroupDetails.setSubnetGroup_subnet2_VpcId(subnetGroup_subnet2_VpcId);
		subnetGroupDetails.setSubnetGroup_subnet2_availabilityZone(subnetGroup_subnet2_availabilityZone);
		return subnetGroupDetails;
	}
	public static void getReadPropertiesFile() {
		if(subnetGroupDetails == null){
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
