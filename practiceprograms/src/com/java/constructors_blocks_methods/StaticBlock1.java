package com.java.constructors_blocks_methods;

public class StaticBlock1 {
	static {
		//System.out.println(" IN SB1 a: "+a); //---> cannot reference a field before it is defined .
		System.out.print(" IN SB1 a: "+getA());
		System.out.print("\t IN SB1 b: "+getB());
		System.out.println("\t IN SB1 c: "+getC());
	}
	static int a;
	static int b = 6;
	static final int c = 5;
	static {
		System.out.print(" IN SB2 a: "+a);
		System.out.print("\t IN SB2 b: "+b);
		System.out.println("\t IN SB2 c: "+c);
	}
	public static void main(String[] args) {
		System.out.print(" IN main a: "+a);
		System.out.print("\t IN main b: "+b);
		System.out.println("\t IN main c: "+c);
	}
	static {
		System.out.print(" IN SB3 a: "+a);
		System.out.print("\t IN SB3 b: "+b);
		System.out.println("\t IN SB3 c: "+c);
	}
	public static int getA() {
		return a;
		
	}
	public static int getB() {
		return b;
		
	}
	public static int getC() {
		return c;
		
	}}
