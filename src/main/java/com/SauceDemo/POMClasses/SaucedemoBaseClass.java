package com.SauceDemo.POMClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SaucedemoBaseClass 
{
    WebDriver driver ;
	
	@BeforeMethod
	
	public void Login() throws InterruptedException
	{
	  System.setProperty("webdriver.chrome.driver", "C:\\oraclexe\\chromedriver_win32 (3)\\chromedriver.exe");
	
	 driver =new ChromeDriver ();
	
	driver.get("https://www.saucedemo.com/");
	
	System.out.println("Url is open");
	
	driver.manage().window().maximize();
	
	System.out.println("Url Window is maximized");
	
	driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
	
	LoginPageSauceDemoClass Lp = new LoginPageSauceDemoClass(driver);
	 
	Thread.sleep(2000);
	Lp.SendUsername();
	System.out.println("Username is Entered");
	
	Thread.sleep(2000);
	Lp.sendpassword();
	System.out.println("Password is Entered");
	
	Thread.sleep(2000);
	Lp.clickOnLogin();
	System.out.println("Click on login button");
	
//	LogoutSauceDemoClass LT = new LogoutSauceDemoClass(driver);
//	LT.ClickOnSettingButton();
//	LT.ClickLogoutButton();
	
	}
	
	
	
	
	@AfterMethod
	
	public void teardown()
	{
		
		driver.quit();
	}
	
	
	
	
	
	
	}

