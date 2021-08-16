package com.java.constructors_blocks_methods;

import java.io.IOException;

public class NSV {
	static String Name = "Bhanu";
	int id = 401;
	String name = "Brahmini";
	String dept = "ECE";
	boolean isStudent = false;
	public static void main(String[] args) throws IOException{
		NSV e1 = new NSV();
		NSV e2 = null;
		System.out.println("e1: " +e1); //com.java.sample_programs.NSV@15db9742
		System.out.println("e2: " +e2); //null
		System.out.println("id is: " +e1.id);
		System.out.println("name is: " +e1.name);
		System.out.println("dept is: " +e1.dept);
		System.out.println("is Student: " +e1.isStudent);
		//System.out.println("id is: " +e2.id); -->java.lang.NullPointerException
		//System.out.println("name is: " +e2.name);
		System.out.println("name is: " +e2.Name);//Bhanu..No null pointer exception.
	}
	
}
