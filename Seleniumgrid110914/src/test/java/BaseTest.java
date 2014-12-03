import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;


public class BaseTest 
{
	WebDriver dr;
	@BeforeTest
	public void start() throws Throwable
	{
		String shahana=System.getProperty("malu");
		String jerin=System.getProperty("falu");
		if(shahana.equals("jf"))
		{
			if(jerin.equals("shuvo"))
			{
				dr=new FirefoxDriver();
			}
			else
			{
				DesiredCapabilities x=new DesiredCapabilities().firefox();
				x.setPlatform(Platform.WINDOWS);
				x.setVersion("28");
			dr=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),x);
			dr.get("http://www.bluefly.com");
			}
		}
		
	}

}
