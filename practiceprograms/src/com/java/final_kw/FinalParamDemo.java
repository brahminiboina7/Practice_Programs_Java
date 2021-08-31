package com.java.final_kw;

public class FinalParamDemo {
	static void fun(final int a, int b) {
		//a = a+1;	not allowed
		int c = b;
		b = a+1;
		b = b+c;
		System.out.println("a: "+a+" b: "+b);
		
	}
	public static void main(String[] args) {
		fun(1,7);
		fun(3,8);
	}
}
