package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutSauceDemoClass
{
	
	WebDriver driver ; 
	
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement SettingButton ;
	
	public void ClickOnSettingButton()
	{
		SettingButton.click();
	}
	
	
	@FindBy (xpath="//a[@id='logout_sidebar_link']")
	WebElement LogoutButton ; 
	
	public void ClickLogoutButton () 
	{
		LogoutButton.click();
	}

	
	
//	----------------------------------------------------------------------------
	
	
	public LogoutSauceDemoClass(WebDriver driver)
	{
		this.driver=driver ;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	
	
	
	
	
	
	
}
