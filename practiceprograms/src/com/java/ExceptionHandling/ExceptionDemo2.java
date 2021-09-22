package com.java.ExceptionHandling;

public class ExceptionDemo2 {
	public static void main(String[] args) /* throws ClassNotFoundException */{
		System.out.println("main begin");
		try {
		Class.forName("123");
		}catch(ClassNotFoundException e1) {
			System.out.println("please handle the error:" );
		}catch(Exception e2) {
			System.out.println("please handle the error2:" );
		}
		System.out.println("main end");
	}

}
