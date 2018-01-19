package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class AddUserAttribute {
	
	String user_name;
	String user_age;
	String user_salary;
	
	
	public String getuser_name()
	{
		return user_name;
	}
	public String user_name()
	{
		return user_age;
	}
	public String getuser_salary()
	{
		return user_salary;
	}
	public String getuser_age()
	{
		return user_age;
	}
	
	public void setuser_name(String user_name)
	{
		this.user_name=user_name;
	}
	public void setuser_age(String user_age)
	{
		this.user_age=user_age;
	}
	public void setuser_salary(String user_salary)
	{
		this.user_salary=user_salary;
	}
	
	private static Properties properties;
	private static AddUserAttribute dnowUser = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String USER_NAME = "user_name";
	private static final String USER_AGE= "user_age";
	private static final String USER_SALARY = "user_salary";
	
	public static AddUserAttribute getUserDetailsFromProperties(){
		
		AddUserAttribute.getReadPropertiesFile();
		
		String user_name = properties.getProperty(USER_NAME);
		String user_age = properties.getProperty(USER_AGE);
		String user_salary = properties.getProperty(USER_SALARY);
		dnowUser = new AddUserAttribute();
		dnowUser.setuser_name(user_name);
		dnowUser.setuser_age(user_age);
		dnowUser.setuser_salary(user_salary);
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
