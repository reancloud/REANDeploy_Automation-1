package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class KMSResource {
	
	String kms_key_name;
	String kms_alias_name;
    String	target_key_id;
    String name;
    
    
    public String getkms_key_name()
    {
    	return kms_key_name;
    }
    public String getkms_alias_name()
    {
    	return kms_alias_name;
    }
    public String gettarget_key_id()
    {
    	return target_key_id;
    }
    public String getname()
    {
    	return name;
    }
    public void setkms_key_name(String kms_key_name)
    {
    	this.kms_key_name=kms_key_name;
    }
    public void setkms_alias_name(String kms_alias_name)
    {
    	this.kms_alias_name=kms_alias_name;
    }
    public void settarget_key_id(String target_key_id)
    {
    	this.target_key_id=target_key_id;
    }
    public void setname(String name)
    {
    	this.name=name;
    }
    
    private static Properties properties;
	private static KMSResource KmsAttributes = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	
	
	
	private static final String KMS_KEY_NAME="kms_key_name";
	
	
	
	private static final String NAME="name";
	
	private static final String TARGET_KEY_ID="target_key_id";
	
	private static final String KMS_ALIAS_NAME="kms_alias_name";

	

	public static KMSResource getKmsAttributesFromProperties(){

		KmsAttributes.getReadPropertiesFile();
		
		String kms_key_name=properties.getProperty(KMS_KEY_NAME);
		
		String kms_alias_name=properties.getProperty(KMS_ALIAS_NAME);
		String name=properties.getProperty(NAME);
			
		String target_key_id=properties.getProperty(TARGET_KEY_ID);
		

		KmsAttributes = new KMSResource();
		
		KmsAttributes.setkms_key_name(kms_key_name);
		
		KmsAttributes.setkms_alias_name(kms_alias_name);
		KmsAttributes.setname(name);
		
		KmsAttributes.settarget_key_id(target_key_id);
	
		return KmsAttributes;
	}

	public static void getReadPropertiesFile() {
		if(KmsAttributes == null || KmsAttributes ==null){
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

