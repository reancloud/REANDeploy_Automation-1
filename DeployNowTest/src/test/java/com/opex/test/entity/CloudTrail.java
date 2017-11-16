package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class CloudTrail 
{
	
	String cloud_trail_name;
	String s3_bucket_name;


public String getCloud_trail_name()
{
  return cloud_trail_name;
}
public String getS3_bucket_name()
{
	return s3_bucket_name;
}
public void setCloud_trail_name(String cloud_trail_name)
{
	this.cloud_trail_name=cloud_trail_name;
}
public void setS3_bucket_name(String s3_bucket_name)
{
	this.s3_bucket_name=s3_bucket_name;
}

      private static Properties properties;
	private static CloudTrail cloudtrailDetails = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String CLOUD_TRAIL_NAME="cloud_trail_name";
	private static final String S3_BUCKET_NAME="s3_bucket_name";

	public static CloudTrail getCloudTrailFromPropertiesFile() 
	{
		CloudTrail.getReadPropertiesFile();
		String cloud_trail_name = properties.getProperty(CLOUD_TRAIL_NAME);
		String s3_bucket_name=properties.getProperty(S3_BUCKET_NAME);
		
		
		cloudtrailDetails = new CloudTrail();
		cloudtrailDetails.setCloud_trail_name(cloud_trail_name);
		cloudtrailDetails.setS3_bucket_name(s3_bucket_name);
		
		return cloudtrailDetails;
		
	}
	public static void getReadPropertiesFile() {
		if(cloudtrailDetails == null || cloudtrailDetails == null){
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
