package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class RouteTableAttributes {
	
	//Routetable -vpc
	String routetable_vpc_resourceName;
	String routetable_vpc_cidr;
	//RouteTable-IGW
	String routetable_igw_resourceName;
	String routetable_igw_vpcid;
	//routetable resource
	String routetable_Rname;
	String routetable_vpcID;
	String routetable_dependsOn;
	String routetable_connection;
	String routetable_propagating_vgws;
	String routetable_route;
	
	//Routetable -vpc
	public String getRoutetable_vpc_resourceName() {
		return routetable_vpc_resourceName;
	}
	public void setRoutetable_vpc_resourceName(String routetable_vpc_resourceName) {
		this.routetable_vpc_resourceName = routetable_vpc_resourceName;
	}
		
	public String getRoutetable_vpc_cidr() {
		return routetable_vpc_cidr;
	}
	public void setRoutetable_vpc_cidr(String routetable_vpc_cidr) {
		this.routetable_vpc_cidr = routetable_vpc_cidr;
	}
	//RouteTable-IGW
	public String getRoutetable_igw_resourceName() {
		return routetable_igw_resourceName;
	}
	public void setRoutetable_igw_resourceName(String routetable_igw_resourceName) {
		this.routetable_igw_resourceName = routetable_igw_resourceName;
	}
	
	public String getRoutetable_igw_vpcid() {
		return routetable_igw_vpcid;
	}
	public void setRoutetable_igw_vpcid(String routetable_igw_vpcid) {
		this.routetable_igw_vpcid = routetable_igw_vpcid;
	}
	//routetable
	
	public String getRoutetable_Rname() {
		return routetable_Rname;
	}
	public void setRoutetable_Rname(String routetable_Rname) {
		this.routetable_Rname = routetable_Rname;
	}
	
	public String getRoutetable_vpcID() {
		return routetable_vpcID;
	}
	public void setRoutetable_vpcID(String routetable_vpcID) {
		this.routetable_vpcID = routetable_vpcID;
	}
	
	public String getRoutetable_dependsOn() {
		return routetable_dependsOn;
	}
	public void setRoutetable_dependsOn(String routetable_dependsOn) {
		this.routetable_dependsOn = routetable_dependsOn;
		
	}
	
	public String getRoutetable_connection() {
		return routetable_connection;
	}
	public void setRoutetable_connection(String routetable_connection) {
		this.routetable_connection = routetable_connection;
	}
	
	public String getRoutetable_propagating_vgws() {
		return routetable_propagating_vgws;
	}
	public void setRoutetable_propagating_vgws(String routetable_propagating_vgws) {
		this.routetable_propagating_vgws = routetable_propagating_vgws;
	}
	
	public String getRoutetable_route() {
		return routetable_route;
	}
	public void setRoutetable_route(String routetable_route) {
		this.routetable_route = routetable_route;
		
	}
	
	private static Properties properties;
	private static RouteTableAttributes RouteTableAttributes = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	//RouteTable-IGW
	private static final String ROUTETABLE_IGW_RESOURCENAME="routetable_igw_resourceName";
	private static final String ROUTETABLE_IGW_VPCID="routetable_igw_vpcid";
	//Routetable -vpc
	private static final String ROUTETABLE_VPC_RESOURCENAME="routetable_vpc_resourceName";
	private static final String ROUTETABLE_VPC_CIDR="routetable_vpc_cidr";
	//routetable resource
	private static final String ROUTETABLE_RNAME="routetable_Rname";
	private static final String ROUTETABLE_VPCID="routetable_vpcID";
	private static final String ROUTETABLE_DEPENDSON="routetable_dependsOn";
	private static final String ROUTETABLE_CONNECTION="routetable_connection";
	private static final String ROUTETABLE_PROPAGATING_VGWS="routetable_propagating_vgws";
	private static final String ROUTETABLE_ROUTE="routetable_route";
	
	
	
	
	public static RouteTableAttributes getRouteTableAttributesFromProperties(){
		
		RouteTableAttributes.getReadPropertiesFile();
		//Routetable -vpc
		String routetable_vpc_resourceName= properties.getProperty(ROUTETABLE_VPC_RESOURCENAME);
		String routetable_vpc_cidr=properties.getProperty(ROUTETABLE_VPC_CIDR);
		//RouteTable-IGW
		String routetable_igw_resourceName= properties.getProperty(ROUTETABLE_IGW_RESOURCENAME);
		String routetable_igw_vpcid= properties.getProperty(ROUTETABLE_IGW_VPCID);
		//routetable resource
		String routetable_Rname = properties.getProperty(ROUTETABLE_RNAME);
		String routetable_vpcID = properties.getProperty(ROUTETABLE_VPCID);
		String routetable_dependsOn = properties.getProperty(ROUTETABLE_DEPENDSON);
		String routetable_connection = properties.getProperty(ROUTETABLE_CONNECTION);
		String routetable_propagating_vgws = properties.getProperty(ROUTETABLE_PROPAGATING_VGWS);
		String routetable_route = properties.getProperty(ROUTETABLE_ROUTE);
		
		
		//Routetable -vpc
		RouteTableAttributes = new RouteTableAttributes();
		RouteTableAttributes.setRoutetable_vpc_resourceName(routetable_vpc_resourceName);
		RouteTableAttributes.setRoutetable_vpc_cidr(routetable_vpc_cidr);
		//RouteTable-IGW
		RouteTableAttributes.setRoutetable_igw_resourceName(routetable_igw_resourceName);
		RouteTableAttributes.setRoutetable_igw_vpcid(routetable_igw_vpcid);
		//routetable
		RouteTableAttributes.setRoutetable_Rname(routetable_Rname);
		RouteTableAttributes.setRoutetable_vpcID(routetable_vpcID);
		RouteTableAttributes.setRoutetable_dependsOn(routetable_dependsOn);
		RouteTableAttributes.setRoutetable_connection(routetable_connection);
		RouteTableAttributes.setRoutetable_propagating_vgws(routetable_propagating_vgws);
		RouteTableAttributes.setRoutetable_route(routetable_route);
		
		return RouteTableAttributes;
		
		
	}
	
	public static void getReadPropertiesFile() {
		if(RouteTableAttributes == null){
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

	
