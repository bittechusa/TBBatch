package com.bit.test;

public class DemoString 
{
	int a=8;
	String b="boy";
	String d=new String("hi,welcome,to bittech");
	Integer c=8;
	
	void play()
	{
		System.out.println(c.equals(5));
		System.out.println(b.length());
		System.out.println(b.concat(" girl"));
		System.out.println(b.equals("x"));
		
		String[] z=d.split(",");
		System.out.println(z[0]);
		System.out.println(z[1]);
		System.out.println(b.toUpperCase());
		
		
	}
	boolean play1( String x)
	{
		if(b.equals(x))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		
		boolean play3()
		{
			if(d.contains("Bittech"))
			{
				return true;
			}
			else
				return false;
		}
	}


