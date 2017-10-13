package com.flipkart.codes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchResultPage extends BaseClass{

	public SearchResultPage(WebDriver driver) {
		super(driver);
		waitFor(driver, ExpectedConditions.elementToBeClickable(result1), 10);
	}
	
	@FindBy(xpath = ".//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div/div/div[1]/div/a/div[2]/div[1]/div[1]")
	public WebElement result1;
	
	public AddToCartPage selectItem()
	{
		click(result1);
		return new AddToCartPage(driver);
	}
	
	

}
