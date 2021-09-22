package com.java.ExceptionHandling;
//USING void printStackTrace
public class ExceptionDemo7 {
	static void fun3() {
		RuntimeException r = new RuntimeException("silly exception");
		throw r;
	}
	static void fun2() {
		System.out.println("main is calling fun3()");
		fun3();
	}static void fun1() {
		System.out.println("main is calling fun2()");
		fun2();
	}
	public static void main(String[] args) {
		System.out.println("main is calling fun1()");
		try {
			fun1();
		}catch(RuntimeException e) {
			e.printStackTrace();
		}
	}

}
