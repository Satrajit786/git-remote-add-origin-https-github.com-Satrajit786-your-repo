package com.crm.qa.bae;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtill;

public class TestBase {
	
 public	static WebDriver driver;
 public	static Properties prop;
	
	
  public TestBase(){
	  
	  try {
		  
		  prop = new Properties();
		  
		  FileInputStream ip = new FileInputStream 
				  ("C:\\Workspace\\SNT_Java\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		  
		  prop.load(ip);
	  }
	  
	  catch (FileNotFoundException e) {
		  
	  e.printStackTrace();
	  
  }
	  
	  catch (IOException e) {
		  e.printStackTrace();
	  }
  }
	  public static void initialization() {
	        String browsername = prop.getProperty("browser"); // it will give a string 
	        
	        boolean isHeadless = Boolean.parseBoolean(prop.getProperty("headless"));
	        
	        if(browsername.equalsIgnoreCase("chrome")) {
	        	
	        	ChromeOptions options = new ChromeOptions();
	        	
	        	if (isHeadless) {
	        		
	        		options.addArguments("--headless");
	        		options.addArguments("--window-size=1920,1080");
	        	}
	        	
	        	
	        	driver = new ChromeDriver(options);
	        	
	        }
	        
	        else if (browsername.equalsIgnoreCase("firefox"))
	        {
	        	driver = new FirefoxDriver();
	        }
	        
	       
	        driver.manage().window().maximize();
	        
	        driver.manage().deleteAllCookies();
	        
	        driver.manage().timeouts().pageLoadTimeout(TestUtill.page_load_timeout, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(TestUtill.implicit_wait, TimeUnit.SECONDS);
	        
	        driver.get(prop.getProperty("url"));
	        		
	}
}


