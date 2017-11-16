package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.helpers.DataHelper;
import com.opex.test.utils.FileUtils;

public class DNVPCDHCPAttributes {
	String VPCDHCP_name;
	String VPCDHCP_Dname;
	String VPCDHCP_Dnameserver;
	String VPCDHCP_dependson;
	String VPCDHCP_connection;
	String VPCDHCP_netbios_name_servers;
	String VPCDHCP_netbios_node_type;
	String VPCDHCP_ntp_servers;
	String VPCDHCP_tags;
	
	public String getVPCDHCP_name() {
		return VPCDHCP_name;
	}
	public void setVPCDHCP_name(String VPCDHCP_name) {
		this.VPCDHCP_name = VPCDHCP_name;
	}
	public String getVPCDHCPdomain_name() {
		return VPCDHCP_Dname;
	}
	public void setVPCDHCPdomain_name(String VPCDHCP_Dname) {
		this.VPCDHCP_Dname = VPCDHCP_Dname;
	}
	public String getVPCDHCPdomain_name_server() {
		return VPCDHCP_Dnameserver;
	}
	public void setVPCDHCPdomain_name_server(String VPCDHCP_Dnameserver) {
		this.VPCDHCP_Dnameserver = VPCDHCP_Dnameserver;
	}
	public String getVPCDHCP_dependson() {
		return VPCDHCP_dependson;
	}
	public void setVPCDHCP_dependson(String VPCDHCP_dependson) {
		this.VPCDHCP_dependson = VPCDHCP_dependson;
	}
	public String getVPCDHCP_connection() {
		return VPCDHCP_connection;
	}
	public void setVPCDHCP_connection(String VPCDHCP_connection) {
		this.VPCDHCP_connection = VPCDHCP_connection;
	}
	public String getVPCDHCP_netbios_name_servers() {
		return VPCDHCP_netbios_name_servers;
	}
	public void setVPCDHCP_netbios_name_servers(String VPCDHCP_netbios_name_servers) {
		this.VPCDHCP_netbios_name_servers = VPCDHCP_netbios_name_servers;
	}
	public String getVPCDHCP_netbios_node_type() {
		return VPCDHCP_netbios_node_type;
	}
	public void setVPCDHCP_netbios_node_type(String VPCDHCP_netbios_node_type) {
		this.VPCDHCP_netbios_node_type = VPCDHCP_netbios_node_type;
	}
	public String getVPCDHCP_ntp_servers() {
		return VPCDHCP_ntp_servers;
	}
	public void setVPCDHCP_ntp_servers(String VPCDHCP_ntp_servers) {
		this.VPCDHCP_ntp_servers = VPCDHCP_ntp_servers;
	}
	public String getVPCDHCP_tags() {
		return VPCDHCP_tags;
	}
	public void setVPCDHCP_tags(String VPCDHCP_tags) {
		this.VPCDHCP_tags = VPCDHCP_tags;
	}

	private static Properties properties;
	private static DNVPCDHCPAttributes VPCDHCPDetails = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String VPCDHCP_DOMAINNAME = "VPCDHCP_Domainname";
	private static final String VPCDHCP_DOMAINSERVER= "VPCDHCP_Domainnameserver";
	private static final String VPCDHCP_DEPENDSON = "VPCDHCP_dependson";
	private static final String VPCDHCP_CONNECTION = "VPCDHCP_connection";
	private static final String VPCDHCP_NETBIOS_NAME_SERVERS = "VPCDHCP_netbios_name_servers";
	private static final String VPCDHCP_NETBIOS_NODE_TYPE ="VPCDHCP_netbios_node_type";
	private static final String VPCDHCP_NTP_SERVERS= "VPCDHCP_ntp_servers";
	private static final String VPCDHCP_TAGS = "VPCDHCP_tags";
	private static final String VPCDHCP_NAME = "VPCDHCP_name";
	
	public static DNVPCDHCPAttributes getVPCDHCPDetailsFromPropertiesFile() {
		VPCDHCPDetails.getReadPropertiesFile();
		String VPCDHCP_name =properties.getProperty(VPCDHCP_NAME);		
		String VPCDHCP_Domain_name = properties.getProperty(VPCDHCP_DOMAINNAME);
		String VPCDHCP_Domain_servername =properties.getProperty(VPCDHCP_DOMAINSERVER);
		String VPCDHCP_dependson = properties.getProperty(VPCDHCP_DEPENDSON);
		String VPCDHCP_connection =properties.getProperty(VPCDHCP_CONNECTION);
		String VPCDHCP_netbios_name_servers = properties.getProperty(VPCDHCP_NETBIOS_NAME_SERVERS);
		String VPCDHCP_ntp_servers =properties.getProperty(VPCDHCP_NTP_SERVERS);
		String VPCDHCP_tags =properties.getProperty(VPCDHCP_TAGS);
		String VPCDHCP_netbios_node_type=properties.getProperty(VPCDHCP_NETBIOS_NODE_TYPE);

		VPCDHCPDetails = new DNVPCDHCPAttributes();
		VPCDHCPDetails.setVPCDHCPdomain_name(VPCDHCP_Domain_name);
		VPCDHCPDetails.setVPCDHCPdomain_name_server(VPCDHCP_Domain_servername);
		VPCDHCPDetails.setVPCDHCP_connection(VPCDHCP_connection);
		VPCDHCPDetails.setVPCDHCP_dependson(VPCDHCP_dependson);
		VPCDHCPDetails.setVPCDHCP_netbios_name_servers(VPCDHCP_netbios_name_servers);
		VPCDHCPDetails.setVPCDHCP_netbios_node_type(VPCDHCP_netbios_node_type);
		VPCDHCPDetails.setVPCDHCP_ntp_servers(VPCDHCP_ntp_servers);
		VPCDHCPDetails.setVPCDHCP_tags(VPCDHCP_tags);
		VPCDHCPDetails.setVPCDHCP_name(VPCDHCP_name);
		return VPCDHCPDetails;
	}
		
		public static void getReadPropertiesFile() {
			if(VPCDHCPDetails == null){
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
