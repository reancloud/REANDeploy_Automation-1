package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class SecuritygroupAttributes {
	
	String security_egress;
	String security_ingress;
	String security_rname;
	String security_name;
	String security_dpendson;
	String security_connection;
	String security_description;
	String security_vpcid;
	
	public String getsecurity_rname() {
		return security_rname ;
	}
	public void setsecurity_rname(String security_rname ) {
		this.security_rname  = security_rname ;
	}
	public String getsecurity_name() {
		return security_name ;
	}
	public void setsecurity_name(String security_name ) {
		this.security_name  = security_name ;
	}
	public String getsecurity_dpendson() {
		return security_dpendson ;
	}
	public void setsecurity_dpendson(String security_dpendson ) {
		this.security_dpendson  = security_dpendson ;
	}
	public String getsecurity_connection() {
		return security_connection ;
	}
	public void setsecurity_connection(String security_connection ) {
		this.security_connection  = security_connection ;
	}
	public String getsecurity_description() {
		return security_description ;
	}
	public void setsecurity_description(String security_description ) {
		this.security_description  = security_description ;
	}
	public String getsecurity_vpcid() {
		return security_vpcid ;
	}
	public void setsecurity_vpcid(String security_vpcid ) {
		this.security_vpcid  = security_vpcid ;
	}
	public String getsecurity_egress() {
		return security_egress ;
	}
	public void setsecurity_egress(String security_egress ) {
		this.security_egress  = security_egress ;
	}
	public String getsecurity_ingress() {
		return security_ingress ;
	}
	public void setsecurity_ingress(String security_ingress ) {
		this.security_ingress  = security_ingress ;
	}
	
	private static Properties properties;
	private static SecuritygroupAttributes securityAttributes = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	
	private static final String SECURITY_EGRESS = "security_egress";
	private static final String SECURITY_INGRESS ="security_ingress";
	private static final String SECURITY_RNAME = "security_rname";
	private static final String SECURITY_NAME ="security_name"; 
	private static final String SECURITY_DEPENDSON = "security_dpendson";
	private static final String SECURITY_CONNECTION ="security_connection";
	private static final String SECURITY_DESCRIPTION = "security_description";
	private static final String SECURITY_VPCID ="security_vpcid";
	
public static SecuritygroupAttributes getSecurityAtrributesFromProperties(){
		
	   
	    SecuritygroupAttributes.getReadPropertiesFile();
		String security_egress = properties.getProperty(SECURITY_EGRESS);
		String security_ingress = properties.getProperty(SECURITY_INGRESS);
		String security_rname = properties.getProperty(SECURITY_RNAME);
		String security_name = properties.getProperty(SECURITY_NAME);
		String security_dpendson = properties.getProperty(SECURITY_DEPENDSON);
		String security_connection = properties.getProperty(SECURITY_CONNECTION);
		String security_description = properties.getProperty(SECURITY_DESCRIPTION);
		String security_vpcid = properties.getProperty(SECURITY_VPCID);
		
		securityAttributes = new SecuritygroupAttributes();
		securityAttributes.setsecurity_egress(security_egress);
		securityAttributes.setsecurity_ingress(security_ingress);
		securityAttributes.setsecurity_rname(security_rname);
		securityAttributes.setsecurity_name(security_name);
		securityAttributes.setsecurity_dpendson(security_dpendson);
		securityAttributes.setsecurity_connection(security_connection);
		securityAttributes.setsecurity_description(security_description);
		securityAttributes.setsecurity_vpcid(security_vpcid);
		return securityAttributes;
		
	}
public static void getReadPropertiesFile() {
	if(securityAttributes == null || securityAttributes ==null){
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
