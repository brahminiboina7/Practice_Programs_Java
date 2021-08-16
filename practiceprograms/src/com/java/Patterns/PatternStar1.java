package com.java.Patterns;

import java.util.Scanner;

public class PatternStar1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scn.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
