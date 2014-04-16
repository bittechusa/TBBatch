package com.bit.test.ui;

public class BaseTest 
{
    public static void main(String[] args)
    {
       SmokeTest m=new SmokeTest();
       SmokeTest m1=new SmokeTest(14);
       SmokeTest m2=new SmokeTest(10," doller");
       SmokeTest m3=new SmokeTest("Hello World");
    }
}
