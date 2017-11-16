package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class FlowLogAttributes {
	
	String flowLog_rname;
	String flowLog_depends_on;
	String flowLog_con;
	String flowLog_iamRoleArn;
	String flowLog_blankData;
	String flowLog_logGroupName;
	String flowLog_trafficType;
	String flowLog_vpcId;
	String flowLog_subnetId;
	String flowLog_eniId;
	String flowLog_VPC_rname;
	String flowLog_VPC_vpcId;
	String flowLog_CloudWatch_rname;
	String flowLog_IAMRole_assumeRolePolicy;
	String flowLog_IAMRole_rname;
	
	
	
	
	
	public String getFlowLog_rname() {
		return flowLog_rname ;
	}
	public void setFlowLog_rname(String flowLog_rname) {
		this.flowLog_rname  = flowLog_rname ;
	}
	public String getFlowLog_depends_on() {
		return flowLog_depends_on ;
	}
	public void setFlowLog_depends_on(String flowLog_depends_on) {
		this.flowLog_depends_on  = flowLog_depends_on ;
	}
	public String getFlowLog_con() {
		return flowLog_con ;
	}
	public void setFlowLog_con(String flowLog_con ) {
		this.flowLog_con  = flowLog_con ;
	}
	
	public String getFlowLog_iamRoleArn() {
		return flowLog_iamRoleArn;
	}
	public void setFlowLog_iamRoleArn(String flowLog_iamRoleArn) {
		this.flowLog_iamRoleArn  = flowLog_iamRoleArn ;
	}
	
	public String getflowLog_blankData() {
		return flowLog_blankData;
	}
	public void setflowLog_blankData(String flowLog_blankData) {
		this.flowLog_blankData  = flowLog_blankData ;
	}
	
	public String getFlowLog_logGroupName() {
		return flowLog_logGroupName;
	}
	public void setFlowLog_logGroupName(String flowLog_logGroupName) {
		this.flowLog_logGroupName = flowLog_logGroupName;
	}
	
	public String getFlowLog_VPC_rname() {
		return flowLog_VPC_rname;
	}
	public void setFlowLog_VPC_rname(String flowLog_VPC_rname) {
		this.flowLog_VPC_rname = flowLog_VPC_rname;
	}
	public String getFlowLog_subnetId() {
		return flowLog_subnetId;
	}
	public void setFlowLog_subnetId(String flowLog_subnetId) {
		this.flowLog_subnetId = flowLog_subnetId;
	}
	public String getFlowLog_VPC_vpcId() {
		return flowLog_VPC_vpcId;
	}
	public void setFlowLog_VPC_vpcId(String flowLog_VPC_vpcId) {
		this.flowLog_VPC_vpcId = flowLog_VPC_vpcId;
	}
	public String getFlowLog_eniId() {
		return flowLog_eniId;
	}
	public void setFlowLog_eniId(String flowLog_eniId) {
		this.flowLog_eniId = flowLog_eniId;
	}
	
	public String getFlowLog_trafficType() {
		return flowLog_trafficType;
	}
	public void setFlowLog_trafficType(String flowLog_trafficType) {
		this.flowLog_trafficType = flowLog_trafficType;
	}
	public String getFlowLog_CloudWatch_rname() {
		return flowLog_CloudWatch_rname;
	}
	public void setFlowLog_CloudWatch_rname(String flowLog_CloudWatch_rname) {
		this.flowLog_CloudWatch_rname = flowLog_CloudWatch_rname;
	}
	public String getFlowLog_vpcId() {
		return flowLog_vpcId;
	}
	public void setFlowLog_vpcId(String flowLog_vpcId) {
		this.flowLog_vpcId = flowLog_vpcId;
	}
	public String getFlowLog_IAMRole_assumeRolePolicy() {
		return flowLog_IAMRole_assumeRolePolicy;
	}
	public void setFlowLog_IAMRole_assumeRolePolicy(String flowLog_IAMRole_assumeRolePolicy) {
		this.flowLog_IAMRole_assumeRolePolicy = flowLog_IAMRole_assumeRolePolicy;
	}
	
	public String getFlowLog_IAMRole_IAMRole_rname() {
		return flowLog_IAMRole_rname;
	}
	public void setFlowLog_IAMRole_IAMRole_rname(String flowLog_IAMRole_rname) {
		this.flowLog_IAMRole_rname = flowLog_IAMRole_rname;
	}
	
	
	
	private static Properties properties;
	private static FlowLogAttributes flowLogDetails = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String FLOW_LOG_RNAME = "flowLog_rname";
	private static final String FLOW_LOG_DEPENDS_ON = "flowLog_depends_on";
	private static final String FLOW_LOG_CON = "flowLog_con";
	private static final String FLOW_LOG_IAM_ROLE_ARN = "flowLog_iamRoleArn";
	private static final String FLOW_LOG_BLANK_DATA = "flowLog_blankData";
	private static final String FLOW_LOG_TRAFFIC_TYPE = "flowLog_trafficType";
	private static final String FLOW_LOG_VPC_ID = "flowLog_vpcId";
	private static final String FLOW_LOG_SUBNET_ID = "flowLog_subnetId";
	private static final String FLOW_LOG_ENI_ID = "flowLog_eniId";
	private static final String FLOW_LOG_GROUP_NAME = "flowLog_logGroupName";
	private static final String FLOW_LOG_VPC_RNAME = "flowLog_VPC_rname";
	private static final String FLOW_LOG_VPC_VPC_ID = "flowLog_VPC_vpcId";
	private static final String FLOW_LOG_CLOUDWATCH_RNAME = "flowLog_CloudWatch_rname";
	private static final String FLOW_LOG_IAMROLE_RNAME = "flowLog_IAMRole_rname";
	private static final String FLOW_LOG_IAMROLE_ASSUME_ROLE_POLICY = "flowLog_IAMRole_assumeRolePolicy";
	
public static FlowLogAttributes getFlowLogFromProperties(){
		
		FlowLogAttributes.getReadPropertiesFile();
		String flowLog_rname = properties.getProperty(FLOW_LOG_RNAME);
		String flowLog_depends_on = properties.getProperty(FLOW_LOG_DEPENDS_ON);
		String flowLog_con = properties.getProperty(FLOW_LOG_CON);
		String flowLog_iamRoleArn = properties.getProperty(FLOW_LOG_IAM_ROLE_ARN);
		String flowLog_blankData = properties.getProperty(FLOW_LOG_BLANK_DATA);
		String flowLog_logGroupName = properties.getProperty(FLOW_LOG_GROUP_NAME);
		String flowLog_trafficType = properties.getProperty(FLOW_LOG_TRAFFIC_TYPE);
		String flowLog_vpcId = properties.getProperty(FLOW_LOG_VPC_ID);
		String flowLog_subnetId = properties.getProperty(FLOW_LOG_SUBNET_ID);
		String flowLog_eniId = properties.getProperty(FLOW_LOG_ENI_ID);
		String flowLog_VPC_rname = properties.getProperty(FLOW_LOG_VPC_RNAME);
		String flowLog_VPC_vpcId = properties.getProperty(FLOW_LOG_VPC_VPC_ID);
		String flowLog_CloudWatch_rname = properties.getProperty(FLOW_LOG_CLOUDWATCH_RNAME);
		String flowLog_IAMRole_assumeRolePolicy = properties.getProperty(FLOW_LOG_IAMROLE_ASSUME_ROLE_POLICY);
		String flowLog_IAMRole_rname = properties.getProperty(FLOW_LOG_IAMROLE_RNAME);
		
		
		
		
		flowLogDetails = new FlowLogAttributes();
		flowLogDetails.setFlowLog_rname(flowLog_rname);
		flowLogDetails.setFlowLog_depends_on(flowLog_depends_on);
		flowLogDetails.setFlowLog_con(flowLog_con);
		flowLogDetails.setFlowLog_iamRoleArn(flowLog_iamRoleArn);
		flowLogDetails.setflowLog_blankData(flowLog_blankData);
		flowLogDetails.setFlowLog_logGroupName(flowLog_logGroupName);
		flowLogDetails.setFlowLog_trafficType(flowLog_trafficType);
		flowLogDetails.setFlowLog_vpcId(flowLog_vpcId);
		flowLogDetails.setFlowLog_eniId(flowLog_eniId);
		flowLogDetails.setFlowLog_subnetId(flowLog_subnetId);
		flowLogDetails.setFlowLog_VPC_rname(flowLog_VPC_rname);
		flowLogDetails.setFlowLog_VPC_vpcId(flowLog_VPC_vpcId);
		flowLogDetails.setFlowLog_CloudWatch_rname(flowLog_CloudWatch_rname);
		flowLogDetails.setFlowLog_IAMRole_IAMRole_rname(flowLog_IAMRole_rname);
		flowLogDetails.setFlowLog_IAMRole_assumeRolePolicy(flowLog_IAMRole_assumeRolePolicy);
		return flowLogDetails;
	}
	public static void getReadPropertiesFile() {
		if(flowLogDetails == null){
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
