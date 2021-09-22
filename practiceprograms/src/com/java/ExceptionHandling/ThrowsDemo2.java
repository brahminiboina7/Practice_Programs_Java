package com.java.ExceptionHandling;

public class ThrowsDemo2 {
	public static void fun(int a)/*throws Throwable -->is optional when there is try/catch */  {
		try {
			if(a==0) {
				throw (new Throwable());
			}
		}catch(Throwable e) {
			System.out.println("caught the exception");
		}
		System.out.println("fun end");
	}
	public static void main(String[] args) throws Throwable{
		System.out.println("main begin");
		fun(0);
		System.out.println("main end");
	}
}
