package com.bit.test;

public class Demo {

	public static void main(String[] args) {
		Car x=new Car();
		x.move(5);
		BMW x1=new BMW();
		x1.move(3.0);
		Car x2=new BMW();
		x2.move(7);
		DemoString x3=new DemoString();
		x3.play();
		
		System.out.println(x3.play1("bo"));
		System.out.println(x3.play3());

	}

}
