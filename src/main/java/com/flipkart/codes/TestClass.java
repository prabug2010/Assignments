package com.flipkart.codes;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.gecko.driver", "D:\\gecko driver\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
/*
	@AfterClass
	public void closeDriver() {
		driver.close();
	}
	
	*/
	@Test
	public void searchProduct() {
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		HomePage home = new HomePage(driver);
		home.searchItem("redmi note 4");
		home.beginSearch();
		SearchResultPage search = new SearchResultPage(driver);
		search.selectItem();
		AddToCartPage add = new AddToCartPage(driver);
		add.addToCart();
		CartPage cp = new CartPage(driver);
		cp.cartExists();
	}

}
