package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class VPCendpointAttributes {
	String vpcEndpoint_rname;
	String vpcEndpoint_Servicename;
	String vpcEndpoint_VpcID;
	String vpcEndpoint_DependsOn;
	String vpcEndpoint_Connection;
	String vpcEndpoint_policy;
	String vpcEndpoint_RouteTableID;
	//vpcendpoint-vpc
	String vpcEndpoint_vpc_rname;
	String vpcEndpoint_vpc_cidrblock;


	public String getVpcendpoint_rname() {
		return vpcEndpoint_rname;
	}
	public void setVpcendpoint_rname(String vpcEndpoint_rname) {
		this.vpcEndpoint_rname= vpcEndpoint_rname;
	}
	
	public String getVpcendpoint_ServiceName() {
		return vpcEndpoint_Servicename;
	}
	public void setVpcendpoint_ServiceName(String vpcEndpoint_Servicename) {
		this.vpcEndpoint_Servicename = vpcEndpoint_Servicename;
	}

	public String getvpcEndpoint_VpcID() {
		return vpcEndpoint_VpcID;
	}
	public void setvpcEndpoint_VpcID(String vpcEndpoint_VpcID) {
		this.vpcEndpoint_VpcID = vpcEndpoint_VpcID;
	}

	public String getvpcEndpoint_DependsOn() {
		return vpcEndpoint_DependsOn;
	}
	public void setvpcEndpoint_DependsOn(String vpcEndpoint_DependsOn) {
		this.vpcEndpoint_DependsOn = vpcEndpoint_DependsOn;
	}


	public String getvpcEndpoint_Connection() {
		return vpcEndpoint_Connection;
	}
	public void setvpcEndpoint_Connection(String vpcEndpoint_Connection) {
		this.vpcEndpoint_Connection = vpcEndpoint_Connection;
	}

	public String getvpcEndpoint_policy() {
		return vpcEndpoint_policy;
	}
	public void setvpcEndpoint_policy(String vpcEndpoint_policy) {
		this.vpcEndpoint_policy = vpcEndpoint_policy;
	}
	public String getvpcEndpoint_RouteTableID() {
		return vpcEndpoint_RouteTableID;
	}
	public void setvpcEndpoint_RouteTableID(String vpcEndpoint_RouteTableID) {
		this.vpcEndpoint_RouteTableID = vpcEndpoint_RouteTableID;
	}
	
	public String getvpcEndpoint_vpc_rname() {
		return vpcEndpoint_vpc_rname;
	}
	public void setvpcEndpoint_vpc_rname(String vpcEndpoint_vpc_rname) {
		this.vpcEndpoint_vpc_rname = vpcEndpoint_vpc_rname;
	}

	public String getvpcEndpoint_vpc_cidrblock() {
		return vpcEndpoint_vpc_cidrblock;
	}
	public void setvpcEndpoint_vpc_cidrblock(String vpcEndpoint_vpc_cidrblock) {
		this.vpcEndpoint_vpc_cidrblock = vpcEndpoint_vpc_cidrblock;
	}

	private static Properties properties;
	private static VPCendpointAttributes VPCendpointAttributes = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String VPCENDPOINT_RNAME = "vpcEndpoint_rname";
	private static final String VPCENDPOINT_SERVICE = "vpcEndpoint_Servicename";
	private static final String VPCENDPOINT_VPCID = "vpcEndpoint_VpcID";
	private static final String VPCENDPOINT_DEPENDSON = "vpcEndpoint_DependsOn";
	private static final String VPCENDPOINT_CONNECTION = "vpcEndpoint_Connection";
	private static final String VPCENDPOINT_POLICY = "vpcEndpoint_policy";
	private static final String VPCENDPOINT_RTID = "vpcEndpoint_RouteTableID";
	//vpcendpoint-vpc
	private static final String VPCENDPOINT_VPC_RNAME = "vpcEndpoint_vpc_rname";
	private static final String VPCENDPOINT_VPC_CIDRBLOCK = "vpcEndpoint_vpc_cidrblock";


	public static VPCendpointAttributes getVPCendpointAttributesFromProperties(){

		VPCendpointAttributes.getReadPropertiesFile();
		String vpcEndpoint_rname = properties.getProperty(VPCENDPOINT_RNAME);
		String vpcEndpoint_Servicename = properties.getProperty(VPCENDPOINT_SERVICE);
		String vpcEndpoint_VpcID = properties.getProperty(VPCENDPOINT_VPCID);
		String vpcEndpoint_DependsOn = properties.getProperty(VPCENDPOINT_DEPENDSON);
		String vpcEndpoint_Connection = properties.getProperty(VPCENDPOINT_CONNECTION);
		String vpcEndpoint_policy = properties.getProperty(VPCENDPOINT_POLICY);
		String vpcEndpoint_RouteTableIDn = properties.getProperty(VPCENDPOINT_RTID);
		//vpcendpoint-vpc
		String vpcEndpoint_vpc_rname = properties.getProperty(VPCENDPOINT_VPC_RNAME);
		String vpcEndpoint_vpc_cidrblock = properties.getProperty(VPCENDPOINT_VPC_CIDRBLOCK);
		VPCendpointAttributes = new VPCendpointAttributes();
		VPCendpointAttributes.setVpcendpoint_rname(vpcEndpoint_rname);
		VPCendpointAttributes.setVpcendpoint_ServiceName(vpcEndpoint_Servicename);
		VPCendpointAttributes.setvpcEndpoint_VpcID(vpcEndpoint_VpcID);
		VPCendpointAttributes.setvpcEndpoint_DependsOn(vpcEndpoint_DependsOn);
		VPCendpointAttributes.setvpcEndpoint_Connection(vpcEndpoint_Connection);
		VPCendpointAttributes.setvpcEndpoint_policy(vpcEndpoint_policy);
		VPCendpointAttributes.setvpcEndpoint_RouteTableID(vpcEndpoint_RouteTableIDn);
		//vpcendpoint-vpc
		VPCendpointAttributes.setvpcEndpoint_vpc_rname(vpcEndpoint_vpc_rname);
		VPCendpointAttributes.setvpcEndpoint_vpc_cidrblock(vpcEndpoint_vpc_cidrblock);
		return VPCendpointAttributes;


	}

	public static void getReadPropertiesFile() {
		if(VPCendpointAttributes == null || VPCendpointAttributes ==null){
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



