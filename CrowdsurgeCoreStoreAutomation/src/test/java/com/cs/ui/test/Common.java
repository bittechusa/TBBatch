package com.cs.ui.test;

import org.openqa.selenium.By;

public class Common extends BaseTest
{
	
	
	public void clickBuyTicket()
	{
		try
		{
			driver.findElement(By.xpath("//a[@class='action_button']//div[contains(text(),'Buy')]")).click();
		}
		catch(Exception NoSuchElementException)
		{
			System.out.println("Buy Ticket Button not found");
			
		}
	}
	
	public void accessCodeHandle() throws Exception
	{
		Thread.sleep(3000);
		if(driver.findElement(By.name("codesubmit")).isDisplayed())
		{
			try 
			{
				driver.findElement(By.className("codeinput")).sendKeys("test");
			}
			
			catch (Exception NoSuchElementException)
			{
				System.out.println("Access Code Text Box Not Found");
			}
			
			try 
			{
				driver.findElement(By.name("codesubmit")).click();
			}
			
			catch (Exception NoSuchElementException)
			{
				System.out.println("Code Unlock button not found");
			}	
			
		}	
		
	}// end of accesscode method
	
	public void selectQuantity()
	
	{
		try 
		{
			driver.findElement(By.xpath("//span[contains(@class,'quantity')]//span[contains(@class,'selectboxit-arrow-container')]")).click();
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Quantity button not found");
		}	
		
		try 
		{
			driver.findElement(By.xpath("//form[@id='ticket_request']//li[@id='"+2+"']/a")).click();		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Quantity not found");
		}	

	}//end of selectQuantity method
	
	public void findTickets()
	{
		try 
		{
			driver.findElement(By.xpath("//input[@id='find_tickets']")).click();
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Find Tickets button not found");
		}	

	}//end of findTickets method
	
	public void clickContinue() throws Exception
	{
		Thread.sleep(3000);
		try 
		{
			driver.findElement(By.xpath("//div[contains(@class,'action_button ajax_continue') and text()='Continue']")).click();
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Continue button not found");
		}	
		
	}
	
	public void clickUpsellContinue() throws Exception
	{
		Thread.sleep(3000);
		try 
		{
			driver.findElement(By.name("upsell_submit")).click();
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Upsell Continue button not found");
		}	
		
	}
	
	public void beforeCart() throws Exception
	{
		clickBuyTicket();
		accessCodeHandle();
		selectQuantity();
		findTickets();
		clickContinue();
		clickUpsellContinue();
	}
	
	public void addTicketsToCart() throws Exception
	{
		Thread.sleep(3000);
		clickBuyTicket();
		accessCodeHandle();
		selectQuantity();
		findTickets();
		clickContinue();
		clickUpsellContinue();
		Thread.sleep(3000);
	}
	
	public void verifyElementPresent(By by, String eleName) throws Exception
	{
		Thread.sleep(3000);
		if(driver.findElements(by).size() != 0){
			System.out.println(eleName + "elemnet present");
			}
		else{
			System.out.println(eleName + "element not found");
			}
	}
	
	public void verifyTextPresent(String text) throws Exception
	{
		Thread.sleep(3000);
		if(driver.getPageSource().contains(text))
		  {
		    System.out.println(text + "found");
		  }
		else
		  {
		    System.out.println(text + "not found");
		  }
	}
	
	public void fillFormAsNewCustomer() throws Exception
	{
		int ran = 100 + (int)(Math.random() * ((1000000 - 100) + 1));
		String email = "signuptest"+ran+"@gmail.com";
		
		Thread.sleep(3000);
		try 
		{
			driver.findElement(By.xpath("//input[@name='reg_firstname']")).sendKeys("asad");
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("First name textbox not found");
		}	
		
		try 
		{
			driver.findElement(By.xpath("//input[@name='reg_lastname']")).sendKeys("zaman");
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Last name textbox not found");
		}	
		try 
		{
			driver.findElement(By.xpath("//span[@name='reg_country']")).click();
			driver.findElement(By.xpath("//ul[@class='selectboxit-options selectboxit-list']//li[@id='222']")).click();
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Country box can not be selected");
		}	
		try 
		{
			driver.findElement(By.xpath("//input[@name='reg_phone']")).sendKeys("345678908");
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Phone textbox not found");
		}	
		try 
		{

			driver.findElement(By.xpath("//input[@name='reg_email']")).sendKeys(email);
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Email textbox not found");
		}	
		try 
		{
			driver.findElement(By.xpath("//input[@name='reg_email_confirm']")).sendKeys(email);
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Confirm email textbox not found");
		}	
		try 
		{
			driver.findElement(By.xpath("//input[@name='reg_password']")).sendKeys("Password1");
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Password textbox not found");
		}	
		
		try 
		{
			driver.findElement(By.xpath("//input[@name='reg_password_confirm']")).sendKeys("Password1");
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Confirm Password textbox not found");
		}	
		
		try 
		{
			driver.findElement((By.name("reg_mailer"))).click();
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Mailing List checkbox not found");
		}	
		
		
		try 
		{
			driver.findElement(By.xpath("//input[@class='action_button' and contains(@value,'Sign Up')]")).click();
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Sign Up button not found");
		}		
		
	}
	
	public void payByPaypal() throws Exception
	{
		try 
		{
			driver.findElement(By.xpath("//div[@class='field pay_method']//input[@id='pay_method_pp']")).click();
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Paypal radio button not found");
		}	
		
		try 
		{
			driver.findElement(By.xpath("//div[@class='field pay_method']//img[@class='pp_logo']")).isDisplayed();
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Paypal image not displayed");
		}	
		
		try 
		{
			 driver.findElement(By.xpath("//div[@class='field pay_terms_pp']//input[@id='pay_terms_pp']")).click();
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Terms and Cond checkbox not found");
		}	
		
		try 
		{
			driver.findElement(By.xpath("//input[@id='pay_submit_pp']")).isDisplayed();		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Paypal submit button not found");
		}	
		
	}
	
	public void clickRemoveAllLink() throws Exception
	{
		Thread.sleep(3000);
		try 
		{
			driver.findElement(By.xpath("//a[contains(@href,'checkout')]/span[text()='x']/..")).click();
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Remove All link not found");
		}	
		
		verifyElementPresent(By.xpath("//div[contains(@class,'success_wrap checkout_top_successmsg')]"), "Element Empty message");
		
	}
	
	public void payByCreditCard() throws Exception
	{
		try 
		{
			driver.findElement(By.xpath("//div[@class='field pay_method']//input[@id='pay_method_cc']")).click();
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Creditcard radio button not found");
		}	
		
		try 
		{
			driver.findElement(By.xpath("//div[@class='field pay_method']//img[@class='cards_logo']")).isDisplayed();
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Credit card image not displayed");
		}	
		
		try 
		{
			driver.findElement(By.xpath("//span[@name='pay_card_type']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'MasterCard')]")).click();
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Card not selected");
		}	
		
		try 
		{
			driver.findElement(By.xpath("//div[@class='field pay_card_num']//input[@name='pay_card_num']")).sendKeys("1234567891234567");		
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Card number textbox not found");
		}	
		try 
		{
			driver.findElement(By.xpath("//div[@class='field pay_card_cvn']//input[@name='pay_card_cvn']")).sendKeys("123");
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("CVN textbox not found");
		}	
		try 
		{
			driver.findElement(By.xpath("//input[@id='pay_terms_cc']")).click();	
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Terms and Cond checkbox for Credit card not found");
		}	
		try 
		{
			driver.findElement(By.xpath("//input[@id='pay_submit_cc']")).isDisplayed();
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Make payment button not found");
		}	
		
		
	}
	
	public void billingInfoExistingCustomerWithSameAddress() throws Exception
	{
		try 
		{
			driver.findElement(By.name("bill_firstname")).sendKeys("asad");	
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Billing First textbox not found");
		}
		
		try 
		{
			driver.findElement(By.name("bill_lastname")).sendKeys("zaman");
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Billing Last name textbox not found");
		}
		
		try 
		{
			driver.findElement(By.name("bill_addressline1")).sendKeys("45 Main St");	
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Billing address line 1 textbox not found");
		}
		
		try 
		{
			driver.findElement(By.name("bill_towncity")).sendKeys("Brooklyn");
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Billing Town/City textbox not found");
		}
		
		try 
		{
			driver.findElement(By.name("bill_countystate")).sendKeys("ny");
			
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Billing state/county textbox not found");
		}
		
		try 
		{
			driver.findElement(By.name("bill_postzip")).sendKeys("11201");
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Billing zipcode textbox not found");
		}
		
		try 
		{
			driver.findElement(By.xpath("//span[@name='bill_country']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='United States']")).click();
			
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Billing Country textbox not found");
		}
		
		/*try 
		{
			driver.findElement(By.name("ship_sameasbill")).click();
			
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Billing same as textbox not found");
		}*/
		
		Thread.sleep(3000);
		
	}
	
	public void existingCustomer()
	{	
		try 
		{
			driver.findElement(By.name("login_email")).sendKeys("personalchithi@gmail.com");
			
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Login Email textbox not found");
		}
		
		try 
		{
			driver.findElement(By.name("login_password")).sendKeys("Myfamily01");
			
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Login password textbox not found");
		}
		
		try 
		{
			driver.findElement(By.xpath("//input[@value='Sign In']")).click();
			
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Sign In button not found");
		}	
	}
	
	public void logout() throws Exception
	{	
		Thread.sleep(3000);
		try 
		{
			driver.findElement(By.xpath("//a[contains(@href,'logout') and contains(text(),'Logout')]")).click();
			
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Logout button not found");
		}	
		
	}
	
	public void goToEventListingPage() throws Exception
	{	
		Thread.sleep(3000);
		try 
		{
			driver.findElement(By.xpath("//a[contains(@href,'listings') and contains(text(),'All Dates')]")).click();
			
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("All dates not found");
		}	
		
	}
	
	public void billingInfoExistingCustomerWithDifferentAddress() throws Exception
	{
		
		try 
		{
			driver.findElement(By.name("ship_sameasbill")).click();
			
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Billing same as textbox not found");
		}
		
		
		try 
		{
			driver.findElement(By.name("ship_addressline1")).sendKeys("123 main street");
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Shipping address Line1 textbox not found");
		}
		
		try 
		{
			driver.findElement(By.name("ship_towncity")).sendKeys("queens");
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Ship Town/City textbox not found");
		}
		
		try 
		{
			driver.findElement(By.name("ship_countystate")).sendKeys("ny");
			
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Ship state/county textbox not found");
		}
		
		try 
		{
			driver.findElement(By.name("ship_postzip")).sendKeys("10567");
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Ship zipcode textbox not found");
		}
		
		try 
		{
			driver.findElement(By.xpath("//span[@id='langSelectBoxItArrowContainer']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//ul[contains(@class,'selectboxit-list')]//li[id='222']")).click();
			
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Billing Country textbox not found");
		}
		
		
	}
	
		public void verifyPageTitle(String expectedPageTitle)
		{
			if(driver.getTitle().contains(expectedPageTitle))
			    //Pass
			    System.out.println("Passed : Page title '" + expectedPageTitle + "' found");
			else
			    //Fail
				System.out.println("Failed : Page title '" + expectedPageTitle + "' not found");
		}
	
}
	


