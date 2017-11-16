package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;
import com.opex.test.utils.FileUtils;

public class OutputAttributes {
	//output
	String output_resourceName;
	String output_dependsOn;
	String output_connection;
	String output_outputJson;
	String output_outputJson_invalid;
	//output -vpc
	String output_vpc_Rname;
	String output_vpc_cidr;
	
	public String getOutput_resourceName() {
		return output_resourceName;
	}
	public void setOutput_resourceName(String output_resourceName) {
		this.output_resourceName = output_resourceName;
	}
	public String getOutput_dependsOn() {
		return output_dependsOn;
	}
	public void setOutput_dependsOn(String output_dependsOn) {
		this.output_dependsOn = output_dependsOn;
	}
	public String getOutput_connection() {
		return output_connection;
	}
	public void setOutput_connection(String output_connection) {
		this.output_connection = output_connection;
	}
	
	public String getOutput_outputJson() {
		return output_outputJson;
	}
	public void setOutput_outputJson(String output_outputJson) {
		this.output_outputJson = output_outputJson;
	}
	public String getOutput_outputJson_invalid() {
		return output_outputJson_invalid;
	}
	public void setOutput_outputJson_invalid(String output_outputJson_invalid) {
		this.output_outputJson_invalid = output_outputJson_invalid;
	}
	//output -vpc
	
	public String getOutput_vpc_Rname() {
		return output_vpc_Rname;
	}
	public void setOutput_vpc_Rname(String output_vpc_Rname) {
		this.output_vpc_Rname = output_vpc_Rname;
	}
	
	public String getOutput_vpc_cidr() {
		return output_vpc_cidr;
	}
	public void setOutput_vpc_cidr(String output_vpc_cidr) {
		this.output_vpc_cidr = output_vpc_cidr;
	}
	
	private static Properties properties;
	private static OutputAttributes  OutputAttributes  = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String OUTPUT_DEPENDSON="output_dependsOn";
	private static final String OUTPUT_CONNECTION="output_connection";
	private static final String OUTPUT_OUTPUTJSON="output_outputJson";
	private static final String OUTPUT_OUTPUTJSON_INVALID="output_outputJson_invalid";
	private static final String OUTPUT_RESOURCENAME="output_resourceName";
	//output -vpc
	private static final String OUTPUT_VPC_RNAME="output_vpc_Rname";
	private static final String OUTPUT_VPC_CIDR="output_vpc_cidr";
	
	public static OutputAttributes  getOutputAttributesFromProperties(){

		OutputAttributes.getReadPropertiesFile();
		String output_resourceName=properties.getProperty(OUTPUT_RESOURCENAME);
		String output_dependsOn= properties.getProperty(OUTPUT_DEPENDSON);
		String output_connection=properties.getProperty(OUTPUT_CONNECTION);
		String output_outputJson=properties.getProperty(OUTPUT_OUTPUTJSON);
		String output_outputJson_invalid=properties.getProperty(OUTPUT_OUTPUTJSON_INVALID);
		//output -vpc
		String output_vpc_Rname=properties.getProperty(OUTPUT_VPC_RNAME);
		String output_vpc_cidr=properties.getProperty(OUTPUT_VPC_CIDR);


		OutputAttributes = new OutputAttributes();
		OutputAttributes.setOutput_resourceName(output_resourceName);
		OutputAttributes.setOutput_dependsOn(output_dependsOn);
		OutputAttributes.setOutput_connection(output_connection);
		OutputAttributes.setOutput_outputJson(output_outputJson);
		OutputAttributes.setOutput_outputJson_invalid(output_outputJson_invalid);
		//output -vpc
		OutputAttributes.setOutput_vpc_Rname(output_vpc_Rname);
		OutputAttributes.setOutput_vpc_cidr(output_vpc_cidr);
		return OutputAttributes;


	}

	public static void getReadPropertiesFile() {
		if(OutputAttributes == null || OutputAttributes ==null){
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
