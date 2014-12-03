package com.bit.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SmokeTest extends BaseTest
{
	
	//CommonTest cm=new CommonTest(driver);
	//@Test
	public void clickCloth() throws Throwable 
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement ele=driver.findElement(By.xpath("//nav[@class='f_left f_xs_none d_xs_none']/ul/li[1]/a"));
		Thread.sleep(3000);
		new Actions(driver).moveToElement(ele).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/div/div[1]/a/b")).click();
		
	}
	/*public void clickWatches() throws Throwable  
	{
		WebElement ele=driver.findElement(By.xpath("//nav[@class='f_left f_xs_none d_xs_none']/ul/li[1]/a"));
		Thread.sleep(3000);
		new Actions(driver).moveToElement(ele).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/div/div[2]/a/b")).click();
		}*/
	public void clickWomen() throws Throwable
	{
		WebElement ele5=driver.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[2]/a"));
		Thread.sleep(3000);
		new Actions(driver).moveToElement(ele5).perform();
		driver.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[2]/div/div/a/b")).click();
		Thread.sleep(3000);
		WebElement ele6=driver.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[2]/a"));
		new Actions(driver).moveToElement(ele6).perform();
		driver.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[2]/div/div/ul/li[1]/a")).click();
		List<WebElement> count2=driver.findElements(By.xpath("//section[@class='products_container category_grid clearfix m_bottom_15 isotope']/div"));
		int size2=count2.size();
		for(int k=1;k<=size2;k++)
		{
				try{
					Thread.sleep(2000);
				
				driver.findElement(By.xpath("//section[@class='products_container category_grid clearfix m_bottom_15 isotope']/div["+k+"]//a/img")).click();
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
				}catch(Exception e1)
				{
		          System.out.println("not visible");
				}
			
			
		
		}
	}
	
	
	@Test
	public void clickSubmenu() throws Throwable
	{
		clickCloth();

		/*WebElement ele=driver.findElement(By.xpath("//nav[@class='f_left f_xs_none d_xs_none']/ul/li[1]/a"));
		Thread.sleep(3000);
		new Actions(driver).moveToElement(ele).perform();
		
		List<WebElement> count=driver.findElements(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/div/div[1]/ul/li"));
		int size=count.size();
		for(int i=1;i<=size;i++)
		{
			Thread.sleep(3000);
			WebElement ele1=driver.findElement(By.xpath("//nav[@class='f_left f_xs_none d_xs_none']/ul/li[1]/a"));
			Thread.sleep(3000);
			new Actions(driver).moveToElement(ele1).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='container clearfix']/nav/ul/li[1]/div/div[1]/ul/li["+i+"]/a")).click();
			Thread.sleep(3000);
		}
		//clickWatches();
		WebElement ele2=driver.findElement(By.xpath("//nav[@class='f_left f_xs_none d_xs_none']/ul/li[1]/a"));
		Thread.sleep(3000);
		new Actions(driver).moveToElement(ele2).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/div/div[2]/a/b")).click();
		

		Thread.sleep(3000);
		WebElement ele3=driver.findElement(By.xpath("//nav[@class='f_left f_xs_none d_xs_none']/ul/li[1]/a"));
		
		Thread.sleep(3000);
		new Actions(driver).moveToElement(ele3).perform();
		Thread.sleep(2000);
		List<WebElement> count1=driver.findElements(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/div/div[2]/ul/li"));
		int size1=count.size();
		for(int j=1;j<=size1;j++)
		{
			try
			{
				Thread.sleep(3000);
			
			WebElement ele4=driver.findElement(By.xpath("//nav[@class='f_left f_xs_none d_xs_none']/ul/li[1]/a"));
			
			Thread.sleep(3000);
			new Actions(driver).moveToElement(ele4).perform();
			Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='container clearfix']/nav/ul/li[1]/div/div[2]/ul/li["+j+"]/a")).click();
		Thread.sleep(3000);
		}catch(Exception e)
		
		{
			System.out.println("element not visible");
		}
		}*/
		clickWomen();
	}
	

}
