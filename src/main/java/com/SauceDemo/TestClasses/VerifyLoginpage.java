package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.LoginPageSauceDemoClass;
import com.SauceDemo.POMClasses.SaucedemoBaseClass;

public class VerifyLoginpage extends BaseClass
{
	
	 
	 
	 
	@Test 
	
	public void loginFunctionality()
	{
	String Actualresult = driver.getTitle()	;
		
		String ExpectedResult = "Swag Labs" ;
		
	
	
		if(Actualresult.equals(ExpectedResult))
		
		
		   {
			log.info("Tc Is Passed");
		   }
		else
		   {
			log.info("Tc is failed");
		   }
		
		
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


