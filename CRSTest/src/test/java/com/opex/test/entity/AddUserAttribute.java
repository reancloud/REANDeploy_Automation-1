package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class AddUserAttribute {
	
	String user_name;
    String user_password;
	String user_salary;
	String invalid_username;
	String invalid_password;
	String group_code;
	String account_number;
	String dob;
	
	
	public String getuser_name()
	{
		return user_name;
	}
	
	public String getinvalid_username()
	{
		return invalid_username;
	}

	public String getuser_salary()
	{
		return user_salary;
	}
	public String getuser_password()
	{
		return user_password;
	}
	public String getinvalid_password()
	{
		return invalid_password;
	}
	public String getgroup_code()
	{
		return group_code;
	}
	public String getaccount_number()
	{
		return account_number;
	}
	public String getdob()
	{
		return dob;
	}
	
	public void setuser_name(String user_name)
	{
		this.user_name=user_name;
	}
	public void setinvalid_username(String invalid_username)
	{
		this.invalid_username=invalid_username;
	}
	public void setuser_password(String user_password)
	{
		this.user_password=user_password;
	}
	public void setinvalid_password(String invalid_password)
	{
		this.invalid_password=invalid_password;
	}
	public void setgroup_code(String group_code)
	{
		this.group_code=group_code;
	}
	public void setaccount_code(String account_number)
	{
		this.account_number=account_number;
	}
	public void setdob(String dob)
	{
		this.dob=dob;
	}
	
	private static Properties properties;
	private static AddUserAttribute dnowUser = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String USER_NAME = "user_name";
	private static final String USER_PASSWORD= "user_password";
	private static final String INVALID_USERNAME = "invalid_username";
	private static final String INVALID_PASSWORD= "invalid_password";
	private static final String GROUP_CODE= "group_code";
	private static final String ACCOUNT_NUMBER= "account_number";
	private static final String DOB= "dob";
	
	public static AddUserAttribute getUserDetailsFromProperties(){
		
		AddUserAttribute.getReadPropertiesFile();
		
		String user_name = properties.getProperty(USER_NAME);
		String user_password = properties.getProperty(USER_PASSWORD);
		String invalid_username = properties.getProperty(INVALID_USERNAME);
		String invalid_password = properties.getProperty(INVALID_PASSWORD);
		String group_code = properties.getProperty(GROUP_CODE);
		String account_number = properties.getProperty(ACCOUNT_NUMBER);
		String dob = properties.getProperty(DOB);
		dnowUser = new AddUserAttribute();
		dnowUser.setuser_name(user_name);
		dnowUser.setuser_password(user_password);
		dnowUser.setinvalid_username(invalid_username);
		dnowUser.setinvalid_password(invalid_password);
		dnowUser.setgroup_code(group_code);
		dnowUser.setaccount_code(account_number);
		dnowUser.setdob(dob);
		return dnowUser;
	}
	public static void getReadPropertiesFile() {
		if(dnowUser == null){
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
