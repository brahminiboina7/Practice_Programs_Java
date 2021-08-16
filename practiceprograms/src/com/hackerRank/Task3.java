package com.hackerRank;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		int n;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a no.  ");
		n = scn.nextInt();
		for(int i=1;i<=10;i++) {
			// System.out.println(n+" x "+i+" = "+n*i);
            System.out.printf("%d x %d = %d%n",n,i,n*i);
		}
	}

}
