package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePageSaucedemo;
import com.SauceDemo.POMClasses.LoginPageSauceDemoClass;
import com.SauceDemo.UtilityClasse.ScreenshotClass;

public class VerifyAddtoCartMultiProducts extends BaseClass 
{
	
	@Test

public void addtocartMultiproducts() throws IOException
{
	
	
	HomePageSaucedemo hp = new HomePageSaucedemo(driver);
	
	hp.AddtoCartMultiproducts();
	log.info("products are added to cart");
	
	
	
	
	
// =========================================================================================
	
}
		
	
		
		
		
		
		
	}


