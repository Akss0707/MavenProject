package com.SauceDemo.TestClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePageSaucedemo;
import com.SauceDemo.POMClasses.LoginPageSauceDemoClass;

public class VerifyAddToCartProducts extends BaseClass

{
	
	@Test
	public void addtocart()
	{
		HomePageSaucedemo hs = new HomePageSaucedemo(driver);
		
		hs.SelectAddToCart();
		
		
		log.info("product is added to cart");
		
		
		
		
		
//	===================================================================================	
		
		
		
		

	}

}
