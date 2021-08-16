package com.java.inner_classes;

public class StaticIC1 {
	static int a = 10;
	int x = 20;
	private int y = 30;
		static class A{
			public static void main(String[] args) {
				System.out.println(a);
				//System.out.println(x);
				//System.out.println(y);
				
				StaticIC1 e = new StaticIC1();
				System.out.println(e.a);
				System.out.println(e.x);
				System.out.println(e.y);
			}
		}
	

}
