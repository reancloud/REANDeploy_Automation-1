package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class Bastionhost {
	
	String username;
	String Host;
	String port;
	String bastionkey;
	
	public String getusername()
	{
		return username;
	}
	public String getHost()
	{
		return Host;
	}
	public String getport()
	{
		return port;
	}
	public String getbastionkey()
	{
		return bastionkey;
	}
	public void setuesrname(String username)
	{
		this.username=username;
	}
	public void setHost(String Host)
	{
		this.Host=Host;
	}
	public void setport(String port)
	{
		this.port=port;
	}
	public void setbastionkey(String bastionkey)
	{
		this.bastionkey=bastionkey;
	}
	
	 private static Properties properties;
		private static Bastionhost bastionDetails = null;
		private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
		private static final String USERNAME="username";
		private static final String HOST="Host";
		private static final String PORT="port";
		private static final String BASTIONKEY="bastionkey";


		public static Bastionhost getBastionhostFromPropertiesFile() 
		{
			Bastionhost.getReadPropertiesFile();
			String username = properties.getProperty(USERNAME);
			String Host=properties.getProperty(HOST);
			String port = properties.getProperty(PORT);
			String bastionkey=properties.getProperty(BASTIONKEY);
			
			
			bastionDetails = new Bastionhost();
			bastionDetails.setuesrname(username);;
			bastionDetails.setHost(Host);;
			bastionDetails.setport(port);
			bastionDetails.setbastionkey(bastionkey);
			
			return bastionDetails;
			
		}
		public static void getReadPropertiesFile() {
			if(bastionDetails == null || bastionDetails == null){
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
