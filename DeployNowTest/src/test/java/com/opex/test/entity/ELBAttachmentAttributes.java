package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class  ELBAttachmentAttributes {

	
	//ELB Attachment-VPC
	String elba_vpc_Rname;
	String elba_vpc_cidrblock;
	 //ELB Attachment-IGW
	String elba_igw_Rname;
	String elba_igw_vpcId;
	 //ELB Attachment-Routetable
	String elba_routetable_Rname;
	String elba_routetable_vpcId;
	String elba_routetable_route;
	 //ELB Attachment-Subnet
	String elba_subnet_Rname;
	String elba_subnet_cidrblock;
	String elba_subnet_vpcId;
	 //ELB Attachment-Routetable Association
	String elba_rta_Rname;
	String elba_rta_routetable_id;
	String elba_rta_subnet_id;
	//ELB Attachment secutity group
	String elba_sg_rname ;
	String	elba_sg_egress ;
	String	elba_sg_ingress;
	String	elba_sg_vpcid ;
	//ELB Attachment-ELB
	String elba_elb_Rname;
	String elba_elb_listener;
	String elba_elb_name;
	String elba_elb_subnets;
	String elba_elb_dependson;
	String elba_elb_connection;
	String elba_elb_access_logs;
	String elba_elb_cross_zone_load_balancing;
	String elba_elb_health_check;
	String elba_elb_idle_timeout;
	String elba_elb_instances;
	String elba_elb_internal;
	String elba_elb_security_groups;
	String elba_elb_tags;
	//ELB Attachment-Instance
	String elba_instance_envname;
	String elba_instance_rname;
	String elba_instance_connection;
	String elba_ami;
	String elba_instance_key_name;
	String elba_instance_type;
	String elba_availability_zone; 
	String elba_security_groups; 
	String elba_vpc_security_group_id ; 
	String elba_instance_initiated;
	String elba_source_dest_check;
	String elba_instance_subnet_id;
	String elba_instance_associate_public_ip_address;
	String elba_instance_disable_api_termination;
	String elba_instance_ebs_block_device;
	String elba_instance_ebs_optimized; 
	String elba_instance_ephemeral_block_device;
	String elba_instance_iam_instance_profile; 
	String elba_instance_monitoring;
	String elba_instance_placement_group ; 
	String elba_instance_private_ip; 
	String elba_instance_root_block_device;
	String elba_instance_tags;
	String elba_instance_tenancy; 
	String elba_instance_user_data; 
	 //ELB Attachment
	 String elbas_rname;
	 String elbas_elb;
	 String elbas_instance;
	 String elbas_dependson;
	 String elbas_connection;
	 String elba_renameELBA;
	 

	//ELBA Search element
	 String elba_searchA; 
	
	//ELB Attachment-VPC
	 
	public String getElba_vpc_Rname() {
		return elba_vpc_Rname;
	}
	
	public void setElba_vpc_Rname(String elba_vpc_Rname) {
		this.elba_vpc_Rname = elba_vpc_Rname;
	}
	
	public String getElba_vpc_cidrblock() {
		return elba_vpc_cidrblock;
	}
	
	public void setElba_vpc_cidrblock(String elba_vpc_cidrblock) {
		this.elba_vpc_cidrblock = elba_vpc_cidrblock;
	}
	
	//ELB Attachment-IGW
	
	public String getElba_igw_Rname() {
		return elba_igw_Rname;
	}
	
	public void setElba_igw_Rname(String elba_igw_Rname) {
		this.elba_igw_Rname = elba_igw_Rname;
	}
	
	public String getElba_igw_vpcId() {
		return elba_igw_vpcId;
	}
	
	public void setElba_igw_vpcId(String elba_igw_vpcId) {
		this.elba_igw_vpcId = elba_igw_vpcId;
	}
	
	//ELB Attachment-Route Table
	public String getElba_routetable_Rname() {
		return elba_routetable_Rname;
	}
	
	public void setElba_routetable_Rname(String elba_routetable_Rname) {
		this.elba_routetable_Rname = elba_routetable_Rname;
	}
	
	public String getElba_routetable_vpcId() {
		return elba_routetable_vpcId;
	}
	
	public void setElba_routetable_vpcId(String elba_routetable_vpcId) {
		this.elba_routetable_vpcId = elba_routetable_vpcId;
	}
	
	public String getElba_routetable_route() {
		return elba_routetable_route;
	}
	
	public void setElba_routetable_route(String elba_routetable_route) {
		this.elba_routetable_route = elba_routetable_route;
	}
	
	//ELB Attachment-Subnet
	public String getElba_subnet_Rname() {
		return elba_subnet_Rname;
	}
	
	public void setElba_subnet_Rname(String elba_subnet_Rname) {
		this.elba_subnet_Rname = elba_subnet_Rname;
	}
	
	public String getElba_subnet_cidrblock() {
		return elba_subnet_cidrblock;
	}
	
	public void setElba_subnet_cidrblock(String elba_subnet_cidrblock) {
		this.elba_subnet_cidrblock = elba_subnet_cidrblock;
	}
	
	public String getElba_subnet_vpcId() {
		return elba_subnet_vpcId;
	}
	
	public void setElba_subnet_vpcId(String elba_subnet_vpcId) {
		this.elba_subnet_vpcId = elba_subnet_vpcId;
	}
	
	//ELB Attachment-Route Table Association
	public String getElba_rta_Rname() {
		return elba_rta_Rname;
	}
	public void setElba_rta_Rname(String elba_rta_Rname) {
		this.elba_rta_Rname = elba_rta_Rname;
	}
	public String getElba_rta_routetable_id() {
		return elba_rta_routetable_id;
	}
	public void setElba_rta_routetable_id(String elba_rta_routetable_id) {
		this.elba_rta_routetable_id = elba_rta_routetable_id;
	}
	public String getElba_rta_subnet_id() {
		return elba_rta_subnet_id;
	}
	
	public void setElba_rta_subnet_id(String elba_rta_subnet_id) {
		this.elba_rta_subnet_id = elba_rta_subnet_id;
	}
	
	//ELB Attachment-ELB
	public String getElba_elb_Rname() {
		return elba_elb_Rname;
	}
	
	public void setElba_elb_Rname(String elba_elb_Rname) {
		this.elba_elb_Rname = elba_elb_Rname;
	}
	
	public String getElba_elb_listener() {
		return elba_elb_listener;
	}
	
	public void setElba_elb_listener(String elba_elb_listener) {
		this.elba_elb_listener = elba_elb_listener;
	}
	public String getElba_elb_name() {
		return elba_elb_name;
	}
	public void setElba_elb_name(String elba_elb_name) {
		this.elba_elb_name = elba_elb_name;
	}
	public String getElba_elb_subnets() {
		return elba_elb_subnets;
	}
	public void setElba_elb_subnets(String elba_elb_subnets) {
		this.elba_elb_subnets = elba_elb_subnets;
	}
	public String getElba_elb_dependson() {
		return elba_elb_dependson;
	}
	public void setElba_elb_dependson(String elba_elb_dependson) {
		this.elba_elb_dependson = elba_elb_dependson;
	}
	public String getElba_elb_connection() {
		return elba_elb_connection;
	}
	public void setElba_elb_connection(String elba_elb_connection) {
		this.elba_elb_connection = elba_elb_connection;
	}
	public String getElba_elb_access_logs() {
		return elba_elb_access_logs;
	}
	public void setElba_elb_access_logs(String elba_elb_access_logs) {
		this.elba_elb_access_logs = elba_elb_access_logs;
	}
	public String getElba_elb_cross_zone_load_balancing() {
		return elba_elb_cross_zone_load_balancing;
	}
	public void setElba_elb_cross_zone_load_balancing(String elba_elb_cross_zone_load_balancing) {
		this.elba_elb_cross_zone_load_balancing = elba_elb_cross_zone_load_balancing;
	}
	public String getElba_elb_health_check() {
		return elba_elb_health_check;
	}
	public void setElba_elb_health_check(String elba_elb_health_check) {
		this.elba_elb_health_check = elba_elb_health_check;
	}
	public String getElba_elb_idle_timeout() {
		return elba_elb_idle_timeout;
	}
	public void setElba_elb_idle_timeout(String elba_elb_idle_timeout) {
		this.elba_elb_idle_timeout = elba_elb_idle_timeout;
	}
	public String getElba_elb_instances() {
		return elba_elb_instances;
	}
	public void setElba_elb_instances(String elba_elb_instances) {
		this.elba_elb_instances = elba_elb_instances;
	}
	public String getElba_elb_internal() {
		return elba_elb_internal;
	}
	public void setElba_elb_internal(String elba_elb_internal) {
		this.elba_elb_internal = elba_elb_internal;
	}
	public String getElba_elb_security_groups() {
		return elba_elb_security_groups;
	}
	public void setElba_elb_security_groups(String elba_elb_security_groups) {
		this.elba_elb_security_groups = elba_elb_security_groups;
	}
	public String getElba_elb_tags() {
		return elba_elb_tags;
	}
	public void setElba_elb_tags(String elba_elb_tags) {
		this.elba_elb_tags = elba_elb_tags;
	}
	
	//ELB Attachment instance
	public String getElba_instance_envname() {
		return elba_instance_envname;
	}
	public void setElba_instance_envname(String elba_instance_envname) {
		this.elba_instance_envname = elba_instance_envname;
	}
	public String getElba_instance_rname() {
		return elba_instance_rname;
	}
	public void setElba_instance_rname(String elba_instance_rname) {
		this.elba_instance_rname = elba_instance_rname;
	}
	public String getElba_instance_connection() {
		return elba_instance_connection;
	}
	public void setElba_instance_connection(String elba_instance_connection) {
		this.elba_instance_connection = elba_instance_connection;
	}
	public String getElba_ami() {
		return elba_ami;
	}
	public void setElba_ami(String elba_ami) {
		this.elba_ami = elba_ami;
	}
	public String getElba_instance_key_name() {
		return elba_instance_key_name;
	}
	public void setElba_instance_key_name(String elba_instance_key_name) {
		this.elba_instance_key_name = elba_instance_key_name;
	}
	public String getElba_instance_type() {
		return elba_instance_type;
	}
	public void setElba_instance_type(String elba_instance_type) {
		this.elba_instance_type = elba_instance_type;
	}
	public String getElba_availability_zone() {
		return elba_availability_zone;
	}
	public void setElba_availability_zone(String elba_availability_zone) {
		this.elba_availability_zone = elba_availability_zone;
	}
	public String getElba_security_groups() {
		return elba_security_groups;
	}
	public void setElba_security_groups(String elba_security_groups) {
		this.elba_security_groups = elba_security_groups;
	}
	public String getElba_vpc_security_group_id() {
		return elba_vpc_security_group_id;
	}
	public void setElba_vpc_security_group_id(String elba_vpc_security_group_id) {
		this.elba_vpc_security_group_id = elba_vpc_security_group_id;
	}
	public String getElba_instance_initiated() {
		return elba_instance_initiated;
	}
	public void setElba_instance_initiated(String elba_instance_initiated) {
		this.elba_instance_initiated = elba_instance_initiated;
	}
	public String getElba_source_dest_check() {
		return elba_source_dest_check;
	}
	public void setElba_source_dest_check(String elba_source_dest_check) {
		this.elba_source_dest_check = elba_source_dest_check;
	}
	public String getElba_instance_subnet_id() {
		return elba_instance_subnet_id;
	}
	public void setElba_instance_subnet_id(String elba_instance_subnet_id) {
		this.elba_instance_subnet_id = elba_instance_subnet_id;
	}
	public String getElba_instance_associate_public_ip_address() {
		return elba_instance_associate_public_ip_address;
	}
	public void setElba_instance_associate_public_ip_address(String elba_instance_associate_public_ip_address) {
		this.elba_instance_associate_public_ip_address = elba_instance_associate_public_ip_address;
	}
	public String getElba_instance_disable_api_termination() {
		return elba_instance_disable_api_termination;
	}
	public void setElba_instance_disable_api_termination(String elba_instance_disable_api_termination) {
		this.elba_instance_disable_api_termination = elba_instance_disable_api_termination;
	}
	public String getElba_instance_ebs_block_device() {
		return elba_instance_ebs_block_device;
	}
	public void setElba_instance_ebs_block_device(String elba_instance_ebs_block_device) {
		this.elba_instance_ebs_block_device = elba_instance_ebs_block_device;
	}
	public String getElba_instance_ebs_optimized() {
		return elba_instance_ebs_optimized;
	}
	public void setElba_instance_ebs_optimized(String elba_instance_ebs_optimized) {
		this.elba_instance_ebs_optimized = elba_instance_ebs_optimized;
	}
	public String getElba_instance_ephemeral_block_device() {
		return elba_instance_ephemeral_block_device;
	}
	public void setElba_instance_ephemeral_block_device(String elba_instance_ephemeral_block_device) {
		this.elba_instance_ephemeral_block_device = elba_instance_ephemeral_block_device;
	}
	public String getElba_instance_iam_instance_profile() {
		return elba_instance_iam_instance_profile;
	}
	public void setElba_instance_iam_instance_profile(String elba_instance_iam_instance_profile) {
		this.elba_instance_iam_instance_profile = elba_instance_iam_instance_profile;
	}
	public String getElba_instance_monitoring() {
		return elba_instance_monitoring;
	}
	public void setElba_instance_monitoring(String elba_instance_monitoring) {
		this.elba_instance_monitoring = elba_instance_monitoring;
	}
	public String getElba_instance_placement_group() {
		return elba_instance_placement_group;
	}
	public void setElba_instance_placement_group(String elba_instance_placement_group) {
		this.elba_instance_placement_group = elba_instance_placement_group;
	}
	public String getElba_instance_private_ip() {
		return elba_instance_private_ip;
	}
	public void setElba_instance_private_ip(String elba_instance_private_ip) {
		this.elba_instance_private_ip = elba_instance_private_ip;
	}
	public String getElba_instance_root_block_device() {
		return elba_instance_root_block_device;
	}
	public void setElba_instance_root_block_device(String elba_instance_root_block_device) {
		this.elba_instance_root_block_device = elba_instance_root_block_device;
	}
	public String getElba_instance_tags() {
		return elba_instance_tags;
	}
	public void setElba_instance_tags(String elba_instance_tags) {
		this.elba_instance_tags = elba_instance_tags;
	}
	public String getElba_instance_tenancy() {
		return elba_instance_tenancy;
	}
	public void setElba_instance_tenancy(String elba_instance_tenancy) {
		this.elba_instance_tenancy = elba_instance_tenancy;
	}
	public String getElba_instance_user_data() {
		return elba_instance_user_data;
	}
	public void setElba_instance_user_data(String elba_instance_user_data) {
		this.elba_instance_user_data = elba_instance_user_data;
	}
	
	//ELB Attachment
	
	public String getElbas_rname() {
		return elbas_rname;
	}

	public void setElbas_rname(String elbas_rname) {
		ELBAttachmentAttributes.elbas_rname = elbas_rname;
	}

	
	public String getElbas_elb() {
		return elbas_elb;
	}
	public void setElbas_elb(String elbas_elb) {
		this.elbas_elb = elbas_elb;
	}
	public String getElbas_instance() {
		return elbas_instance;
	}
	public void setElbas_instance(String elbas_instance) {
		this.elbas_instance = elbas_instance;
	}
	
	public String getElbas_dependson() {
		return elbas_dependson;
	}
	public void setElbas_dependson(String elbas_dependson) {
		this.elbas_dependson = elbas_dependson;
	}
	public String getElbas_connection() {
		return elbas_connection;
	}
	public void setElbas_connection(String elbas_connection) {
		this.elbas_connection = elbas_connection;
	}
	
  //ELBA rename
	 public String getElba_renameELBA() {
		return elba_renameELBA;
	}

	public void setElba_renameELBA(String elba_renameELBA) {
		this.elba_renameELBA = elba_renameELBA;
	}

	
	//ELBA Search element
		public String getElba_searchA() {
			return elba_searchA;
		}

		public void setElba_searchA(String elba_searchA) {
			this.elba_searchA = elba_searchA;
		}

	//ELBA Security group
	public String getElba_sg_rname() {
			return elba_sg_rname;
		}

		public void setElba_sg_rname(String elba_sg_rname) {
			this.elba_sg_rname = elba_sg_rname;
		}

		public String getElba_sg_egress() {
			return elba_sg_egress;
		}

		public void setElba_sg_egress(String elba_sg_egress) {
			this.elba_sg_egress = elba_sg_egress;
		}

		public String getElba_sg_ingress() {
			return elba_sg_ingress;
		}

		public void setElba_sg_ingress(String elba_sg_ingress) {
			this.elba_sg_ingress = elba_sg_ingress;
		}

		public String getElba_sg_vpcid() {
			return elba_sg_vpcid;
		}

		public void setElba_sg_vpcid(String elba_sg_vpcid) {
			this.elba_sg_vpcid = elba_sg_vpcid;
		}


	private static Properties properties;
	private static ELBAttachmentAttributes ELBAttachmentAttributes = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	
	//ELB Attachment-VPC
	private static final String ELBA_VPC_RNAME="elba_vpc_Rname";
	private static final String ELBA_VPC_CIDRBLOCK="elba_vpc_cidrblock";
	//ELB Attachment-IGW
	private static final String ELBA_IGW_RNAME="elba_igw_Rname";
	private static final String ELBA_IGW_VPCID="elba_igw_vpcId";
	//ELB Attachment-Routetable
	private static final String ELBA_ROUTETABLE_RNAME="elba_routetable_Rname";
	private static final String ELBA_ROUTETABLE_VPCID="elba_routetable_vpcId";
	private static final String ELBA_ROUTETABLE_ROUTE="elba_routetable_route";
	//ELB Attachment-Subnet
	private static final String ELBA_SUBNET_RNAME="elba_subnet_Rname";
	private static final String ELBA_SUBNET_CIDRBLOCK="elba_subnet_cidrblock";
	private static final String ELBA_SUBNET_VPCID="elba_subnet_vpcId";
	//ELB Attachment-Routetable Association
	private static final String ELBA_RTA_RNAME="elba_rta_Rname";
	private static final String ELBA_RTA_ROUTETABLE_ID="elba_rta_routetable_id";
	private static final String ELBA_RTA_SUBNET_ID="elba_rta_subnet_id";
	//ELB Attachment-ELB
	private static final String ELBA_ELB_RNAME="elba_elb_Rname";
	private static final String ELBA_ELB_LISTENER="elba_elb_listener";
	private static final String ELBA_ELB_NAME="elba_elb_name";
	private static final String ELBA_ELB_SUBNETS="elba_elb_subnets";
	private static final String ELBA_ELB_DEPENDSON="elba_elb_dependson";
	private static final String ELBA_ELB_CONNECTION="elba_elb_connection";
	private static final String ELBA_ELB_ACCESS_LOGS="elba_elb_access_logs";
	private static final String ELBA_ELB_CROSS_ZONE_LOAD_BALANCING="elba_elb_cross_zone_load_balancing";
	private static final String ELBA_ELB_HEALTH_CHECK="elba_elb_health_check";
	private static final String ELBA_ELB_IDLE_TIMEOUT="elba_elb_idle_timeout";
	private static final String ELBA_ELB_INSTANCES="elba_elb_instances";
	private static final String ELBA_ELB_INTERNAL="elba_elb_internal";
	private static final String ELBA_ELB_SECURITY_GROUPS="elba_elb_security_groups";
	private static final String ELBA_ELB_TAGS="elba_elb_tags";
	//ELB Attachment-Instance
	private static final String ELBA_INSTANCE_ENVNAME="elba_instance_envname";
	private static final String ELBA_INSTANCE_RNAME="elba_instance_rname";
	private static final String ELBA_INSTANCE_CONNECTION="elba_instance_connection";
	private static final String ELBA_INSTANCE_AMI="elba_ami";
	private static final String ELBA_INSTANCE_KEY_NAME="elba_instance_key_name";
	private static final String ELBA_INSTANCE_TYPE="elba_instance_type";
	private static final String ELBA_AVAILABILITY_ZONE="elba_availability_zone"; 
	private static final String ELBA_SECURITY_GROUPS="elba_security_groups"; 
	private static final String ELBA_VPC_SECURITY_GROUP_ID="elba_vpc_security_group_id"; 
	private static final String ELBA_INSTANCE_INITIATED="elba_instance_initiated";
	private static final String ELBA_SOURCE_DEST_CHECK="elba_source_dest_check";
	private static final String ELBA_INSTANCE_SUBNET_ID="elba_instance_subnet_id";
	private static final String ELBA_INSTANCE_ASSOCIATE_PUBLIC_IP_ADDRESS="elba_instance_associate_public_ip_address";
	private static final String ELBA_INSTANCE_DISABLE_API_TERMINATION="elba_instance_disable_api_termination";
	private static final String ELBA_INSTANCE_EBS_BLOCK_DEVICE="elba_instance_ebs_block_device";
	private static final String ELBA_INSTANCE_EBS_OPTIMIZED="elba_instance_ebs_optimized"; 
	private static final String ELBA_INSTANCE_EPHEMERAL_BLOCK_DEVICE="elba_instance_ephemeral_block_device";
	private static final String ELBA_INSTANCE_IAM_INSTANCE_PROFILE="elba_instance_iam_instance_profile"; 
	private static final String ELBA_INSTANCE_MONITORING="elba_instance_monitoring";
	private static final String ELBA_INSTANCE_PLACEMENT_GROUP="elba_instance_placement_group"; 
	private static final String ELBA_INSTANCE_PRIVATE_IP="elba_instance_private_ip"; 
	private static final String ELBA_INSTANCE_ROOT_BLOCK_DEVICE="elba_instance_root_block_device";
	private static final String ELBA_INSTANCE_TAGS="elba_instance_tags";
	private static final String ELBA_INSTANCE_TENANCY="elba_instance_tenancy"; 
	private static final String ELBA_INSTANCE_USER_DATA="elba_instance_user_data"; 
	//ELB Attachment
	private static final String ELBAS_RNAME="elbas_rname";
	private static final String ELBAS_ELB="elbas_elb";
	private static final String ELBAS_INSTANCE="elbas_instance";
	private static final String ELBAS_DEPENDSON="elbas_dependson";
	private static final String ELBAS_CONNECTION="elbas_connection";
	 //ELBA Search element
	 public static final String ELBA_SEARCHA="elba_searchA"; 
	//ELBA rename
	 public static final String ELBA_RENAMEELBA="elba_renameELBA";
	//security group
	 public static final String ELBA_SG_RNAME="elba_sg_rname";
	 public static final String ELBA_SG_EGRESS="elba_sg_egress";
	 public static final String ELBA_SG_INGRESS="elba_sg_ingress";
	 public static final String ELBA_SG_VPCID="elba_sg_vpcid";
	 
	public static ELBAttachmentAttributes getELBAttachmentAttributesFromProperties(){
		
	
		
		
		ELBAttachmentAttributes.getReadPropertiesFile();
		
		//ELB Attachment-VPC
		String elba_vpc_Rname=properties.getProperty(ELBA_VPC_RNAME);
		String elba_vpc_cidrblock=properties.getProperty(ELBA_VPC_CIDRBLOCK);
		 //ELB Attachment-IGW
		String elba_igw_Rname=properties.getProperty(ELBA_IGW_RNAME);
		String elba_igw_vpcId=properties.getProperty(ELBA_IGW_VPCID);
		 //ELB Attachment-Routetable
		String elba_routetable_Rname=properties.getProperty(ELBA_ROUTETABLE_RNAME);
		String elba_routetable_vpcId=properties.getProperty(ELBA_ROUTETABLE_VPCID);
		String elba_routetable_route=properties.getProperty(ELBA_ROUTETABLE_ROUTE);
		 //ELB Attachment-Subnet
		String elba_subnet_Rname=properties.getProperty(ELBA_SUBNET_RNAME);
		String elba_subnet_cidrblock=properties.getProperty(ELBA_SUBNET_CIDRBLOCK);
		String elba_subnet_vpcId=properties.getProperty(ELBA_SUBNET_VPCID);
		 //ELB Attachment-Routetable Association
		String elba_rta_Rname=properties.getProperty(ELBA_RTA_RNAME);
		String elba_rta_routetable_id=properties.getProperty(ELBA_RTA_ROUTETABLE_ID);
		String elba_rta_subnet_id=properties.getProperty(ELBA_RTA_SUBNET_ID);
		//ELB Attachment-ELB
		String elba_elb_Rname=properties.getProperty(ELBA_ELB_RNAME);
		String elba_elb_listener=properties.getProperty(ELBA_ELB_LISTENER);
		String elba_elb_name=properties.getProperty(ELBA_ELB_NAME);
		String elba_elb_subnets=properties.getProperty(ELBA_ELB_SUBNETS);
		String elba_elb_dependson=properties.getProperty(ELBA_ELB_DEPENDSON);
		String elba_elb_connection=properties.getProperty(ELBA_ELB_CONNECTION);
		String elba_elb_access_logs=properties.getProperty(ELBA_ELB_ACCESS_LOGS);
		String elba_elb_cross_zone_load_balancing=properties.getProperty(ELBA_ELB_CROSS_ZONE_LOAD_BALANCING);
		String elba_elb_health_check=properties.getProperty(ELBA_ELB_HEALTH_CHECK);
		String elba_elb_idle_timeout=properties.getProperty(ELBA_ELB_IDLE_TIMEOUT);
		String elba_elb_instances=properties.getProperty(ELBA_ELB_INSTANCES);
		String elba_elb_internal=properties.getProperty(ELBA_ELB_INTERNAL);
		String elba_elb_security_groups=properties.getProperty(ELBA_ELB_SECURITY_GROUPS);
		String elba_elb_tags=properties.getProperty(ELBA_ELB_TAGS);
		//ELB Attachment-Instance
		String elba_instance_envname=properties.getProperty(ELBA_INSTANCE_ENVNAME);
		String elba_instance_rname=properties.getProperty(ELBA_INSTANCE_RNAME);
		String elba_instance_connection=properties.getProperty(ELBA_INSTANCE_CONNECTION);
		String elba_ami=properties.getProperty(ELBA_INSTANCE_AMI);
		String elba_instance_key_name=properties.getProperty(ELBA_INSTANCE_KEY_NAME);
		String elba_instance_type=properties.getProperty(ELBA_INSTANCE_TYPE);
		String elba_availability_zone=properties.getProperty(ELBA_AVAILABILITY_ZONE); 
		String elba_security_groups=properties.getProperty(ELBA_SECURITY_GROUPS); 
		String elba_vpc_security_group_id=properties.getProperty(ELBA_VPC_SECURITY_GROUP_ID); 
		String elba_instance_initiated=properties.getProperty(ELBA_INSTANCE_INITIATED);
		String elba_source_dest_check=properties.getProperty(ELBA_SOURCE_DEST_CHECK);
		String elba_instance_subnet_id=properties.getProperty(ELBA_INSTANCE_SUBNET_ID);
		String elba_instance_associate_public_ip_address=properties.getProperty(ELBA_INSTANCE_ASSOCIATE_PUBLIC_IP_ADDRESS);
		String elba_instance_disable_api_termination=properties.getProperty(ELBA_INSTANCE_DISABLE_API_TERMINATION);
		String elba_instance_ebs_block_device=properties.getProperty(ELBA_INSTANCE_EBS_BLOCK_DEVICE);
		String elba_instance_ebs_optimized=properties.getProperty(ELBA_INSTANCE_EBS_OPTIMIZED); 
		String elba_instance_ephemeral_block_device=properties.getProperty(ELBA_INSTANCE_EPHEMERAL_BLOCK_DEVICE);
		String elba_instance_iam_instance_profile=properties.getProperty(ELBA_INSTANCE_IAM_INSTANCE_PROFILE); 
		String elba_instance_monitoring=properties.getProperty(ELBA_INSTANCE_MONITORING);
		String elba_instance_placement_group=properties.getProperty(ELBA_INSTANCE_PLACEMENT_GROUP); 
		String elba_instance_private_ip=properties.getProperty(ELBA_INSTANCE_PRIVATE_IP); 
		String elba_instance_root_block_device=properties.getProperty(ELBA_INSTANCE_ROOT_BLOCK_DEVICE);
		String elba_instance_tags=properties.getProperty(ELBA_INSTANCE_TAGS);
		String elba_instance_tenancy=properties.getProperty(ELBA_INSTANCE_TENANCY); 
		String elba_instance_user_data=properties.getProperty(ELBA_INSTANCE_USER_DATA); 
		//ELB Attachment

		String elbas_rname=properties.getProperty(ELBAS_RNAME);
		String elbas_elb=properties.getProperty(ELBAS_ELB);
		String elbas_instance=properties.getProperty(ELBAS_INSTANCE);
		String elbas_dependson=properties.getProperty(ELBAS_DEPENDSON);
		String elbas_connection=properties.getProperty(ELBAS_CONNECTION);
		 //ELBA Search element
		 String elba_searchA=properties.getProperty(ELBA_SEARCHA); 
		//elba rename
		 String elba_renameELBA=properties.getProperty(ELBA_RENAMEELBA);
		 String elba_sg_rname=properties.getProperty(ELBA_SG_RNAME);
		 String elba_sg_egress=properties.getProperty(ELBA_SG_EGRESS);
		 String elba_sg_ingress=properties.getProperty(ELBA_SG_INGRESS);
		 String elba_sg_vpcid=properties.getProperty(ELBA_SG_VPCID);
		 
		ELBAttachmentAttributes=new ELBAttachmentAttributes();
	
		//ELB Attachment-vpc
		ELBAttachmentAttributes.setElba_vpc_Rname(elba_vpc_Rname);
		ELBAttachmentAttributes.setElba_vpc_cidrblock(elba_vpc_cidrblock);
		//ELB Attachment-subnet
		ELBAttachmentAttributes.setElba_subnet_Rname(elba_subnet_Rname);
		ELBAttachmentAttributes.setElba_subnet_cidrblock(elba_subnet_cidrblock);
		ELBAttachmentAttributes.setElba_subnet_vpcId(elba_subnet_vpcId);
		//ELB Attachment-igw
		ELBAttachmentAttributes.setElba_igw_Rname(elba_igw_Rname);
		ELBAttachmentAttributes.setElba_igw_vpcId(elba_igw_vpcId);
		//ELB Attachment-routetable
		ELBAttachmentAttributes.setElba_routetable_Rname(elba_routetable_Rname);
		ELBAttachmentAttributes.setElba_routetable_route(elba_routetable_route);
		ELBAttachmentAttributes.setElba_routetable_vpcId(elba_routetable_vpcId);
		//ELB Attachment-route table associate
		ELBAttachmentAttributes.setElba_rta_Rname(elba_rta_Rname);
		ELBAttachmentAttributes.setElba_rta_routetable_id(elba_rta_routetable_id);
		ELBAttachmentAttributes.setElba_rta_subnet_id(elba_rta_subnet_id);
		//ELB Attachment-elb
		ELBAttachmentAttributes.setElba_elb_name(elba_elb_name);
		ELBAttachmentAttributes.setElba_elb_Rname(elba_elb_Rname);
		ELBAttachmentAttributes.setElba_elb_listener(elba_elb_listener);
		ELBAttachmentAttributes.setElba_elb_subnets(elba_elb_subnets);
		ELBAttachmentAttributes.setElba_elb_dependson(elba_elb_dependson);
		ELBAttachmentAttributes.setElba_elb_connection(elba_elb_connection);
		ELBAttachmentAttributes.setElba_elb_access_logs(elba_elb_access_logs);
		ELBAttachmentAttributes.setElba_elb_cross_zone_load_balancing(elba_elb_cross_zone_load_balancing);
		ELBAttachmentAttributes.setElba_elb_health_check(elba_elb_health_check);
		ELBAttachmentAttributes.setElba_elb_idle_timeout(elba_elb_idle_timeout);
		ELBAttachmentAttributes.setElba_elb_instances(elba_elb_instances);
		ELBAttachmentAttributes.setElba_elb_internal(elba_elb_internal);
		ELBAttachmentAttributes.setElba_elb_security_groups(elba_elb_security_groups);
		ELBAttachmentAttributes.setElba_elb_tags(elba_elb_tags);
		//ELB Attachment-instance
		ELBAttachmentAttributes.setElba_instance_envname(elba_instance_envname);
		ELBAttachmentAttributes.setElba_instance_rname(elba_instance_rname);
		ELBAttachmentAttributes.setElba_instance_connection(elba_instance_connection);
		ELBAttachmentAttributes.setElba_ami(elba_ami);
		ELBAttachmentAttributes.setElba_instance_key_name(elba_instance_key_name);
		ELBAttachmentAttributes.setElba_instance_type(elba_instance_type);
		ELBAttachmentAttributes.setElba_availability_zone(elba_availability_zone);
		ELBAttachmentAttributes.setElba_security_groups(elba_security_groups); 
		ELBAttachmentAttributes.setElba_vpc_security_group_id(elba_vpc_security_group_id); 
	    ELBAttachmentAttributes.setElba_instance_initiated(elba_instance_initiated); 
	    ELBAttachmentAttributes.setElba_source_dest_check(elba_source_dest_check);
	    ELBAttachmentAttributes.setElba_instance_subnet_id(elba_instance_subnet_id);
	    ELBAttachmentAttributes.setElba_instance_associate_public_ip_address(elba_instance_associate_public_ip_address);
	    ELBAttachmentAttributes.setElba_instance_disable_api_termination(elba_instance_disable_api_termination);
	    ELBAttachmentAttributes.setElba_instance_ebs_block_device(elba_instance_ebs_block_device);
	    ELBAttachmentAttributes.setElba_instance_ebs_optimized(elba_instance_ebs_optimized);
	    ELBAttachmentAttributes.setElba_instance_ephemeral_block_device(elba_instance_ephemeral_block_device); 
	    ELBAttachmentAttributes.setElba_instance_iam_instance_profile(elba_instance_iam_instance_profile);
	    ELBAttachmentAttributes.setElba_instance_monitoring(elba_instance_monitoring); 
	    ELBAttachmentAttributes.setElba_instance_placement_group(elba_instance_placement_group);
	    ELBAttachmentAttributes.setElba_instance_private_ip(elba_instance_private_ip);
	    ELBAttachmentAttributes.setElba_instance_root_block_device(elba_instance_root_block_device);
	    ELBAttachmentAttributes.setElba_instance_tags(elba_instance_tags);
	    ELBAttachmentAttributes.setElba_instance_tenancy(elba_instance_tenancy);
	    ELBAttachmentAttributes.setElba_instance_user_data(elba_instance_user_data);
		
		
		//ELB Attachment-elba
	    ELBAttachmentAttributes.setElbas_rname(elbas_rname);
		ELBAttachmentAttributes.setElbas_elb(elbas_elb);
		ELBAttachmentAttributes.setElbas_instance(elbas_instance);
		ELBAttachmentAttributes.setElbas_dependson(elbas_dependson);
		ELBAttachmentAttributes.setElbas_connection(elbas_connection);
		
		 //ELBA Search element
		 ELBAttachmentAttributes.setElba_searchA(elba_searchA); 
		ELBAttachmentAttributes.setElba_renameELBA(elba_renameELBA);
		ELBAttachmentAttributes.setElba_sg_rname(elba_sg_rname);
		ELBAttachmentAttributes.setElba_sg_egress(elba_sg_egress);
		ELBAttachmentAttributes.setElba_sg_ingress(elba_sg_ingress);
		ELBAttachmentAttributes.setElba_sg_vpcid(elba_sg_vpcid);
		return ELBAttachmentAttributes;
		
	}
	
	public static void getReadPropertiesFile() {
		if(ELBAttachmentAttributes == null || ELBAttachmentAttributes ==null){
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
