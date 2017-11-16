package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class RDSAttribute {
	
	String rds_rname;
	String rds_allocated_storage;
	String rds_engine;
	String rds_instance_class;
	String rds_name;
	String rds_password;
	String rds_username;
	String rds_depends_on;
	String rds_connection;
	String rds_availibilty_zone;
	String rds_backup_window;
	String rds_copy_tags_to_snapshots;
	String rds_db_subnetgroup_name;
	String rds_engine_version;
	String rds_final_snapshot_identifier;
	String rds_identifier;
	String rds_iops;
	String rds_license_model;
	String rds_multi_az;
	String rds_parameter_group_name;
	String rds_port;
	String rds_publicly_accessible;
	String rds_security_group_name;
	String rds_skip_final_snapshots;
	String rds_storage_type;
	String rds_vpc_security_group_ids;
	
	//Subnetgroup
	String rds_subnetgroup_rname;
	String rds_subnetgroup_description;
	String rds_subnetgroup_name;
	String rds_subnetgroup_ids;
	//VPC
	String rds_vpc_rname;
	String rds_vpc_cidrblock;
	String rds_vpc_enable_dns_hostnames;
	String rds_vpc_enable_dns_support;
	//Subnet1
	String rds_subnet1_rname;
	String rds_subnet1_cidr_block;
	String rds_subnet1_vpc_id;
	String rds_subnet1_availibility_zone;
	//Subnet2
	String rds_subnet2_rname;
	String rds_subnet2_cidr_block;
	String rds_subnet2_vpc_id;
	String rds_subnet2_availibility_zone;
	//IGW
	String rds_igw_rname;
	String rds_igw_vpc_id;
	
	
		public String getrds_rname() {
			return rds_rname;
		}
		public void setrds_rname(String rds_rname) {
			this.rds_rname = rds_rname;
		}
		public String getrds_allocated_storage() {
			return rds_allocated_storage;
		}
		public void setrds_allocated_storage(String rds_allocated_storage) {
			this.rds_allocated_storage = rds_allocated_storage;
		}
		public String getrds_engine() {
			return rds_engine;
		}
		public void setrds_engine(String rds_engine) {
			this.rds_engine = rds_engine;
		}
		public String getrds_instance_class() {
			return rds_instance_class;
		}
		public void setrds_instance_class(String rds_instance_class) {
			this.rds_instance_class = rds_instance_class;
		}
		public String getrds_name() {
			return rds_name;
		}
		public void setrds_name(String rds_name) {
			this.rds_name = rds_name;
		}
		public String getrds_password() {
			return rds_password;
		}
		public void setrds_password(String rds_password) {
			this.rds_password = rds_password;
		}
		public String getrds_username() {
			return rds_username;
		}
		public void setrds_username(String rds_username) {
			this.rds_username = rds_username;
		}
		
		public String getrds_depends_on() {
			return rds_depends_on;
		}
		public void setrds_depends_on(String rds_depends_on) {
			this.rds_depends_on = rds_depends_on;
		}
		
		public String getrds_connection() {
			return rds_connection;
		}
		public void setrds_connection(String rds_connection) {
			this.rds_connection = rds_connection;
		}
				
		public String getrds_availibilty_zone() {
			return rds_availibilty_zone;
		}
		public void setrds_availibilty_zone(String rds_availibilty_zone) {
			this.rds_availibilty_zone = rds_availibilty_zone;
		}
		
		public String getrds_vpc_security_group_ids() {
			return rds_vpc_security_group_ids;
		}
		public void setrds_vpc_security_group_ids(String rds_vpc_security_group_ids) {
			this.rds_vpc_security_group_ids = rds_vpc_security_group_ids;
		}
		public String getrds_identifier() {
			return rds_identifier;
		}
		public void setrds_identifier(String rds_identifier) {
			this.rds_identifier = rds_identifier;
		}
		public String getrds_iops() {
			return rds_iops;
		}
		public void setrds_iops(String rds_iops) {
			this.rds_iops = rds_iops;
		}
		public String getrds_license_model() {
			return rds_license_model;
		}
		public void setrds_license_model(String rds_license_model) {
			this.rds_license_model = rds_license_model;
		}
		public String getrds_multi_az() {
			return rds_multi_az;
		}
		public void setrds_multi_az(String rds_multi_az) {
			this.rds_multi_az = rds_multi_az;
		}
		public String getrds_parameter_group_name() {
			return rds_parameter_group_name;
		}
		public void setrds_parameter_group_name(String rds_parameter_group_name) {
			this.rds_parameter_group_name = rds_parameter_group_name;
		}
		public String getrds_port() {
			return rds_port;
		}
		public void setrds_port(String rds_port) {
			this.rds_port = rds_port;
		}
		public String getrds_publicly_accessible() {
			return rds_publicly_accessible;
		}
		public void setrds_publicly_accessible(String rds_publicly_accessible) {
			this.rds_publicly_accessible = rds_publicly_accessible;
		}
		
		public String getrds_security_group_name() {
			return rds_security_group_name;
		}
		public void setrds_security_group_name(String rds_security_group_name) {
			this.rds_security_group_name = rds_security_group_name;
		}
		
		public String getrds_skip_final_snapshots() {
			return rds_skip_final_snapshots;
		}
		public void setrds_skip_final_snapshots(String rds_skip_final_snapshots) {
			this.rds_skip_final_snapshots = rds_skip_final_snapshots;
		}
				
		public String getrds_storage_type() {
			return rds_storage_type;
		}
		public void setrds_storage_type(String rds_storage_type) {
			this.rds_storage_type = rds_storage_type;
		}
		
		public String getrds_backup_window() {
			return rds_backup_window;
		}
		public void setrds_backup_window(String rds_backup_window) {
			this.rds_backup_window = rds_backup_window;
		}
		public String getrds_copy_tags_to_snapshots() {
			return rds_copy_tags_to_snapshots;
		}
		public void setrds_copy_tags_to_snapshots(String rds_copy_tags_to_snapshots) {
			this.rds_copy_tags_to_snapshots = rds_copy_tags_to_snapshots;
		}
		public String getrds_db_subnetgroup_name() {
			return rds_db_subnetgroup_name;
		}
		public void setrds_db_subnetgroup_name(String rds_db_subnetgroup_name) {
			this.rds_db_subnetgroup_name = rds_db_subnetgroup_name;
		}
		
		public String getrds_engine_version() {
			return rds_engine_version;
		}
		public void setrds_engine_version(String rds_engine_version) {
			this.rds_engine_version = rds_engine_version;
		}
		public String getrds_final_snapshot_identifier() {
			return rds_final_snapshot_identifier;
		}
		public void setrds_final_snapshot_identifier(String rds_final_snapshot_identifier) {
			this.rds_final_snapshot_identifier = rds_final_snapshot_identifier;
		}
		//Subnetgroup
		public String getrds_subnetgroup_rname() {
			return rds_subnetgroup_rname;
		}
		public void setrds_subnetgroup_rname(String rds_subnetgroup_rname) {
			this.rds_subnetgroup_rname = rds_subnetgroup_rname;
		}
		public String getrds_subnetgroup_name() {
			return rds_subnetgroup_name;
		}
		public void setrds_subnetgroup_name(String rds_subnetgroup_name) {
			this.rds_subnetgroup_name = rds_subnetgroup_name;
		}
		public String getrds_subnetgroup_ids() {
			return rds_subnetgroup_ids;
		}
		public void setrds_subnetgroup_ids(String rds_subnetgroup_ids) {
			this.rds_subnetgroup_ids = rds_subnetgroup_ids;
		}
		
		public String getrds_subnetgroup_description() {
			return rds_subnetgroup_description;
		}
		public void setrds_subnetgroup_description(String rds_subnetgroup_description) {
			this.rds_subnetgroup_description = rds_subnetgroup_description;
		}
		//VPC
		public String getrds_vpc_rname() {
			return rds_vpc_rname;
		}
		public void setrds_vpc_rname(String rds_vpc_rname) {
			this.rds_vpc_rname = rds_vpc_rname;
		}
		public String getrds_vpc_cidrblock() {
			return rds_vpc_cidrblock;
		}
		public void setrds_vpc_cidrblock(String rds_vpc_cidrblock) {
			this.rds_vpc_cidrblock = rds_vpc_cidrblock;
		}
		public String getrds_vpc_enable_dns_hostnames() {
			return rds_vpc_enable_dns_hostnames;
		}
		public void setrds_vpc_enable_dns_hostnames(String rds_vpc_enable_dns_hostnames) {
			this.rds_vpc_enable_dns_hostnames = rds_vpc_enable_dns_hostnames;
		}
		public String getrds_vpc_enable_dns_support() {
			return rds_vpc_enable_dns_support;
		}
		public void setrds_vpc_enable_dns_support(String rds_vpc_enable_dns_support) {
			this.rds_vpc_enable_dns_support = rds_vpc_enable_dns_support;
		}
		//Subnet1
		public String getrds_subnet1_rname() {
			return rds_subnet1_rname;
		}
		public void setrds_subnet1_rname(String rds_subnet1_rname) {
			this.rds_subnet1_rname = rds_subnet1_rname;
		}
		public String getrds_subnet1_cidr_block() {
			return rds_subnet1_cidr_block;
		}
		public void setrds_subnet1_cidr_block(String rds_subnet1_cidr_block) {
			this.rds_subnet1_cidr_block = rds_subnet1_cidr_block;
		}
		public String getrds_subnet1_vpc_id() {
			return rds_subnet1_vpc_id;
		}
		public void setrds_subnet1_vpc_id(String rds_subnet1_vpc_id) {
			this.rds_subnet1_vpc_id = rds_subnet1_vpc_id;
		}
		public String getrds_subnet1_availibility_zone() {
			return rds_subnet1_availibility_zone;
		}
		public void setrds_subnet1_availibility_zone(String rds_subnet1_availibility_zone) {
			this.rds_subnet1_availibility_zone = rds_subnet1_availibility_zone;
		}
		
		//Subnet2
		public String getrds_subnet2_rname() {
			return rds_subnet2_rname;
		}
		public void setrds_subnet2_rname(String rds_subnet2_rname) {
			this.rds_subnet2_rname = rds_subnet2_rname;
		}
		public String getrds_subnet2_cidr_block() {
			return rds_subnet2_cidr_block;
		}
		public void setrds_subnet2_cidr_block(String rds_subnet2_cidr_block) {
			this.rds_subnet2_cidr_block = rds_subnet2_cidr_block;
		}
		public String getrds_subnet2_vpc_id() {
			return rds_subnet2_vpc_id;
		}
		public void setrds_subnet2_vpc_id(String rds_subnet2_vpc_id) {
			this.rds_subnet2_vpc_id = rds_subnet2_vpc_id;
		}
		public String getrds_subnet2_availibility_zone() {
			return rds_subnet2_availibility_zone;
		}
		public void setrds_subnet2_availibility_zone(String rds_subnet2_availibility_zone) {
			this.rds_subnet2_availibility_zone = rds_subnet2_availibility_zone;
		}
		//IGW
		public String getrds_igw_rname() {
			return rds_igw_rname;
		}
		public void setrds_igw_rname(String rds_igw_rname) {
			this.rds_igw_rname = rds_igw_rname;
		}
		public String getrds_igw_vpc_id() {
			return rds_igw_vpc_id;
		}
		public void setrds_igw_vpc_id(String rds_igw_vpc_id) {
			this.rds_igw_vpc_id = rds_igw_vpc_id;
		}
		
			
		private static Properties properties;
		private static RDSAttribute RDSAttribute = null;
		private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
		private static final String RDS_RNAME ="rds_rname";
		private static final String RDS_ALLLOCATED_STORAGE ="rds_allocated_storage";
		private static final String RDS_ENGINE ="rds_engine";
		private static final String RDS_INSTANCE_CLASS="rds_instance_class";
		private static final String RDS_NAME ="rds_name";
		private static final String RDS_PASSWORD ="rds_password";
		private static final String RDS_DEPENDS_ON ="rds_depends_on";
		private static final String RDS_CONNECTION ="rds_connection" ;
		private static final String RDS_AVAILIBILTY_ZONE="rds_availibilty_zone";
		private static final String RDS_BACKUP_WINDOW="rds_backup_window"; 
		private static final String RDS_COPY_TAGS_TO_SNAPSHOTS="rds_copy_tags_to_snapshots";
		private static final String RDS_USERNAME="rds_username"; 
		private static final String RDS_DB_SUBNETGROUP_NAME ="rds_db_subnetgroup_name";
		private static final String RDS_ENGINE_VERSION ="rds_engine_version" ;
		private static final String RDS_FINAL_SNAPSHOT_IDENTIFIER="rds_final_snapshot_identifier";
		private static final String RDS_IDENTIFIER ="rds_identifier";
		private static final String RDS_IOPS="rds_iops";
		private static final String RDS_LICENSE_MODEL ="rds_license_model";
		private static final String RDS_MULITI_AZ ="rds_multi_az";
		private static final String RDS_PARAMETER_GROUP_NAME ="rds_parameter_group_name";
		private static final String RDS_PORT ="rds_port" ;
		private static final String RDS_PUBLICLY_ACCESIBLE="rds_publicly_accessible";
		private static final String RDS_SECURITY_GROUP_NAME="rds_security_group_name"; 
		private static final String RDS_SKIP_FINAL_SNAPSHOT="rds_skip_final_snapshots";
		private static final String RDS_STORAGE_TYPE="rds_storage_type"; 
		private static final String RDS_VPC_SECURITY_GROUP_IDS ="rds_vpc_security_group_ids";
		private static final String RDS_SUBNETGROUP_RNAME="rds_subnetgroup_rname"; 
		private static final String RDS_SUBNETGROUP_DESCRIPTION="rds_subnetgroup_description";
		private static final String RDS_SUBNETGROUP_IDS="rds_subnetgroup_ids"; 
		private static final String RDS_SUBNETGROUP_NAME="rds_subnetgroup_name"; 
		private static final String RDS_VPC_RNAME ="rds_vpc_rname";
		private static final String RDS_VPC_CIDRBLOCK ="rds_vpc_cidrblock";
		private static final String RDS_VPC_ENABLE_DNS_HOSTNAME="rds_vpc_enable_dns_hostnames";
		private static final String RDS_VPC_ENABLE_DNS_SUPPORT="rds_vpc_enable_dns_support";
		private static final String RDS_SUBNET1_RNAME="rds_subnet1_rname" ;
		private static final String RDS_SUBNET1_CIDR_BLOCK="rds_subnet1_cidr_block";
		private static final String RDS_SUBNET1_VPC_ID ="rds_subnet1_vpc_id";
		private static final String RDS_SUBNET1_AVAILIBILTY_ZONE ="rds_subnet1_availibility_zone";
		private static final String RDS_SUBNET2_RNAME="rds_subnet2_rname";
		private static final String RDS_SUBNET2_CIDR_BLOCK ="rds_subnet2_cidr_block";
		private static final String RDS_SUBNET2_VPC_ID="rds_subnet2_vpc_id";
		private static final String RDS_SUBNET2_AVAILIBILTY_ZONE ="rds_subnet2_availibility_zone";
		private static final String RDS_IGW_RNAME ="rds_igw_rname";
		private static final String RDS_IGW_VPC_ID ="rds_igw_vpc_id" ;
		
	
		public static RDSAttribute getRDSAttributeFromProperties(){
			
			RDSAttribute.getReadPropertiesFile();
			
			String rds_rname = properties.getProperty(RDS_RNAME);
			String rds_allocated_storage = properties.getProperty(RDS_ALLLOCATED_STORAGE);
			String rds_engine = properties.getProperty(RDS_ENGINE);
			String rds_instance_class=properties.getProperty(RDS_INSTANCE_CLASS);
			String rds_name = properties.getProperty(RDS_NAME);
			String rds_password = properties.getProperty(RDS_PASSWORD);
			String rds_depends_on = properties.getProperty(RDS_DEPENDS_ON);
			String rds_connection = properties.getProperty(RDS_CONNECTION);
			String rds_availibilty_zone = properties.getProperty(RDS_AVAILIBILTY_ZONE);
			String rds_backup_window = properties.getProperty(RDS_BACKUP_WINDOW);
			String rds_copy_tags_to_snapshots= properties.getProperty(RDS_COPY_TAGS_TO_SNAPSHOTS);
			String rds_username = properties.getProperty(RDS_USERNAME);
			String rds_db_subnetgroup_name = properties.getProperty(RDS_DB_SUBNETGROUP_NAME);
			String rds_engine_version = properties.getProperty(RDS_ENGINE_VERSION);
			String rds_final_snapshot_identifier = properties.getProperty(RDS_FINAL_SNAPSHOT_IDENTIFIER);
			String rds_identifier = properties.getProperty(RDS_IDENTIFIER);
			String rds_iops = properties.getProperty(RDS_IOPS);
			String rds_license_model = properties.getProperty(RDS_LICENSE_MODEL);
			String rds_multi_az=properties.getProperty(RDS_MULITI_AZ);
			String rds_parameter_group_name = properties.getProperty(RDS_PARAMETER_GROUP_NAME);
			String rds_port = properties.getProperty(RDS_PORT);
			String rds_publicly_accessible = properties.getProperty(RDS_PUBLICLY_ACCESIBLE);
			String rds_security_group_name = properties.getProperty(RDS_SECURITY_GROUP_NAME);
			String rds_skip_final_snapshots = properties.getProperty(RDS_SKIP_FINAL_SNAPSHOT);
			String rds_storage_type = properties.getProperty(RDS_STORAGE_TYPE);
			String rds_vpc_security_group_ids = properties.getProperty(RDS_VPC_SECURITY_GROUP_IDS);
			String rds_subnetgroup_rname=properties.getProperty(RDS_SUBNETGROUP_RNAME);
			String rds_subnetgroup_description = properties.getProperty(RDS_SUBNETGROUP_DESCRIPTION);
			String rds_subnetgroup_ids = properties.getProperty(RDS_SUBNETGROUP_IDS);
			String rds_subnetgroup_name = properties.getProperty(RDS_SUBNETGROUP_NAME);
			String rds_vpc_rname = properties.getProperty(RDS_VPC_RNAME);
			String rds_vpc_cidrblock = properties.getProperty(RDS_VPC_CIDRBLOCK);
			String rds_vpc_enable_dns_hostnames =properties.getProperty(RDS_VPC_ENABLE_DNS_HOSTNAME);
			String rds_vpc_enable_dns_support =properties.getProperty(RDS_VPC_ENABLE_DNS_SUPPORT);
			String rds_subnet1_rname= properties.getProperty(RDS_SUBNET1_RNAME);
			String rds_subnet1_cidr_block = properties.getProperty(RDS_SUBNET1_CIDR_BLOCK);
			String rds_subnet1_vpc_id = properties.getProperty(RDS_SUBNET1_VPC_ID);
			String rds_subnet1_availibility_zone =properties.getProperty(RDS_SUBNET1_AVAILIBILTY_ZONE);
			String rds_subnet2_cidr_block = properties.getProperty(RDS_SUBNET2_CIDR_BLOCK);
			String rds_subnet2_rname = properties.getProperty(RDS_SUBNET2_RNAME);
			String rds_subnet2_vpc_id = properties.getProperty(RDS_SUBNET2_VPC_ID);
			String rds_subnet2_availibility_zone =properties.getProperty(RDS_SUBNET2_AVAILIBILTY_ZONE);
			String rds_igw_rname = properties.getProperty(RDS_IGW_RNAME);
			String rds_igw_vpc_id = properties.getProperty(RDS_IGW_VPC_ID);
			RDSAttribute =new RDSAttribute();
			//RDS
			RDSAttribute.setrds_rname(rds_rname);
			RDSAttribute.setrds_name(rds_name);
			RDSAttribute.setrds_allocated_storage(rds_allocated_storage);
			RDSAttribute.setrds_availibilty_zone(rds_availibilty_zone);
			RDSAttribute.setrds_backup_window(rds_backup_window);
			RDSAttribute.setrds_connection(rds_connection);
			RDSAttribute.setrds_copy_tags_to_snapshots(rds_copy_tags_to_snapshots);
			RDSAttribute.setrds_db_subnetgroup_name(rds_db_subnetgroup_name);
			RDSAttribute.setrds_depends_on(rds_depends_on);
			RDSAttribute.setrds_engine(rds_engine_version);
			RDSAttribute.setrds_engine_version(rds_engine_version);
			RDSAttribute.setrds_final_snapshot_identifier(rds_final_snapshot_identifier);
			RDSAttribute.setrds_identifier(rds_identifier);
			RDSAttribute.setrds_instance_class(rds_instance_class);
			RDSAttribute.setrds_iops(rds_iops);
			RDSAttribute.setrds_license_model(rds_license_model);
			RDSAttribute.setrds_multi_az(rds_multi_az);
			RDSAttribute.setrds_security_group_name(rds_security_group_name);
			RDSAttribute.setrds_skip_final_snapshots(rds_skip_final_snapshots);
			RDSAttribute.setrds_storage_type(rds_storage_type);
			RDSAttribute.setrds_username(rds_username);
			RDSAttribute.setrds_vpc_security_group_ids(rds_vpc_security_group_ids);
			RDSAttribute.setrds_engine(rds_engine);
			RDSAttribute.setrds_password(rds_password);
			RDSAttribute.setrds_parameter_group_name(rds_parameter_group_name);
			RDSAttribute.setrds_port(rds_port);
			RDSAttribute.setrds_publicly_accessible(rds_publicly_accessible);
			//Subnet1
			RDSAttribute.setrds_subnet1_rname(rds_subnet1_rname);
			RDSAttribute.setrds_subnet1_cidr_block(rds_subnet1_cidr_block);
			RDSAttribute.setrds_subnet1_vpc_id(rds_subnet1_vpc_id);
			RDSAttribute.setrds_subnet1_availibility_zone(rds_subnet1_availibility_zone);
			//Subnet2
			RDSAttribute.setrds_subnet2_rname(rds_subnet2_rname);
			RDSAttribute.setrds_subnet2_cidr_block(rds_subnet2_cidr_block);	
			RDSAttribute.setrds_subnet2_vpc_id(rds_subnet2_vpc_id);
			RDSAttribute.setrds_subnet2_availibility_zone(rds_subnet2_availibility_zone);
			//Subnetgroup
			RDSAttribute.setrds_subnetgroup_description(rds_subnetgroup_description);
			RDSAttribute.setrds_subnetgroup_ids(rds_subnetgroup_ids);
			RDSAttribute.setrds_subnetgroup_name(rds_subnetgroup_name);
			RDSAttribute.setrds_subnetgroup_rname(rds_subnetgroup_rname);
			//VPC
			RDSAttribute.setrds_vpc_cidrblock(rds_vpc_cidrblock);
			RDSAttribute.setrds_vpc_rname(rds_vpc_rname);
			RDSAttribute.setrds_vpc_enable_dns_hostnames(rds_vpc_enable_dns_hostnames);
			RDSAttribute.setrds_vpc_enable_dns_support(rds_vpc_enable_dns_support);
			//IGW
			RDSAttribute.setrds_igw_rname(rds_igw_rname);
			RDSAttribute.setrds_igw_vpc_id(rds_igw_vpc_id);
			return RDSAttribute;
			
			
				
			
		}
		
		public static void getReadPropertiesFile() {
			if(RDSAttribute == null){
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
