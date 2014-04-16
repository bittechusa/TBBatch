package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SingUp
{
	public void p2m1()
	{
		FirefoxDriver dr=new FirefoxDriver();
		dr.get("http://www.facebook.com");
		dr.findElement(By.id("u_0_1")).sendKeys("shahid");
		dr.findElement(By.id("u_0_3")).sendKeys("Islam");
		dr.findElement(By.id("u_0_5")).sendKeys("ureka12@yahoo.com");
		dr.findElement(By.id("u_0_5")).sendKeys("ureka12@yahoo.com");
		dr.findElement(By.id("u_0_a")).sendKeys("54321m");
		new Select(dr.findElement(By.id("month"))).selectByVisibleText("Jan");
		new Select(dr.findElement(By.id("day"))).selectByVisibleText("23");
		new Select(dr.findElement(By.id("year"))).selectByVisibleText("2001");
		dr.findElement(By.id("u_0_e")).click();
		//dr.findElement(By.id("u_0_i")).click();
		
	}

	
}
