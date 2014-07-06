package com.bit.support;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Moga 
{
	static Logger log = Logger.getLogger(Moga.class);
	
	public static void main (String[] args)
	{
		//FirefoxDriver driver = new FirefoxDriver();
		DOMConfigurator.configure("log4j.xml");
		log.error("hheooooo");
		log.info("hheooooo");
		log.debug("hheooooo");
		
	}

}
