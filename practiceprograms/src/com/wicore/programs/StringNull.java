package com.wicore.programs;

import java.util.Scanner;

public class StringNull {
	public static void main(String[] args) {
	String s = null;
	/*Scanner scn = new Scanner(System.in);
	System.out.println("Enter a string:");
	s = scn.nextLine();
	if(s.length() == 0) {*/ 
	if(s == null) {
		System.out.println("it is null");
	}
	else {
		System.out.println("it is not null");
	}	
}
}