package com.bit.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseTest 
{
static WebDriver driver;
	@BeforeClass
	public static void start()
	{
		String b=System.getProperty("Browser");
		if(b.equals("F"))
		{
			driver=new FirefoxDriver();
			driver.get("http://beta.eshopper24.com");
		}
		else if(b.equals("C"))
		{
		System.setProperty("webdriver.chrome.driver", "/Users/shahidulislam/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://beta.eshopper24.com/");

		}
		else if(b.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "/Users/shahidulislam/Downloads/IEDriverServer");
			driver=new InternetExplorerDriver();
			driver.get("http://beta.eshopper24.com");

		}
		else
			driver=new FirefoxDriver();
		driver.get("http://beta.eshopper24.com");

		
	}
	@AfterClass
	public static void end() throws Throwable
	{
		Thread.sleep(3000);
		driver.quit();
	}
		


}
