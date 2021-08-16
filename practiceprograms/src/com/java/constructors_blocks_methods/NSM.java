package com.java.constructors_blocks_methods;

public class NSM {
	static int a = 10;
	static int b = 20;
	int x = 30;
	int y = 40;
	public NSM(int a2, int b2) {
		System.out.println("in constructor");
		System.out.println("a: " +a+ "    b: "+b);
		m2();
		m1();
		
	}
	{
		System.out.println("in nsb");
		m3();
		m2();
	}
	void m1() {
		
		System.out.println("in nsm");
		m2();
	}
	static void m2() {
		System.out.println("in sm");
		
	}
	void m3() {
		System.out.println("in nsm2");
		m1();
		m2();
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println("in mm");
		NSM e1 = new NSM(a,b);
		NSM e2 = null;
		e1.m1();//we cannot call nsm directly
		m2();
		NSM.m2();
		e1.m2();
		e2.m2();
		
		
	}
	static {
		System.out.println("in sb ");
		m2();
	}

}
