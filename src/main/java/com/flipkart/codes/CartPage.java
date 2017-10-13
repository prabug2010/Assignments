package com.flipkart.codes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BaseClass{

	public CartPage(WebDriver driver)
	{
		super (driver);
		waitFor(driver, ExpectedConditions.elementToBeClickable(placeorder), 10);
	}
	
	@FindBy(css = "form button:nth-child(1)")
	public WebElement placeorder;
	
	public void cartExists()
	{
		if(placeorder.isEnabled())
		{
			System.out.println("product added to cart successfully");
		}
	}
}
