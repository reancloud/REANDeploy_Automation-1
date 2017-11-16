package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class NatgatewayAttributes {
	String natgateway_rname;
	String natgateway_allocationId;
	String natgateway_subnetId;
	String natgateway_dependsOn;
	String natgateway_networkInterfaceId;
	String natgateway_privateIp;
	String natgateway_publicIp;
	String natgateway_vpc_rname;
	String  natgateway_vpc_cidrblock;

	String natgateway_subnet1_rname;
	String natgateway_subnet1_cidr;
	String natgateway_subnet1_vpcid; 

	String natgateway_subnet2_rname;
	String natgateway_subnet2_cidr;
	String natgateway_subnet2_vpcid;

	String natgateway_Rtable1_rname;
	String natgateway_Rtable1_vpcid;
	String natgateway_Rtable1_json;

	String natgateway_Rtable2_rname;
	String natgateway_Rtable2_vpcid;
	String natgateway_Rtable2_json;

	String natgateway_IGW_rname;
	String natgateway_vpc_id;

	String natgateway_RTA_rname;
	String natgateway_RTA_routetable_id;
	String natgateway_RTA_subnetid;

	String natgateway_EIP_rname;

	public String getnatgateway_rname() {
		return natgateway_rname;
	}
	public void setnatgateway_rname(String natgateway_rname) {
		this.natgateway_rname = natgateway_rname;
	}

	public String getnatgateway_vpc_rname() {
		return natgateway_vpc_rname;
	}
	public void setnatgateway_vpc_rname(String natgateway_vpc_rname) {
		this.natgateway_vpc_rname = natgateway_vpc_rname;
	}

	public String getnatgateway_vpc_cidrblock() {
		return natgateway_vpc_cidrblock;
	}
	public void setnatgateway_vpc_cidrblock(String natgateway_vpc_cidrblock) {
		this.natgateway_vpc_cidrblock = natgateway_vpc_cidrblock;
	}

	public String getnatgateway_subnet1_rname() {
		return natgateway_subnet1_rname;
	}
	public void setnatgateway_subnet1_rname(String natgateway_subnet1_rname) {
		this.natgateway_subnet1_rname = natgateway_subnet1_rname;
	}

	public String getnatgateway_subnet1_cidr() {
		return natgateway_subnet1_cidr;
	}
	public void setnatgateway_subnet1_cidr(String natgateway_subnet1_cidr) {
		this.natgateway_subnet1_cidr = natgateway_subnet1_cidr;
	}

	public String getnatgateway_subnet1_vpcid() {
		return natgateway_subnet1_vpcid;
	}
	public void setnatgateway_subnet1_vpcid(String natgateway_subnet1_vpcid) {
		this.natgateway_subnet1_vpcid = natgateway_subnet1_vpcid;
	}
	public String getnatgateway_subnet2_rname() {
		return natgateway_subnet2_rname;
	}
	public void setnatgateway_subnet2_rname(String natgateway_subnet2_rname) {
		this.natgateway_subnet2_rname = natgateway_subnet2_rname;
	}

	public String getnatgateway_subnet2_cidr() {
		return natgateway_subnet2_cidr;
	}
	public void setnatgateway_subnet2_cidr(String natgateway_subnet2_cidr) {
		this.natgateway_subnet2_cidr = natgateway_subnet2_cidr;
	}

	public String getnatgateway_subnet2_vpcid() {
		return natgateway_subnet2_vpcid;
	}
	public void setnatgateway_subnet2_vpcid(String natgateway_subnet2_vpcid) {
		this.natgateway_subnet2_vpcid = natgateway_subnet2_vpcid;
	}

	public String getnatgateway_Rtable1_rname() {
		return natgateway_Rtable1_rname;
	}
	public void setnatgateway_Rtable1_rname(String natgateway_Rtable1_rname) {
		this.natgateway_Rtable1_rname = natgateway_Rtable1_rname;
	}

	public String getnatgateway_Rtable1_vpcid() {
		return natgateway_Rtable1_vpcid;
	}
	public void setnatgateway_Rtable1_vpcid(String natgateway_Rtable1_vpcid) {
		this.natgateway_Rtable1_vpcid = natgateway_Rtable1_vpcid;
	}

	public String getnatgateway_Rtable1_json() {
		return natgateway_Rtable1_json;
	}
	public void setnatgateway_Rtable1_json(String natgateway_Rtable1_json) {
		this.natgateway_Rtable1_json = natgateway_Rtable1_json;
	}
	public String getnatgateway_Rtable2_rname() {
		return natgateway_Rtable2_rname;
	}
	public void setnatgateway_Rtable2_rname(String natgateway_Rtable2_rname) {
		this.natgateway_Rtable2_rname = natgateway_Rtable2_rname;
	}

	public String getnatgateway_Rtable2_vpcid() {
		return natgateway_Rtable2_vpcid;
	}
	public void setnatgateway_Rtable2_vpcid(String natgateway_Rtable2_vpcid) {
		this.natgateway_Rtable2_vpcid = natgateway_Rtable2_vpcid;
	}

	public String getnatgateway_Rtable2_json() {
		return natgateway_Rtable2_json;
	}
	public void setnatgateway_Rtable2_json(String natgateway_Rtable2_json) {
		this.natgateway_Rtable2_json = natgateway_Rtable2_json;
	}

	public String getNatgateway_allocationId() {
		return natgateway_allocationId;
	}
	public void setNatgateway_allocationId(String natgateway_allocationId) {
		this.natgateway_allocationId = natgateway_allocationId;
	}

	public String getNatgateway_subnetId() {
		return natgateway_subnetId;
	}
	public void setNatgateway_subnetId(String natgateway_subnetId) {
		this.natgateway_subnetId = natgateway_subnetId;
	}

	public String getNatgateway_dependsOn() {
		return natgateway_dependsOn;
	}
	public void setNatgateway_dependsOn(String natgateway_dependsOn) {
		this.natgateway_dependsOn = natgateway_dependsOn;
	}

	public String getNatgateway_networkInterfaceId() {
		return natgateway_networkInterfaceId;
	}
	public void setNatgateway_networkInterfaceId(String natgateway_networkInterfaceId) {
		this.natgateway_networkInterfaceId = natgateway_networkInterfaceId;
	}

	public String getNatgateway_privateIp() {
		return natgateway_privateIp;
	}
	public void setNatgateway_privateIp(String natgateway_privateIp) {
		this.natgateway_privateIp = natgateway_privateIp;
	}

	public String getNatgateway_publicIp() {
		return natgateway_publicIp;
	}
	public void setNatgateway_publicIp(String natgateway_publicIp) {
		this.natgateway_publicIp = natgateway_publicIp;
	}
	public String getnatgateway_IGW_rname() {
		return natgateway_IGW_rname;
	}
	public void setnatgateway_IGW_rname(String natgateway_IGW_rname) {
		this.natgateway_IGW_rname = natgateway_IGW_rname;
	}
	public String getnatgateway_vpc_id() {
		return natgateway_vpc_id;
	}
	public void setnatgateway_vpc_id(String natgateway_vpc_id) {
		this.natgateway_vpc_id = natgateway_vpc_id;
	}
	public String getnatgateway_RTA_rname() {
		return natgateway_RTA_rname;
	}
	public void setnatgateway_RTA_rname(String natgateway_RTA_rname) {
		this.natgateway_RTA_rname = natgateway_RTA_rname;
	}
	public String getnatgateway_RTA_routetable_id() {
		return natgateway_RTA_routetable_id;
	}
	public void setnatgateway_RTA_routetable_id(String natgateway_RTA_routetable_id) {
		this.natgateway_RTA_routetable_id = natgateway_RTA_routetable_id;
	}
	public String getnatgateway_RTA_subnetid() {
		return natgateway_RTA_subnetid;
	}
	public void setnatgateway_RTA_subnetid(String natgateway_RTA_subnetid) {
		this.natgateway_RTA_subnetid = natgateway_RTA_subnetid;
	}
	public String getnatgateway_EIP_rname() {
		return natgateway_EIP_rname;
	}
	public void setnatgateway_EIP_rname(String natgateway_EIP_rname) {
		this.natgateway_EIP_rname = natgateway_EIP_rname;
	}
	private static Properties properties;
	private static NatgatewayAttributes NatgatewayAttributes = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String NATGATEWAY_ALLOCATIONID ="natgateway_allocationId";
	private static final String NATGATEWAY_SUBNETID ="natgateway_subnetId" ;
	private static final String NATGATEWAY_DEPENDSON="natgateway_dependsOn";
	private static final String NATGATEWAY_NETWORKINTERFACE="networkInterfaceId"; 
	private static final String NATGATEWAY_PRIVATEIP="natgateway_privateIp";
	private static final String NATGATEWAY_PUBLICIP="natgateway_publicIp"; 
	private static final String NATGATEWAY_RNAME ="natgateway_rname";
	private static final String NATGATEWAY_VPC_RNAME ="natgateway_vpc_rname" ;
	private static final String NATGATEWAY_VPC_CIDR="natgateway_vpc_cidrblock";
	private static final String NATGATEWAY_SUBNET1_RNAME="natgateway_subnet1_rname"; 
	private static final String NATGATEWAY_SUBNET1_CIDR="natgateway_subnet1_cidr";
	private static final String NATGATEWAY_SUBNET1_VPCID="natgateway_subnet1_vpcid"; 
	private static final String NATGATEWAY_SUBNET2_RNAME="natgateway_subnet2_rname";
	private static final String NATGATEWAY_SUBNET2_CIDR="natgateway_subnet2_cidr" ;
	private static final String NATGATEWAY_SUBNET2_VPCID="natgateway_subnet2_vpcid";
	private static final String NATGATEWAY_RTABLE1_RNAME="natgateway_Rtable1_rname"; 
	private static final String NATGATEWAY_RTABLE1_VPCID="natgateway_Rtable1_vpcid";
	private static final String NATGATEWAY_RTABLE1_JSON="natgateway_Rtable1_json"; 
	private static final String NATGATEWAY_RTABLE2_RNAME ="natgateway_Rtable2_rname";
	private static final String NATGATEWAY_RTABLE2_VPCID ="natgateway_Rtable2_vpcid" ;
	private static final String NATGATEWAY_RTABLE2_JSON="natgateway_Rtable2_json";
	private static final String NATGATEWAY_IGW_RNAME="natgateway_IGW_rname"; 
	private static final String NATGATEWAY_VPC_ID="natgateway_vpc_id";
	private static final String NATGATEWAY_RTA_RNAME="natgateway_RTA_rname"; 
	private static final String NATGATEWAY_RTA_ROUTETABLE_ID="natgateway_RTA_routetable_id" ;
	private static final String NATGATEWAY_RTA_SUBNETID="natgateway_RTA_subnetid";
	private static final String NATGATEWAY_EIP_RNAME="natgateway_EIP_rname"; 


	public static NatgatewayAttributes getNatgatewayAttributesFromProperties(){

		NatgatewayAttributes.getReadPropertiesFile();

		String natgateway_allocationId = properties.getProperty(NATGATEWAY_ALLOCATIONID);
		String natgateway_subnetId = properties.getProperty(NATGATEWAY_SUBNETID);
		String natgateway_dependsOn = properties.getProperty(NATGATEWAY_DEPENDSON);
		String natgateway_networkInterfaceId = properties.getProperty(NATGATEWAY_NETWORKINTERFACE);
		String natgateway_privateIp= properties.getProperty(NATGATEWAY_PRIVATEIP);
		String natgateway_publicIp = properties.getProperty(NATGATEWAY_PUBLICIP);
		String natgateway_rname = properties.getProperty(NATGATEWAY_RNAME);
		String natgateway_vpc_rname = properties.getProperty(NATGATEWAY_VPC_RNAME);
		String natgateway_vpc_cidrblock = properties.getProperty(NATGATEWAY_VPC_CIDR);
		String natgateway_subnet1_rname = properties.getProperty(NATGATEWAY_SUBNET1_RNAME);
		String natgateway_subnet1_cidr= properties.getProperty(NATGATEWAY_SUBNET1_CIDR);
		String natgateway_subnet1_vpcid = properties.getProperty(NATGATEWAY_SUBNET1_VPCID);
		String natgateway_subnet2_rname = properties.getProperty(NATGATEWAY_SUBNET2_RNAME);
		String natgateway_subnet2_cidr = properties.getProperty(NATGATEWAY_SUBNET2_CIDR);
		String natgateway_subnet2_vpcid = properties.getProperty(NATGATEWAY_SUBNET2_VPCID);
		String natgateway_Rtable1_rname = properties.getProperty(NATGATEWAY_RTABLE1_RNAME);
		String natgateway_Rtable1_vpcid= properties.getProperty(NATGATEWAY_RTABLE1_VPCID);
		String natgateway_Rtable1_json = properties.getProperty(NATGATEWAY_RTABLE1_JSON);
		String natgateway_Rtable2_rname = properties.getProperty(NATGATEWAY_RTABLE2_RNAME);
		String natgateway_Rtable2_vpcid = properties.getProperty(NATGATEWAY_RTABLE2_VPCID);
		String natgateway_Rtable2_json = properties.getProperty(NATGATEWAY_RTABLE2_JSON);
		String natgateway_IGW_rname = properties.getProperty(NATGATEWAY_IGW_RNAME);
		String natgateway_vpc_id= properties.getProperty(NATGATEWAY_VPC_ID);
		String natgateway_RTA_rname = properties.getProperty(NATGATEWAY_RTA_RNAME);
		String natgateway_RTA_routetable_id = properties.getProperty(NATGATEWAY_RTA_ROUTETABLE_ID);
		String natgateway_RTA_subnetid = properties.getProperty(NATGATEWAY_RTA_SUBNETID);
		String natgateway_EIP_rname = properties.getProperty(NATGATEWAY_EIP_RNAME);

		NatgatewayAttributes=new NatgatewayAttributes();
		NatgatewayAttributes.setNatgateway_allocationId(natgateway_allocationId);
		NatgatewayAttributes.setNatgateway_subnetId(natgateway_subnetId);
		NatgatewayAttributes.setNatgateway_dependsOn(natgateway_dependsOn);
		NatgatewayAttributes.setNatgateway_networkInterfaceId(natgateway_networkInterfaceId);
		NatgatewayAttributes.setNatgateway_privateIp(natgateway_privateIp);
		NatgatewayAttributes.setNatgateway_publicIp(natgateway_publicIp);
		NatgatewayAttributes.setnatgateway_rname(natgateway_rname);
		NatgatewayAttributes.setnatgateway_EIP_rname(natgateway_EIP_rname);
		NatgatewayAttributes.setnatgateway_IGW_rname(natgateway_IGW_rname);
		NatgatewayAttributes.setnatgateway_RTA_rname(natgateway_RTA_rname);
		NatgatewayAttributes.setnatgateway_RTA_routetable_id(natgateway_RTA_routetable_id);
		NatgatewayAttributes.setnatgateway_RTA_subnetid(natgateway_RTA_subnetid);
		NatgatewayAttributes.setnatgateway_Rtable1_json(natgateway_Rtable1_json);
		NatgatewayAttributes.setnatgateway_Rtable1_rname(natgateway_Rtable1_rname);
		NatgatewayAttributes.setnatgateway_Rtable1_vpcid(natgateway_Rtable1_vpcid);
		NatgatewayAttributes.setnatgateway_Rtable2_json(natgateway_Rtable2_json);
		NatgatewayAttributes.setnatgateway_Rtable2_rname(natgateway_Rtable2_rname);
		NatgatewayAttributes.setnatgateway_Rtable2_vpcid(natgateway_Rtable2_vpcid);
		NatgatewayAttributes.setnatgateway_subnet1_cidr(natgateway_subnet1_cidr);
		NatgatewayAttributes.setnatgateway_subnet1_rname(natgateway_subnet1_rname);
		NatgatewayAttributes.setnatgateway_subnet1_vpcid(natgateway_subnet1_vpcid);
		NatgatewayAttributes.setnatgateway_subnet2_cidr(natgateway_subnet2_cidr);
		NatgatewayAttributes.setnatgateway_subnet2_rname(natgateway_subnet2_rname);
		NatgatewayAttributes.setnatgateway_subnet2_vpcid(natgateway_subnet2_vpcid);
		NatgatewayAttributes.setnatgateway_vpc_id(natgateway_vpc_id);
		NatgatewayAttributes.setnatgateway_vpc_rname(natgateway_vpc_rname);
		NatgatewayAttributes.setnatgateway_vpc_cidrblock(natgateway_vpc_cidrblock);
		return NatgatewayAttributes;			

	}

	public static void getReadPropertiesFile() {
		if(NatgatewayAttributes == null){
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
