package com.SauceDemo.POMClasses;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageSauceDemoClass
{
      private WebDriver driver ;
       
       @FindBy(xpath="//input[@class='input_error form_input'][1]")
       WebElement Username ;
	
       public void SendUsername()
       {
    	   Username.sendKeys("standard_user");
       }
       
       
       
       
       @FindBy(xpath="//form//div[2]//input")
      private WebElement Password ;
       
       public void sendpassword()
       {
    	   Password.sendKeys("secret_sauce");
       }
       
       
       
       @FindBy(xpath="//input[@id='login-button']")
      private WebElement Login ;
       
       public void clickOnLogin()
       {
    	   Login.click();
       }
       
//       TakesScreenshot Sc = (TakesScreenshot) driver ;
       
        
       public LoginPageSauceDemoClass (WebDriver driver)
       {
    	   this.driver=driver ;
    	   
    	   PageFactory.initElements(driver , this);
       }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
}
