package com.opex.test.step_definitions;




import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.Scenario;




public class applicationSD extends SuperUsedDefinition{

	public applicationSD()
	{
   	    super(); 	 
	}
   	 
		@When("^User redirect to the application URL$")
		public void User_is_redirected_to_application() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("url >"+url);
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
   
		@Then("^Verify User is on correct application URL$")
		public void Verify_user_is_on_correct_app() throws Throwable
		{
			Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(), 'Name')]")).getText(),true);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			String str = driver.findElement(By.xpath("//*[contains(text(), 'Name')]")).getText();
			System.out.println(str);
		}
		@When("^User enter the Name of the user$")
		public void User_enter_the_Name_of_the_user() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@ng-model='ctrl.user.name']")).sendKeys("sekhar");
			
		}
		@Then("^user enter the age of the user$")
		public void user_enter_the_age_of_the_user() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@ng-model='ctrl.user.age']")).sendKeys("27");
			
		}
		@Then("^user enter the salary of the user$")
		public void user_enter_the_salary_of_the_user() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@ng-model='ctrl.user.salary']")).sendKeys("30000");
			
		}
		@Then("^click the add button on the web page$")
		public void click_the_add_button_on_the_webpage() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@value='Add']")).click();
			driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		}
		
		
      
}   	 


