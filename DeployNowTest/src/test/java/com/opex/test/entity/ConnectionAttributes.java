package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class ConnectionAttributes {
	
	
	String con_name;
	String another_con_name;
	String con_user;
	String con_pwd;
	String con_key;
	String TestFile;
	String con_name_winrm;
	String con_typeWINRM;
	String con_key_winrm;
	String con_typeSSH;
	String con_BlankData;
		
		public String getCon_name() {
			return con_name;
		}
		public void setCon_name(String con_name) {
			this.con_name = con_name;
		}
		
		public String getAnother_con_name() {
			return another_con_name;
		}
		public void setAnother_con_name(String another_con_name) {
			this.another_con_name = another_con_name;
		}
		public String getCon_user() {
			return con_user;
		}
		public void setCon_user(String con_user) {
			this.con_user = con_user;
		}
		
		public String getCon_pwd() {
			return con_pwd;
		}
		public void setCon_pwd(String con_pwd) {
			this.con_pwd = con_pwd;
		}
		
		public String getTestFile() {
			return TestFile;
		}
		public void setTestFile(String TestFile) {
			this.TestFile = TestFile;
		}

		public String getCon_key_winrm() {
			return con_key_winrm;
		}
		public void setCon_key_winrm(String con_key_winrm) {
			this.con_key_winrm = con_key_winrm;
		}
		public String getCon_key() {
			return con_key;
		}
		public void setCon_key(String con_key) {
			this.con_key = con_key;
		}
		public String getCon_typeWINRM() {
			return con_typeWINRM;
		}
		public void setCon_typeWINRM(String con_typeWINRM) {
			this.con_typeWINRM = con_typeWINRM;
		}
		public String getCon_typeSSH() {
			return con_typeSSH;
		}
		public void setCon_typeSSH(String con_typeSSH) {
			this.con_typeSSH = con_typeSSH;
		}
		
		public String getCon_name_winrm() {
			return con_name_winrm;
		}
		public void setCon_name_winrm(String con_name_winrm) {
			this.con_name_winrm = con_name_winrm;
		}
		
		public String getCon_BlankData() {
			return con_BlankData;
		}
		public void setCon_BlankData(String con_BlankData) {
			this.con_BlankData = con_BlankData;
		}
		
		private static Properties properties;
		private static ConnectionAttributes conDetails = null;
		private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
		private static final String CON_NAME = "con_name";
		private static final String ANOTHER_CON_NAME = "another_con_name";
		private static final String CON_USER = "con_user";
		private static final String CON_PWD = "con_pwd";
		private static final String CON_KEY = "con_key";
		private static final String TEST_FILE = "TestFile";
		private static final String CON_TYPESSH = "con_typeSSH";
		private static final String CON_TYPEWINRM = "con_typeWINRM";
		private static final String CON_NAME_WINRM = "con_name_winrm";
		private static final String CON_KEY_WINRM = "con_key_winrm";
		private static final String CON_BLANKDATA = "con_BlankData";

		public static ConnectionAttributes getConDetailsFromProperties(){
			
			ConnectionAttributes.getReadPropertiesFile();
			
			String con_name = properties.getProperty(CON_NAME);
			String con_user = properties.getProperty(CON_USER);
			String another_con_name = properties.getProperty(ANOTHER_CON_NAME);
			String con_pwd = properties.getProperty(CON_PWD);
			String con_key = properties.getProperty(CON_KEY);
			String con_typeSSH = properties.getProperty(CON_TYPESSH);
			String con_typeWINRM = properties.getProperty(CON_TYPEWINRM);
			String TestFile = properties.getProperty(TEST_FILE);
			String con_name_winrm = properties.getProperty(CON_NAME_WINRM);
			String con_key_winrm = properties.getProperty(CON_KEY_WINRM);
			String con_BlankData = properties.getProperty(CON_BLANKDATA);
			conDetails = new ConnectionAttributes();
			conDetails.setCon_name(con_name);
			conDetails.setAnother_con_name(another_con_name);
			conDetails.setCon_user(con_user);
			conDetails.setCon_pwd(con_pwd);
			conDetails.setCon_key(con_key);
			conDetails.setCon_typeSSH(con_typeSSH);
			conDetails.setCon_typeWINRM(con_typeWINRM);
			conDetails.setTestFile(TestFile);
			conDetails.setCon_name_winrm(con_name_winrm);
			conDetails.setCon_key_winrm(con_key_winrm);
			conDetails.setCon_BlankData(con_BlankData);
			return conDetails;
		}
		
		public static void getReadPropertiesFile() {
			if(conDetails == null){
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
