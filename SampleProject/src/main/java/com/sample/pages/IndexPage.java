package com.sample.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.sample.browser.util.Shared;


public class IndexPage 
{
	private static Logger log = Logger.getLogger(IndexPage.class.getName());
	
	private WebDriver browser;
	
	Shared sh = new Shared(browser);
	
	// Find all the element in this page
	@FindBy(how= How.XPATH, using="//a[@id='theshop']")
	public WebElement theShop;
	
	@FindBy(how= How.ID, using="theshop")
	public WebElement theShopById;
	
	@FindBy(how= How.XPATH, using="//li[@id='visittheshop']/h2/a")
	public WebElement visitShop;
	
	@FindBy(how= How.XPATH, using="//li[@id='readthestory']/h2/a")
	public WebElement readStory;
	
	@FindBy(how= How.XPATH, using="//li[@id='readthenews']/h2/a")
	public WebElement readNews;
	
	
	public IndexPage(WebDriver browser)
	{
		this.browser = browser; 
		PageFactory.initElements(browser, this);
		log.info("Visiting index page");
		browser.get("http://www.viasnella.com/");
	}
	
	public void clickTheShopLink()
	{
		if(sh.isElementPresent(theShop))
		{
			theShop.click();
			log.info("Click Shop link");
				
		}
		
		else if(sh.isElementPresent(theShopById))
		{
			theShop.click();
				
		}			
		
	}
	
	public void clickvisitShopLink()
	{
		if(sh.isElementPresent(visitShop))
		{
			visitShop.click();
				
		}		
		
	}
	
	public void clickreadthestoryLink()
	{
		if(sh.isElementPresent(readStory))
		{
			readStory.click();
				
		}		
		
	}
	public void clickreadNewsLink()
	{
		if(sh.isElementPresent(readNews))
		{
			readNews.click();
				
		}		
		
	}

}
