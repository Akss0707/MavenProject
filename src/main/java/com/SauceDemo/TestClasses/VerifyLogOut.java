package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePageSaucedemo;
import com.SauceDemo.POMClasses.LoginPageSauceDemoClass;
import com.SauceDemo.POMClasses.LogoutSauceDemoClass;

public class VerifyLogOut extends BaseClass
{
	
		@Test
		
		public void Logout() throws InterruptedException
		
		{
//			LogoutSauceDemoClass Lg = new LogoutSauceDemoClass(driver) ;
		
		LogoutSauceDemoClass LT = new LogoutSauceDemoClass(driver);
		LT.ClickOnSettingButton();
		log.info("clicked on setting button ");
		
		LT.ClickLogoutButton();
		log.info("Clikced on logout button");
		
		
//			String Actualresult = 	
				
		
		
	}

}
