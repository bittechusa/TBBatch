import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class LogFile 
{

	public static void main(String[] args) 
	{
		Logger logger = Logger.getLogger(LogFile.class);
		logger.debug("this is a sample log message.");

	}

}
