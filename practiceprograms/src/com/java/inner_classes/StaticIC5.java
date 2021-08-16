package com.java.inner_classes;

public class StaticIC5 {
	static {
		System.out.println("outer class is loaded");
	}
	static class A{
		static {
			System.out.println("static inner class is loaded");
		}
		public static void main(String[] args) {
			System.out.println("static inner class main method");
		}
	}
	public static void main(String[] args) {
		System.out.println("outer class main method");
	}

}
