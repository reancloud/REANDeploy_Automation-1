package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class S3bucketAttribute {
	
	String s3bucket_bucket;
	String s3bucket_depends_on;
	String s3bucket_connection;
	String s3bucket_acl;
	String s3bucket_core_rule;
	String s3bucket_force_destroy;
	String s3bucket_lifecycle_rule;
	String s3bucket_policy;
	String s3bucket_tags;
	String s3bucket_website;
	String s3bucket_Rname;
		
		public String getS3bucket_bucket() {
			return s3bucket_bucket;
		}
		public void setS3bucket_bucket(String s3bucket_bucket) {
			this.s3bucket_bucket = s3bucket_bucket;
		}
		
		public String getS3bucket_depends_on() {
			return s3bucket_depends_on;
		}
		public void setS3bucket_depends_on(String s3bucket_depends_on) {
			this.s3bucket_depends_on = s3bucket_depends_on;
		}
		
		public String getS3bucket_connection() {
			return s3bucket_connection;
		}
		public void setS3bucket_connection(String s3bucket_connection) {
			this.s3bucket_connection = s3bucket_connection;
		}
				
		public String getS3bucket_acl() {
			return s3bucket_acl;
		}
		public void setS3bucket_acl(String s3bucket_acl) {
			this.s3bucket_acl = s3bucket_acl;
		}
		
		public String getS3bucket_core_rule() {
			return s3bucket_core_rule;
		}
		public void setS3bucket_core_rule(String s3bucket_core_rule) {
			this.s3bucket_core_rule = s3bucket_core_rule;
		}

		public String getS3bucket_force_destroy() {
			return s3bucket_force_destroy;
		}
		public void setS3bucket_force_destroy(String s3bucket_force_destroy) {
			this.s3bucket_force_destroy = s3bucket_force_destroy;
		}
		public String getS3bucket_lifecycle_rule() {
			return s3bucket_lifecycle_rule;
		}
		public void setS3bucket_lifecycle_rule(String s3bucket_lifecycle_rule) {
			this.s3bucket_lifecycle_rule = s3bucket_lifecycle_rule;
		}
		
		public String getS3bucket_policy() {
			return s3bucket_policy;
		}
		public void setS3bucket_policy(String s3bucket_policy) {
			this.s3bucket_policy = s3bucket_policy;
		}
		public String getS3bucket_tags() {
			return s3bucket_tags;
		}
		public void setS3bucket_tags(String s3bucket_tags) {
			this.s3bucket_tags = s3bucket_tags;
		}
		public String getS3bucket_website() {
			return s3bucket_website;
		}
		public void setS3bucket_website(String s3bucket_website) {
			this.s3bucket_website = s3bucket_website;
		}
		public String getS3bucket_Rname() {
			return s3bucket_Rname;
		}
		public void setS3bucket_Rname(String s3bucket_Rname) {
			this.s3bucket_Rname = s3bucket_Rname;
		}		
		private static Properties properties;
		private static S3bucketAttribute S3bucketAttribute = null;
		private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
		private static final String S3BUCKET_BUCKET ="s3bucket_bucket";
		private static final String S3BUCKET_DEPENDS_ON ="s3bucket_depends_on" ;
		private static final String S3BUCKET_CONNECTION="s3bucket_connection";
		private static final String S3BUCKET_ACL="s3bucket_acl"; 
		private static final String S3BUCKET_CORE_RULE="s3bucket_core_rule";
		private static final String S3BUCKET_FORCE_DESTROY="s3bucket_force_destroy"; 
		private static final String S3BUCKET_LIFECYCLE_RULE ="s3bucket_lifecycle_rule";
		private static final String S3BUCKET_POLICY ="s3bucket_policy" ;
		private static final String S3BUCKET_TAGS="s3bucket_tags";
		private static final String S3BUCKET_WEBSITE="s3bucket_website"; 
		private static final String S3BUCKET_RNAME="s3bucket_Rname";
			

		public static S3bucketAttribute getS3bucketAttributeFromProperties(){
			
			S3bucketAttribute.getReadPropertiesFile();
			
			String S3bucket_bucket = properties.getProperty(S3BUCKET_BUCKET);
			String S3bucket_depends_on = properties.getProperty(S3BUCKET_DEPENDS_ON);
			String S3bucket_connection = properties.getProperty(S3BUCKET_CONNECTION);
			String S3bucket_acl = properties.getProperty(S3BUCKET_ACL);
			String S3bucket_core_rule= properties.getProperty(S3BUCKET_CORE_RULE);
			String S3bucket_force_destroy = properties.getProperty(S3BUCKET_FORCE_DESTROY);
			String S3bucket_lifecycle_rule = properties.getProperty(S3BUCKET_LIFECYCLE_RULE);
			String S3bucket_policy = properties.getProperty(S3BUCKET_POLICY);
			String S3bucket_tags = properties.getProperty(S3BUCKET_TAGS);
			String S3bucket_website = properties.getProperty(S3BUCKET_WEBSITE);
			String S3bucket_Rname=properties.getProperty(S3BUCKET_RNAME);
			
			S3bucketAttribute=new S3bucketAttribute();
			S3bucketAttribute.setS3bucket_bucket(S3bucket_bucket);
			S3bucketAttribute.setS3bucket_depends_on(S3bucket_depends_on);
			S3bucketAttribute.setS3bucket_connection(S3bucket_connection);
			S3bucketAttribute.setS3bucket_acl(S3bucket_acl);
			S3bucketAttribute.setS3bucket_core_rule(S3bucket_core_rule);
			S3bucketAttribute.setS3bucket_force_destroy(S3bucket_force_destroy);
			S3bucketAttribute.setS3bucket_lifecycle_rule(S3bucket_lifecycle_rule);
			S3bucketAttribute.setS3bucket_policy(S3bucket_policy);
			S3bucketAttribute.setS3bucket_tags(S3bucket_tags);
			S3bucketAttribute.setS3bucket_website(S3bucket_website);
			S3bucketAttribute.setS3bucket_Rname(S3bucket_Rname);
			
			return S3bucketAttribute;
			
			
				
			
		}
		
		public static void getReadPropertiesFile() {
			if(S3bucketAttribute == null){
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
