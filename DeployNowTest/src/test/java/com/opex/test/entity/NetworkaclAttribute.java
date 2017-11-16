package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class NetworkaclAttribute {
	String networlacl_Rname;
	String networlacl_egress;
	String networkacl_ingress;
	String networkacl_vpcid;
	String networkacl_dependson;
	String networkacl_connection;
	String networkacl_subnetid;
	String networkacl_vpc_resourceName;
	String networkacl_vpc_cidr;
	String networkacl_subnet1_resourceName;
	String networkacl_subnet1_cidr;
	String networkacl_subnet1_vpcid;
	String networkacl_subnet2_resourceName;
	String networkacl_subnet2_cidr;
	String networkacl_subnet2_vpcid;
	
	
		public String getnetworlacl_Rname() {
			return networlacl_Rname;
		}
		public void setnetworlacl_Rname(String networlacl_Rname) {
			this.networlacl_Rname = networlacl_Rname;
		}
		public String getnetworlacl_egress() {
			return networlacl_egress;
		}
		public void setnetworlacl_egress(String networlacl_egress) {
			this.networlacl_egress = networlacl_egress;
		}
		
		public String getnetworkacl_ingress() {
			return networkacl_ingress;
		}
		public void setnetworkacl_ingress(String networkacl_ingress) {
			this.networkacl_ingress = networkacl_ingress;
		}
		
		public String getnetworkacl_vpcid() {
			return networkacl_vpcid;
		}
		public void setnetworkacl_vpcid(String networkacl_vpcid) {
			this.networkacl_vpcid = networkacl_vpcid;
		}
				
		public String getnetworkacl_dependson() {
			return networkacl_dependson;
		}
		public void setnetworkacl_dependson(String networkacl_dependson) {
			this.networkacl_dependson = networkacl_dependson;
		}
		
		public String getnetworkacl_connection() {
			return networkacl_connection;
		}
		public void setnetworkacl_connection(String networkacl_connection) {
			this.networkacl_connection = networkacl_connection;
		}

		public String getnetworkacl_subnetid() {
			return networkacl_subnetid;
		}
		public void setnetworkacl_subnetid(String networkacl_subnetid) {
			this.networkacl_subnetid = networkacl_subnetid;
		}
		public String getnetworkacl_vpc_resourceName() {
			return networkacl_vpc_resourceName;
		}
		public void setnetworkacl_vpc_resourceName(String networkacl_vpc_resourceName) {
			this.networkacl_vpc_resourceName = networkacl_vpc_resourceName;
		}
		
		public String getnetworkacl_vpc_cidr() {
			return networkacl_vpc_cidr;
		}
		public void setnetworkacl_vpc_cidr(String networkacl_vpc_cidr) {
			this.networkacl_vpc_cidr = networkacl_vpc_cidr;
		}
		public String getnetworkacl_subnet1_resourceName() {
			return networkacl_subnet1_resourceName;
		}
		public void setnetworkacl_subnet1_resourceName(String networkacl_subnet1_resourceName) {
			this.networkacl_subnet1_resourceName = networkacl_subnet1_resourceName;
		}
		public String getnetworkacl_subnet1_cidr() {
			return networkacl_subnet1_cidr;
		}
		public void setnetworkacl_subnet1_cidr(String networkacl_subnet1_cidr) {
			this.networkacl_subnet1_cidr = networkacl_subnet1_cidr;
		}
				
		public String getnetworkacl_subnet1_vpcid() {
			return networkacl_subnet1_vpcid;
		}
		public void setnetworkacl_subnet1_vpcid(String networkacl_subnet1_vpcid) {
			this.networkacl_subnet1_vpcid = networkacl_subnet1_vpcid;
		}
		public String getnetworkacl_subnet2_resourceName() {
			return networkacl_subnet2_resourceName;
		}
		public void setnetworkacl_subnet2_resourceName(String networkacl_subnet2_resourceName) {
			this.networkacl_subnet2_resourceName = networkacl_subnet2_resourceName;
		}
		public String getnetworkacl_subnet2_cidr() {
			return networkacl_subnet2_cidr;
		}
		public void setnetworkacl_subnet2_cidr(String networkacl_subnet2_cidr) {
			this.networkacl_subnet2_cidr = networkacl_subnet2_cidr;
		}

		public String getnetworkacl_subnet2_vpcid() {
			return networkacl_subnet2_vpcid;
		}
		public void setnetworkacl_subnet2_vpcid(String networkacl_subnet2_vpcid) {
			this.networkacl_subnet2_vpcid = networkacl_subnet2_vpcid;
		}
		
		private static Properties properties;
		private static NetworkaclAttribute NetworkaclAttribute = null;
		private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
		private static final String NETWORKACL_RNAME = "networlacl_Rname";
		private static final String NETWORKACL_EGRESS ="networlacl_egress";
		private static final String NETWORKACL_INGRESS ="networkacl_ingress" ;
		private static final String NETWORKACL_VPCID="networkacl_vpcid";
		private static final String NETWORKACL_DEPENDSON="networkacl_dependson"; 
		private static final String NETWORKACL_CONNECTION="networkacl_connection";
		private static final String NETWORKACL_SUBNETID="networkacl_subnetid"; 
		private static final String NETWORKACL_VPC_RNAME ="networkacl_vpc_resourceName";
		private static final String NETWORKACL_VPC_CIDR ="networkacl_vpc_cidr" ;
		private static final String NETWORKACL_SUBNET1_RNAME="networkacl_subnet1_resourceName";
		private static final String NETWORKACL_SUBNET1_CIDR="networkacl_subnet1_cidr"; 
		private static final String NETWORKACL_SUBNET1_VPCID="networkacl_subnet1_vpcid";
		private static final String NETWORKACL_SUBNET2_RNAME="networkacl_subnet2_resourceName";
		private static final String NETWORKACL_SUBNET2_CIDR="networkacl_subnet2_cidr"; 
		private static final String NETWORKACL_SUBNET2_VPCID="networkacl_subnet2_vpcid";
		
		

		public static NetworkaclAttribute getNetworkACLAttributesFromProperties(){
			
			NetworkaclAttribute.getReadPropertiesFile();
			String networlacl_Rname = properties.getProperty(NETWORKACL_RNAME);
			String networlacl_egress = properties.getProperty(NETWORKACL_EGRESS);
			String networkacl_ingress = properties.getProperty(NETWORKACL_INGRESS);
			String networkacl_vpcid = properties.getProperty(NETWORKACL_VPCID);
			String networkacl_dependson = properties.getProperty(NETWORKACL_DEPENDSON);
			String networkacl_connection= properties.getProperty(NETWORKACL_CONNECTION);
			String networkacl_subnetid = properties.getProperty(NETWORKACL_SUBNETID);
			String networkacl_vpc_resourceName = properties.getProperty(NETWORKACL_VPC_RNAME);
			String networkacl_vpc_cidr = properties.getProperty(NETWORKACL_VPC_CIDR);
			String networkacl_subnet1_resourceName = properties.getProperty(NETWORKACL_SUBNET1_RNAME);
			String networkacl_subnet1_cidr = properties.getProperty(NETWORKACL_SUBNET1_CIDR);
			String networkacl_subnet1_vpcid= properties.getProperty(NETWORKACL_SUBNET1_VPCID);
			String networkacl_subnet2_resourceName = properties.getProperty(NETWORKACL_SUBNET2_RNAME);
			String networkacl_subnet2_cidr = properties.getProperty(NETWORKACL_SUBNET2_CIDR);
			String networkacl_subnet2_vpcid= properties.getProperty(NETWORKACL_SUBNET2_VPCID);
			
			NetworkaclAttribute=new NetworkaclAttribute();
			NetworkaclAttribute.setnetworlacl_Rname(networlacl_Rname);
			NetworkaclAttribute.setnetworlacl_egress(networlacl_egress);
			NetworkaclAttribute.setnetworkacl_ingress(networkacl_ingress);
			NetworkaclAttribute.setnetworkacl_vpcid(networkacl_vpcid);
			NetworkaclAttribute.setnetworkacl_dependson(networkacl_dependson);
			NetworkaclAttribute.setnetworkacl_connection(networkacl_connection);
			NetworkaclAttribute.setnetworkacl_subnetid(networkacl_subnetid);
			NetworkaclAttribute.setnetworkacl_vpc_resourceName(networkacl_vpc_resourceName);
			NetworkaclAttribute.setnetworkacl_vpc_cidr(networkacl_vpc_cidr);
			NetworkaclAttribute.setnetworkacl_subnet1_resourceName(networkacl_subnet1_resourceName);
			NetworkaclAttribute.setnetworkacl_subnet1_cidr(networkacl_subnet1_cidr);
			NetworkaclAttribute.setnetworkacl_subnet1_vpcid(networkacl_subnet1_vpcid);
			NetworkaclAttribute.setnetworkacl_subnet2_resourceName(networkacl_subnet2_resourceName);
			NetworkaclAttribute.setnetworkacl_subnet2_cidr(networkacl_subnet2_cidr);
			NetworkaclAttribute.setnetworkacl_subnet2_vpcid(networkacl_subnet2_vpcid);
			return NetworkaclAttribute;
			
			
				
			
		}
		
		public static void getReadPropertiesFile() {
			if(NetworkaclAttribute == null){
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
