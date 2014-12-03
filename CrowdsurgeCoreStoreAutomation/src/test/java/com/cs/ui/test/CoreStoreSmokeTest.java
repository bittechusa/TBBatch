package com.cs.ui.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CoreStoreSmokeTest extends BaseTest
{
	 Common support = new Common();
	
	@Test(priority=1)
	public void buyTicketsAsNewCustomerWithSameAddressByPaypal() throws Exception
	{
		System.out.println("'buyTicketsAsNewCustomerWithSameAddressByPaypal' method strted");
		support.addTicketsToCart();
		support.fillFormAsNewCustomer();
		support.verifyElementPresent(By.xpath("//div[contains(@class,'checkout_top_successmsg')]"),"Success message after sign up");
		support.verifyTextPresent("Payment Details");
		support.billingInfoExistingCustomerWithSameAddress();
		support.payByPaypal();
		support.clickRemoveAllLink();
		support.logout();
		support.goToEventListingPage();
		System.out.println("Method ended");
		
	}
	
	@Test(priority=2)
	public void buyTicketsAsNewCustomerWithDifferentAddressByPaypal() throws Exception
	{
		System.out.println("'buyTicketsAsNewCustomerWithDifferentAddressByPaypal' method strted");
		support.addTicketsToCart();
		support.fillFormAsNewCustomer();
		support.verifyElementPresent(By.xpath("//div[contains(@class,'checkout_top_successmsg')]"),"Success message after sign up");
		support.verifyTextPresent("Payment Details");
		support.billingInfoExistingCustomerWithSameAddress();
		support.billingInfoExistingCustomerWithDifferentAddress();
		support.payByPaypal();
		support.clickRemoveAllLink();
		support.logout();
		support.goToEventListingPage();
		System.out.println("Method ended");

	}
	
	@Test(priority=3)
	public void buyTicketsAsNewCustomerWithSameAddressByCreditCard() throws Exception
	{
		System.out.println("'buyTicketsAsNewCustomerWithSameAddressByCreditCard' method strted");
		support.addTicketsToCart();
		support.fillFormAsNewCustomer();
		support.verifyElementPresent(By.xpath("//div[contains(@class,'checkout_top_successmsg')]"),"Success message after sign up");
		support.verifyTextPresent("Payment Details");
		support.billingInfoExistingCustomerWithSameAddress();
		support.payByCreditCard();
		support.clickRemoveAllLink();
		support.logout();
		support.goToEventListingPage();
		System.out.println("Method ended");
		
	}
	
	@Test(priority=4)
	public void buyTicketsAsNewCustomerWithDifferentAddressByCreditCard() throws Exception
	{
		System.out.println("'buyTicketsAsNewCustomerWithDifferentAddressByCreditCard' method strted");
		support.addTicketsToCart();
		support.fillFormAsNewCustomer();
		support.verifyElementPresent(By.xpath("//div[contains(@class,'checkout_top_successmsg')]"),"Success message after sign up");
		support.verifyTextPresent("Payment Details");
		support.billingInfoExistingCustomerWithSameAddress();
		support.billingInfoExistingCustomerWithDifferentAddress();
		support.payByCreditCard();
		support.clickRemoveAllLink();
		support.logout();
		support.goToEventListingPage();
		System.out.println("Method ended");
		
	}
	
	
	@Test(priority=5)
	public void buyTicketsAsExistingCustomerByCrediCard() throws Exception
	{
		System.out.println("'buyTicketsAsExistingCustomerByPaypal' method strted");
		support.addTicketsToCart();
		support.existingCustomer();
		support.verifyTextPresent("Payment Details");
		support.payByCreditCard();
		support.clickRemoveAllLink();
		support.logout();
		support.goToEventListingPage();
		System.out.println("Method ended");
	}
	
	@Test(priority=6)
	public void buyTicketsAsExistingCustomerByPaypal() throws Exception
	{
		System.out.println("'buyTicketsAsExistingCustomerByCrediCard' method strted");
		support.addTicketsToCart();
		support.existingCustomer();
		support.verifyTextPresent("Payment Details");
		support.payByPaypal();
		support.clickRemoveAllLink();
		support.logout();
		support.goToEventListingPage();
		System.out.println("Method ended");
	}

}// end of CoreStoreSmokeTest method
