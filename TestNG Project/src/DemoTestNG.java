import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DemoTestNG 
{
//FirefoxDriver driver=new FirefoxDriver();

@BeforeTest
public void strat()
{
//driver.get("http://www.facebook.com");	
	System.out.println("btest");
}
@AfterTest

public void end()
{
	//driver.quit();
	System.out.println("atest");
}
/*@BeforeMethod
public void btest()
{
System.out.println("bmethod");	
}
@AfterMethod
public void atest()
{
System.out.println("amethod");	
}*/

@Test
	public void login()
	{login1();
		System.out.println("test1");
	}
public void login1()
{
	System.out.println("t2method");}
@Test(dependsOnMethods={"login"})
	public void sendMail()
	{
		System.out.println("after login method u can only send mail so if login not pass this method cannt run");
	}
@Test(priority=1)
	public void password()
	{
		throw new SkipException("to skip any tesyt");
	}
@Test(dataProvider="getData")
	public void multiDataSet(String name,String from,String to,String port)
	{
		System.out.println(name+"--"+from+"--"+to+"---"+port);
	}

@DataProvider
	public Object[][] getData()
	{
	Object o [][]=new Object[2][4];
	//1st row
	o[0][0]="shahid";
	o[0][1]="dhaka";
	o[0][2]="ny";
	o[0][3]="jfk";
	//2nd row
	//1st row
		o[1][0]="asad";
		o[1][1]="sylhet";
		o[1][2]="nj";
		o[1][3]="lagudia";
	return o;
}
}

