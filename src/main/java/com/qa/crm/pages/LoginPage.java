package com.qa.crm.pages;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.bae.TestBase;

public class LoginPage extends TestBase{
	
	//PageFactory - OR
	
	@FindBy(name = "username")
	WebElement username;
	
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement loginbtn;
	
	@FindBy(xpath= "//img[@alt='company-branding']")
	WebElement hrmlogo;
	
	
	// to initialize webelement we need to create a constructor
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver ;
		
		PageFactory.initElements(driver, this);
	}
	
	// Methods
	
	public  String validateLoginPage() {
		
		return driver.getTitle();
		
	}
	
	public boolean hrmlogo() {
		
		return hrmlogo.isDisplayed();
	}

	public HomePage login(String un, String pwd) {
		// TODO Auto-generated method stub
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		
		return new HomePage();
		
		
	}
	


}


