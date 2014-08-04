import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class A {
	FirefoxDriver dr=new FirefoxDriver();
	@Test
	public void test1() throws Throwable, Throwable
	{		
		Properties p=new Properties();
		//String propFileName = "log.properties";
		 
		p.load(new FileInputStream("log.properties"));
		dr.get(p.getProperty("URL"));
		dr.findElement(By.id("u_0_1")).sendKeys(p.getProperty("fname"));
	}

}
