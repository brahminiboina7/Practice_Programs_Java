package com.java.final_kw;

public class FinalLocalVarDemo1 {
	public static void main(String[] args) {
		final int a = 5; 
	//	a = a+1;      --> Not allowed
		System.out.println("a: "+a);
	}
}
