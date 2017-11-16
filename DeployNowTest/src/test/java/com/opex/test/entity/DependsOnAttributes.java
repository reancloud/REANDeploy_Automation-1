package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class DependsOnAttributes {

	//Dependson
	String dependson_dependson;

	//Dependson-vpc
	String dependson_vpc_cidr;
	String dependson_vpc_resourceName;

	//Dependson-output
	String dependson_output_json;

	//Dependson-subnet
	String dependson_subnet_resourceName;
	String dependson_subnet_cidr;
	String dependson_subnet_vpcid;
	
	//Env names
	String dependson_Env;
	String dependson_Vpc_Env;
	String dependson_rname;
	
	//DependsOn Attributes
	public String getDependson_dependson() {
		return dependson_dependson;
	}
	public void setDependson_dependson(String dependson_dependson) {
		this.dependson_dependson = dependson_dependson;
	}
	//Env names
	public String getDependson_Env() {
		return dependson_Env;
	}
	public void setDependson_Env(String dependson_Env) {
		this.dependson_Env = dependson_Env;
	}
	
	public String getDependson_Vpc_Env() {
		return dependson_Vpc_Env;
	}
	public void setDependson_Vpc_Env(String dependson_Vpc_Env) {
		this.dependson_Vpc_Env = dependson_Vpc_Env;
	}
	
	public String getDependson_rname() {
		return dependson_rname;
	}
	public void setDependson_rname(String dependson_rname) {
		this.dependson_rname = dependson_rname;
	}
	
	//Dependson-vpc
	public String getDependson_vpc_cidr() {
		return dependson_vpc_cidr;
	}
	public void setDependson_vpc_cidr(String dependson_vpc_cidr) {
		this.dependson_vpc_cidr = dependson_vpc_cidr;
	}

	public String getDependson_vpc_resourceName() {
		return dependson_vpc_resourceName;
	}
	public void setDependson_vpc_resourceName(String dependson_vpc_resourceName) {
		this.dependson_vpc_resourceName = dependson_vpc_resourceName;
	}

	//Dependson-output
	public String getDependson_output_json() {
		return dependson_output_json;
	}
	public void setDependson_output_json(String dependson_output_json) {
		this.dependson_output_json = dependson_output_json;
	}

	//Dependson-subnet
	public String getDependson_subnet_resourceName() {
		return dependson_subnet_resourceName;
	}
	public void setDependson_subnet_resourceName(String dependson_subnet_resourceName) {
		this.dependson_subnet_resourceName = dependson_subnet_resourceName;
	}
	public String getDependson_subnet_cidr() {
		return dependson_subnet_cidr;
	}
	public void setDependson_subnet_cidr(String dependson_subnet_cidr) {
		this.dependson_subnet_cidr = dependson_subnet_cidr;
	}

	public String getDependson_subnet_vpcid() {
		return dependson_subnet_vpcid;
	}
	public void setDependson_subnet_vpcid(String dependson_subnet_vpcid) {
		this.dependson_subnet_vpcid = dependson_subnet_vpcid;
	}


	private static Properties properties;
	private static DependsOnAttributes DependsOnAttribute = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	
	//Dependson Attribute
	private static final String DEPENDSON_DEPENDSON="dependson_dependson";
	
	
	//Dependson-vpc
	private static final String DEPENDSON_VPC_CIDR="dependson_vpc_cidr";
	private static final String DEPENDSON_VPC_RESOURCENAME="dependson_vpc_resourceName";
	//Dependson -output
	private static final String DEPENDSON_OUTPUT_JSON="dependson_output_json";

	//Dependson -subnet
	private static final String DEPENDSON_SUBNET_RESOURCENAME="dependson_subnet_resourceName";
	private static final String DEPENDSON_SUBNET_CIDR="dependson_subnet_cidr";
	private static final String DEPENDSON_SUBNET_VPCID="dependson_subnet_vpcid";

	//DependsOn Env
	private static final String DEPENDSON_VPC_ENV="dependson_Vpc_Env";
	private static final String DEPENDSON_ENV="dependson_Env";
	private static final String DEPENDSON_RNAME="dependson_rname";
	

	public static DependsOnAttributes getDependsOnAttributesFromProperties(){

		DependsOnAttributes.getReadPropertiesFile();
		//Dependson
		String dependson_dependson=properties.getProperty(DEPENDSON_DEPENDSON);
		//Dependson-vpc
		String dependson_vpc_cidr=properties.getProperty(DEPENDSON_VPC_CIDR);
		String dependson_vpc_resourceName=properties.getProperty(DEPENDSON_VPC_RESOURCENAME);
		//Dependson-output		
		String dependson_output_json=properties.getProperty(DEPENDSON_OUTPUT_JSON);
		//Dependson -subnet
		String dependson_subnet_resourceName=properties.getProperty(DEPENDSON_SUBNET_RESOURCENAME);	
		String dependson_subnet_cidr=properties.getProperty(DEPENDSON_SUBNET_CIDR);	
		String dependson_subnet_vpcid=properties.getProperty(DEPENDSON_SUBNET_VPCID);
		
		//DependsOn Env names
		String dependson_Env = properties.getProperty(DEPENDSON_ENV);
		String dependson_Vpc_Env = properties.getProperty(DEPENDSON_VPC_ENV);
		String dependson_rname = properties.getProperty(DEPENDSON_RNAME);

		DependsOnAttribute = new DependsOnAttributes();
		//Dependson
		DependsOnAttribute.setDependson_dependson(dependson_dependson);
		//Dependson-vpc
		DependsOnAttribute.setDependson_vpc_cidr(dependson_vpc_cidr);
		DependsOnAttribute.setDependson_vpc_resourceName(dependson_vpc_resourceName);
		//Dependson-output
		DependsOnAttribute.setDependson_output_json(dependson_output_json);
		//Dependson-subnet
		DependsOnAttribute.setDependson_subnet_resourceName(dependson_subnet_resourceName);
		DependsOnAttribute.setDependson_subnet_cidr(dependson_subnet_cidr);
		DependsOnAttribute.setDependson_subnet_vpcid(dependson_subnet_vpcid);
		//DeoendsOn Env names
		DependsOnAttribute.setDependson_Env(dependson_Env);
		DependsOnAttribute.setDependson_Vpc_Env(dependson_Vpc_Env);
		DependsOnAttribute.setDependson_rname(dependson_rname);
		return DependsOnAttribute;
	}

	public static void getReadPropertiesFile() {
		if(DependsOnAttribute == null || DependsOnAttribute ==null){
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

