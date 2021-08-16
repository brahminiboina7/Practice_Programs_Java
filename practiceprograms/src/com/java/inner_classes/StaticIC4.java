package com.java.inner_classes;

public class StaticIC4 {
	public static void main(String[] args) {
		System.out.println("a: " +Example.A.a);
		Example.A e = new Example.A();
		System.out.println("x: " +e.x);
		//System.out.println("y: " +e.y); // ce: y has a private access in Example.java
		
	}

}
