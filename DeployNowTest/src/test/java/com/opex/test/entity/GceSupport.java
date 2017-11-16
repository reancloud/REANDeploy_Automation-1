/*package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class GceSupports {
	
	String gce_instance_name;
	String disk;
	String machine_type;
	String network_interface;
	String zone;
	
	
	public String getDisk() {
		return disk;
	}
	public void setDisk(String disk) {
		this.disk =disk;
	}
	public String getMachine_type() {
		return machine_type;
	}
	public void setMachine_type(String machine_type) {
		this.machine_type =machine_type;
	}
	public String getNetwork_interface() {
		return network_interface;
	}
	public void setNetwork_interface(String network_interface) {
		this.network_interface = network_interface;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	
	public String getGce_instance_name() {
		return gce_instance_name;
	}
	public void setGce_instance_name(String gce_instance_name) {
		this.gce_instance_name = gce_instance_name;
	}
	
	
	private static Properties properties;
	private static GceSupports gceinstanceAttributes = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String DISK = "disk";
	private static final String GCE_INSTANCE_NAME = "gce_instance_name";
	private static final String MACHINE_TYPE = "machine_type";
	private static final String ZONE = "zone";
	private static final String NETWORK_INTERFACE = "network_interface";
	

	public static GceSupports getGceInstanceAttributesFromProperties() {
		
		GceSupports.getReadPropertiesFile();
		
		String disk = properties.getProperty(DISK);
		String gce_instance_name = properties.getProperty(GCE_INSTANCE_NAME);
		String machine_type = properties.getProperty(MACHINE_TYPE);
		String zone = properties.getProperty(ZONE);
		String network_interface = properties.getProperty(NETWORK_INTERFACE);
		
		
		gceinstanceAttributes = new  GceSupports();
		gceinstanceAttributes.setDisk(disk);
		gceinstanceAttributes.setGce_instance_name(gce_instance_name);
		gceinstanceAttributes.setMachine_type(machine_type);
		gceinstanceAttributes.setZone(zone);
		gceinstanceAttributes.setNetwork_interface(network_interface);
		
		return gceinstanceAttributes;
	}
	public static void getReadPropertiesFile() {
		if(gceinstanceAttributes == null){
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

*/