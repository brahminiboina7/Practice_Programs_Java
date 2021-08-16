package com.java.inheritance;

public class B extends A {
	static int a = 100;
	static int c = 40;
	static int d = 50;
	int e = 60;
	int x = 200;
	static {
		System.out.println("in bsb");
		
	}
	{
		System.out.println("in bnsb");
		System.out.println(" x ---->  " +this.x);
	}
	public static void main(String[] args) {
		//A aa = new A();
		//B bb = new B();
		A ab = new B();
		System.out.println("in B main method");
		System.out.println(" a ---->  " +ab.a);
		System.out.println(" a ---->  " +a) ;
		System.out.println(" b ---->  " +b);
		System.out.println(" c ---->  " +c) ;
		System.out.println(" d ---->  " +d);
		//System.out.println(" e ---->  " +ab.e) ;
		System.out.println(" x ---->  " +ab.x);
		System.out.println("------------" );
	}
	
}
