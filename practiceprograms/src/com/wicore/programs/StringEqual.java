package com.wicore.programs;

import java.util.Scanner;

public class StringEqual {
	public static void main(String[] args) {
		String s1,s2;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a 1st string:");
		s1 = scn.nextLine();
		System.out.println("Enter a 2nd string:");
		s2 = scn.nextLine();
		if(s1.equals(s2)) {
			System.out.println("THEY ARE EQUAL");
		}
		else {
			System.out.println("THEY ARE NOT EQUAL");
		}
	}

}
