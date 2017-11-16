package com.opex.test.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AWSIAMSCertificatePage {
	
	@FindBy(how=How.XPATH, xpath="//*[@id='sidebar-wrapper']//div[@title='AWS IAM Server Certificate']")
	public static WebElement resource_server_certificate;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='certificate_body']/following::*[text()='Set text'][1]")
	public static WebElement resource_server_certificatebody;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='private_key']/following::*[text()='Set text'][1]")
	public static WebElement resource_privatekey;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='certificate_chain']/following::*[text()='Set text'][1]")
	public static WebElement resource_certificatechain;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='name']/following::*[@type='text'][1]")
	public static WebElement resource_name;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='name_prefix']/following::*[@type='text'][1]")
	public static WebElement resource_name_prefix;
	
	@FindBy(how=How.XPATH, xpath="//*[text()='path']/following::*[@type='text'][1]")
	public static WebElement resource_path;

}
