	package com.sample.test;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.sample.pages.AboutUsPage;
import com.sample.pages.BlogNewsPage;
import com.sample.pages.CollectionPage;
import com.sample.pages.IndexPage;

public class SmokeTest extends BaseTest
{
	private static Logger log = Logger.getLogger(SmokeTest.class.getName());
	
	IndexPage hPage;
	CollectionPage cPage;
	AboutUsPage aUsPage;
	BlogNewsPage bnPage;
	
	@Test
	public void purchase()
	{
		log.info("================================");
		log.info("Purchse test started");
		log.info("================================");
		
		hPage = new IndexPage(browser);
		hPage.clickTheShopLink();
		cPage.clickFirstProduct();
		
		log.info("================================");
		log.info("Purchse test ended");
		log.info("================================");
	}
	
	@Test
	public void collectionTest()
	{
		log.info("================================");
		log.info("CollectionTest test started");
		log.info("================================");
		
		hPage = new IndexPage(browser);
		hPage.clickTheShopLink();
		cPage.clickFirstProduct();
		
		
		
		log.info("================================");
		log.info("CollectionTest test ended");
		log.info("================================");
	}
	
	

}
