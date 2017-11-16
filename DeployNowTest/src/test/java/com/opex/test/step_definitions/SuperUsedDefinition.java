package com.opex.test.step_definitions;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.opex.test.entity.AwspecPackage;
import com.opex.test.entity.CloudwatchLogGroup;
import com.opex.test.entity.CommonFunctionalityAttributes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.opex.test.entity.AutoScalingGroup;
import com.opex.test.entity.Bastionhost;
import com.opex.test.entity.CloudTrail;
import com.opex.test.entity.KMSResource;
import com.opex.test.entity.RouteRecordAttributes;
import com.opex.test.entity.DNVPCDHCPAttributes;
import com.opex.test.entity.DependsOnAttributes;
import com.opex.test.entity.DeployNowSignInUser;
import com.opex.test.entity.DeployNowSignUpUser;
import com.opex.test.entity.EBSVolumeAttributes;
import com.opex.test.entity.EnvironmentAttributes;
import com.opex.test.entity.EnvironmentListAttributes;
import com.opex.test.entity.FlowLogAttributes;
import com.opex.test.entity.IAMGroupAttributes;
import com.opex.test.entity.KeyPairAttributes;
import com.opex.test.entity.MultilayerAPPAttributes;
import com.opex.test.entity.RouteAttributes;
import com.opex.test.entity.S3BucketObjectAttributes;
import com.opex.test.entity.SecuritygroupAttributes;
import com.opex.test.entity.SubnetAtrributes;
import com.opex.test.entity.SubnetGroupAttributes;
import com.opex.test.entity.TomcatAttributes;
import com.opex.test.entity.VPCAttributes;
import com.opex.test.entity.IAMInstanceProfileAttributes;
import com.opex.test.entity.IAMRolePolicyAttributes;
import com.opex.test.entity.IAMPolicyAttributes;
import com.opex.test.entity.IAMRoleAttributes;
import com.opex.test.entity.InputVariablesAttributes;
import com.opex.test.entity.InstanceAttributes;
import com.opex.test.entity.JavaDetails;
import com.opex.test.entity.WebUrl;
import com.opex.test.helpers.DataHelper;
import com.opex.test.pageobjects.CommonPage;
import com.opex.test.entity.NatgatewayAttributes;
import com.opex.test.entity.NetworkInterfaceAttributes;
import com.opex.test.entity.VPCendpointAttributes;
import com.opex.test.entity.RouteTableAttributes;
import com.opex.test.entity.RouteTableAssociationAttribute;
import com.opex.test.entity.EIPAttributes;
import com.opex.test.entity.EcsTaskAttributes;
import com.opex.test.entity.OutputAttributes;
import com.opex.test.entity.Philips_Usecase_Attributes;
import com.opex.test.entity.ProfileAttributes;
import com.opex.test.entity.InternetGatewayAttributes;
import com.opex.test.entity.NetworkaclAttribute;
import com.opex.test.entity.ProviderAttribute;
import com.opex.test.entity.ConnectionAttributes;
import com.opex.test.entity.RoutezoneAtrribute;
import com.opex.test.entity.S3bucketAttribute;
import com.opex.test.entity.ELBAttributes;
import com.opex.test.entity.ELBAttachmentAttributes;
import com.opex.test.entity.EcsClusterAttributes;
import com.opex.test.entity.RDSAttribute;
import com.opex.test.entity.IAMServerCertificateAttribute;
import com.opex.test.entity.vpcPeeringAttributes;
import com.opex.test.entity.Bastionhost;

public class SuperUsedDefinition 
{
	public WebDriver driver;
	public static List<HashMap<String,String>> datamap = null;
	public static String url = null;
	public static EnvironmentAttributes dnowEnv = null;
	public static KeyPairAttributes dnKeyPair = null;
	public static RouteRecordAttributes dnowRouteRecord = null;
	public static DNVPCDHCPAttributes dnowVPCDHCP = null;
	public static IAMInstanceProfileAttributes dnIMIP = null;
	public static CommonFunctionalityAttributes dnowCommanfun = null;
	public static RouteAttributes dnRoute = null;
	public static AwspecPackage dnowawspec =null;
	public static S3BucketObjectAttributes dnS3BucketObject = null;
	public static DependsOnAttributes dnDependsOn = null;
	public static TomcatAttributes dntomcat_install = null;
	public static JavaDetails dnjava_install = null;
	public static NatgatewayAttributes dnNatgateway=null;
	public static VPCendpointAttributes dnVpcendpoint=null;
	public static InstanceAttributes dnInstance = null;
	public static InputVariablesAttributes dnInputVariables = null;
	public static VPCAttributes dnVpc=null;
	public static SubnetAtrributes dnsubnet =null;
	public static CloudwatchLogGroup dncloud=null;
	public static RouteTableAttributes dnRT=null;
	public static SecuritygroupAttributes dnsecurity =null;
	public static EIPAttributes dnEip=null;
	public static OutputAttributes dnOutput=null;
	public static InternetGatewayAttributes dnIGW = null;
	public static NetworkaclAttribute dnNetworkACL=null;
	public static IAMGroupAttributes dnIamGroup = null;
	public static ProviderAttribute dnProvider=null;
	public static EcsTaskAttributes ecstaskdef=null;
	public static FlowLogAttributes dnFlowLog = null;
	public static ConnectionAttributes dncon = null;
	public static S3bucketAttribute dns3bucket =null;
	public static RoutezoneAtrribute dnroutzone =null;	 
	public static RouteTableAssociationAttribute dnRTA =null;
	public static IAMPolicyAttributes dnIamPolicy = null;
	public static EBSVolumeAttributes dnEbsVolume = null;
	public static IAMRoleAttributes dnIamRole = null;
	public static ELBAttributes dnElb=null;
	public static ELBAttachmentAttributes dnElbA=null;
	public static IAMRolePolicyAttributes dnIMRP=null;
	public static RDSAttribute dnRDS =null;
	public static SubnetGroupAttributes dnSubnetGroup = null;
	public static IAMServerCertificateAttribute dncertificate = null;
	public static vpcPeeringAttributes dnVPeering=null;
	public static EcsClusterAttributes dnEcsCluster = null;
	public static NetworkInterfaceAttributes dnNetworkInterface = null;
	public static DeployNowSignUpUser dnsignup =null;
	public static EnvironmentListAttributes dnEnvListAttributes = null;
	public static ProfileAttributes dnProfileAttributes = null;
	public static MultilayerAPPAttributes dnAppAttributes = null;
         public static  CloudTrail dncloudtrailattributes=null;
         public static Philips_Usecase_Attributes dnPU=null;
         public static Bastionhost dnbastionattributes=null;
          public static KMSResource kmsattributes=null;
          public static AutoScalingGroup dnauto=null;


	public SuperUsedDefinition() {
		// initializing driver
		driver = Hooks.driver;
		// adding list to map
		datamap = new ArrayList<HashMap<String,String>>();
		DeployNowSignInUser dnowUser = DataHelper.getUserFromPropertiesFile();
		HashMap<String,String> sampleData = new HashMap<String,String>();
		sampleData.put("username",dnowUser.getEmail());
		sampleData.put("password",dnowUser.getPassword());
		datamap.add(sampleData);

		WebUrl dnowUrl = DataHelper.getUrlFromPropertiesFile();
		url = dnowUrl.getTarget_url();
		dnsignup=DataHelper.getSignUpUserFromPropertiesFile();
		dnowEnv = EnvironmentAttributes.getEnvDetailsFromPropertiesFile();

		dnKeyPair = KeyPairAttributes.getKeyPairAttributesFromProperties();
		//dnKeyPair = DataHelper.getKeyPairAttributesFromProperties();

		dnowRouteRecord = RouteRecordAttributes.getRouterecordDetailsFromPropertiesFile();

		dnowVPCDHCP=DNVPCDHCPAttributes.getVPCDHCPDetailsFromPropertiesFile();

		dnowCommanfun =CommonFunctionalityAttributes.getCommanDetailsFromPropertiesFile();

		dnRoute = RouteAttributes.getRouteAttributesFromProperties();

		dnowawspec =DataHelper.getawsspecDetailsFromPropertiesFile();

		dnS3BucketObject = S3BucketObjectAttributes.getS3BucketObjectAttributesFromProperties();

		dnDependsOn = DependsOnAttributes.getDependsOnAttributesFromProperties();

		dntomcat_install = TomcatAttributes.getTomcat_DetailsFromProperties();

		dnjava_install = JavaDetails.getjava_DetailsFromProperties();

		dnNatgateway=NatgatewayAttributes.getNatgatewayAttributesFromProperties();

		dnVpcendpoint=VPCendpointAttributes.getVPCendpointAttributesFromProperties();

		dnInstance = InstanceAttributes.getInstanceAttributesFromProperties();

		dnInputVariables = InputVariablesAttributes.getInputVariablesAttributesFromProperties();

		dnVpc=VPCAttributes.getVPCAttributesFromProperties();

		dnsubnet = SubnetAtrributes.getSubnetAtrributesFromProperties();

		dncloud =CloudwatchLogGroup.getCloudwatch_log_groupFromProperties();

		dnRT=RouteTableAttributes.getRouteTableAttributesFromProperties();

		dnsecurity =SecuritygroupAttributes.getSecurityAtrributesFromProperties();

		dnEip=EIPAttributes.getEIPAttributesFromProperties();

		dnOutput=OutputAttributes.getOutputAttributesFromProperties();

		dnIGW = InternetGatewayAttributes.getInternetGatewayAttributesFromProperties();

		dnNetworkACL=NetworkaclAttribute.getNetworkACLAttributesFromProperties();

		dnIamGroup = IAMGroupAttributes.getIAM_groupFromProperties();

		dnProvider=ProviderAttribute.getProviderAttributeFromProperties();

		dnFlowLog = FlowLogAttributes.getFlowLogFromProperties();

		dncon = ConnectionAttributes.getConDetailsFromProperties();

		dns3bucket =S3bucketAttribute.getS3bucketAttributeFromProperties();

		dnroutzone =RoutezoneAtrribute.getRoutezoneAtrributeFromProperties();

		dnRTA=RouteTableAssociationAttribute.getRTAAttributeFromProperties();

		dnIamPolicy = IAMPolicyAttributes.getIAM_PolicyFromProperties();


		dnEbsVolume = EBSVolumeAttributes.getEBS_VolumeFromProperties();

		dnIamRole = IAMRoleAttributes.getIAM_RoleFromProperties();

		dnElb=ELBAttributes.getELBAttributesFromProperties();

		dnElbA=ELBAttachmentAttributes.getELBAttachmentAttributesFromProperties();

		dnIMRP=IAMRolePolicyAttributes.getIAMRolePolicyAttributesFromProperties();

		dnRDS =RDSAttribute.getRDSAttributeFromProperties();

		dnSubnetGroup = SubnetGroupAttributes.getSubnetGroupFromProperties();

		dncertificate =IAMServerCertificateAttribute.getIAM_Server_CertificateAttributeFromProperties();

		dnVPeering=vpcPeeringAttributes.getvpcPeeringAttributesFromProperties();

		dnEcsCluster = EcsClusterAttributes.getECSClusterFromProperties();

		dnNetworkInterface = NetworkInterfaceAttributes.getNetworkInterfaceFromProperties();

		dnIMIP=IAMInstanceProfileAttributes.getIAMInstanceProfileAttributesFromProperties();
		
		dnEnvListAttributes = EnvironmentListAttributes.getEnvListFromProperties();
		
		dnProfileAttributes = ProfileAttributes.getProfileFromProperties();
		
		dnAppAttributes = MultilayerAPPAttributes.getMultilayerAPPFromProperties();
                
                dncloudtrailattributes=CloudTrail.getCloudTrailFromPropertiesFile();

                dnPU=Philips_Usecase_Attributes.getPhilipsUsecaseFromProperties();
                 
              	dnbastionattributes=Bastionhost.getBastionhostFromPropertiesFile();
		
		kmsattributes=KMSResource.getKmsAttributesFromProperties();
		
		dnauto=AutoScalingGroup.getAutoScalingGroupFromProperties();


		// for loading CommonPage class at once 


		PageFactory.initElements(driver, CommonPage.class);
	}

}
