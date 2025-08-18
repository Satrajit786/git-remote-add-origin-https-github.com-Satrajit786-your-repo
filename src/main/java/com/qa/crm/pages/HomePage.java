package com.qa.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.bae.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//p[contains(text(),'Luciano Sobrinho')]")
	
	WebElement username;
	
	@FindBy(xpath ="//span[normalize-space()='Admin']")
	
	WebElement adminlink;
	
	@FindBy(xpath = "//span[normalize-space()='Leave']")
	
	WebElement leavelink;
	
	// after declaring xpath we need to initialize constructor to initialixe homepage
	
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver ;
		
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTittle() {
		 return driver.getTitle();
	}
	
  public boolean verifyCorrectUserName() {
	   return username.isDisplayed();
  }
	
	public AdminPage clickonAdminLink() {
		
		adminlink.click();
		
		return new AdminPage();
		
		
	}
	
	public LeavePage clickonLeaveLink() {
		
	leavelink.click();
		
		return new LeavePage();
	
	}
	
	
	
	
	

}
