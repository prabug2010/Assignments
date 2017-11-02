package com.testng.codes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	@Parameters("Browser")
	@Test
	public  void test1(String browser) {
	 
	if(browser.equalsIgnoreCase("FF")){
		
		System.setProperty("webdriver.gecko.driver", "D:\\gecko driver\\geckodriver.exe");
	 
	WebDriver driver=new FirefoxDriver();
	 
	driver.manage().window().maximize();
	 
	driver.get("http://www.facebook.com");
	 
	driver.quit();
	 
	}
	else if(browser.equalsIgnoreCase("IE")){
	 
	System.setProperty("webdriver.ie.driver", "D:\\IE Driver\\IEDriverServer.exe");
	 
	WebDriver driver=new InternetExplorerDriver();
	 
	driver.manage().window().maximize();
	 
	driver.get("http://www.facebook.com");
	 
	driver.quit();
	}
	}
}
