package com.opex.test.entity;

import java.io.InputStream;
import java.security.spec.ECFieldFp;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class EIPAttributes {

	//  EIP resource
	String eip_rname;
	String eip_dependsOn;
	String eip_connection;
	String eip_associateWithPrivateIp;
	String eip_instance;
	String eip_networkInterface;
	String eip_vpc;

	public String getEIP_rname() {
		return eip_rname;
	}
	public void setEIP_rname(String eip_rname) {
		this.eip_rname= eip_rname;
	}
	public String getEIP_dependsOn() {
		return eip_dependsOn;
	}
	public void setEIP_dependsOn(String eip_dependsOn) {
		this.eip_dependsOn = eip_dependsOn;
	}
	public String getEIP_connection() {
		return eip_connection;
	}
	public void setEIP_connection(String eip_connection) {
		this.eip_connection = eip_connection;
	}

	public String getEIP_associateWithPrivateIp() {
		return eip_associateWithPrivateIp;
	}
	public void setEIP_associateWithPrivateIp(String eip_associateWithPrivateIp) {
		this.eip_associateWithPrivateIp = eip_associateWithPrivateIp;
	}

	public String getEIP_instance() {
		return eip_instance;
	}
	public void setEIP_instance(String eip_instance) {
		this.eip_instance = eip_instance;
	}

	public String getEIP_networkInterface() {
		return eip_networkInterface;
	}
	public void setEIP_networkInterface(String eip_networkInterface) {
		this.eip_networkInterface = eip_networkInterface;
	}

	public String getEIP_vpc() {
		return eip_vpc;
	}
	public void setEIP_vpc(String eip_vpc) {
		this.eip_vpc = eip_vpc;
	}


	private static Properties properties;
	private static EIPAttributes  EIPAttributes  = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String EIP_RNAME="eip_rname";
	private static final String EIP_DEPENDSON="eip_dependsOn";
	private static final String EIP_CONNECTION="eip_connection";
	private static final String EIP_ASSOCIATEWITHPRIVATEIP="eip_associateWithPrivateIp";
	private static final String EIP_INSTANCE="eip_instance";
	private static final String EIP_NETWORKINTERFACE="eip_networkInterface";
	private static final String EIP_VPC="eip_vpc";

	public static EIPAttributes  getEIPAttributesFromProperties(){

		EIPAttributes.getReadPropertiesFile();
		String eip_rname= properties.getProperty(EIP_RNAME);
		String eip_dependsOn= properties.getProperty(EIP_DEPENDSON);
		String eip_connection=properties.getProperty(EIP_CONNECTION);
		String eip_associateWithPrivateIp=properties.getProperty(EIP_ASSOCIATEWITHPRIVATEIP);
		String eip_instance=properties.getProperty(EIP_INSTANCE);
		String eip_networkInterface=properties.getProperty(EIP_NETWORKINTERFACE);
		String eip_vpc=properties.getProperty(EIP_VPC);



		EIPAttributes = new EIPAttributes();
		EIPAttributes.setEIP_rname(eip_rname);
		EIPAttributes.setEIP_connection(eip_connection);
		EIPAttributes.setEIP_dependsOn(eip_dependsOn);
		EIPAttributes.setEIP_associateWithPrivateIp(eip_associateWithPrivateIp);
		EIPAttributes.setEIP_instance(eip_instance);
		EIPAttributes.setEIP_networkInterface(eip_networkInterface);
		EIPAttributes.setEIP_vpc(eip_vpc);

		return EIPAttributes;


	}

	public static void getReadPropertiesFile() {
		if(EIPAttributes == null || EIPAttributes ==null){
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


