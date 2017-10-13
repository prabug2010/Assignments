package com.flipkart.codes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddToCartPage extends BaseClass{

	
	public AddToCartPage(WebDriver driver) {
		super(driver);
		waitFor(driver, ExpectedConditions.elementToBeClickable(cart), 10);
	}
	
	@FindBy(css = "button._2AkmmA._2Npkh4._2MWPVK")
	public WebElement cart;
	
	public CartPage addToCart()
	{
		click(cart);
		System.out.println("adding the product to cart");
		return new CartPage(driver);
	}
}
