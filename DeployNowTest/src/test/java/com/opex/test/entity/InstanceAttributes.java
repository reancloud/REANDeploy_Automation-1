package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;


public class InstanceAttributes {

	//Instance test data
	String ami;
	String instance_key_name;
	String instance_type;
	String availability_zone;
	String security_groups;
	String vpc_security_group_id;
	String resource_source_dest_check;
	String instance_initiated;
	String instance_envname;
    String instance_rname;
	String instance_connection;
	String instance_dependsOn;
	
	String instance_associate_public_ip_address;
	String instance_disable_api_termination;
	String instance_ebs_block_service;
	String instance_ebs_optimized;
	String instance_ephemeral_block_device;
	String instance_iam_instance_profile;
	String instance_monitoring;
	String instance_placement_group;
	String instance_private_ip;
	String instance_root_block_device;
	String instance_tags;
	String instance_tenancy;
	String instance_user_data;
	String instance_subnetid;
	//Instance -> Security Group test data
	String instance_sg_ingress;
	String instance_sg_vpcid;
	String instance_sg_rname;
	//Instance -> Subnet test data
	String instance_subnet_cidr;
	String instance_subnet_vpcid;
	String instance_subnet_rname;
	//Instance -> Vpc test data
	String instance_vpc_cidr;
	String instance_vpc_rname;
	
	//For import
	String instance_tags_import;
	//Instance 
	public String getInstance_envname(){
		return instance_envname;
	}
	public void setInstance_envname(String instance_envname) {
		this.instance_envname = instance_envname;
	}
	public String getInstance_rname(){
		return instance_rname;
	}
	public void setInstance_rname(String instance_rname) {
		this.instance_rname = instance_rname;
	}
	public String getInstance_connection(){
		return instance_connection;
	}
	public void setInstance_connection(String instance_connection) {
		this.instance_connection = instance_connection;
	}
	public String getInstance_dependsOn(){
		return instance_dependsOn;
	}
	public void setInstance_dependsOn(String instance_dependsOn) {
		this.instance_dependsOn = instance_dependsOn;
	}
	
	public String getAmi(){
		return ami;
	}
	public void setAmi(String ami) {
		this.ami = ami;
	}

	public String getInstance_key_name() {
		return instance_key_name;
	}
	public void setInstance_key_name(String instance_key_name) {
		this.instance_key_name = instance_key_name;
	}

	public String getInstance_type() {
		return instance_type;
	}
	public void setInstance_type(String instance_type) {
		this.instance_type = instance_type;
	}

	public String getAvailabilityZone() {
		return availability_zone;
	}
	public void setAvailabilityZone(String availability_zone) {
		this.availability_zone = availability_zone;
	}
	public String getSecurityGroups() {
		return security_groups;
	}
	public void setSecurityGroups(String security_groups) {
		this.security_groups = security_groups;
	}

	public String getVPCSecurityGroupsId() {
		return vpc_security_group_id;
	}
	public void setVPCSecurityGroupsId(String vpc_security_group_id) {
		this.vpc_security_group_id = vpc_security_group_id;
	}

	public String getInstanceInitiated() {
		return instance_initiated;
	}
	public void setInstanceIntiated(String instance_initiated) {
		this.instance_initiated = instance_initiated;
	}

	public String getInstanceAssociatePublicIp() {
		return instance_associate_public_ip_address;
	}
	public void setInstanceAssociatePublicIp(String instance_associate_public_ip_address) {
		this.instance_associate_public_ip_address = instance_associate_public_ip_address;
	}
	
	public String getResourceSourceDestCheck() {
		return resource_source_dest_check;
	}
	public void setResourceSourceDestCheck(String resource_source_dest_check) {
		this.resource_source_dest_check = resource_source_dest_check;
	}
	
	public String getInstanceDisableApiTermination() {
		return instance_disable_api_termination;
	}
	public void setInstanceDisableApiTermination(String instance_disable_api_termination) {
		this.instance_disable_api_termination = instance_disable_api_termination;
	}
	
	public String getEbsBlockService() {
		return instance_ebs_block_service;
	}
	public void setEbsBlockService(String instance_ebs_block_service) {
		this.instance_ebs_block_service = instance_ebs_block_service;
	}
	
	public String getInstanceEbsOptimized() {
		return instance_ebs_optimized;
	}
	public void setInstanceEbsOptimized(String instance_ebs_optimized) {
		this.instance_ebs_optimized = instance_ebs_optimized;
	}
	
	public String getInstanceEphemeralBlockDevice() {
		return instance_ephemeral_block_device;
	}
	public void setInstanceEphemeralBlockDevice(String instance_ephemeral_block_device) {
		this.instance_ephemeral_block_device = instance_ephemeral_block_device;
	}
	
	public String getInstanceIamInstanceProfile() {
		return instance_iam_instance_profile;
	}
	public void setInstanceIamInstanceProfile(String instance_iam_instance_profile) {
		this.instance_iam_instance_profile = instance_iam_instance_profile;
	}
	
	public String getInstanceMonitoring() {
		return instance_monitoring;
	}
	public void setInstanceMonitoring(String instance_monitoring) {
		this.instance_monitoring = instance_monitoring;
	}
	
	public String getInstancePlacementGroup() {
		return instance_placement_group;
	}
	public void setInstancePlacementGroup(String instance_placement_group) {
		this.instance_placement_group = instance_placement_group;
	}
	
	public String getInstancePrivateIp() {
		return instance_private_ip;
	}
	public void setInstancePrivateIp(String instance_private_ip) {
		this.instance_private_ip = instance_private_ip;
	}
	
	public String getInstanceRootBlockDevice() {
		return instance_root_block_device;
	}
	public void setInstanceRootBlockDevice(String instance_root_block_device) {
		this.instance_root_block_device = instance_root_block_device;
	}
	
	public String getInstanceTags() {
		return instance_tags;
	}
	public void setInstanceTags(String instance_tags) {
		this.instance_tags = instance_tags;
	}
	
	public String getInstanceTagsImport() {
		return instance_tags_import;
	}
	public void setInstanceTagsImport(String instance_tags_import) {
		this.instance_tags_import = instance_tags_import;
	}
	
	public String getInstanceTenancy() {
		return instance_tags;
	}
	public void setInstanceTenancy(String instance_tags) {
		this.instance_tags = instance_tags;
	}
	
	public String getInstanceUserData() {
		return instance_user_data;
	}
	public void setInstanceUserData(String instance_user_data) {
		this.instance_user_data = instance_user_data;
	}
	
	public String getInstanceSubnetId() {
		return instance_subnetid;
	}
	public void setInstanceSubnetId(String instance_subnetid) {
		this.instance_subnetid = instance_subnetid;
	}
	
	//Instance -> security group
	public String getInstanceSg_rname() {
		return instance_sg_rname;
	}
	public void setInstanceSg_rname(String instance_sg_rname) {
		this.instance_sg_rname = instance_sg_rname;
	}
	
	public String getInstanceSg_ingress() {
		return instance_sg_ingress;
	}
	public void setInstanceSg_ingress(String instance_sg_ingress) {
		this.instance_sg_ingress = instance_sg_ingress;
	}
	
	public String getInstanceSg_vpcid() {
		return instance_sg_vpcid;
	}
	public void setInstanceSg_vpcid(String instance_sg_vpcid) {
		this.instance_sg_vpcid = instance_sg_vpcid;
	}
	//Instance -> subnet
	
	public String getInstanceSubnet_rname() {
		return instance_subnet_rname;
	}
	public void setInstanceSubnet_rname(String instance_subnet_rname) {
		this.instance_subnet_rname = instance_subnet_rname;
	}
	public String getInstanceSubnet_vpcid() {
		return instance_subnet_vpcid;
	}
	public void setInstanceSubnet_vpcid(String instance_subnet_vpcid) {
		this.instance_subnet_vpcid = instance_subnet_vpcid;
	}
	public String getInstanceSubnet_cidr() {
		return instance_subnet_cidr;
	}
	public void setInstanceSubnet_cidr(String instance_subnet_cidr) {
		this.instance_subnet_cidr = instance_subnet_cidr;
	}
	//Instance -> Vpc
	public String getInstanceVpc_rname() {
		return instance_vpc_rname;
	}
	public void setInstanceVpc_rname(String instance_vpc_rname) {
		this.instance_vpc_rname = instance_vpc_rname;
	}
	public String getInstanceVpc_cidr() {
		return instance_vpc_cidr;
	}
	public void setInstanceVpc_cidr(String instance_vpc_cidr) {
		this.instance_vpc_cidr = instance_vpc_cidr;
	}
	private static Properties properties;
	private static InstanceAttributes instanceAttributes = null;
	//Instance
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String INSTANCE_ENVNAME = "instance_envname";
	private static final String INSTANCE_RNAME = "instance_rname";
	private static final String INSTANCE_CONNECTION = "instance_connectio";
	private static final String INSTANCE_DEPENDSON = "instance_dependsOn";
	private static final String AMI = "ami";
	private static final String INSTANCE_KEY_NAME = "instance_key_name";
	private static final String INSTANCE_TYPE = "instance_type";
	private static final String AVAILABILITY_ZONE = "availability_zone";
	private static final String SECURITY_GROUPS = "security_groups";
	private static final String VPC_SECURITY_GROUP_ID = "vpc_security_group_id";
	private static final String INSTANCE_INITIATED = "instance_initiated";
	private static final String RESOURCE_SOURCE_DEST_CHECK = "resource_source_dest_check";	
	private static final String INSTANCE_ASSOCITE_PUBLIC_IP_ADDRESS = "instance_associate_public_ip_address";
	private static final String INSTANCE_DISABLE_API_TERMINATION = "instance_disable_api_termination";
	private static final String INSTANCE_EBS_BLOCK_SERVICE = "instance_ebs_block_service";
	private static final String INSTANCE_EBS_OPTIMIZED = "instance_ebs_optimized";
	private static final String INSTANCE_EPHEMERAL_BLOCK_DEVICE = "instance_ephemeral_block_device";
	private static final String INSTANCE_IAM_INSTANCE_PROFILE = "instance_iam_instance_profile";
	private static final String INSTANCE_MONITORING = "instance_monitoring";
	private static final String INSTANCE_PLACEMENT_GROUP = "instance_placement_group";
	private static final String INSTANCE_PRIVATE_IP = "instance_private_ip";
	private static final String INSTANCE_ROOT_BLOCK_DEVICE = "instance_root_block_device";
	private static final String INSTANCE_TAGS = "instance_tags";
	private static final String INSTANCE_TENANCY = "instance_tenancy";
	private static final String INSTANCE_USERDATA = "instance_user_data";
	private static final String INSTANCE_SUBNETID = "instance_subnetid";
	
	//Instance -> Security Group
	private static final String INSTANCE_SG_INGRESS = "instance_sg_ingress"; 
	private static final String INSTANCE_SG_VPCID = "instance_sg_vpcid";
	private static final String	INSTANCE_SG_RNAME = "instance_sg_rname";

	//Instance -> Subnet test data
	private static final String INSTANCE_SUBNET_CIDR = "instance_subnet_cidr";
	private static final String INSTANCE_SUBNET_VPCID = "instance_subnet_vpcid";
	private static final String INSTANCE_SUBNET_RNAME = "instance_subnet_rname";
	//Instance -> Vpc test data
	private static final String INSTANCE_VPC_CIDR = "instance_vpc_cidr";
	private static final String INSTANCE_VPC_RNAME = "instance_vpc_rname";
	//For Import
	private static final String INSTANCE_TAGS_IMPORT = "instance_tags_import";
	
	public static InstanceAttributes getInstanceAttributesFromProperties() {

		InstanceAttributes.getReadPropertiesFile();
		//Instance
		String instance_envname = properties.getProperty(INSTANCE_ENVNAME);
		String ami = properties.getProperty(AMI);
		String instance_key_name = properties.getProperty(INSTANCE_KEY_NAME);
		String instance_type = properties.getProperty(INSTANCE_TYPE);
		String availability_zone = properties.getProperty(AVAILABILITY_ZONE);
		String security_groups = properties.getProperty(SECURITY_GROUPS);
		String vpc_security_group_id = properties.getProperty(VPC_SECURITY_GROUP_ID);
		String instance_initiated = properties.getProperty(INSTANCE_INITIATED);
		String resource_source_dest_check = properties.getProperty(RESOURCE_SOURCE_DEST_CHECK);
		String instance_rname = properties.getProperty(INSTANCE_RNAME);
		String instance_connection = properties.getProperty(INSTANCE_CONNECTION);
		String instance_dependsOn = properties.getProperty(INSTANCE_DEPENDSON);
		String instance_associate_public_ip_address = properties.getProperty(INSTANCE_ASSOCITE_PUBLIC_IP_ADDRESS);
		String instance_disable_api_termination = properties.getProperty(INSTANCE_DISABLE_API_TERMINATION);
		String instance_ebs_block_service = properties.getProperty(INSTANCE_EBS_BLOCK_SERVICE);
		String instance_ebs_optimized = properties.getProperty(INSTANCE_EBS_OPTIMIZED);
		String instance_ephemeral_block_device = properties.getProperty(INSTANCE_EPHEMERAL_BLOCK_DEVICE);
		String instance_iam_instance_profile = properties.getProperty(INSTANCE_IAM_INSTANCE_PROFILE);
		String instance_monitoring = properties.getProperty(INSTANCE_MONITORING);
		String instance_placement_group = properties.getProperty(INSTANCE_PLACEMENT_GROUP);
		String instance_private_ip = properties.getProperty(INSTANCE_PRIVATE_IP);
		String instance_root_block_device = properties.getProperty(INSTANCE_ROOT_BLOCK_DEVICE);
		String instance_tags = properties.getProperty(INSTANCE_TAGS);
		String instance_tenancy = properties.getProperty(INSTANCE_TENANCY);
		String instance_user_data = properties.getProperty(INSTANCE_USERDATA);
		String instance_subnetid = properties.getProperty(INSTANCE_SUBNETID);
		//Instance ->Security Group
		String instance_sg_ingress = properties.getProperty(INSTANCE_SG_INGRESS);
		String instance_sg_vpcid = properties.getProperty(INSTANCE_SG_VPCID);
		String instance_sg_rname = properties.getProperty(INSTANCE_SG_RNAME);
		//Instance ->Subnet
		String instance_subnet_cidr = properties.getProperty(INSTANCE_SUBNET_CIDR);
		String instance_subnet_vpcid = properties.getProperty(INSTANCE_SUBNET_VPCID);
		String instance_subnet_rname = properties.getProperty(INSTANCE_SUBNET_RNAME);
		//Instance ->Vpc
		String instance_vpc_cidr = properties.getProperty(INSTANCE_VPC_CIDR);
		String instance_vpc_rname = properties.getProperty(INSTANCE_VPC_RNAME);
		//For Import
		String instance_tags_import = properties.getProperty(INSTANCE_TAGS_IMPORT); 
		
		instanceAttributes = new InstanceAttributes();
		//Instance
		instanceAttributes.setInstance_envname(instance_envname);
		instanceAttributes.setAmi(ami);
		instanceAttributes.setInstance_key_name(instance_key_name);
		instanceAttributes.setInstance_type(instance_type);
		instanceAttributes.setAvailabilityZone(availability_zone);
		instanceAttributes.setSecurityGroups(security_groups);
		instanceAttributes.setVPCSecurityGroupsId(vpc_security_group_id);
		instanceAttributes.setInstanceIntiated(instance_initiated);
		instanceAttributes.setResourceSourceDestCheck(resource_source_dest_check);
		instanceAttributes.setInstance_connection(instance_connection);
		instanceAttributes.setInstance_dependsOn(instance_dependsOn);
		instanceAttributes.setInstance_rname(instance_rname);
		instanceAttributes.setInstanceAssociatePublicIp(instance_associate_public_ip_address);
		instanceAttributes.setInstanceDisableApiTermination(instance_disable_api_termination);
		instanceAttributes.setEbsBlockService(instance_ebs_block_service);
		instanceAttributes.setInstanceEbsOptimized(instance_ebs_optimized);
		instanceAttributes.setInstanceEphemeralBlockDevice(instance_ephemeral_block_device);
		instanceAttributes.setInstanceIamInstanceProfile(instance_iam_instance_profile);
		instanceAttributes.setInstanceMonitoring(instance_monitoring);
		instanceAttributes.setInstancePlacementGroup(instance_placement_group);
		instanceAttributes.setInstancePrivateIp(instance_private_ip);
		instanceAttributes.setInstanceRootBlockDevice(instance_root_block_device);
		instanceAttributes.setInstanceTags(instance_tags);
		instanceAttributes.setInstanceTenancy(instance_tags);
		instanceAttributes.setInstanceUserData(instance_user_data);
		instanceAttributes.setInstanceSubnetId(instance_subnetid);
		//Instance -> Security Group
		instanceAttributes.setInstanceSg_ingress(instance_sg_ingress);
		instanceAttributes.setInstanceSg_vpcid(instance_sg_vpcid);
		instanceAttributes.setInstanceSg_rname(instance_sg_rname);
		//Instance -> Subnet
		instanceAttributes.setInstanceSubnet_cidr(instance_subnet_cidr);
		instanceAttributes.setInstanceSubnet_vpcid(instance_subnet_vpcid);
		instanceAttributes.setInstanceSubnet_rname(instance_subnet_rname);
		//Instance -> Vpc
		instanceAttributes.setInstanceVpc_cidr(instance_vpc_cidr);
		instanceAttributes.setInstanceVpc_rname(instance_vpc_rname);
		instanceAttributes.setInstanceTagsImport(instance_tags_import);
		return instanceAttributes;
	}

	
		public static void getReadPropertiesFile() {
		if(instanceAttributes == null){
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

