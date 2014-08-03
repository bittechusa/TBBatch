package com.bit.test;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
	WebDriver driver = null;
	
	@BeforeMethod
	public void start()
	{
		
		URL chromeDriverURL = BaseTest.class.getResource("/driver/chromedriver.exe");
		File file = new File(chromeDriverURL.getFile()); 
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, file.getAbsolutePath());
		
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--ignore-certificate-errors");*/
		
		//System.setProperty("webdriver.chrome.driver", "");
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
	}
	
	@AfterMethod
	public void stop()
	{
		driver.quit();
	}

}
