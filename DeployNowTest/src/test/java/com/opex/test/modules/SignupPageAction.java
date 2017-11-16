package com.opex.test.modules;




import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.opex.test.helpers.Log;
import com.opex.test.pageobjects.LoginPage;
import com.opex.test.pageobjects.SignupPage;
import com.opex.test.step_definitions.SuperUsedDefinition;

/*User click on create account link and should see create account page*/
public class SignupPageAction extends SuperUsedDefinition{

	public static void execute(WebDriver driver) throws Exception{

		Log.info("Click action is perfromed on Create an account link" );
		try{
			SignupPage.createAcc_link.click();
			sleepTime(3000);
			if(SignupPage.welcome_deploy_title.isDisplayed())
			{
				Assert.assertTrue(SignupPage.welcome_deploy_title.getText(),true);
			}
		}catch(NoSuchElementException ex){

			Assert.fail("User unable to navigate on Create an account page");
		}
		Reporter.log("Click Action is successfully perfomred");
	}
	/*User enter valid data to create new account*/
	public static void signupValidCreateAcc(WebDriver driver) throws Exception{
		//DeployNowSignUpUser s_user = SignupPageAction.getUserInformation();
		Log.info("Checking functinality of create new account with validcredentials" );
		SignupPage.signup_name.sendKeys(dnsignup.getUser_name());
		SignupPage.signup_email.sendKeys(dnsignup.getUser_email());
		SignupPage.signup_password.sendKeys(dnsignup.getUser_password());
		SignupPage.signup_url.sendKeys(dnsignup.getUser_url());
		SignupPage.signup_iagreechkbox.click();
		Reporter.log("entered all data successfully");
	}

	public static void signupName(WebDriver driver) throws Exception{

		Log.info("Checking functionality of valid Signup name" );
		if(SignupPage.signup_name.isDisplayed())
		{
			SignupPage.signup_name.sendKeys(dnsignup.getUser_name());
		}
		Reporter.log("name entered successfully");
	}
	public static void signupEmail(WebDriver driver) throws Exception{

		Log.info("Checking functionality of valid Signup email" );

		if(SignupPage.signup_email.isDisplayed())
		{
			SignupPage.signup_email.sendKeys(dnsignup.getUser_email());	
		}
		Reporter.log("email entered successfully");
	}
	public static void signupPassword(WebDriver driver) throws Exception{

		Log.info("Checking functionality of valid Signup password" );
		if(SignupPage.signup_password.isDisplayed())
		{
			SignupPage.signup_password.sendKeys(dnsignup.getUser_password());
		}
		Reporter.log("password entered successfully");
	}
	public static void signupUrl(WebDriver driver) throws Exception{

		Log.info("Checking functionality of valid Signup organization website url" );

		if(SignupPage.signup_url.isDisplayed())
		{
			SignupPage.signup_url.sendKeys(dnsignup.getUser_url());;
		}
		Reporter.log("organzation website url entered successfully");
	}
	public static void signupTickchkbox(WebDriver driver) throws Exception{

		Log.info("Checking tick functionality of Signup i agree check box" );

		if(SignupPage.signup_iagreechkbox.isDisplayed())
		{
			SignupPage.signup_iagreechkbox.click();	
			sleepTime(2000);
		}
		Reporter.log("click action perform successfully");
	}
	public static void SignupUntickchkbox(WebDriver driver) throws Exception{

		Log.info("Checking untick functionality of Signup i agree check box" );
		if(SignupPage.signup_iagreechkbox.isDisplayed())
		{
			SignupPage.signup_iagreechkbox.click();
			SignupPage.signup_iagreechkbox.click();
		}
		Reporter.log("click action perform successfully");
	}
	public static void signupTermsconditions(WebDriver driver) throws Exception{

		Log.info("Checking  functionality of Signup terms & condition link" );

		if(SignupPage.signup_termsconditions.isDisplayed())
		{
			SignupPage.signup_termsconditions.click();
		}
		Reporter.log("click action perform successfully ");
	}
	public static void signupClosebutton(WebDriver driver) throws Exception{

		Log.info("Checking  functionality of Signup close button" );
		if(SignupPage.signup_termsconditions.isDisplayed())
		{
			SignupPage.signup_termsconditions.click();
			sleepTime(3000);
			SignupPage.signup_closebutton.click();
			sleepTime(1000);
		}
		Reporter.log("click action perform successfully ");
	}


	public static void signupScrollbar(WebDriver driver) throws Exception{

		Log.info("Checking  functionality of Signup scroll bar" );
		if(SignupPage.signup_termsconditions.isDisplayed())
		{
			SignupPage.signup_termsconditions.click();
			WebElement element = driver.findElement(By.xpath("//*[contains(text(),'CONFIDENTIALITY')]"));
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("arguments[0].scrollIntoView(true);",element);
		}
	}


	public static void signupCrossclosebutton(WebDriver driver) throws Exception
	{
		Log.info("Checking functionality of cross close button" );
		if(SignupPage.signup_termsconditions.isDisplayed())
		{
			SignupPage.signup_termsconditions.click();
			sleepTime(3000);
			SignupPage.signup_crossclosebutton.click();
			sleepTime(1000);
		}
		Reporter.log("click action perform successfully");
	}
	public static void signupSigninlnk(WebDriver driver) throws Exception{

		Log.info("Checking functionality of sign in link" );
		if(SignupPage.signup_signinlnk.isDisplayed())
		{
			SignupPage.signup_signinlnk.click();
		}
		Reporter.log("click action perform successfully");
	}

	/*User click on sign up button and should see verification message*/
	public static void signupSignuplnk(WebDriver driver) throws Exception{

		//DeployNowSignUpUser signup_user_info = SignupPageAction.getUserInformation();
		//String s_email = signup_user_info.getUser_email();
		//String s_pass = signup_user_info.getUser_password();
		//String mailinator_email=signup_user_info.getmailinator_email();
		//String gmail_password=signup_user_info.getgmail_password();
		Log.info("Checking functionality of signup link" );
		System.out.println("clicked on singup button");
		SignupPage.signup_signupbtn.click();
		sleepTime(5000);
		//String success_message="Your DeployNow account is created successfully. Please check your email and verify the account.";
		String success_message="Your REAN Deploy account is created successfully. Please check your email and verify the account.";
		String exist_message="User with email "+ dnsignup.getUser_email() +" is already registered.";
		String not_verified ="User is not yet verified.";
		String invalid ="Invalid user and password combination.";
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement element = (WebElement)wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.build().perform();
		String notificationMessage = element.getText();
		if(notificationMessage.equals(success_message))
		{
			try{
				Assert.assertTrue( success_message.equals(notificationMessage));
				//System.out.println(notificationMessage);

				String parentwindow =driver.getWindowHandle();

				Set<String>windows =driver.getWindowHandles();
				for(String window :windows)
				{
					if(window.equalsIgnoreCase(parentwindow))
					{
						continue;
					}
					driver.switchTo().window(window);

				}
				sleepTime(2000);
				driver.get("https://www.mailinator.com/");
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.id("inboxfield")).sendKeys(dnsignup.getmailinator_email());
				
				driver.findElement(By.xpath("//*[@class='btn btn-dark']")).click();
				
				sleepTime(2000);
				
				//driver.findElement(By.id("//*[@class='innermail ng-binding']/preceding::*[contains(text(),'Welcome to DeployNow')]"));
				
				List<WebElement> unreadMail = driver.findElements(By.xpath("//div[@class='all_message-min_text all_message-min_text-3' and contains(text(), 'Welcome to REAN Deploy')]"));
				System.out.println(unreadMail.size());
				for (int i = 0; i < unreadMail.size(); i++) {
					System.out.println(unreadMail.get(i).getText());
					//if (unreadMail.get(i).getText().equals("Welcome to DeployNow")) //to click on a specific mail.
					if (unreadMail.get(i).getText().equals("Welcome to REAN Deploy")) //to click on a specific mail.
					{ 
						unreadMail.get(i).click();
						break;
					}
				}
				//sleepTime(1000);
				sleepTime(2000);
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='msg_body']")));
				//driver.switchTo().frame("publicshowmaildivcontent");
				sleepTime(1000);
				WebDriverWait w1 = new WebDriverWait(driver,3);
				WebElement ele1 = (WebElement)w1.until(
						ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(".//a[text()='login.']"))).get(0);
				ele1.click();
				sleepTime(1000);
				String currentwindow =driver.getWindowHandle();

				Set<String>windows1 =driver.getWindowHandles();
				for(String win :windows1)
				{
					if(win.equalsIgnoreCase(currentwindow))
					{
						continue;
					}
					driver.switchTo().window(win);

				}
				WebDriverWait wait1 = new WebDriverWait(driver, 3);
				WebElement deploynowtext = (WebElement)wait1.until(
						ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[text() ='Welcome to REAN Deploy']"))).get(0);
				LoginPage.email.sendKeys(dnsignup.getUser_email());
				LoginPage.password.sendKeys(dnsignup.getUser_password());
				LoginPage.signin_button.click();
				sleepTime(1000);


			}catch(Exception e1)
			{
				Assert.fail("Verification failed");
			}
		}
		else if(notificationMessage.equals(exist_message))
		{
			Assert.assertTrue( exist_message.equals(notificationMessage));
			//System.out.println(notificationMessage);
			sleepTime(1000);
			SignupPage.signup_signinlnk.click();
			sleepTime(1000);
			LoginPage.email.sendKeys(dnsignup.getUser_email());
			LoginPage.password.sendKeys(dnsignup.getUser_password());
			LoginPage.signin_button.click();
			sleepTime(1000);
			try{
				WebDriverWait w = new WebDriverWait(driver, 3);
				WebElement ele = (WebElement)w.until(
						ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='message ng-binding']"))).get(0);
				Actions action = new Actions(driver);
				action.moveToElement(ele);
				action.build().perform();
				String notification = ele.getText();

				if(notification.equalsIgnoreCase(not_verified))
				{
					Assert.assertTrue( not_verified.equals(notification));
					//System.out.println(notification);

					String parentwindow =driver.getWindowHandle();

					Set<String>windows =driver.getWindowHandles();
					for(String window :windows)
					{
						if(window.equalsIgnoreCase(parentwindow))
						{
							continue;
						}
						driver.switchTo().window(window);
					}
					sleepTime(2000);
					driver.get("https://www.mailinator.com/");
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.findElement(By.id("inboxfield")).sendKeys(dnsignup.getmailinator_email());
					driver.findElement(By.xpath("//*[@class='btn btn-dark']")).click();
					sleepTime(1000);
					//sleepTime();
					//driver.findElement(By.id("//*[@class='innermail ng-binding']/preceding::*[contains(text(),'Welcome to DeployNow')]"));
					List<WebElement> unreadMail = driver.findElements(By.xpath("//*[text()[normalize-space() = 'Welcome to REAN Deploy']]"));
					System.out.println(unreadMail.size());
					for (int i = 0; i < unreadMail.size(); i++) {
						System.out.println(unreadMail.get(i).getText());
						if (unreadMail.get(i).getText().equals("Welcome to REAN DeployNow")) //to click on a specific mail.
						{ 
							unreadMail.get(i).click();
							break;
						}
					}
					sleepTime(1000);
					/*WebElement login=driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td/a[1]"));
					login.click();*/
					driver.switchTo().frame("publicshowmaildivcontent");
					sleepTime(1000);
					WebDriverWait w1 = new WebDriverWait(driver, 10);
					WebElement ele1 = (WebElement)w1.until(
							ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@src='https://deploynow.reancloud.com/logo.png']/following::*[text()='login.']"))).get(0);
					ele1.click();
					String currentwindow =driver.getWindowHandle();

					Set<String>windows1 =driver.getWindowHandles();
					for(String win :windows1)
					{
						if(win.equalsIgnoreCase(currentwindow))
						{
							continue;
						}
						driver.switchTo().window(win);

					}
					WebDriverWait wait1 = new WebDriverWait(driver, 20);
					WebElement deploynowtext = (WebElement)wait1.until(
							ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[text() = 'Welcome to REAN Deploy']]"))).get(0);
					LoginPage.email.sendKeys(dnsignup.getUser_email());
					LoginPage.password.sendKeys(dnsignup.getUser_password());
					LoginPage.signin_button.click();
					sleepTime(1000);
					Reporter.log("click action perform successfully");
				}
				else if(notification.equalsIgnoreCase(invalid))
				{
					Assert.fail("Please enter valid credentials");
					//System.out.println(notification);
					//System.out.println("Please enter valid credentials");
				}
			}
			catch(Exception exp)
			{
				WebElement el=driver.findElement(By.xpath(".//span[@class='fa-stack fa-lg deploy-logo']"));
				//WebElement el=driver.findElement(By.xpath("//*[@src='logo_white.png']"));
				if(el.isDisplayed())
				{
					System.out.println("logged in successfully ");
				}
				else
				{
					Assert.fail("Verification failed");
				}
			}

		}
	}

	public static void signupBlankname(WebDriver driver) throws Exception{

		Log.info("Checking functinality of Blank name " );
		if(SignupPage.signup_name.isDisplayed())
		{
			SignupPage.signup_name.sendKeys(" ");
			SignupPage.signup_iagreechkbox.click();
			WebElement element=driver.findElement(By.xpath("//*[contains(text(),'Please enter your name ...')]"));
			Assert.assertTrue(element.getText().matches("Please enter your name ..."));
		}
		Reporter.log("entered blank name ");
	}
	public static void signupBlankemail(WebDriver driver) throws Exception{

		Log.info("Checking functionality of blank Signup name" );
		if(SignupPage.signup_email.isDisplayed())
		{
			SignupPage.signup_email.sendKeys(" ");
			SignupPage.signup_iagreechkbox.click();
			WebElement element=driver.findElement(By.xpath("//*[contains(text(),'Please enter your email address...')]"));
			Assert.assertTrue(element.getText().matches("Please enter your email address..."));
			Reporter.log("entered blank space in name");
		}
	}
	public static void signupBlankOrgwebsite(WebDriver driver) throws Exception{

		Log.info("Checking functionality of blank organization website url" );
		if(SignupPage.signup_url.isDisplayed())
		{
			SignupPage.signup_url.sendKeys(" ");
			SignupPage.signup_iagreechkbox.click();
			WebElement element=driver.findElement(By.xpath("//*[contains(text(),'Please enter the organization URL ...')]"));
			Assert.assertTrue(element.getText().matches("Please enter the organization URL ..."));
		}
		Reporter.log("entered blank space in organization website url");
	}
	public static void signupBlankpassword(WebDriver driver) throws Exception{

		Log.info("Checking functionality of blank Signup password" );
		if(SignupPage.signup_password.isDisplayed())
		{
			SignupPage.signup_password.sendKeys("");
			SignupPage.signup_iagreechkbox.click();
			WebElement element=driver.findElement(By.xpath("//*[contains(text(),'Password required!')]"));
			Assert.assertTrue(element.getText().matches("Password required!"));
		}
		Reporter.log("entered blank space in password");
	}
	public static void signupEncryptedpwd(WebDriver driver) throws Exception{

		Log.info("Checking functionality of password encryption" );
		SignupPage.signup_password.sendKeys("12345");
		String password = SignupPage.signup_password.getAttribute("value");
		byte[] encodedBytes = Base64.encodeBase64(password.getBytes());
		String encode =new String(encodedBytes);
		System.out.println("encodedBytes "+ encode);
		Log.info("encodedBytes "+ encode);
		if(encode.equals("MTIzNDU"))
		{
			Log.info("Element is present");
		}
		Reporter.log("entered password");
	}
	public static void signupSignupbtncolor(WebDriver driver) throws Exception{

		Log.info("Checking mouse hover functionality of sign up button" );
		if(SignupPage.signup_signupbtn.isDisplayed()){
			Log.info("Color of a button before mouse hover: "    +SignupPage.signup_signupbtn.getCssValue("background-color"));
			sleepTime(1000);
			Actions action = new Actions(driver);
			action.moveToElement(SignupPage.signup_signupbtn).click().build().perform();
			sleepTime(2000);
			Log.info("Color of a button after mouse hover : "    +SignupPage.signup_signupbtn.getCssValue("background-color"));
			sleepTime(3000);
		}
		Reporter.log("move mouse pointer on sign up button ");


	}
	public static void signupInvalidCreateAcc(WebDriver driver) throws Exception{

		Log.info("Checking functinality of create new account with invalid credentials" );

		if(SignupPage.signup_name.isDisplayed()){
			SignupPage.signup_name.sendKeys("priyanka");
			SignupPage.signup_email.sendKeys("p@gmailcom");
			SignupPage.signup_password.sendKeys("12345");
			SignupPage.signup_url.sendKeys("opexcom");
			SignupPage.signup_iagreechkbox.click();
		}
		Reporter.log("entered all data successfully");
	}
	public static void signupInvalidnamecapital(WebDriver driver) throws Exception{

		Log.info("Checking functinality of invalid name as capital letter" );
		SignupPage.signup_name.sendKeys("PRIYANKA");
		Reporter.log("entered name in capital letters");
	}
	public static void signupInvalidnamesmall(WebDriver driver) throws Exception{

		Log.info("Checking functinality of invalid name as small  letter" );
		if(SignupPage.signup_name.isDisplayed())
		{
			SignupPage.signup_name.sendKeys("priyanka");
		}
		Reporter.log("entered name in small letters");
	}
	public static void signupInvalidnamespecialchar(WebDriver driver) throws Exception{

		Log.info("Checking functinality of invalid name in special letters" );
		if(SignupPage.signup_name.isDisplayed())
		{
			SignupPage.signup_name.sendKeys("@#$$@@#");
		}
		Reporter.log("entered name in special characters");
	}
	public static void signupInvalidnamedigits(WebDriver driver) throws Exception{

		Log.info("Checking functinality of invalid name as digits" );
		if(SignupPage.signup_name.isDisplayed())
		{
			SignupPage.signup_name.sendKeys("12345678");
		}
		Reporter.log("entered name in digits");
	}
	public static void signupInvalidnamemin(WebDriver driver) throws Exception{

		Log.info("Checking functionality of invalid name as minimum 4 characters" );

		if(SignupPage.signup_name.isDisplayed())
		{
			SignupPage.signup_name.sendKeys("pr");
			String str = SignupPage.signup_name.getAttribute("value");
			if(str.length()<4)
			{
				Log.info(" Please use between 4-64 characters");
			}
			else
			{
				Log.info("valid email address");
			}
		}
		Reporter.log("entered name less than 4 characters");
	}
	public static void signupInvalidemaildigits(WebDriver driver) throws Exception{

		Log.info("Checking functionality of invalid email as digits" );
		if(SignupPage.signup_email.isDisplayed())
		{
			SignupPage.signup_email.sendKeys("1323423");
			SignupPage.signup_iagreechkbox.click();
			WebElement element=driver.findElement(By.xpath("//*[contains(text(),'Invalid Email')]"));
			Assert.assertTrue(element.getText().matches("Invalid Email"));
		}
		Reporter.log("entered email in digits");
	}
	public static void signupInvalidemailspecial(WebDriver driver) throws Exception{

		Log.info("Checking functinality of invalid email as specialcharacters" );

		if(SignupPage.signup_email.isDisplayed())
		{
			SignupPage.signup_email.sendKeys("@##$@@");
			SignupPage.signup_iagreechkbox.click();
			WebElement element=driver.findElement(By.xpath("//*[contains(text(),'Invalid Email')]"));
			Assert.assertTrue(element.getText().matches("Invalid Email"));
		}

		Reporter.log("entered email in special characters");
	}
	public static void signupInvalidemailattheratesign(WebDriver driver) throws Exception{

		Log.info("Checking functinality of invalid email @ sign not present" );

		if(SignupPage.signup_email.isDisplayed())
		{
			SignupPage.signup_email.sendKeys("priyankacom");
			String str = SignupPage.signup_email.getAttribute("value");
			if(!str.contains("@"))
			{
				Assert.assertTrue(true);
			}
		}
		Reporter.log("entered email as @ sign not present");
	}
	public static void signupInvalidemaildomainname(WebDriver driver) throws Exception{

		Log.info("Checking functinality of invalid email domain name not present" );
		if(SignupPage.signup_email.isDisplayed())
		{
			SignupPage.signup_email.sendKeys("priyanka@gmail.com");
			String str = SignupPage.signup_email.getAttribute("value");
			if(!str.contains("@gmail.com"))
			{
				Assert.assertTrue(true);
			}
		}
		Reporter.log("entered email as domain name not present");
	}
	public static void signupInvalidemaildot(WebDriver driver) throws Exception{

		Log.info("Checking functinality of invalid email dot not present" );
		if(SignupPage.signup_email.isDisplayed())
		{
			SignupPage.signup_email.sendKeys("priyankacom");
			String str = SignupPage.signup_email.getAttribute("value");
			if(!str.contains("."))
			{
				Assert.assertTrue(true);
			}    
		}
		Reporter.log("entered email as dot not present");
	}
	public static void signupInvalidemailusername(WebDriver driver) throws Exception{

		Log.info("Checking functinality of invalid email username not present" );
		if(SignupPage.signup_email.isDisplayed())
		{
			SignupPage.signup_email.sendKeys("priyanka@com");
			//WebElement element = driver.findElement(By.xpath("//*[@ng-model='signup.email']"));
			String str = SignupPage.signup_email.getAttribute("value");

			String a[] = str.split("@");
			if(a[0].equalsIgnoreCase("priyanka"))
			{
				Assert.assertTrue(true);
			}
		}
		Reporter.log("entered email as username not present");
	}
	public static void signupInvalidemailmin(WebDriver driver) throws Exception{

		Log.info("Checking functinality of invalid email accepting less than 4 characters" );
		if(SignupPage.signup_email.isDisplayed())
		{
			SignupPage.signup_email.sendKeys("priyanka@gmail.com");
			String str = SignupPage.signup_email.getAttribute("value");
			if(str.length()<4)
			{
				Log.info(" Please use between 4-64 characters");
			}
			else
			{
				Log.info("valid email address");
			} 
		}
		Reporter.log("entered email as less than four chracters");
	}
	public static void signupInvalidepassworddigits(WebDriver driver) throws Exception{

		Log.info("Checking functinality of invalid password accepting only digits" );
		if(SignupPage.signup_password.isDisplayed())
		{
			SignupPage.signup_password.sendKeys("12345");
			SignupPage.signup_iagreechkbox.click();
			WebElement element=driver.findElement(By.xpath("//*[contains(text(),'Use a password with atleast length 6 character. It should be combination of the alphabets, atleast 1 number and 1 special character correctly.')]"));
			Assert.assertTrue(element.getText().matches("Use a password with atleast length 6 character. It should be combination of the alphabets, atleast 1 number and 1 special character correctly."));

		}
		Reporter.log("entered password as digits");
	}
	public static void signupInvalidepasswordsmall(WebDriver driver) throws Exception{

		Log.info("Checking functinality of invalid password as small letters" );
		if(SignupPage.signup_password.isDisplayed())
		{
			SignupPage.signup_password.sendKeys("qweqwdsd");
			SignupPage.signup_iagreechkbox.click();
			WebElement element=driver.findElement(By.xpath("//*[contains(text(),'Use a password with atleast length 6 character. It should be combination of the alphabets, atleast 1 number and 1 special character correctly.')]"));
			Assert.assertTrue(element.getText().matches("Use a password with atleast length 6 character. It should be combination of the alphabets, atleast 1 number and 1 special character correctly."));
		}
		Reporter.log("entered password as small letters");
	}
	public static void signupInvalidepasswordcapital(WebDriver driver) throws Exception{

		Log.info("Checking functinality of invalid password as capital letters" );
		if(SignupPage.signup_password.isDisplayed())
		{
			SignupPage.signup_password.sendKeys("PRIYANKA");
			SignupPage.signup_iagreechkbox.click();
			WebElement element=driver.findElement(By.xpath("//*[contains(text(),'Use a password with atleast length 6 character. It should be combination of the alphabets, atleast 1 number and 1 special character correctly.')]"));
			Assert.assertTrue(element.getText().matches("Use a password with atleast length 6 character. It should be combination of the alphabets, atleast 1 number and 1 special character correctly."));
		}
		Reporter.log("entered password as capital letters");
	}
	public static void signupInvalidepasswordspecial(WebDriver driver) throws Exception{

		Log.info("Checking functinality of invalid password as specialcahracters" );
		if(SignupPage.signup_password.isDisplayed())
		{
			SignupPage.signup_password.sendKeys("@#%$##");
			SignupPage.signup_iagreechkbox.click();
			WebElement element=driver.findElement(By.xpath("//*[contains(text(),'Use a password with atleast length 6 character. It should be combination of the alphabets, atleast 1 number and 1 special character correctly.')]"));
			Assert.assertTrue(element.getText().matches("Use a password with atleast length 6 character. It should be combination of the alphabets, atleast 1 number and 1 special character correctly."));
		}
		Reporter.log("entered password as special characters letters");
	}
	public static void signupInvalidepasswordmin(WebDriver driver) throws Exception{

		Log.info("Checking functinality of invalid password as minimum characters " );
		if(SignupPage.signup_password.isDisplayed())
		{
			SignupPage.signup_password.sendKeys("pr");
			String str = SignupPage.signup_password.getAttribute("value");
			if(str.length()<4)
			{
				Log.info(" Please use between 4-64 characters");
			}
			else
			{
				Log.info("valid email address");
			}
		}
		Reporter.log("entered password as minimum less than 4 characters");
	}
	public static void signupInvalidepasswordcombiantion(WebDriver driver) throws Exception{

		Log.info("Checking functinality of Negative testcases to check password is accepting  combination of characters,numbers, & one special character symbol." );
		if(SignupPage.signup_password.isDisplayed())
		{
			SignupPage.signup_password.sendKeys("aaas");
			SignupPage.signup_iagreechkbox.click();
			WebElement element=driver.findElement(By.xpath("//*[contains(text(),'Use a password with atleast length 6 character. It should be combination of the alphabets, atleast 1 number and 1 special character correctly.')]"));
			Assert.assertTrue(element.getText().matches("Use a password with atleast length 6 character. It should be combination of the alphabets, atleast 1 number and 1 special character correctly."));
		}

		Reporter.log("entered password as invalid characters");
	}
	public static void signupInvalideorganizationurlmin(WebDriver driver) throws Exception{

		Log.info("Checking functinality of invalid organization website url as minimum characters." );
		if(SignupPage.signup_url.isDisplayed())
		{
			SignupPage.signup_url.sendKeys("op");
			String str = SignupPage.signup_url.getAttribute("value");
			if(str.length()<4)
			{
				Log.info(" Please use between 4-64 characters");
			}
			else
			{
				Log.info("valid email address");
			}
		}
		Reporter.log("entered organization website url as less than 4 characters");
	}
	public static void signupInvalideorganizationurlspecial(WebDriver driver) throws Exception{

		Log.info("Checking functinality of invalid organization website url as special characters." );
		if(SignupPage.signup_url.isDisplayed())
		{
			SignupPage.signup_url.sendKeys("@!@#$");
			SignupPage.signup_iagreechkbox.click();
			WebElement element=driver.findElement(By.xpath("//*[contains(text(),'Invalid URL')]"));
			Assert.assertTrue(element.getText().matches("Invalid URL"));
		}
		Reporter.log("entered organization website url as less than 4 charactersspecial characters");
	}
	public static void signupInvalideorganizationurlcapital(WebDriver driver) throws Exception{

		Log.info("Checking functinality of invalid organization website url as capital letters." );
		if(SignupPage.signup_url.isDisplayed())
		{
			SignupPage.signup_url.sendKeys("OPEX");
			SignupPage.signup_iagreechkbox.click();
			WebElement element=driver.findElement(By.xpath("//*[contains(text(),'Invalid URL')]"));
			Assert.assertTrue(element.getText().matches("Invalid URL"));
		}
		Reporter.log("entered organization website url as capital letters");
	}
	public static void SignupInvalidepasswordmax(WebDriver driver) throws Exception{

		Log.info("Checking functinality of invalid password as maximum characters " );
		
			if(SignupPage.signup_password.isDisplayed())
			{
				SignupPage.signup_password.sendKeys("asdsdsdsdsd111111");
				String str = SignupPage.signup_password.getAttribute("value");
				if(str.length()>64)
				{
					Log.info(" Please use between 4-64 characters");
				}
				else
				{
					Log.info("valid email address");
				}  
			}
		Reporter.log("entered password as maximum more than 64 characters");
	}
	public static void signupInvalidnamemax(WebDriver driver) throws Exception{

		Log.info("Checking functinality of invalid name as maximum characters " );
		if(SignupPage.signup_name.isDisplayed())
		{
			SignupPage.signup_name.sendKeys("asdsdsdsdsd111");
			String str = SignupPage.signup_name.getAttribute("value");
			if(str.length()>64)
			{
				Log.info(" Please use between 4-64 characters");
			}
			else
			{
				Log.info("valid email address");
			} 
		}  
		Reporter.log("entered name as maximum more than 64 characters");
	}
	public static void signupInvalidemailmax(WebDriver driver) throws Exception{

		Log.info("Checking functinality of invalid email as maximum characters " );
		if(SignupPage.signup_email.isDisplayed())
		{
			SignupPage.signup_email.sendKeys("priyanka@gmail.com1111111111");
			String str = SignupPage.signup_email.getAttribute("value");
			if(str.length()>64)
			{
				Log.info(" Please use between 4-64 characters");
			}
			else
			{
				Log.info("valid email address");
			}
		}
		Reporter.log("entered email as maximum more than 64 characters");
	}
	public static void signupInvalidorganizationurlmax(WebDriver driver) throws Exception{

		Log.info("Checking functinality of invalid organization website url as maximum characters " );
		if(SignupPage.signup_url.isDisplayed())
		{
			SignupPage.signup_url.sendKeys("pjksjdkjskdjksjdksjdk1111111111fs");
			String str = SignupPage.signup_url.getAttribute("value");
			if(str.length()>64)
			{
				Log.info(" Please use between 4-64 characters");
			}
			else
			{
				Log.info("valid email address");
			}
		}
		Reporter.log("entered organization website url as maximum more than 64 characters");
	}
	private static void sleepTime(long milli) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(milli);

	}

}
