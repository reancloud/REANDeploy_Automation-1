package com.opex.test.helpers;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.entity.AwspecPackage;
import com.opex.test.entity.DeployNowSignInUser;
import com.opex.test.entity.DeployNowSignUpUser;
import com.opex.test.entity.WebUrl;
import com.opex.test.utils.FileUtils;


public class DataHelper {
	
	private static DeployNowSignInUser userFromProperties = null;
	
	private static DeployNowSignUpUser signupUserFromProperties = null;
	private static WebUrl urlFromProperties = null;
	
	
	private static Properties properties;
	private static AwspecPackage awspec_pkgDetails = null;
    
	
	
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String DEPLOYNOW_BASE_URL = "deploynow_base_url";
	private static final String USER_NAME = "email";
	private static final String PASSWORD = "password";
	//private static final String TARGET_URL = "target_url";
	private static final String SIGNUP_USER_NAME = "signup_name";
	private static final String SIGNUP_EMAIL = "signup_email";
	private static final String SIGNUP_PASSWORD = "signup_password";	
	private static final String SIGNUP_URL = "signup_url";
	private static final String SOURCE_USERNAME = "source_username";
	private static final String SOURCE_PASSWORD = "source_password";
	private static final String SOURCE_URL_ = "source_url";
	private static final String MAILINATOR_EMAIL = "mailinator_email";
        private static final String CONTAINER_DEFINITION="container_definitions";
	private static final String FAMILY="family";
	
	public static WebUrl getUrlFromPropertiesFile() {
		DataHelper.getReadPropertiesFile();		
		//String url = properties.getProperty(TARGET_URL);
		String url = getDeployNowLoginURL();
		urlFromProperties = new WebUrl();
		urlFromProperties.setTarget_url(url);
        return urlFromProperties;
	}
	
	
	public static DeployNowSignUpUser getSignUpUserFromPropertiesFile() {
		DataHelper.getReadPropertiesFile();
		String s_name = properties.getProperty(SIGNUP_USER_NAME);
		String s_email = properties.getProperty(SIGNUP_EMAIL);
		String s_password = properties.getProperty(SIGNUP_PASSWORD);
		String s_url = properties.getProperty(SIGNUP_URL);
		String mailinator_email=properties.getProperty(MAILINATOR_EMAIL);
	
		signupUserFromProperties = new DeployNowSignUpUser();
		signupUserFromProperties.setUser_name(s_name);
		signupUserFromProperties.setUser_email(s_email);
		signupUserFromProperties.setUser_password(s_password);
		signupUserFromProperties.setUser_url(s_url);
		signupUserFromProperties.setmailinator_email(mailinator_email);
		return signupUserFromProperties;
	}
	
	public static DeployNowSignInUser getUserFromPropertiesFile() {
		DataHelper.getReadPropertiesFile();
		String email = properties.getProperty(USER_NAME);
		String password = properties.getProperty(PASSWORD);
		userFromProperties = new DeployNowSignInUser();
		userFromProperties.setEmail(email);
		userFromProperties.setPassword(password);
		return userFromProperties;
	}
	

	public static AwspecPackage getawsspecDetailsFromPropertiesFile() {
		DataHelper.getReadPropertiesFile();
		String source_username= properties.getProperty(SOURCE_USERNAME);
		String source_password =properties.getProperty(SOURCE_PASSWORD);
		String source_url =properties.getProperty(SOURCE_URL_);
		awspec_pkgDetails = new AwspecPackage();
		awspec_pkgDetails.setAwspec_username(source_username);
		awspec_pkgDetails.setAwspec_password(source_password);
		awspec_pkgDetails.setAwspec_url(source_url);
		return awspec_pkgDetails;
	}
	public static String getDeployNowLoginURL() 
	{
		String baseUrl = null;
		if(System.getenv("TEST_URL") != null){
			baseUrl = System.getenv("TEST_URL");
			System.out.println("environment >"+baseUrl);
		}else{
			baseUrl = getProperty(DEPLOYNOW_BASE_URL);
			System.out.println("property >"+baseUrl);

		}
		baseUrl = baseUrl.trim();
		
		if(baseUrl.endsWith("/")){
			baseUrl = baseUrl.substring(0, baseUrl.length()-1);
		}
		return baseUrl; 
	}
	
	public static String getProperty(String  key){
		if(properties == null){
			getUserFromPropertiesFile();
		}
		return properties.getProperty(key);
	}
	
	
	public static void getReadPropertiesFile() {
		if(userFromProperties == null || urlFromProperties ==null){
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
	
	/*public static void getReadFiles(Object obj) {
		if(obj == null ){
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
		
	}*/
	
	
	
	/*public static List<HashMap<String,String>> data()
	{


		List<HashMap<String,String>> mydata = null;
		try
		{

			FileInputStream fs = new FileInputStream("classpath:TestData-deploynow.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheet("SignInSignOut");
			Row HeaderRow = sheet.getRow(0);

			for(int i=1;i<sheet.getPhysicalNumberOfRows();i++)
			{
				Row currentRow = sheet.getRow(i);
				HashMap<String,String> currentHash = new HashMap<String,String>();
				for(int j=0;j<currentRow.getPhysicalNumberOfCells();j++)
				{
					Cell currentCell = currentRow.getCell(j);

					switch (currentCell.getCellType())
					{
					case Cell.CELL_TYPE_STRING:
						System.out.print(currentCell.getStringCellValue() + "\t");

						currentHash.put(HeaderRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue());
						break;
					}

				}
				mydata.add(currentHash);
			}

			fs.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return mydata;

	}
*/
}
