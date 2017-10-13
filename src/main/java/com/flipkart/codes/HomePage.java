package com.flipkart.codes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BaseClass{
	
	public HomePage(WebDriver driver) {
		super(driver);
		waitFor(driver, ExpectedConditions.elementToBeClickable(searchbox), 10);
	}

	@FindBy(css = "input[title='Search for Products, Brands and More']")
	public WebElement searchbox;
	
	@FindBy(css = "button[type='submit']")
	public WebElement searchbeginbutton;
	
	public void searchItem(String item)
	{
		userinput(searchbox, item);
	}
	
	public SearchResultPage beginSearch()
	{
		click(searchbeginbutton);
		return new SearchResultPage(driver);
	}
}
