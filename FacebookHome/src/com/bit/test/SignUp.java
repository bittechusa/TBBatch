package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class SignUp
{
	public void p2m1()
	{
		FirefoxDriver dr=new FirefoxDriver();
		dr.get("http://www.facebook.com");
		dr.findElement(By.id("email")).sendKeys("rejaahmed@gmail.com");
		dr.findElement(By.id("pass")).sendKeys("1234");
		dr.findElement(By.id("u_0_1")).sendKeys("kawkab");
		dr.findElement(By.id("u_0_3")).sendKeys("ahmed");
		dr.findElement(By.id("u_0_5")).sendKeys("kawkab@gmail.com");
		dr.findElement(By.id("u_0_8")).sendKeys("kawkab@gmail.com");
		dr.findElement(By.id("u_0_a")).sendKeys("12345");
		new Select(dr.findElement(By.id("day"))).selectByVisibleText("15");
		new Select(dr.findElement(By.id("month"))).selectByVisibleText("Jan");
		new Select(dr.findElement(By.id("year"))).selectByVisibleText("1992");
		dr.findElement(By.id("u_0_e")).click();
		
		
		
	}

}
