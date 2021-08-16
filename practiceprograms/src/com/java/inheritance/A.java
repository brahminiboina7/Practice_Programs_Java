package com.java.inheritance;

public class A {
	static int a = 10 ;
	static int b = 20;
	int x = 30;
	static {
		System.out.println("in sb");
	}
	{
		System.out.println("in nsb");
	}
	public static void main(String[] args) {
		System.out.println("in A main method");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}

}
