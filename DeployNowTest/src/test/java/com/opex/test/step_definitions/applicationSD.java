package com.opex.test.step_definitions;




import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.opex.test.modules.SignInAction;
import com.opex.test.modules.SignoutAction;
import com.opex.test.modules.SignupPageAction;
import com.opex.test.pageobjects.CommonPage;
import com.opex.test.pageobjects.LoginPage;
import com.opex.test.pageobjects.LogoutPage;
import com.opex.test.pageobjects.SignupPage;

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
			Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(), 'About Currency Converter')]")).getText(),true);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			String str = driver.findElement(By.xpath("//*[contains(text(), 'About Currency Converter')]")).getText();
			System.out.println(str);
		}
		
		@When("^User Clicks on currency converter link$")
		public void user_clicks_on_currency_converter_link() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id='form2']/ul/li[2]/a")).click();
			
		}
		
		@Then("^User should be redirected to currency converter page$")
		public void user_should_be_redirected_to_converter_page() throws Throwable
		{
			Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(), 'Convert Ghana Cedis to any other Currency')]")).getText(),true);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			String str = driver.findElement(By.xpath("//*[contains(text(), 'Convert Ghana Cedis to any other Currency')]")).getText();
			System.out.println(str);
		}
      
}   	 


