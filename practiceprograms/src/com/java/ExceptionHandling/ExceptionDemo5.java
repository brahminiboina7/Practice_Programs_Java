package com.java.ExceptionHandling;
//Example to throw the exception by using throw statement. Adding try,catch to catch the exception
public class ExceptionDemo5 {
	public static void fun(int a) {
		RuntimeException e = new RuntimeException("param is -ve");
		System.out.println("fun begin");
		if(a<0) {
			throw e;
		}
		System.out.println("fun end");
	}
	public static void main(String[] args) /*throws Exception*/ {
		System.out.println("main begin");
		try {
		fun(0);
		fun(-1);
		}catch(Exception e) {
			System.out.println("caught "+e);
		}
		System.out.println("main end");
	}
}
