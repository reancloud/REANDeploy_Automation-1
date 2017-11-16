package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class EBSVolumeAttributes {
	
	String ebsVolume_rname;
	String ebsVolume_depends_on;
	String ebsVolume_con;
	String ebsVolume_encrypted;
	String ebsVolume_blankData;
	String ebsVolume_iops;
	String ebsVolume_kmsKeyId;
	String ebsVolume_size;
	String ebsVolume_snapshotId;
	String ebsVolume_tags;
	String ebsVolume_type;
	String ebsVolume_availabilityZone;

	public String getEbsVolume_rname() {
		return ebsVolume_rname ;
	}
	public void setEbsVolume_rname(String ebsVolume_rname) {
		this.ebsVolume_rname  = ebsVolume_rname ;
	}
	public String getEbsVolume_depends_on() {
		return 	ebsVolume_depends_on ;
	}
	public void setEbsVolume_depends_on(String ebsVolume_depends_on) {
		this.ebsVolume_depends_on  = ebsVolume_depends_on ;
	}
	public String getEbsVolume_con() {
		return ebsVolume_con ;
	}
	public void setEbsVolume_con(String ebsVolume_con ) {
		this.ebsVolume_con  = ebsVolume_con ;
	}
	
	public String getEbsVolume_encrypted() {
		return ebsVolume_encrypted;
	}
	public void setEbsVolume_encrypted(String ebsVolume_encrypted) {
		this.ebsVolume_encrypted  = ebsVolume_encrypted ;
	}
	
	public String getEbsVolume_blankData() {
		return ebsVolume_blankData;
	}
	public void setEbsVolume_blankData(String ebsVolume_blankData) {
		this.ebsVolume_blankData  = ebsVolume_blankData ;
	}
	
	public String getEbsVolume_iops() {
		return ebsVolume_iops;
	}
	public void setEbsVolume_iops(String ebsVolume_iops) {
		this.ebsVolume_iops = ebsVolume_iops;
	}
	
	public String getEbsVolume_kmsKeyId() {
		return ebsVolume_kmsKeyId;
	}
	public void setEbsVolume_kmsKeyId(String ebsVolume_kmsKeyId) {
		this.ebsVolume_kmsKeyId = ebsVolume_kmsKeyId;
	}
	public String getEbsVolume_size() {
		return ebsVolume_size;
	}
	public void setEbsVolume_size(String ebsVolume_size) {
		this.ebsVolume_size = ebsVolume_size;
	}
	public String getEbsVolume_tags() {
		return ebsVolume_tags;
	}
	public void setEbsVolume_tags(String ebsVolume_tags) {
		this.ebsVolume_tags = ebsVolume_tags;
	}
	public String getEbsVolume_snapshotId() {
		return ebsVolume_snapshotId;
	}
	public void setEbsVolume_snapshotId(String ebsVolume_snapshotId) {
		this.ebsVolume_snapshotId = ebsVolume_snapshotId;
	}
	public String getEbsVolume_type() {
		return ebsVolume_type;
	}
	public void setEbsVolume_type(String ebsVolume_type) {
		this.ebsVolume_type = ebsVolume_type;
	}
	public String getEbsVolume_availabilityZone() {
		return ebsVolume_availabilityZone;
	}
	public void setEbsVolume_availabilityZone(String ebsVolume_availabilityZone) {
		this.ebsVolume_availabilityZone = ebsVolume_availabilityZone;
	}
		
	private static Properties properties;
	private static EBSVolumeAttributes ebsVolumeDetails = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
	private static final String EBSVOLUME_RNAME = "ebsVolume_rname";
	private static final String EBSVOLUME_DEPENDS_ON = "ebsVolume_depends_on";
	private static final String EBSVOLUME_CON = "ebsVolume_con";
	private static final String EBSVOLUME_ENCRYPTED = "ebsVolume_encrypted";
	private static final String EBSVOLUME_BLANK_DATA = "ebsVolume_blankData";
	private static final String EBSVOLUME_IOPS = "ebsVolume_iops";
	private static final String EBSVOLUME_KMSKEYID = "ebsVolume_kmsKeyId";
	private static final String EBSVOLUME_SIZE = "ebsVolume_size";
	private static final String EBSVOLUME_TAGS = "ebsVolume_tags";
	private static final String EBSVOLUME_TYPE = "ebsVolume_type";
	private static final String EBSVOLUME_SNAPSHOTID = "ebsVolume_snapshotId";
	private static final String EBSVOLUME_AVAILABILITYZONE = "ebsVolume_availabilityZone";
	
	public static EBSVolumeAttributes getEBS_VolumeFromProperties(){
		
		EBSVolumeAttributes.getReadPropertiesFile();
		
		String ebsVolume_rname = properties.getProperty(EBSVOLUME_RNAME);
		String ebsVolume_depends_on = properties.getProperty(EBSVOLUME_DEPENDS_ON);
		String ebsVolume_con = properties.getProperty(EBSVOLUME_CON);
		String ebsVolume_encrypted = properties.getProperty(EBSVOLUME_ENCRYPTED);
		String ebsVolume_blankData = properties.getProperty(EBSVOLUME_BLANK_DATA);
		String ebsVolume_iops = properties.getProperty(EBSVOLUME_IOPS);
		String ebsVolume_kmsKeyId = properties.getProperty(EBSVOLUME_KMSKEYID);
		String ebsVolume_size = properties.getProperty(EBSVOLUME_SIZE);
		String ebsVolume_snapshotId = properties.getProperty(EBSVOLUME_SNAPSHOTID);
		String ebsVolume_tags = properties.getProperty(EBSVOLUME_TAGS);
		String ebsVolume_type = properties.getProperty(EBSVOLUME_TYPE);
		String ebsVolume_availabilityZone = properties.getProperty(EBSVOLUME_AVAILABILITYZONE);

		ebsVolumeDetails = new EBSVolumeAttributes();
		
		ebsVolumeDetails.setEbsVolume_rname(ebsVolume_rname);
		ebsVolumeDetails.setEbsVolume_depends_on(ebsVolume_depends_on);
		ebsVolumeDetails.setEbsVolume_con(ebsVolume_con);
		ebsVolumeDetails.setEbsVolume_encrypted(ebsVolume_encrypted);
		ebsVolumeDetails.setEbsVolume_iops(ebsVolume_iops);
		ebsVolumeDetails.setEbsVolume_blankData(ebsVolume_blankData);
		ebsVolumeDetails.setEbsVolume_kmsKeyId(ebsVolume_kmsKeyId);
		ebsVolumeDetails.setEbsVolume_size(ebsVolume_size);
		ebsVolumeDetails.setEbsVolume_snapshotId(ebsVolume_snapshotId);
		ebsVolumeDetails.setEbsVolume_availabilityZone(ebsVolume_availabilityZone);
		ebsVolumeDetails.setEbsVolume_tags(ebsVolume_tags);
		ebsVolumeDetails.setEbsVolume_type(ebsVolume_type);
		
		return ebsVolumeDetails;
	}
	public static void getReadPropertiesFile() {
		if(ebsVolumeDetails == null){
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
