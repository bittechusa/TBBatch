import org.junit.After;
import org.junit.Before;


public class BaseTest extends BrowserOpen
{
	//BrowserOpen br = new BrowserOpen();
	@Before
	public void open()
	{
		start();
	}
	
	@After
	public void close()
	{
		end();
	}
}
