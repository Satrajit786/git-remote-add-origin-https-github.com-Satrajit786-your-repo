package com.crm.qa.util;

import com.crm.qa.bae.TestBase;

public class TestUtill extends TestBase{
	
	public static long page_load_timeout = 20;
	public static long implicit_wait = 10;
	
	public void switchToFrame(String framename) {
		driver.switchTo().frame("mainpanel");
		
		System.out.println("Hello world");
		
	}

	


		
	
	


}

