package com.java.var_args;

public class VarArgsDemo2 {
	public static void fun(String...a) {
		System.out.println("No. of parameter:"+a.length);
		for(String e: a) {
			System.out.println(e);
		}
		
	}
	public static void main(String[] args) {
		fun();
		fun("Bhanu");
		fun("krishna", "Brahmini");
		String s1 = "Nandu";
		String s2 = "Kavya";
		fun(s1,s2);
		String a[] = { "Pavani", "Lakshmi","Baby"};
		fun(a);
		                                                                                                                                                                                                
	}

}
