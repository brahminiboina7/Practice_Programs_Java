package com.java.inner_classes;

public class StaticIC6 {
	static {
		System.out.println("outer class is loaded");
	}
	StaticIC6(){
		System.out.println("outer class constructor");
	}
	static class A{
		static {
			System.out.println("inner class is loaded");
		}
		A(){
			System.out.println("inner class constructor");
		}
		static void m1() {
			System.out.println("inner class sm");
		}
		void m2() {
			System.out.println("inner class nsm");
		}
		public static void main(String[] args) {
			System.out.println("inner class mm");
			StaticIC6.m3();
			StaticIC6 e = new StaticIC6();
			e.m4();
		}
	}
	static void m3() {
		System.out.println("outer class sm");
	}
	void m4() {
		System.out.println("outer class nsm");
	}
	public static void main(String[] args) {
		System.out.println("outer class mm");
		A.m1();
		A a = new A();
		a.m2();
	}

}
