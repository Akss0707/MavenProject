package com.SauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageSaucedemo 
{

	private WebDriver driver ;
	
	@FindBy (xpath= " //select[@class='product_sort_container']")
	WebElement ProductContainer ;
	
	public void SelectProductContainer ()
	{
		ProductContainer.click();
	}
	
	
	@FindBy (xpath="//option[@value='hilo']")
	WebElement HighToLow ;
	
	public void SelectHighToLow ()
	{
		HighToLow.click();
		
	}
	
	@FindBy (xpath="//button[@class='btn btn_primary btn_small btn_inventory']")
	WebElement AddToCart ;
	
	public void SelectAddToCart()
	{
		AddToCart.click();
	}
	
	
	@FindBy (xpath="//button[@id='react-burger-menu-btn']")
	WebElement MenuBar ;
	
	
	
	
	// Multiple products 
	
	@FindBy(xpath="//button[text()='Add to cart']")
	List<WebElement> Multiproducts ;
	
	
	public void AddtoCartMultiproducts()
	{
		
		for(WebElement Aks : Multiproducts )
		{
			Aks.click();
		}
	}
	
	
	
	
	public void SelectSettingButton ()
	{
		MenuBar.click();
	}
	
	
	@FindBy (xpath="//a[@id='inventory_sidebar_link']")
	WebElement AllItems ;
	
	public void SelectAllItems ()
	{
		AllItems.click();
	}
	
	public HomePageSaucedemo (WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
}
