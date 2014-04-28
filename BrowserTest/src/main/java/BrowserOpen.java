import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserOpen 
{
	WebDriver driver;
	// WebDriver driver = new ChromeDriver();
	public void start()
	{
		String x = System.getProperty("moga1");
		if(x.equals("FF"))
		{
			driver = new FirefoxDriver();
		}
		else if(x.equals("CC"))
		{
			System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(x.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else
		{
			driver = new FirefoxDriver();
		}
		
		driver.get("http://www.facebook.com");
	}
	
	public void end()
	{
		driver.quit();
	}

}
