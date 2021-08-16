package com.java.Patterns;

import java.util.Scanner;

public class PatternStar5 {
	public static void main(String[] args) {
		int i,j,n;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter how many rows to print:");
		n = scn.nextInt();
		for(i=1;i<n;i++) {
			for(j=n-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}
	
}
