package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class RouteTableAssociationAttribute {
	String RTA_rname;
	String RTA_route_table_id;
	String RTA_subnet_id;
	String RTA_depends_on;
	String RTA_connection;
	String RTA_routetable_rname;
	String RTA_routetable_vpcid;
	String RTA_routetable_route;
	String RTA_vpc_rname;
	String RTA_vpc_cidrblock;
	String RTA_subnet_rname;
	String RTA_subnet_cidr_block;
	String RTA_subnet_vpc_id;
	String RTA_igw_rname;
	String RTA_igw_vpc_id;
	
		public String getRTA_rname() {
			return RTA_rname;
		}
		public void setRTA_rname(String RTA_rname) {
			this.RTA_rname = RTA_rname;
		}
		public String getRTA_routetable_rname() {
			return RTA_routetable_rname;
		}
		public void setRTA_routetable_rname(String RTA_routetable_rname) {
			this.RTA_routetable_rname = RTA_routetable_rname;
		}
		public String getRTA_routetable_route() {
			return RTA_routetable_route;
		}
		public void setRTA_routetable_route(String RTA_routetable_route) {
			this.RTA_routetable_route = RTA_routetable_route;
		}
		public String getRTA_vpc_rname() {
			return RTA_vpc_rname;
		}
		public void setRTA_vpc_rname(String RTA_vpc_rname) {
			this.RTA_vpc_rname = RTA_vpc_rname;
		}
		public String getRTA_subnet_rname() {
			return RTA_subnet_rname;
		}
		public void setRTA_subnet_rname(String RTA_subnet_rname) {
			this.RTA_subnet_rname = RTA_subnet_rname;
		}
		public String getRTA_igw_rname() {
			return RTA_igw_rname;
		}
		public void setRTA_igw_rname(String RTA_igw_rname) {
			this.RTA_igw_rname = RTA_igw_rname;
		}
		public String getRTA_route_table_id() {
			return RTA_route_table_id;
		}
		public void setRTA_route_table_id(String RTA_route_table_id) {
			this.RTA_route_table_id = RTA_route_table_id;
		}
		
		public String getRTA_subnet_id() {
			return RTA_subnet_id;
		}
		public void setRTA_subnet_id(String RTA_subnet_id) {
			this.RTA_subnet_id = RTA_subnet_id;
		}
		
		public String getRTA_depends_on() {
			return RTA_depends_on;
		}
		public void setRTA_depends_on(String RTA_depends_on) {
			this.RTA_depends_on = RTA_depends_on;
		}
				
		public String getRTA_connection() {
			return RTA_connection;
		}
		public void setRTA_connection(String RTA_connection) {
			this.RTA_connection = RTA_connection;
		}
		
		public String getRTA_routetable_vpcid() {
			return RTA_routetable_vpcid;
		}
		public void setRTA_routetable_vpcid(String RTA_routetable_vpcid) {
			this.RTA_routetable_vpcid = RTA_routetable_vpcid;
		}

		public String getRTA_vpc_cidrblock() {
			return RTA_vpc_cidrblock;
		}
		public void setRTA_vpc_cidrblock(String RTA_vpc_cidrblock) {
			this.RTA_vpc_cidrblock = RTA_vpc_cidrblock;
		}
		public String getRTA_subnet_cidr_block() {
			return RTA_subnet_cidr_block;
		}
		public void setRTA_subnet_cidr_block(String RTA_subnet_cidr_block) {
			this.RTA_subnet_cidr_block = RTA_subnet_cidr_block;
		}
		
		public String getRTA_subnet_vpc_id() {
			return RTA_subnet_vpc_id;
		}
		public void setRTA_subnet_vpc_id(String RTA_subnet_vpc_id) {
			this.RTA_subnet_vpc_id = RTA_subnet_vpc_id;
		}
		public String getRTA_igw_vpc_id() {
			return RTA_igw_vpc_id;
		}
		public void setRTA_igw_vpc_id(String RTA_igw_vpc_id) {
			this.RTA_igw_vpc_id = RTA_igw_vpc_id;
		}
			
		private static Properties properties;
		private static RouteTableAssociationAttribute RTAAttribute = null;
		private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
		private static final String RTA_RNAME ="RTA_rname";
		private static final String RTA_ROUTETABLE_RNAME ="RTA_routetable_rname";
		private static final String RTA_VPC_RNAME ="RTA_vpc_rname";
		private static final String RTA_ROUTETABLE_ROUTE="RTA_routetable_route";
		private static final String RTA_SUBNET_RNAME ="RTA_subnet_rname";
		private static final String RTA_IGW_RNAME ="RTA_igw_rname";
		private static final String RTA_ROUTE_TABLE_ID ="RTA_route_table_id";
		private static final String RTA_SUBNET_ID ="RTA_subnet_id" ;
		private static final String RTA_DEPENDSON="RTA_depends_on";
		private static final String RTA_CONNECTION="RTA_connection"; 
		private static final String RTA_ROUTE_TABLE_VPCID="RTA_routetable_vpcid";
		private static final String RTA_VPC_CIDRBLOCK="RTA_vpc_cidrblock"; 
		private static final String RTA_SUBNET_CIDR_BLOCK ="RTA_subnet_cidr_block";
		private static final String RTA_SUBNET_VPC_ID ="RTA_subnet_vpc_id" ;
		private static final String RTA_IGW_VPC_ID="RTA_igw_vpc_id";
			

		public static RouteTableAssociationAttribute getRTAAttributeFromProperties(){
			
			RTAAttribute.getReadPropertiesFile();
			
			String RTA_rname = properties.getProperty(RTA_RNAME);
			String RTA_routetable_rname = properties.getProperty(RTA_ROUTETABLE_RNAME);
			String RTA_vpc_rname = properties.getProperty(RTA_VPC_RNAME);
			String RTA_routetable_route=properties.getProperty(RTA_ROUTETABLE_ROUTE);
			String RTA_igw_rname = properties.getProperty(RTA_IGW_RNAME);
			String RTA_subnet_rname = properties.getProperty(RTA_SUBNET_RNAME);
			String RTA_route_table_id = properties.getProperty(RTA_ROUTE_TABLE_ID);
			String RTA_subnet_id = properties.getProperty(RTA_SUBNET_ID);
			String RTA_depends_on = properties.getProperty(RTA_DEPENDSON);
			String RTA_connection = properties.getProperty(RTA_CONNECTION);
			String RTA_routetable_vpcid= properties.getProperty(RTA_ROUTE_TABLE_VPCID);
			String RTA_vpc_cidrblock = properties.getProperty(RTA_VPC_CIDRBLOCK);
			String RTA_subnet_cidr_block = properties.getProperty(RTA_SUBNET_CIDR_BLOCK);
			String RTA_subnet_vpc_id = properties.getProperty(RTA_SUBNET_VPC_ID);
			String RTA_igw_vpc_id = properties.getProperty(RTA_IGW_VPC_ID);
			RTAAttribute =new RouteTableAssociationAttribute();
			RTAAttribute.setRTA_rname(RTA_rname);
			RTAAttribute.setRTA_routetable_rname(RTA_routetable_rname);
			RTAAttribute.setRTA_routetable_route(RTA_routetable_route);
			RTAAttribute.setRTA_igw_rname(RTA_igw_rname);
			RTAAttribute.setRTA_subnet_rname(RTA_subnet_rname);
			RTAAttribute.setRTA_vpc_rname(RTA_vpc_rname);
			RTAAttribute.setRTA_route_table_id(RTA_route_table_id);
			RTAAttribute.setRTA_subnet_id(RTA_subnet_id);
			RTAAttribute.setRTA_depends_on(RTA_depends_on);
			RTAAttribute.setRTA_connection(RTA_connection);
			RTAAttribute.setRTA_routetable_vpcid(RTA_routetable_vpcid);
			RTAAttribute.setRTA_subnet_cidr_block(RTA_subnet_cidr_block);
			RTAAttribute.setRTA_subnet_vpc_id(RTA_subnet_vpc_id);
			RTAAttribute.setRTA_igw_vpc_id(RTA_igw_vpc_id);
			RTAAttribute.setRTA_vpc_cidrblock(RTA_vpc_cidrblock);
	
			return RTAAttribute;
			
			
				
			
		}
		
		public static void getReadPropertiesFile() {
			if(RTAAttribute == null){
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
