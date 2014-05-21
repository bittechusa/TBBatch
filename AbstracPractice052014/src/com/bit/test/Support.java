package com.bit.test;

public class Support extends Demo
{

	@Override
	public void m2()
	{
	
		System.out.println("sd");
	}
	Support()
	{
		
		super();//u can call parent constructor using super();
		System.out.println("constructor");
	}
		
		
	
	//Demo x=new Demo();abstract class cannot create an object only extends

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("h3");
		super.m1();//u can call parent method using super key word
	}

}
