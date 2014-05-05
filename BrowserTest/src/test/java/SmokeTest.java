import org.junit.Test;
import org.openqa.selenium.By;

public class SmokeTest extends BaseTest
{
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//a[text='Women']")).click();
		
	}
}
