package com.java.final_kw;

public class FinalLocalVarDemo2 {
	public static void main(String[] args) {
		final int a; 
		a = 7;
		System.out.println("a: "+a);
		//a = a+1;      --> Not allowed
		int b;
		b = a+1; //allowed
		System.out.println("b: "+b);
	}
}
                                                                                   