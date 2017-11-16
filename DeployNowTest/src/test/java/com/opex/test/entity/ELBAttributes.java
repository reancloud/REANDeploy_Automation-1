package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class ELBAttributes {
	
	//ELB-VPC
	String elb_vpc_Rname;
	String elb_vpc_cidrblock;
	//ELB-IGW
	String elb_igw_Rname;
	String elb_igw_vpcId;
	//ELB-Routetable
	String elb_routetable_Rname;
	String elb_routetable_vpcId;
	String elb_routetable_route;
	//ELB-Subnet
	String elb_subnet_Rname;
	String elb_subnet_cidrblock;
	String elb_subnet_vpcId;
	 //ELB-Routetable Association
	String elb_rta_Rname;
	String elb_rta_routetable_id;
	String elb_rta_subnet_id;
	//Elb
	String elb_Rname;
	String elb_listener;
	String elb_name;
	String elb_subnets;
	String elb_dependson;
	String elb_connection;
	String elb_access_logs;
	String elb_cross_zone_load_balancing;
	String elb_health_check;
	String elb_idle_timeout;
	String elb_instances;
	String elb_internal;
	String elb_security_groups;
	String elb_tags;
	
	//Elb-vpc
		
		public String getElb_vpc_Rname() {
			return elb_vpc_Rname;
		}
		public void setElb_vpc_Rname(String elb_vpc_Rname) {
			this.elb_vpc_Rname = elb_vpc_Rname;
		}
		
		public String getElb_vpc_cidrblock() {
			return elb_vpc_cidrblock;
		}
		public void setElb_vpc_cidrblock(String elb_vpc_cidrblock) {
			this.elb_vpc_cidrblock= elb_vpc_cidrblock;
		}
		
	//ELB-IGW
		
		public String getElb_igw_Rname() {
			return elb_igw_Rname;
		}
		public void setElb_igw_Rname(String elb_igw_Rname) {
			this.elb_igw_Rname = elb_igw_Rname;
		}
		public String getElb_igw_vpcId() {
			return elb_igw_vpcId;
		}
		public void setElb_igw_vpcId(String elb_igw_vpcId) {
			this.elb_igw_vpcId = elb_igw_vpcId;
		}
	//ELB-Routetable
		
		public String getElb_routetable_Rname() {
			return elb_routetable_Rname;
		}
		public void setElb_routetable_Rname(String elb_routetable_Rname) {
			this.elb_routetable_Rname=elb_routetable_Rname;
		}
		public String getElb_routetable_vpcId() {
			return elb_routetable_vpcId;
		}
		public void setElb_routetable_vpcId(String elb_routetable_vpcId) {
			this.elb_routetable_vpcId=elb_routetable_vpcId;
		}
		public String getElb_routetable_route() {
			return elb_routetable_route;
		}
		public void setElb_routetable_route(String elb_routetable_route) {
			this.elb_routetable_route=elb_routetable_route;
		}
		//ELB-Subnet
		public String getElb_subnet_Rname() {
			return elb_subnet_Rname;
		}
		public void setElb_subnet_Rname(String elb_subnet_Rname) {
			this.elb_subnet_Rname=elb_subnet_Rname;
		}
		
		public String getElb_subnet_cidrblock() {
			return elb_subnet_cidrblock;
		}
		public void setElb_subnet_cidrblock(String elb_subnet_cidrblock) {
			this.elb_subnet_cidrblock=elb_subnet_cidrblock;
		}
		public String getElb_subnet_vpcId() {
			return elb_subnet_vpcId;
		}
		public void setElb_subnet_vpcId(String elb_subnet_vpcId) {
			this.elb_subnet_vpcId=elb_subnet_vpcId;
		}
		//ELB-Routetable Association
		public String getElb_rta_Rname() {
			return elb_rta_Rname;
		}
		public void setElb_rta_Rname(String elb_rta_Rname) {
			this.elb_rta_Rname=elb_rta_Rname;
		}
		
		public String getElb_rta_routetable_id() {
			return elb_rta_routetable_id;
		}
		public void setElb_rta_routetable_id(String elb_rta_routetable_id) {
			this.elb_rta_routetable_id=elb_rta_routetable_id;
		}
		
		public String getElb_rta_subnet_id() {
			return elb_rta_subnet_id;
		}
		public void setElb_rta_subnet_id(String elb_rta_subnet_id) {
			this.elb_rta_subnet_id=elb_rta_subnet_id;
		}
		//Elb
		public String getElb_Rname() {
			return elb_Rname;
		}
		public void setElb_Rname(String elb_Rname) {
			this.elb_Rname=elb_Rname;
		}
		public String getElb_listener() {
			return elb_listener;
		}
		public void setElb_listener(String elb_listener) {
			this.elb_listener=elb_listener;
		}
		public String getElb_name() {
			return elb_name;
		}
		public void setElb_name(String elb_name) {
			this.elb_name=elb_name;
		}
		public String getElb_subnets() {
			return elb_subnets;
		}
		public void setElb_subnets(String elb_subnets) {
			this.elb_subnets=elb_subnets;
		}
		
		public String getElb_dependson() {
			return elb_dependson;
		}
		public void setElb_dependson(String elb_dependson) {
			this.elb_dependson=elb_dependson;
		}
		
		public String getElb_connection() {
			return elb_connection;
		}
		public void setElb_connection(String elb_connection) {
			this.elb_connection=elb_connection;
		}
		public String getElb_access_logs() {
			return elb_access_logs;
		}
		public void setElb_access_logs(String elb_access_logs) {
			this.elb_access_logs=elb_access_logs;
		}
		public String getElb_cross_zone_load_balancing() {
			return elb_cross_zone_load_balancing;
		}
		public void setElb_cross_zone_load_balancing(String elb_cross_zone_load_balancing) {
			this.elb_cross_zone_load_balancing=elb_cross_zone_load_balancing;
		}
		public String getElb_health_check() {
			return elb_health_check;
		}
		public void setElb_health_check(String elb_health_check) {
			this.elb_health_check=elb_health_check;
		}
		public String getElb_idle_timeout() {
			return elb_idle_timeout;
		}
		public void setElb_idle_timeout(String elb_idle_timeout) {
			this.elb_idle_timeout=elb_idle_timeout;
		}
		public String getElb_instances() {
			return elb_instances;
		}
		public void setElb_instances(String elb_instances) {
			this.elb_instances=elb_instances;
		}
		public String getElb_internal() {
			return elb_internal;
		}
		public void setElb_internal(String elb_internal) {
			this.elb_internal=elb_internal;
		}
		public String getElb_security_groups() {
			return elb_security_groups;
		}
		public void setElb_security_groups(String elb_security_groups) {
			this.elb_security_groups=elb_security_groups;
		}
		public String getElb_tags() {
			return elb_tags;
		}
		public void setElb_tags(String elb_tags) {
			this.elb_tags=elb_tags;
		}
		
		private static Properties properties;
		private static ELBAttributes ELBAttributes = null;
		private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
		
		//ELB-VPC
		private static final String ELB_VPC_RNAME="elb_vpc_Rname";
		private static final String ELB_VPC_CIDRBLOCK="elb_vpc_cidrblock";
		//ELB-IGW
		private static final String ELB_IGW_RNAME="elb_igw_Rname";
		private static final String ELB_IGW_VPCID="elb_igw_vpcId";
		//ELB-Routetable
		private static final String ELB_ROUTETABLE_RNAME="elb_routetable_Rname";
		private static final String ELB_ROUTETABLE_VPCID="elb_routetable_vpcId";
		private static final String ELB_ROUTETABLE_ROUTE="elb_routetable_route";
		//ELB-Subnet
		private static final String ELB_SUBNET_RNAME="elb_subnet_Rname";
		private static final String ELB_SUBNET_CIDRBLOCK="elb_subnet_cidrblock";
		private static final String ELB_SUBNET_VPCID="elb_subnet_vpcId";
		 //ELB-Routetable Association
		private static final String ELB_RTA_RNAME="elb_rta_Rname";
		private static final String ELB_RTA_ROUTETABLE_ID="elb_rta_routetable_id";
		private static final String ELB_RTA_SUBNET_ID="elb_rta_subnet_id";
		//Elb
		private static final String ELB_RNAME="elb_Rname";
		private static final String ELB_LISTENER="elb_listener";
		private static final String ELB_NAME="elb_name";
		private static final String ELB_SUBNETS="elb_subnets";
		private static final String ELB_DEPENDSON="elb_dependson";
		private static final String ELB_CONNECTION="elb_connection";
		private static final String ELB_ACCESS_LOGS="elb_access_logs";
		private static final String ELB_CROSS_ZONE_LOAD_BALANCING="elb_cross_zone_load_balancing";
		private static final String ELB_HEALTH_CHECKUP="elb_health_check";
		private static final String ELB_IDLE_TIMEOUT="elb_idle_timeout";
		private static final String ELB_INSTANCES="elb_instances";
		private static final String ELB_Internal="elb_internal";
		private static final String ELB_SECURITY_GROUPS="elb_security_groups";
		private static final String ELB_TAGS="elb_tags";
		
		public static ELBAttributes getELBAttributesFromProperties(){
			
			ELBAttributes.getReadPropertiesFile();
			
			//ELB-VPC
			String elb_vpc_Rname= properties.getProperty(ELB_VPC_RNAME);
			String elb_vpc_cidrblock= properties.getProperty(ELB_VPC_CIDRBLOCK);
			//ELB-IGW
			String elb_igw_Rname= properties.getProperty(ELB_IGW_RNAME);
			String elb_igw_vpcId= properties.getProperty(ELB_IGW_VPCID);
			//ELB-Routetable
			String elb_routetable_Rname= properties.getProperty(ELB_ROUTETABLE_RNAME);
			String elb_routetable_vpcId= properties.getProperty(ELB_ROUTETABLE_VPCID);
			String elb_routetable_route= properties.getProperty(ELB_ROUTETABLE_ROUTE);
			//ELB-Subnet
			String elb_subnet_Rname= properties.getProperty(ELB_SUBNET_RNAME);
			String elb_subnet_cidrblock= properties.getProperty(ELB_SUBNET_CIDRBLOCK);
			String elb_subnet_vpcId= properties.getProperty(ELB_SUBNET_VPCID);
			 //ELB-Routetable Association
			String elb_rta_Rname= properties.getProperty(ELB_RTA_RNAME);
			String elb_rta_routetable_id= properties.getProperty(ELB_RTA_ROUTETABLE_ID);
			String elb_rta_subnet_id= properties.getProperty(ELB_RTA_SUBNET_ID);
			//Elb
			String elb_Rname= properties.getProperty(ELB_RNAME);
			String elb_listener= properties.getProperty(ELB_LISTENER);
			String elb_name= properties.getProperty(ELB_NAME);
			String elb_subnets= properties.getProperty(ELB_SUBNETS);
			String elb_dependson=properties.getProperty(ELB_DEPENDSON);
			String elb_connection=properties.getProperty(ELB_CONNECTION);
			String elb_access_logs=properties.getProperty(ELB_ACCESS_LOGS);
			String elb_cross_zone_load_balancing=properties.getProperty(ELB_CROSS_ZONE_LOAD_BALANCING);
			String elb_health_check=properties.getProperty(ELB_HEALTH_CHECKUP);
			String elb_idle_timeout=properties.getProperty(ELB_IDLE_TIMEOUT);
			String elb_instances=properties.getProperty(ELB_INSTANCES);
			String elb_internal=properties.getProperty(ELB_Internal);
			String elb_security_groups=properties.getProperty(ELB_SECURITY_GROUPS);
			String elb_tags=properties.getProperty(ELB_TAGS);
			
			ELBAttributes = new ELBAttributes();
			//ELB-VPC
			ELBAttributes.setElb_vpc_Rname(elb_vpc_Rname);
			ELBAttributes.setElb_vpc_cidrblock(elb_vpc_cidrblock);
			//ELB-IGW
			ELBAttributes.setElb_igw_Rname(elb_igw_Rname);
			ELBAttributes.setElb_igw_vpcId(elb_igw_vpcId);
			//ELB-Routetable
			ELBAttributes.setElb_routetable_Rname(elb_routetable_Rname);
			ELBAttributes.setElb_routetable_vpcId(elb_routetable_vpcId);
			ELBAttributes.setElb_routetable_route(elb_routetable_route);
			//ELB-Subnet
			ELBAttributes.setElb_subnet_Rname(elb_subnet_Rname);
			ELBAttributes.setElb_subnet_cidrblock(elb_subnet_cidrblock);
			ELBAttributes.setElb_subnet_vpcId(elb_subnet_vpcId);
			 //ELB-Routetable Association
			ELBAttributes.setElb_rta_Rname(elb_rta_Rname);
			ELBAttributes.setElb_rta_routetable_id(elb_rta_routetable_id);
			ELBAttributes.setElb_rta_subnet_id(elb_rta_subnet_id);
			//Elb
			ELBAttributes.setElb_Rname(elb_Rname);
			ELBAttributes.setElb_listener(elb_listener);
			ELBAttributes.setElb_name(elb_name);
			ELBAttributes.setElb_subnets(elb_subnets);
			ELBAttributes.setElb_dependson(elb_dependson);
			ELBAttributes.setElb_connection(elb_connection);
			ELBAttributes.setElb_access_logs(elb_access_logs);
			ELBAttributes.setElb_cross_zone_load_balancing(elb_cross_zone_load_balancing);
			ELBAttributes.setElb_health_check(elb_health_check);
			ELBAttributes.setElb_idle_timeout(elb_idle_timeout);
			ELBAttributes.setElb_instances(elb_instances);
			ELBAttributes.setElb_internal(elb_internal);
			ELBAttributes.setElb_security_groups(elb_security_groups);
			ELBAttributes.setElb_tags(elb_tags);
			return ELBAttributes;
			
			
		}
		public static void getReadPropertiesFile() {
			if(ELBAttributes == null || ELBAttributes ==null){
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

