package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.helpers.DataHelper;
import com.opex.test.utils.FileUtils;

public class S3BucketObjectAttributes {
	
	String s3Object_bucket;
	String S3_key;
	String S3_source;
	String S3_bucket;
		
		public String getS3Object_bucket() {
			return s3Object_bucket;
		}
		public void setS3Object_bucket(String s3Object_bucket) {
			this.s3Object_bucket = s3Object_bucket;
		}
		
		public String getS3_key() {
			return S3_key;
		}
		public void setS3_key(String S3_key) {
			this.S3_key = S3_key;
		}
		
		public String getS3_source() {
			return S3_source;
		}
		public void setS3_source(String S3_source) {
			this.S3_source = S3_source;
		}
		
		public String getS3_bucket() {
			return S3_bucket;
		}
		public void setS3_bucket(String S3_bucket) {
			this.S3_bucket = S3_bucket;
		}

		
		private static Properties properties;
		private static S3BucketObjectAttributes s3BucketObjectAttributes = null;
		
		private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
		private static final String S3OBJECTBUCKET = "s3Object_bucket";
		private static final String S3_KEY = "S3_key";
		private static final String S3_SOURCE = "S3_source";
		private static final String S3_BUCKET = "S3_bucket";

		
		public static S3BucketObjectAttributes getS3BucketObjectAttributesFromProperties(){
			
			S3BucketObjectAttributes.getReadPropertiesFile();
			String s3Object_bucket = properties.getProperty(S3OBJECTBUCKET);
			String S3_key = properties.getProperty(S3_KEY);
			String S3_source = properties.getProperty(S3_SOURCE);
			String S3_bucket = properties.getProperty(S3_BUCKET);
			
			s3BucketObjectAttributes = new S3BucketObjectAttributes();
			s3BucketObjectAttributes.setS3Object_bucket(s3Object_bucket);
			s3BucketObjectAttributes.setS3_key(S3_key);
			s3BucketObjectAttributes.setS3_source(S3_source);
			s3BucketObjectAttributes.setS3_bucket(S3_bucket);
			return s3BucketObjectAttributes;
			
			
		}
		
		public static void getReadPropertiesFile() {
			if(s3BucketObjectAttributes == null){
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
