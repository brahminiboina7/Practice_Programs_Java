package com.java.Patterns;

import java.util.Scanner;

public class PatternStar6 {
	public static void main(String[] args) {
		int i,j,k,n;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no. of rows:");
		n = scn.nextInt();
		for(i=n;i>1;i--) {
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
