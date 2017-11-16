package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.helpers.DataHelper;
import com.opex.test.utils.FileUtils;

public class KeyPairAttributes {
	
String key_name;
String public_key;
String invalid_public_key;
String keypair_rname;
String keypair_envname;
String keypair_blankdata;


	
	public String getKey_name() {
		return key_name;
	}
	public void setKey_name(String key_name) {
		this.key_name = key_name;
	}
	public String getKeypair_rname() {
		return keypair_rname;
	}
	public void setKeypair_rname(String keypair_rname) {
		this.keypair_rname = keypair_rname;
	}
	
	public String getPublic_key() {
		return public_key;
	}
	public void setPublic_key(String public_key) {
		this.public_key = public_key;
	}
	
	public String getInvalidPublic_key() {
		return invalid_public_key;
	}
	public void setInvalidPublic_key(String invalid_public_key) {
		this.invalid_public_key = invalid_public_key;
	}
	
	public String getKeypair_envname() {
		return keypair_envname;
	}
	public void setKeypair_envname(String keypair_envname) {
		this.keypair_envname = keypair_envname;
	}
	
	public String getKeypair_blankdata() {
		return keypair_blankdata;
	}
	public void setKeypair_blankdata(String keypair_blankdata) {
		this.keypair_blankdata = keypair_blankdata;
	}


	private static Properties properties;
	private static KeyPairAttributes keyPairAttributes = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String KEY_NAME = "key_name";
	private static final String PUBLIC_KEY = "public_key";
	private static final String INVALID_PUBLIC_KEY = "invalid_public_key";
	private static final String KEYPAIR_RNAME = "keypair_rname";
	private static final String KEYPAIR_ENVNAME = "keypair_envname";
	private static final String KEYPAIR_BLANKDATA = "keypair_blankdata";

	public static KeyPairAttributes getKeyPairAttributesFromProperties(){
		
		KeyPairAttributes.getReadPropertiesFile();
		
		String key_name = properties.getProperty(KEY_NAME);
		String public_key = properties.getProperty(PUBLIC_KEY);
		String invalid_public_key1 = properties.getProperty(INVALID_PUBLIC_KEY);
		String keypair_rname = properties.getProperty(KEYPAIR_RNAME);
		String keypair_envname = properties.getProperty(KEYPAIR_ENVNAME);
		String keypair_blankdata = properties.getProperty(KEYPAIR_BLANKDATA);
		keyPairAttributes = new KeyPairAttributes();
		keyPairAttributes.setKey_name(key_name);
		keyPairAttributes.setPublic_key(public_key);
		keyPairAttributes.setInvalidPublic_key(invalid_public_key1);
		keyPairAttributes.setKeypair_rname(keypair_rname);
		keyPairAttributes.setKeypair_envname(keypair_envname);
		keyPairAttributes.setKeypair_blankdata(keypair_blankdata);
		return keyPairAttributes;
	}
	
	public static void getReadPropertiesFile() {
		if(keyPairAttributes == null || keyPairAttributes ==null){
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
