package com.java.inner_classes;

public class StaticIC7 {
	static int a = 20;
	int x = 20;
	static class A{
		static int a = 20;
		int x = 20;
		void m1() {
			System.out.println(a);
			System.out.println(x);
			
			StaticIC7 e = new StaticIC7();
			System.out.println(e.a);
			System.out.println(e.x);
			
		}
	}
	void m2() {
		System.out.println(a);
		System.out.println(x);
		
		A a = new A();
		System.out.println(a.a);
		System.out.println(a.x);
		
	}
	public static void main(String[] args) {
		StaticIC7 e = new StaticIC7();
		e.m2();
		//A a = new A();
		//a.m1();
	}

}
