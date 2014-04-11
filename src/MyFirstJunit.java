import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class MyFirstJunit 
{
	FirefoxDriver browser=new FirefoxDriver();
	

	@Before
	public void start()
	{
		browser.get("http://www.facebook.com");
		
	}
	@After
	public void stop() throws Throwable
	
	{
		Thread.sleep(3000);
		browser.quit();
		
	}
	@Test
	public void signin()
	
	{
		browser.findElement(By.id("email")).sendKeys("sislam_31@yahoo.com");
		browser.findElement(By.name("pass")).sendKeys("1234abc");
		browser.findElement(By.id("u_0_0")).click();
	}
	@Test
	public void signup()
	{
		 browser.findElement(By.id("u_0_0")).sendKeys("Asad");
		browser.findElement(By.name("lastname")).sendKeys("Uzzaman");
		browser.findElement(By.id("u_0_2")).sendKeys("1234asad@yahoo.com");
		
		new Select(browser.findElement(By.id("month"))).selectByVisibleText("Feb");
		new Select(browser.findElement(By.name("day"))).selectByVisibleText("12");
		new Select(browser.findElement(By.id("year"))).selectByVisibleText("2011");
		
	}

}
