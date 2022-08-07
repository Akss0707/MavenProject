package com.SauceDemo.TestClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePageSaucedemo;
import com.SauceDemo.POMClasses.LoginPageSauceDemoClass;

public class VerifyHomePage extends BaseClass
{
	
	@Test
	public void homepage()
	{
		
		HomePageSaucedemo Hs= new HomePageSaucedemo(driver);
		
		
		
		Hs.SelectProductContainer();
		
		log.info("Clicked on product container");
		
		
//	------------------------------------------------------------------------------------
		
		Hs.SelectSettingButton();
		
		log.info("Clicked on setting Button");
		
//-------------------------------------------------------------------------------------
		
		Hs.SelectAllItems();
		
		log.info("Clicked on All items ");
		
		
		
//----------------------------------------------------------------------------------------
		
		
		
//	===================================================================================
		
		
	}

}
