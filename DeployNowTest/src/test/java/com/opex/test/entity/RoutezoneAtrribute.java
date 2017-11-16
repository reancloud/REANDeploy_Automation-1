package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class RoutezoneAtrribute {

	String routezone_rname;
	String routezone_dependson;
	String routezone_connection;
	String routezone_comment;
	String routezone_delegation_set_id;
	String routezone_force_destroy;
	String routezone_tags;
	String routezone_vpc_id;
	String routezone_vpc_region;
	String routezone_vpc_resourceName;
	String routezone_vpc_cidr;
		
		public String getroutezone_rname() {
			return routezone_rname;
		}
		public void setroutezone_rname(String routezone_rname) {
			this.routezone_rname = routezone_rname;
		}
		
		public String getroutezone_dependson() {
			return routezone_dependson;
		}
		public void setroutezone_dependson(String routezone_dependson) {
			this.routezone_dependson = routezone_dependson;
		}
		
		public String getroutezone_connection() {
			return routezone_connection;
		}
		public void setroutezone_connection(String routezone_connection) {
			this.routezone_connection = routezone_connection;
		}
				
		public String getroutezone_comment() {
			return routezone_comment;
		}
		public void setroutezone_comment(String routezone_comment) {
			this.routezone_comment = routezone_comment;
		}
		
		public String getroutezone_delegation_set_id() {
			return routezone_delegation_set_id;
		}
		public void setroutezone_delegation_set_id(String routezone_delegation_set_id) {
			this.routezone_delegation_set_id = routezone_delegation_set_id;
		}

		public String getroutezone_force_destroy() {
			return routezone_force_destroy;
		}
		public void setroutezone_force_destroy(String routezone_force_destroy) {
			this.routezone_force_destroy = routezone_force_destroy;
		}
		public String getroutezone_tags() {
			return routezone_tags;
		}
		public void setroutezone_tags(String routezone_tags) {
			this.routezone_tags = routezone_tags;
		}
		
		public String getroutezone_vpc_id() {
			return routezone_vpc_id;
		}
		public void setroutezone_vpc_id(String routezone_vpc_id) {
			this.routezone_vpc_id = routezone_vpc_id;
		}
		public String getroutezone_vpc_region() {
			return routezone_vpc_region;
		}
		public void setroutezone_vpc_region(String routezone_vpc_region) {
			this.routezone_vpc_region = routezone_vpc_region;
		}
		public String getroutezone_vpc_resourceName() {
			return routezone_vpc_resourceName;
		}
		public void setroutezone_vpc_resourceName(String routezone_vpc_resourceName) {
			this.routezone_vpc_resourceName = routezone_vpc_resourceName;
		}
		public String getroutezone_vpc_cidr() {
			return routezone_vpc_cidr;
		}
		public void setroutezone_vpc_cidr(String routezone_vpc_cidr) {
			this.routezone_vpc_cidr = routezone_vpc_cidr;
		}		
		private static Properties properties;
		private static RoutezoneAtrribute routzoneAttribute = null;
		private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
		private static final String ROUTEZONE_RNAME ="routezone_rname";
		private static final String ROUTEZONE_DEPENDS_ON ="routezone_dependson" ;
		private static final String ROUTEZONE_CONNECTION="routezone_connection";
		private static final String ROUTEZONE_COMMENTS="routezone_comment"; 
		private static final String ROUTEZONE_DELEGATION_SET_ID="routezone_delegation_set_id";
		private static final String ROUTEZONE_FORCE_DESTROY="routezone_force_destroy"; 
		private static final String ROUTEZONE_TAGS ="routezone_tags";
		private static final String ROUTEZONE_VPC_ID ="routezone_vpc_id" ;
		private static final String ROUTEZONE_VPC_REGION="routezone_vpc_region";
		private static final String ROUTEZONE_VPC_RESOURCENAME="routezone_vpc_resourceName"; 
		private static final String ROUTEZONE_VPC_CIDR="routezone_vpc_cidr";
			

		public static RoutezoneAtrribute getRoutezoneAtrributeFromProperties(){
			
			routzoneAttribute.getreadPropertiesFile();
			
			String routezone_rname = properties.getProperty(ROUTEZONE_RNAME);
			String routezone_dependson = properties.getProperty(ROUTEZONE_DEPENDS_ON);
			String routezone_connection = properties.getProperty(ROUTEZONE_CONNECTION);
			String routezone_comment = properties.getProperty(ROUTEZONE_COMMENTS);
			String routezone_delegation_set_id= properties.getProperty(ROUTEZONE_DELEGATION_SET_ID);
			String routezone_force_destroy = properties.getProperty(ROUTEZONE_FORCE_DESTROY);
			String routezone_tags = properties.getProperty(ROUTEZONE_TAGS);
			String routezone_vpc_id = properties.getProperty(ROUTEZONE_VPC_ID);
			String routezone_vpc_region = properties.getProperty(ROUTEZONE_VPC_REGION);
			String routezone_vpc_resourceName = properties.getProperty(ROUTEZONE_VPC_RESOURCENAME);
			String routezone_vpc_cidr=properties.getProperty(ROUTEZONE_VPC_CIDR);
			
			routzoneAttribute=new RoutezoneAtrribute();
			routzoneAttribute.setroutezone_rname(routezone_rname);
			routzoneAttribute.setroutezone_dependson(routezone_dependson);
			routzoneAttribute.setroutezone_connection(routezone_connection);
			routzoneAttribute.setroutezone_comment(routezone_comment);
			routzoneAttribute.setroutezone_delegation_set_id(routezone_delegation_set_id);
			routzoneAttribute.setroutezone_force_destroy(routezone_force_destroy);
			routzoneAttribute.setroutezone_tags(routezone_tags);
			routzoneAttribute.setroutezone_vpc_id(routezone_vpc_id);
			routzoneAttribute.setroutezone_vpc_region(routezone_vpc_region);
			routzoneAttribute.setroutezone_vpc_resourceName(routezone_vpc_resourceName);
			routzoneAttribute.setroutezone_vpc_cidr(routezone_vpc_cidr);
			return routzoneAttribute;
		}
		
		public static void getreadPropertiesFile() {
			if(routzoneAttribute == null){
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
