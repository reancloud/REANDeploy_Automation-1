package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class AutoScalingGroup {
	
	String launch_config_name;
	String image_id;
	String instance_type;
	String auto_scaling_name;
	String launch_configuration;
	String max_size;
	String min_size;
	String Availability_zones;
	
	public String getLaunch_config_name()
	{
		return launch_config_name;
	}
	public String getImage_id()
	{
		return image_id;
	}
	public String getInstance_type()
	{
		return instance_type;
	}
	public String getAuto_scaling_name()
	{
		return auto_scaling_name;
	}
	public String getLaunch_configuration()
	{
		return launch_configuration;
	}
	public String getMax_size()
	{
		return max_size;
	}
	public String getMin_size()
	{
		return min_size;
	}
	public String getAvailability_zones()
	{
		return Availability_zones;
	}
	
	public void setAvailability_zones(String Availability_zones)
	{
		this.Availability_zones=Availability_zones;
	}
	public void setMin_size(String min_size)
	{
		this.min_size=min_size;
	}
	public void setMax_size(String max_size)
	{
		this.max_size=max_size;
	}
	public void setLaunch_configuration(String launch_configuration)
	{
	  this.launch_configuration=launch_configuration;	
	}
	public void setLaunch_config_name(String launch_config_name)
	{
		this.launch_config_name=launch_config_name;
	}
    public void setAuto_scaling_name(String auto_scaling_name)
    {
    	this.auto_scaling_name=auto_scaling_name;
    }
    public void setImage_id(String image_id)
    {
    	this.image_id=image_id;
    }
    public void setInstance_type(String instance_type)
    {
    	this.instance_type=instance_type;
    }
    private static Properties properties;
	private static AutoScalingGroup autoscalingAttributes = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String LAUNCH_CONFIG_NAME = "launch_config_name";
	private static final String IMAGE_ID = "image_id";
	private static final String INSTANCE_TYPE = "instance_type";
	private static final String AUTO_SCALING_NAME = "auto_scaling_name";
	private static final String LAUNCH_CONFIGURATION = "launch_configuration";
	private static final String MIN_SZIE = "min_size";
	private static final String MAX_SIZE = "max_size";
	private static final String AVAILABILITY_ZONE = "Availability_zones";
	
	
public static AutoScalingGroup getAutoScalingGroupFromProperties(){
		
	AutoScalingGroup.getReadPropertiesFile();
		String  launch_config_name= properties.getProperty(LAUNCH_CONFIG_NAME);
		String image_id = properties.getProperty(IMAGE_ID);
		String instance_type = properties.getProperty(INSTANCE_TYPE);
		String auto_scaling_name = properties.getProperty( AUTO_SCALING_NAME);
		String launch_configuration = properties.getProperty(LAUNCH_CONFIGURATION);
		String min_size = properties.getProperty(MIN_SZIE);
		String max_size = properties.getProperty(MAX_SIZE);
		String Availability_zones = properties.getProperty(AVAILABILITY_ZONE);
		autoscalingAttributes = new AutoScalingGroup();
		autoscalingAttributes.setAuto_scaling_name(auto_scaling_name);
		autoscalingAttributes.setAvailability_zones(Availability_zones);
		autoscalingAttributes.setImage_id(image_id);
		autoscalingAttributes.setInstance_type(instance_type);
		autoscalingAttributes.setLaunch_config_name(launch_config_name);
		autoscalingAttributes.setLaunch_configuration(launch_configuration);
		autoscalingAttributes.setMax_size(max_size);
		autoscalingAttributes.setMin_size(min_size);
		return autoscalingAttributes;
	}
	public static void getReadPropertiesFile() {
		if(autoscalingAttributes == null || autoscalingAttributes == null){
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
