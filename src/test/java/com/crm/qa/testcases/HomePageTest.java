package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.bae.TestBase;
import com.crm.qa.util.TestUtill;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;



public class HomePageTest extends TestBase {
	LoginPage loginPage;
	
	HomePage homepage;
	
	TestUtill testutill ;
	
	public HomePageTest() {
		
		super ();
	}
	
	@BeforeMethod
	
	public void setup() {
		
		initialization();
		
		testutill = new TestUtill();
		
		loginPage = new LoginPage(driver);
		
		homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void verifyhomePageTittleTest() {
		
		String homepagetittle =	homepage.verifyHomePageTittle();
		Assert.assertEquals(homepagetittle, "OrangeHRM", "Home page tittle not matched");
		
		
		
	}
	
	@Test(priority=2)
	public void verufyUserNameTest() {
		
		testutill.switchToFrame(toString());
		Assert.assertTrue(homepage.verifyCorrectUserName());
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	
	
}
