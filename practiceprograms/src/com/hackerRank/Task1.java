package com.hackerRank;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		int n;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number:  ");
		n = scn.nextInt();
		if(n%2==1) {
			System.out.println("Weird");
		}else if(n%2==0 && (n>=2) && (n<=5)) {
			System.out.println("Not Weird");
		}else if(n%2==0 && (n>=6) && (n<=20)) {
			System.out.println("Weird");
		}else if(n%2==0 && (n>20)) {
			System.out.println("Not Weird");
		}
	}

}
