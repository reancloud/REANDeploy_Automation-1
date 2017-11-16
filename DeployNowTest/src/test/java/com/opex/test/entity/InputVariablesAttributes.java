package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class InputVariablesAttributes {
	
	String input_variable_attribute;
	String inputVariable_envname;
	String inputVariable_vpc_cidr;
	String inputVariable_BlankData;
	String inputVariable_vpc_rname;
	
	
	public String getInputVariablesAttribute() {
		return input_variable_attribute;
	}
	public void setInputVariablesAttribute(String input_variable_attribute) {
		this.input_variable_attribute = input_variable_attribute;
	}
	
	public String getInputVariablesEnvname() {
		return inputVariable_envname;
	}
	public void setInputVariablesEnvname(String inputVariable_envname) {
		this.inputVariable_envname = inputVariable_envname;
	}
	
	public String getInputVariable_vpc_cidr() {
		return inputVariable_vpc_cidr;
	}
	public void setInputVariable_vpc_cidr(String inputVariable_vpc_cidr) {
		this.inputVariable_vpc_cidr = inputVariable_vpc_cidr;
	}
	public String getInputVariable_BlankData() {
		return inputVariable_BlankData;
	}
	public void setInputVariable_BlankData(String inputVariable_BlankData) {
		this.inputVariable_BlankData = inputVariable_BlankData;
	}
	
	public String getInputVariable_vpc_rname() {
		return inputVariable_vpc_rname;
	}
	public void setInputVariable_vpc_rname(String inputVariable_vpc_rname) {
		this.inputVariable_vpc_rname = inputVariable_vpc_rname;
	}
	
	
	private static Properties properties;
	private static InputVariablesAttributes inputVariablesAttributes = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String INPUT_VARIABLE_ATTRIBUTE = "input_variable_attribute";
	private static final String INPUTVARIABLE_ENVNAME = "inputVariable_envname";
	private static final String INPUTVARIABLE_VPC_RNAME = "inputVariable_vpc_rname";
	private static final String INPUTVARIABLE_VPC_CIDR = "inputVariable_vpc_cidr";
	private static final String INPUTVARIABLE_BLANKDATA = "inputVariable_BlankData";
	
	
	public static InputVariablesAttributes getInputVariablesAttributesFromProperties(){
		
		InputVariablesAttributes.getReadPropertiesFile();
		
		String input_variables_attribute = properties.getProperty(INPUT_VARIABLE_ATTRIBUTE);
		String inputVariable_envname = properties.getProperty(INPUTVARIABLE_ENVNAME);
		String inputVariable_vpc_cidr = properties.getProperty(INPUTVARIABLE_VPC_CIDR);
		String inputVariable_vpc_rname = properties.getProperty(INPUTVARIABLE_VPC_RNAME);
		String inputVariable_BlankData = properties.getProperty(INPUTVARIABLE_BLANKDATA);
		
		inputVariablesAttributes = new InputVariablesAttributes();
		inputVariablesAttributes.setInputVariablesAttribute(input_variables_attribute);
		inputVariablesAttributes.setInputVariablesEnvname(inputVariable_envname);
		inputVariablesAttributes.setInputVariable_BlankData(inputVariable_BlankData);
		inputVariablesAttributes.setInputVariable_vpc_cidr(inputVariable_vpc_cidr);
		inputVariablesAttributes.setInputVariable_vpc_rname(inputVariable_vpc_rname);
		return inputVariablesAttributes;
	}
	
	public static void getReadPropertiesFile() {
		if(inputVariablesAttributes == null){
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

