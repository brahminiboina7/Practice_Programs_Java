package com.java.inner_classes;

public class StaticIC2 {
	int x;
	static void m1() {
		System.out.println("In static outer class method");
	}
	void m2() {
		System.out.println("In static outer class non static method");
		
	}
	static class A{
		static void m1() {
			A a = new A();
			System.out.println("In static inner class method");
			StaticIC2 e = new StaticIC2();
			System.out.println(e.x);
			a.m2();
			e.m2();
			//System.out.println(a.x); --> we can't access outer class nsv with inner class object.
		}
		void m2() {
			System.out.println("In static inner class non static method");
			
		}
		public static void main(String[] args) {
			//A a = new A();
			System.out.println("in mm");
			A.m1();
			StaticIC2.m1();
			m1();
			/*a.m2(); we can't access nsm with out creating object in main method.
			e.m2();*/
		}
	}

}
