package com.sample.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CollectionPage 
{
	private WebDriver browser;
	private static Logger log = Logger.getLogger(CollectionPage.class.getName());
	
	@FindBy(how= How.ID, using="theshop")
	public WebElement firstProduct;
	
	
	public CollectionPage(WebDriver browser)
	{
		this.browser = browser; 
		
	}
	
	public void clickFirstProduct()
	{
		firstProduct.click();
		log.info("Clicked first product");
	}

}
