package com.java.Patterns;

import java.util.Scanner;

public class PatternStar7 {
	public static void main(String[] args) {
		int i,j,k,n,p=1;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no. of rows:");
		n = scn.nextInt();
		p = n-1;
		for(i=1;i<n;i++) {
			for(j=n-i;j>1;j--) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		for(i=n-1;i>1;i--) {
			for(j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(k=1;k<i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
