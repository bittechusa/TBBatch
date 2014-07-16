import java.util.Properties;

import javax.security.auth.login.Configuration;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class LogFile 
{

	public static void main(String[] args) 
	{
		//Logger lg=Logger.getLogger(Logger.class)
		Properties p=new Properties();
		p.getProperty("log4j.properties");
		Logger logger = Logger.getLogger(LogFile.class);
		logger.debug("this is a sample log message.");
		logger.trace("hi");

	}

}
