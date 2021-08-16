package com.java.inner_classes;
public class Test {
	public static void main(String[] args) {
		StaticIC7 e1 = new StaticIC7();
		StaticIC7.A a1 = new StaticIC7.A();
		System.out.println(StaticIC7.a);
		System.out.println(StaticIC7.A.a);
		System.out.println(a1.x);
		System.out.println(e1.x);
	}

}
