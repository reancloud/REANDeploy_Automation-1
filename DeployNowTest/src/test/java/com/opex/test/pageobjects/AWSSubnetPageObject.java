package com.opex.test.pageobjects;


import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AWSSubnetPageObject extends BaseClass{
    
    public AWSSubnetPageObject(WebDriver driver)
    {
   	 super(driver);
    } 

    @FindBy(how=How.XPATH, xpath="//*[@title='AWS Subnet']")
    public static WebElement resource_subnet;
    
    @FindBy(how=How.XPATH, xpath="//*[text()='cidr_block']/following::*[@ng-if='!a.possibleValues '][1]")
    public static WebElement resource_cidrblock;
    
    @FindBy(how=How.XPATH, xpath="//*[text()='vpc_id']/following::*[@ng-if='!a.possibleValues '][1]")
    public static WebElement resource_vpcid;
    
    @FindBy(how=How.XPATH, xpath="//*[contains(text(),'Depends On')]/following::*[@ng-model='sharedData.selectedResource.dependsOn']")
    public static WebElement resource_dependson;
    
    @FindBy(how=How.XPATH, xpath="//*[contains(text(),'Connection')]/following::select[3]")
    public static WebElement resource_connection;
    
    @FindBy(how=How.XPATH, xpath="//*[text()='availability_zone']/following::div[@class='ng-scope']//input[1]")
    public static WebElement resource_availability_zone;
    
    @FindBy(how=How.XPATH, xpath="//*[text()='map_public_ip...']/following::div[@class='ng-scope']//input[1]")
    public static WebElement resource_mappublic;
    
    @FindBy(how=How.XPATH, xpath=" //*[contains(text(),'map_public_ip...')]/following::*[@class='ng-isolate-scope']")
    public static WebElement resource_maplist;

    @FindBy(how=How.XPATH, xpath="//*[contains(text(),'map_public_ip_on_launch')]/following::*[@ng-if='!floatingLabel']")
    public static WebElement resource_maplist_click;
    
}




