package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.opex.test.utils.FileUtils;

public class ProviderAttribute {
	
	String provider_AWSname;
	String provider_AWS_another_name;
	String provider_AWStype;
	String provider_AWSdetails;
	String provider_AWSregion;
	String provider_DegitalOceanname;
	String provider_DegitalOceantype;
	String provider_DegitalOceandetails;
	String provider_vSpherename;
	String provider_vSpheretype;
	String provider_vSpheredetails;
	String provider_Azurename;
	String provider_Azuretype;
	String provider_Azuredetails;
	String provider_Dockername;
	String provider_Dockertype;
	String provider_Dockerdetails;
	
	
		
		public String getprovider_AWSname() {
			return provider_AWSname;
		}
		public void setprovider_AWSname(String provider_AWSname) {
			this.provider_AWSname = provider_AWSname;
		}

		public String getProvider_AWS_another_name() {
			return provider_AWS_another_name;
		}
		public void setProvider_AWS_another_name(String provider_AWS_another_name) {
			this.provider_AWS_another_name = provider_AWS_another_name;
		}

		public String getprovider_AWStype() {
			return provider_AWStype;
		}
		public void setprovider_AWStype(String provider_AWStype) {
			this.provider_AWStype = provider_AWStype;
		}
		
		public String getprovider_AWSdetails() {
			return provider_AWSdetails;
		}
		public void setprovider_AWSdetails(String provider_AWSdetails) {
			this.provider_AWSdetails = provider_AWSdetails;
		}

		public String getProvider_AWSregion() {
			return provider_AWSregion;
		}
		public void setProvider_AWSregion(String provider_AWSregion) {
			this.provider_AWSregion = provider_AWSregion;
		}

		public String getprovider_DegitalOceanname() {
			return provider_DegitalOceanname;
		}
		public void setprovider_DegitalOceanname(String provider_DegitalOceanname) {
			this.provider_DegitalOceanname = provider_DegitalOceanname;
		}
		
		public String getprovider_DegitalOceantype() {
			return provider_DegitalOceantype;
		}
		public void setprovider_DegitalOceantype(String provider_DegitalOceantype) {
			this.provider_DegitalOceantype = provider_DegitalOceantype;
		}

		public String getprovider_DegitalOceandetails() {
			return provider_DegitalOceandetails;
		}
		public void setprovider_DegitalOceandetails(String provider_DegitalOceandetails) {
			this.provider_DegitalOceandetails = provider_DegitalOceandetails;
		}
		public String getprovider_vSpherename() {
			return provider_vSpherename;
		}
		public void setprovider_vSpherename(String provider_vSpherename) {
			this.provider_vSpherename = provider_vSpherename;
		}
		
		public String getprovider_vSpheretype() {
			return provider_vSpheretype;
		}
		public void setprovider_vSpheretype(String provider_vSpheretype) {
			this.provider_vSpheretype = provider_vSpheretype;
		}
		public String getprovider_vSpheredetails() {
			return provider_vSpheredetails;
		}
		public void setprovider_vSpheredetails(String provider_vSpheredetails) {
			this.provider_vSpheredetails = provider_vSpheredetails;
		}
		public String getprovider_Azurename() {
			return provider_Azurename;
		}
		public void setprovider_Azurename(String provider_Azurename) {
			this.provider_Azurename = provider_Azurename;
		}
				
		public String getprovider_Azuretype() {
			return provider_Azuretype;
		}
		public void setprovider_Azuretype(String provider_Azuretype) {
			this.provider_Azuretype = provider_Azuretype;
		}
		public String getprovider_Azuredetails() {
			return provider_Azuredetails;
		}
		public void setprovider_Azuredetails(String provider_Azuredetails) {
			this.provider_Azuredetails = provider_Azuredetails;
		}
		public String getprovider_Dockername() {
			return provider_Dockername;
		}
		public void setprovider_Dockername(String provider_Dockername) {
			this.provider_Dockername = provider_Dockername;
		}

		public String getprovider_Dockertype() {
			return provider_Dockertype;
		}
		public void setprovider_Dockertype(String provider_Dockertype) {
			this.provider_Dockertype = provider_Dockertype;
		}
		public String getprovider_Dockerdetails() {
			return provider_Dockerdetails;
		}
		public void setprovider_Dockerdetails(String provider_Dockerdetails) {
			this.provider_Dockerdetails = provider_Dockerdetails;
		}
		
		private static Properties properties;
		private static ProviderAttribute providerAttribute = null;
		private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
		private static final String PROVIDER_AWSNAME ="provider_AWSname";
		private static final String PROVIDER_AWS_ANOTHER_NAME = "provider_AWS_another_name";
		private static final String PROVIDER_AWSTYPE ="provider_AWStype" ;
		private static final String PROVIDER_AWSDETAILS="provider_AWSdetails";
		private static final String PROVIDER_DEGITALOCEANNAME="provider_DegitalOceanname"; 
		private static final String PROVIDER_DEGITALOCEANTYPE="provider_DegitalOceantype";
		private static final String PROVIDER_DEGITALOCEANDETAILS="provider_DegitalOceandetails"; 
		private static final String PROVIDER_VSPHERENAME ="provider_vSpherename";
		private static final String PROVIDER_VSPHERETYPE ="provider_vSpheretype" ;
		private static final String PROVIDER_VSPHEREDETAILS="provider_vSpheredetails";
		private static final String PROVIDER_AZURENAME="provider_Azurename"; 
		private static final String PROVIDER_AZURETYPE="provider_Azuretype";
		private static final String PROVIDER_AZUREDETAILS="provider_Azuredetails";
		private static final String PROVIDER_DOCKERNAME="provider_Dockername"; 
		private static final String PROVIDER_DOCKERTYPE="provider_Dockertype";
		private static final String PROVIDER_DOCKERDETAILS="provider_Dockerdetails";
		private static final String PROVIDER_AWSREGION ="provider_AWSregion";

		public static ProviderAttribute getProviderAttributeFromProperties(){
			
			ProviderAttribute.getReadPropertiesFile();
			
			String provider_AWSname = properties.getProperty(PROVIDER_AWSNAME);
			String provider_AWS_another_name = properties.getProperty(PROVIDER_AWS_ANOTHER_NAME);
			String provider_AWStype = properties.getProperty(PROVIDER_AWSTYPE);
			String provider_AWSdetails = properties.getProperty(PROVIDER_AWSDETAILS);
			String provider_DegitalOceanname = properties.getProperty(PROVIDER_DEGITALOCEANNAME);
			String provider_DegitalOceantype= properties.getProperty(PROVIDER_DEGITALOCEANTYPE);
			String provider_DegitalOceandetails = properties.getProperty(PROVIDER_DEGITALOCEANDETAILS);
			String provider_vSpherename = properties.getProperty(PROVIDER_VSPHERENAME);
			String provider_vSpheretype = properties.getProperty(PROVIDER_VSPHERETYPE);
			String provider_vSpheredetails = properties.getProperty(PROVIDER_VSPHEREDETAILS);
			String provider_Azurename = properties.getProperty(PROVIDER_AZURENAME);
			String provider_Azuretype= properties.getProperty(PROVIDER_AZURETYPE);
			String provider_Azuredetails = properties.getProperty(PROVIDER_AZUREDETAILS);
			String provider_Dockername = properties.getProperty(PROVIDER_DOCKERNAME);
			String provider_Dockertype= properties.getProperty(PROVIDER_DOCKERTYPE);
			String provider_Dockerdetails= properties.getProperty(PROVIDER_DOCKERDETAILS);
			String provider_AWSregion= properties.getProperty(PROVIDER_AWSREGION);
			providerAttribute=new ProviderAttribute();
			providerAttribute.setprovider_AWSname(provider_AWSname);
			providerAttribute.setProvider_AWS_another_name(provider_AWS_another_name);
			providerAttribute.setprovider_AWStype(provider_AWStype);
			providerAttribute.setprovider_AWSdetails(provider_AWSdetails);
			providerAttribute.setprovider_DegitalOceanname(provider_DegitalOceanname);
			providerAttribute.setprovider_DegitalOceantype(provider_DegitalOceantype);
			providerAttribute.setprovider_DegitalOceandetails(provider_DegitalOceandetails);
			providerAttribute.setprovider_Azurename(provider_Azurename);
			providerAttribute.setprovider_Azuretype(provider_Azuretype);
			providerAttribute.setprovider_Azuredetails(provider_Azuredetails);
			providerAttribute.setprovider_Dockername(provider_Dockername);
			providerAttribute.setprovider_Dockertype(provider_Dockertype);
			providerAttribute.setprovider_Dockerdetails(provider_Dockerdetails);
			providerAttribute.setprovider_vSpherename(provider_vSpherename);
			providerAttribute.setprovider_vSpheretype(provider_vSpheretype);
			providerAttribute.setprovider_vSpheredetails(provider_vSpheredetails);
			providerAttribute.setProvider_AWSregion(provider_AWSregion);
			//set Aws region
			try {
				JSONParser parser = new JSONParser();
				Object obj = parser.parse(provider_AWSdetails);
				JSONObject jsonObject = (JSONObject) obj;
				String Provider_AWSregion = (String)jsonObject.get("region");
				providerAttribute.setProvider_AWSregion(provider_AWSregion);
			}
			catch(Exception e) {
				
			}
			return providerAttribute;
		}
		
		public static void getReadPropertiesFile() {
			if(providerAttribute == null){
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
