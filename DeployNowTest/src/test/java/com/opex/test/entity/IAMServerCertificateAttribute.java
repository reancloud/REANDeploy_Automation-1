package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class IAMServerCertificateAttribute {

	String IAM_s_certificate_rname;
	String IAM_s_certificate_certificatebody;
	String IAM_s_certificate_private_key;
	String IAM_s_certificate_depends_on;
	String IAM_s_certificate_connection;
	String IAM_s_certificate_certificatechain;
	String IAM_s_certificate_name;
	String IAM_s_certificate_name_prefix;
	String IAM_s_certificate_path;
	
		public String getIAM_s_certificate_rname() {
			return IAM_s_certificate_rname;
		}
		public void setIAM_s_certificate_rname(String IAM_s_certificate_rname) {
			this.IAM_s_certificate_rname = IAM_s_certificate_rname;
		}
		public String getIAM_s_certificate_certificatebody() {
			return IAM_s_certificate_certificatebody;
		}
		public void setIAM_s_certificate_certificatebody(String IAM_s_certificate_certificatebody) {
			this.IAM_s_certificate_certificatebody = IAM_s_certificate_certificatebody;
		}
		public String getIAM_s_certificate_private_key() {
			return IAM_s_certificate_private_key;
		}
		public void setIAM_s_certificate_private_key(String IAM_s_certificate_private_key) {
			this.IAM_s_certificate_private_key = IAM_s_certificate_private_key;
		}
		public String getIAM_s_certificate_depends_on() {
			return IAM_s_certificate_depends_on;
		}
		public void setIAM_s_certificate_depends_on(String IAM_s_certificate_depends_on) {
			this.IAM_s_certificate_depends_on = IAM_s_certificate_depends_on;
		}
		public String getIAM_s_certificate_connection() {
			return IAM_s_certificate_connection;
		}
		public void setIAM_s_certificate_connection(String IAM_s_certificate_connection) {
			this.IAM_s_certificate_connection = IAM_s_certificate_connection;
		}
		public String getIAM_s_certificate_certificatechain() {
			return IAM_s_certificate_certificatechain;
		}
		public void setIAM_s_certificate_certificatechain(String IAM_s_certificate_certificatechain) {
			this.IAM_s_certificate_certificatechain = IAM_s_certificate_certificatechain;
		}
		public String getIAM_s_certificate_name() {
			return IAM_s_certificate_name;
		}
		public void setIAM_s_certificate_name(String IAM_s_certificate_name) {
			this.IAM_s_certificate_name = IAM_s_certificate_name;
		}
		public String getIAM_s_certificate_name_prefix() {
			return IAM_s_certificate_name_prefix;
		}
		public void setIAM_s_certificate_name_prefix(String IAM_s_certificate_name_prefix) {
			this.IAM_s_certificate_name_prefix = IAM_s_certificate_name_prefix;
		}
		
		public String getIAM_s_certificate_path() {
			return IAM_s_certificate_path;
		}
		public void setIAM_s_certificate_path(String IAM_s_certificate_path) {
			this.IAM_s_certificate_path = IAM_s_certificate_path;
		}
		
		
			
		private static Properties properties;
		private static IAMServerCertificateAttribute certificateAttribute = null;
		private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
		private static final String IAM_S_CERTIFICATE_RNAME="IAM_s_certificate_rname";
		private static final String IAM_S_CERTIFICATE_CERTIFICATEBODY ="IAM_s_certificate_certificatebody";
		private static final String IAM_S_CERTIFICATE_PRIVATE_KEY ="IAM_s_certificate_private_key";
		private static final String IAM_S_CERTIFICATE_DEPENDSON ="IAM_s_certificate_depends_on";
		private static final String IAM_S_CERTIFICATE_CONNECTION="IAM_s_certificate_connection";
		private static final String IAM_S_CERTIFICATE_CRTIFICATECHAIN ="IAM_s_certificate_certificatechain";
		private static final String IAM_S_CERTIFICATE_NAME ="IAM_s_certificate_name";
		private static final String IAM_S_CERTIFICATE_NAME_PREFIX ="IAM_s_certificate_name_prefix";
		private static final String IAM_S_CERTIFICATE_PATH ="IAM_s_certificate_path" ;
		
			

		public static IAMServerCertificateAttribute getIAM_Server_CertificateAttributeFromProperties(){
			
			certificateAttribute.getReadPropertiesFile();
			String IAM_s_certificate_rname = properties.getProperty(IAM_S_CERTIFICATE_RNAME);
			String IAM_s_certificate_certificatebody = properties.getProperty(IAM_S_CERTIFICATE_CERTIFICATEBODY);
			String IAM_s_certificate_private_key = properties.getProperty(IAM_S_CERTIFICATE_PRIVATE_KEY);
			String IAM_s_certificate_depends_on = properties.getProperty(IAM_S_CERTIFICATE_DEPENDSON);
			String IAM_s_certificate_connection=properties.getProperty(IAM_S_CERTIFICATE_CONNECTION);
			String IAM_s_certificate_certificatechain = properties.getProperty(IAM_S_CERTIFICATE_CRTIFICATECHAIN);
			String IAM_s_certificate_name = properties.getProperty(IAM_S_CERTIFICATE_NAME);
			String IAM_s_certificate_name_prefix = properties.getProperty(IAM_S_CERTIFICATE_NAME_PREFIX);
			String IAM_s_certificate_path = properties.getProperty(IAM_S_CERTIFICATE_PATH);
			
			certificateAttribute =new IAMServerCertificateAttribute();
			certificateAttribute.setIAM_s_certificate_rname(IAM_s_certificate_rname);
			certificateAttribute.setIAM_s_certificate_certificatebody(IAM_s_certificate_certificatebody);
			certificateAttribute.setIAM_s_certificate_private_key(IAM_s_certificate_private_key);
			certificateAttribute.setIAM_s_certificate_depends_on(IAM_s_certificate_depends_on);
			certificateAttribute.setIAM_s_certificate_connection(IAM_s_certificate_connection);
			certificateAttribute.setIAM_s_certificate_name(IAM_s_certificate_name);
			certificateAttribute.setIAM_s_certificate_name_prefix(IAM_s_certificate_name_prefix);
			certificateAttribute.setIAM_s_certificate_path(IAM_s_certificate_path);
			certificateAttribute.setIAM_s_certificate_certificatechain(IAM_s_certificate_certificatechain);
			return certificateAttribute;
			
			
				
			
		}
		
		public static void getReadPropertiesFile() {
			if(certificateAttribute == null){
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
