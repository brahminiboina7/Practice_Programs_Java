package com.java.inner_classes;

public class StaticIC3 {
	static class A{
		private int y = 20;
		static void m1() {
			System.out.println("inner class static method");
		}
		void m2() {
			System.out.println("inner class non static method");
		}
	}
	public static void main(String[] args) {
		System.out.println("in mm");
		A.m1();
		A a = new A();
		System.out.println(a.y);
		a.m2();
		
		
	}

}
