package com.java.ExceptionHandling;

public class ThrowsDemo1 {
	public static void fun(int a) throws Throwable  {
		if(a==0) {
			throw (new Throwable());
		}
		System.out.println("fun end");
	}
	public static void main(String[] args) /*throws Throwable -->is optional when there is try/catch */{
		System.out.println("main begin");
		try {
			fun(0);
		}catch(Throwable e) {
			System.out.println("caught the exception");
		}
		
		System.out.println("main end");
	}
}
