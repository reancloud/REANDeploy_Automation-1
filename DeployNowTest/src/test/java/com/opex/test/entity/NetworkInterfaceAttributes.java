package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class NetworkInterfaceAttributes {

	String networkInterface_rname;
	String networkInterface_blankData;
	String networkInterface_depends_on;
	String networkInterface_con;
	String networkInterface_private_ips;
	String networkInterface_tags;
	String networkInterface_description;
	String networkInterface_subnetId;
	String networkInterface_attachement;
	String networkInterface_source_dest_check;
	String networkInterface_security_groups;
	String networkInterface_vpc_rname;
	String networkInterface_vpc_cidrBlock;
	String networkInterface_subnet_rname;
	String networkInterface_subnet_cidrBlock;		
	String networkInterface_subnet_VpcId;
	String networkInterface_subnet_availabilityZone;
	String networkInterface_subnet_map_public_ip_on_launch;
	
	public String getNnetworkInterface_rname() {
		return networkInterface_rname ;
	}
	public void setNetworkInterface_rname(String networkInterface_rname) {
		this.networkInterface_rname  = networkInterface_rname ;
	}
	public String getgetNnetworkInterface_depends_on() {
		return 	networkInterface_depends_on ;
	}
	public void setgetNnetworkInterface_depends_on(String networkInterface_depends_on) {
		this.networkInterface_depends_on  = networkInterface_depends_on ;
	}
	public String getNetworkInterface_con() {
		return networkInterface_con ;
	}
	public void setNetworkInterface_con(String networkInterface_con ) {
		this.networkInterface_con  = networkInterface_con ;
	}
	
	public String getNetworkInterface_blankData() {
		return networkInterface_blankData ;
	}
	public void setNetworkInterface_blankData(String networkInterface_blankData ) {
		this.networkInterface_blankData  = networkInterface_blankData ;
	}
	public String getNetworkInterface_private_ips() {
		return networkInterface_private_ips;
	}
	public void setNetworkInterface_private_ips(String networkInterface_private_ips ) {
		this.networkInterface_private_ips  = networkInterface_private_ips ;
	}
	public String getNetworkInterface_tags() {
		return networkInterface_tags;
	}
	public void setNetworkInterface_tags(String networkInterface_tags) {
		this.networkInterface_tags  = networkInterface_tags;
	}
	public String getNetworkInterface_description() {
		return networkInterface_description ;
	}
	public void setNetworkInterface_source_dest_check(String networkInterface_source_dest_check) {
		this.networkInterface_source_dest_check  = networkInterface_source_dest_check ;
	}
	public String getNetworkInterface_source_dest_check() {
		return networkInterface_source_dest_check ;
	}
	public void setNetworkInterface_description(String networkInterface_description ) {
		this.networkInterface_description  = networkInterface_description ;
	}
	public String getNetworkInterface_subnetId() {
		return networkInterface_subnetId ;
	}
	public void setNetworkInterface_subnetId(String networkInterface_subnetId) {
		this.networkInterface_subnetId  = networkInterface_subnetId ;
	}
	
	public String getNetworkInterface_attachement() {
		return networkInterface_attachement ;
	}
	public void setNetworkInterface_attachement(String networkInterface_attachement) {
		this.networkInterface_attachement = networkInterface_attachement ;
	}
	public String getNetworkInterface_security_groups() {
		return networkInterface_security_groups ;
	}
	public void setNetworkInterface_security_groups(String networkInterface_security_groups) {
		this.networkInterface_security_groups  = networkInterface_security_groups ;
	}
	public String getNnetworkInterface_vpc_rname() {
		return networkInterface_vpc_rname ;
	}
	public void setNetworkInterface_vpc_rname(String networkInterface_vpc_rname) {
		this.networkInterface_vpc_rname  = networkInterface_vpc_rname ;
	}
	public String getNetworkInterface_vpc_cidrBlock() {
		return networkInterface_vpc_cidrBlock ;
	}
	public void setNetworkInterface_vpc_cidrBlock(String networkInterface_vpc_cidrBlock) {
		this.networkInterface_vpc_cidrBlock = networkInterface_vpc_cidrBlock ;
	}
	
	public String getNnetworkInterface_subnet_rname() {
		return networkInterface_subnet_rname ;
	}
	public void setNetworkInterface_subnet_rname(String networkInterface_subnet_rname) {
		this.networkInterface_subnet_rname  = networkInterface_subnet_rname ;
	}
	
	public String getNetworkInterface_subnet_cidrBlock() {
		return networkInterface_subnet_cidrBlock ;
	}
	public void setNetworkInterface_subnet_cidrBlock(String networkInterface_subnet_cidrBlock) {
		this.networkInterface_subnet_cidrBlock = networkInterface_subnet_cidrBlock ;
	}
	public String getNetworkInterface_subnet_VpcId() {
		return networkInterface_subnet_VpcId ;
	}
	public void setNetworkInterface_subnet_VpcId(String networkInterface_subnet_VpcId) {
		this.networkInterface_subnet_VpcId = networkInterface_subnet_VpcId ;
	}
	public String getNetworkInterface_subnet_availabilityZone() {
		return networkInterface_subnet_availabilityZone ;
	}
	public void setNetworkInterface_subnet_availabilityZone(String networkInterface_subnet_availabilityZone) {
		this.networkInterface_subnet_availabilityZone = networkInterface_subnet_availabilityZone ;
	}
	public String getNetworkInterface_subnet_map_public_ip_on_launch() {
		return networkInterface_subnet_map_public_ip_on_launch ;
	}
	public void setNetworkInterface_subnet_map_public_ip_on_launch(String networkInterface_subnet_map_public_ip_on_launch) {
		this.networkInterface_subnet_map_public_ip_on_launch = networkInterface_subnet_map_public_ip_on_launch ;
	}
	
	private static Properties properties;
	private static NetworkInterfaceAttributes networkInterfaceDetails = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String NETWORKINTERFACE_RNAME = "networkInterface_rname";
	private static final String NETWORKINTERFACE_BLANKDATA = "networkInterface_blankData";
	private static final String NETWORKINTERFACE_DEPENDSON = "networkInterface_depends_on";
	private static final String NETWORKINTERFACE_CON = "networkInterface_con";
	private static final String NETWORKINTERFACE_PRIVATE_IPS = "networkInterface_private_ips";
	private static final String NETWORKINTERFACE_TAGS = "networkInterface_tags";
	private static final String NETWORKINTERFACE_DESCRIPTION = "networkInterface_description";
	private static final String NETWORKINTERFACE_SUBNET_ID = "networkInterface_subnetId";
	private static final String NETWORKINTERFACE_ATTACHMENT = "networkInterface_attachement";
	private static final String NETWORKINTERFACE_SOURCE_DEST_CHECK = "networkInterface_source_dest_check";
	private static final String NETWORKINTERFACE_SECURITY_GROUPS = "networkInterface_security_groups";
	private static final String NETWORKINTERFACE_VPC_RNAME = "networkInterface_vpc_rname";
	private static final String NETWORKINTERFACE_VPC_CIDR_BLOCK = "networkInterface_vpc_cidrBlock";
	private static final String NETWORKINTERFACE_SUBNET_RNAME = "networkInterface_subnet_rname";
	private static final String NETWORKINTERFACE_SUBNET_CIDR_BLOCK = "networkInterface_subnet_cidrBlock";
	private static final String NETWORKINTERFACE_SUBNET_VPC_ID = "networkInterface_subnet_VpcId";
	private static final String NETWORKINTERFACE_SUBNET_AVAILABILITY_ZONE = "networkInterface_subnet_availabilityZone";
	private static final String NETWORKINTERFACE_SUBNET_MAP_PUBLIC_IP_ON_LAUNCH = "networkInterface_subnet_map_public_ip_on_launch";
	

	
	
	
		public static NetworkInterfaceAttributes getNetworkInterfaceFromProperties(){
		
		NetworkInterfaceAttributes.getReadPropertiesFile();
		String networkInterface_rname = properties.getProperty(NETWORKINTERFACE_RNAME);
		String networkInterface_blankData = properties.getProperty(NETWORKINTERFACE_BLANKDATA);
		String networkInterface_depends_on = properties.getProperty(NETWORKINTERFACE_DEPENDSON);
		String networkInterface_con = properties.getProperty(NETWORKINTERFACE_CON);
		String networkInterface_private_ips = properties.getProperty(NETWORKINTERFACE_PRIVATE_IPS);
		String networkInterface_tags = properties.getProperty(NETWORKINTERFACE_TAGS);
		String networkInterface_description = properties.getProperty(NETWORKINTERFACE_DESCRIPTION);
		String networkInterface_subnetId = properties.getProperty(NETWORKINTERFACE_SUBNET_ID);
		String networkInterface_attachement = properties.getProperty(NETWORKINTERFACE_ATTACHMENT);
		String networkInterface_source_dest_check = properties.getProperty(NETWORKINTERFACE_SOURCE_DEST_CHECK);
		String networkInterface_security_groups = properties.getProperty(NETWORKINTERFACE_SECURITY_GROUPS);
		String networkInterface_vpc_rname = properties.getProperty(NETWORKINTERFACE_VPC_RNAME);
		String networkInterface_vpc_cidrBlock = properties.getProperty(NETWORKINTERFACE_VPC_CIDR_BLOCK);
		String networkInterface_subnet_rname = properties.getProperty(NETWORKINTERFACE_SUBNET_RNAME);
		String networkInterface_subnet_cidrBlock = properties.getProperty(NETWORKINTERFACE_SUBNET_CIDR_BLOCK);		
		String networkInterface_subnet_VpcId = properties.getProperty(NETWORKINTERFACE_SUBNET_VPC_ID);
		String networkInterface_subnet_availabilityZone = properties.getProperty(NETWORKINTERFACE_SUBNET_AVAILABILITY_ZONE);
		String networkInterface_subnet_map_public_ip_on_launch = properties.getProperty(NETWORKINTERFACE_SUBNET_MAP_PUBLIC_IP_ON_LAUNCH);
		
		
		networkInterfaceDetails = new NetworkInterfaceAttributes();
		networkInterfaceDetails.setNetworkInterface_rname(networkInterface_rname);
		networkInterfaceDetails.setNetworkInterface_blankData(networkInterface_blankData);
		networkInterfaceDetails.setgetNnetworkInterface_depends_on(networkInterface_depends_on);
		networkInterfaceDetails.setNetworkInterface_con(networkInterface_con);
		networkInterfaceDetails.setNetworkInterface_private_ips(networkInterface_private_ips);
		networkInterfaceDetails.setNetworkInterface_tags(networkInterface_tags);
		networkInterfaceDetails.setNetworkInterface_description(networkInterface_description);
		networkInterfaceDetails.setNetworkInterface_subnetId(networkInterface_subnetId);
		networkInterfaceDetails.setNetworkInterface_attachement(networkInterface_attachement);
		networkInterfaceDetails.setNetworkInterface_source_dest_check(networkInterface_source_dest_check);
		networkInterfaceDetails.setNetworkInterface_security_groups(networkInterface_security_groups);
		networkInterfaceDetails.setNetworkInterface_vpc_rname(networkInterface_vpc_rname);
		networkInterfaceDetails.setNetworkInterface_vpc_cidrBlock(networkInterface_vpc_cidrBlock);
		networkInterfaceDetails.setNetworkInterface_subnet_rname(networkInterface_subnet_rname);
		networkInterfaceDetails.setNetworkInterface_subnet_cidrBlock(networkInterface_subnet_cidrBlock);
		networkInterfaceDetails.setNetworkInterface_subnet_VpcId(networkInterface_subnet_VpcId);
		networkInterfaceDetails.setNetworkInterface_subnet_availabilityZone(networkInterface_subnet_availabilityZone);
		networkInterfaceDetails.setNetworkInterface_subnet_map_public_ip_on_launch(networkInterface_subnet_map_public_ip_on_launch);
		return networkInterfaceDetails;
	}
	public static void getReadPropertiesFile() {
		if(networkInterfaceDetails == null){
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
