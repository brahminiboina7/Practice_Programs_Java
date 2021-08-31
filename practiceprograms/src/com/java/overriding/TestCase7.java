package com.java.overriding;
class Sample{
	static void fun() {
		System.out.println("static Sample fun");
	}
	void task() {
		System.out.println("NS Sample task");
	}
}
class Sub extends Sample{
	static void fun() {
		System.out.println("static sub fun");
	}
	void task() {
		System.out.println("NS sub task");
	}
}
public class TestCase7 {
	public static void main(String[] args) {
		Sample s1,s2;
		Sub s3;
		
		s1 = new Sample();
		s2 = new Sub();
		s3 = new Sub();
		
		s1.fun();
		s1.task();
		s2.fun();
		s2.task();
		s3.fun();
		s3.task();
		Sample.fun();
		Sub.fun();
	}
}
