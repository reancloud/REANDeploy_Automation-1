package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class VPCAttributes {
	String vpc_Rname;
	String vpc_cidrblock;
	String vpc_dependsOn;
	String vpc_connection;
	String vpc_enableClassicLink;
	String vpc_enableHostname;
	String vpc_enableDnssupport;
	String vpc_instancetenancy;
	
	public String getVpc_Rname() {
		return vpc_Rname;
	}
	public void setVpc_Rname(String vpc_Rname) {
		this.vpc_Rname = vpc_Rname;
	}

	public String getVpc_Cidrblock() {
		return vpc_cidrblock;
	}
	public void setVpc_Cidrblock(String vpc_cidrblock) {
		this.vpc_cidrblock = vpc_cidrblock;
	}

	public String getVpc_dependsOn() {
		return vpc_dependsOn;
	}
	public void setVpc_dependsOn(String vpc_dependsOn) {
		this.vpc_dependsOn = vpc_dependsOn;
	}

	public String getVpc_connection() {
		return vpc_connection;
	}
	public void setVpc_connection(String vpc_connection) {
		this.vpc_connection = vpc_connection;
	}

	public String getVpc_enableClassicLink() {
		return vpc_enableClassicLink;
	}
	public void setVpc_enableClassicLink(String vpc_enableClassicLink) {
		this.vpc_enableClassicLink = vpc_enableClassicLink;
	}

	public String getVpc_enableHostname() {
		return vpc_enableHostname;
	}
	public void setVpc_enableHostname(String vpc_enableHostname) {
		this.vpc_enableHostname = vpc_enableHostname;
	}

	public String getVpc_enableDnssupport() {
		return vpc_enableDnssupport;
	}
	public void setVpc_enableDnssupport(String vpc_enableDnssupport) {
		this.vpc_enableDnssupport = vpc_enableDnssupport;
	}

	public String getVpc_instancetenancy() {
		return vpc_instancetenancy;
	}
	public void setVpc_instancetenancy(String vpc_instancetenancy) {
		this.vpc_instancetenancy = vpc_instancetenancy;
	}

	private static Properties properties;
	private static VPCAttributes VPCAttributes = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String VPC_RNAME="vpc_Rname";
	private static final String VPC_CIDRBLOCk="vpc_cidrblock";
	private static final String VPC_DEPENDSON="vpc_dependsOn";
	private static final String VPC_CONNECTION="vpc_connection";
	private static final String VPC_ENABLECLASSICLINK="vpc_enableClassicLink";
	private static final String VPC_ENABLEHOSTNAME="vpc_enableHostname";
	private static final String VPC_ENABLEDNSSUPPORT="vpc_enableDnssupport";
	private static final String VPC_INSTANCETENANCY="vpc_instancetenancy";

	public static VPCAttributes getVPCAttributesFromProperties(){

		VPCAttributes.getReadPropertiesFile();
		String vpc_Rname = properties.getProperty(VPC_RNAME);
		String vpc_cidrblock = properties.getProperty(VPC_CIDRBLOCk);
		String vpc_dependsOn = properties.getProperty(VPC_DEPENDSON);
		String vpc_connection = properties.getProperty(VPC_CONNECTION);
		String vpc_enableClassicLink = properties.getProperty(VPC_ENABLECLASSICLINK);
		String vpc_enableHostname = properties.getProperty(VPC_ENABLEHOSTNAME);
		String vpc_enableDnssupport = properties.getProperty(VPC_ENABLEDNSSUPPORT);
		String vpc_instancetenancy = properties.getProperty(VPC_INSTANCETENANCY);
		VPCAttributes = new VPCAttributes();
		VPCAttributes.setVpc_Rname(vpc_Rname);
		VPCAttributes.setVpc_Cidrblock(vpc_cidrblock);
		VPCAttributes.setVpc_dependsOn(vpc_dependsOn);
		VPCAttributes.setVpc_connection(vpc_connection);		
		VPCAttributes.setVpc_enableClassicLink(vpc_enableClassicLink);
		VPCAttributes.setVpc_enableHostname(vpc_enableHostname);
		VPCAttributes.setVpc_enableDnssupport(vpc_enableDnssupport);
		VPCAttributes.setVpc_instancetenancy(vpc_instancetenancy);	
		return VPCAttributes;

	}

	public static void getReadPropertiesFile() {
		if(VPCAttributes == null){
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