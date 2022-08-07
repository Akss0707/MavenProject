package com.SauceDemo.UtilityClasse;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass

{
     public static void takesscreenshot(WebDriver driver) throws IOException
     {
    	 
//    	 Date & time format
    	 
    	 Date d = new Date();
    	 
    	 DateFormat d1 = new SimpleDateFormat("DD/MM/YY");
    	 
    	 String date = d1.format(d);
    	 
    	 
    	 
//    	 TakesScreenShot
    	 
    	 
    	 
    	 TakesScreenshot ts = (TakesScreenshot)driver ;
    	 
    	 File SourceFile = ts.getScreenshotAs(OutputType.FILE) ;
    	 
    	 File destFile = new File ("./ScreenShotFolder/Saucedemo" + date + ".jpg");
    	 
    	 FileHandler.copy(SourceFile, destFile);
    	 
    	 
    	 
    	 System.out.println("Sc is taken");
    	 
    	 
     }

}
