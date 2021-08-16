package com.java.constructors_blocks_methods;

public class Main {
	static {
		System.out.println( "in the static block");
		main(new String[0]);
		System.out.println("end of static block");
	}
	public static void main(String[] args) {
		System.out.println("in the main method");
		System.out.println("in the main method args:" +args);
	}

}
