package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClasses.LoginPageSauceDemoClass;
import com.SauceDemo.UtilityClasse.ScreenshotClass;

public class BaseClass 
{
	
	Logger log = Logger.getLogger("MavenProjectPractise");
	

	    WebDriver driver ;
		
	    @Parameters("browsername")
		@BeforeMethod
		
		public void Login( String browsername ) throws InterruptedException, IOException
		{
	    	if(browsername.equals("chrome"))
	    	{
		  System.setProperty("webdriver.chrome.driver", "./DriverFolder\\chromedriver.exe");
		
		 driver =new ChromeDriver ();
	    	}
	    	
	    	else if (browsername.equals("firefox"))
	    	{ 
	    		System.setProperty("webdriver.gecko.driver", "./DriverFolder/geckodriver.exe");
	    	
	    		driver = new FirefoxDriver();
	    	}
	    	else
	    	{
	    		System.out.println("throw the error"); 
	    	}
	    	
	    	
	    	
	    	PropertyConfigurator.configure("log4j.properties") ;
	    	
	    	log.info("Browser is open");

 
	    	
		driver.get("https://www.saucedemo.com/");
		
		
		log.info("Url is open");
		
		driver.manage().window().maximize();
		
		log.info("Url Window is maximized");
		
		
		driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
		
		LoginPageSauceDemoClass Lp = new LoginPageSauceDemoClass(driver);
		 
		Thread.sleep(2000);
		Lp.SendUsername();
		log.info("Username is Entered");
		
		
		Thread.sleep(2000);
		Lp.sendpassword();
		log.info("Password is Entered");
		
		
		Thread.sleep(2000);
		Lp.clickOnLogin();
	log.info("Click on login button");
	

	
	
		
//		LogoutSauceDemoClass LT = new LogoutSauceDemoClass(driver);
//		LT.ClickOnSettingButton();
//		LT.ClickLogoutButton();
		
		}
		
		
		
		
		@AfterMethod
		
		public void teardown()
		{
			
			driver.quit();
		}
		
		
		
		
		
		
		}




