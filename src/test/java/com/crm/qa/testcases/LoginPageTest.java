package com.crm.qa.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.bae.TestBase;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	
	HomePage homepage;
	
	public LoginPageTest() {
		super();
		
		
		// by using super keyword it will call the super class here Testbase class.
	}
	
	
	@BeforeMethod
	
	public void setup() {
		
		// It will initialize the initialization() method from base class
		
		initialization();
		
		loginPage = new LoginPage(driver);
			
	}
	
	@Test(priority =1)
	
	public void LoginPageTittleTest()
	{
		String Tittle = loginPage.validateLoginPage();
		
		
		//comparing with Tittle of the page
		
		Assert.assertEquals(Tittle, "OrangeHRM");
	}
	
	@Test(priority=2)
	
	public void HRMLogoImageTest() {
		boolean flag = loginPage.hrmlogo();
		
		Assert.assertTrue(flag);
		
	}
	
	@Test(priority=3)
	
	public void loginTest() {
		homepage =   loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		// prop.getProperty("username"), prop.getProperty("password")); 
		//I have define this properties in config file
	        
	    }
	/*
	WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(50000));
	WebElement logout = mywait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"))));
	
	WebElement logout1 = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
	
	   
	
	*/
	
	@AfterMethod
	
	public void teardown() {
		
		driver.quit();
	}
	
	

}
