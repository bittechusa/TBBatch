package com.bit.test;

import org.testng.annotations.Test;

public class SmokeTest extends BaseTest
{
	@Test
	public void login()
	{
		driver.get("http://www.facebook.com");
	}

}
