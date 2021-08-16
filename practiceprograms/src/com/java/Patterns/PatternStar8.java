package com.java.Patterns;

import java.util.Scanner;

public class PatternStar8 {
	public static void main(String[] args) {
		int i,j,k,n;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no. of rows:");
		n = scn.nextInt();
		for(i=1;i<n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(k=1;k<=i;k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
