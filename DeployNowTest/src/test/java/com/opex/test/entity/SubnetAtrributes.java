package com.opex.test.entity;
import java.io.InputStream;
import java.util.Properties;
import com.opex.test.utils.FileUtils;

public class SubnetAtrributes{
	
	String subnet_rname;
	String subnet_vpc_Rname;
	String subnet_vpc_cidr;
	String subnet_cidr_block;
	String subnet_vpc_id;
	String subnet_Depends_On;
	String subnet_availability_zone;
	String subnet_map_public_ip_on;
	
	public String getsubnet_rname() {
		return subnet_rname ;
	}
	public void setsubnet_rname(String subnet_rname ) {
		this.subnet_rname  = subnet_rname ;
	}
	public String getSubnet_vpc_Rname() {
		return subnet_vpc_Rname ;
	}
	public void setSubnet_vpc_Rname(String subnet_vpc_Rname ) {
		this.subnet_vpc_Rname  = subnet_vpc_Rname ;
	}
	public String getSubnet_vpc_cidr() {
		return subnet_vpc_cidr ;
	}
	public void setSubnet_vpc_cidr(String subnet_vpc_cidr ) {
		this.subnet_vpc_cidr  = subnet_vpc_cidr ;
	}
	public String getSubnet_cidr_block() {
		return subnet_cidr_block ;
	}
	public void setSubnet_cidr_block(String subnet_cidr_block ) {
		this.subnet_cidr_block  = subnet_cidr_block ;
	}
	public String getSubnet_vpc_id() {
		return subnet_vpc_id ;
	}
	public void setSubnet_vpc_id(String subnet_vpc_id ) {
		this.subnet_vpc_id  = subnet_vpc_id ;
	}
	public String getSubnet_Depends_On() {
		return subnet_Depends_On ;
	}
	public void setSubnet_Depends_On(String subnet_Depends_On ) {
		this.subnet_Depends_On  = subnet_Depends_On ;
	}
	public String getSubnet_availability_zone() {
		return subnet_availability_zone ;
	}
	public void setSubnet_availability_zone(String subnet_availability_zone ) {
		this.subnet_availability_zone  = subnet_availability_zone ;
	}
	public String getSubnet_map_public_ip_on() {
		return subnet_map_public_ip_on ;
	}
	public void setSubnet_map_public_ip_on(String subnet_map_public_ip_on ) {
		this.subnet_map_public_ip_on  = subnet_map_public_ip_on ;
	}
	
	private static Properties properties;
	private static SubnetAtrributes subnetAttributes = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String SUBNET_RNAME="subnet_rname";
	private static final String VPC_RNAME = "subnet_vpc_Rname";
	private static final String VPC_CIDR ="subnet_vpc_cidr";
	private static final String CIDR_BLOCK = "subnet_cidr_block";
	private static final String VPC_ID = "subnet_vpc_id";
	private static final String DEPENDS_ON = "subnet_Depends_On";
	private static final String AVAILABILITY_ZONE = "subnet_availability_zone";
	private static final String MAP_PUBLIC_IP = "subnet_map_public_ip_on";
	
public static SubnetAtrributes getSubnetAtrributesFromProperties(){
		
	   
	    SubnetAtrributes.getReadPropertiesFile();
	    String subnet_rname = properties.getProperty(SUBNET_RNAME);
		String vpc_Rname = properties.getProperty(VPC_RNAME);
		String cidr_block = properties.getProperty(CIDR_BLOCK);
		String vpc_id = properties.getProperty(VPC_ID);
		String Depends_On = properties.getProperty(DEPENDS_ON);
		String availability_zone = properties.getProperty(AVAILABILITY_ZONE);
		String map_public_ip_on = properties.getProperty(MAP_PUBLIC_IP);
		String vpc_cidr = properties.getProperty(VPC_CIDR);
		
		subnetAttributes = new SubnetAtrributes();
		subnetAttributes.setsubnet_rname(subnet_rname);
		subnetAttributes.setSubnet_vpc_Rname(vpc_Rname);
		subnetAttributes.setSubnet_cidr_block(cidr_block);
		subnetAttributes.setSubnet_vpc_id(vpc_id);
		subnetAttributes.setSubnet_Depends_On(Depends_On);
		subnetAttributes.setSubnet_availability_zone(availability_zone);
		subnetAttributes.setSubnet_map_public_ip_on(map_public_ip_on);
		subnetAttributes.setSubnet_vpc_cidr(vpc_cidr);
		return subnetAttributes;
	}
public static void getReadPropertiesFile() {
	if(subnetAttributes == null || subnetAttributes ==null){
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