package com.java.constructors_blocks_methods;

import java.util.Scanner;

public class TestCase1 {
	
	public static void main(String[] args) {
		int num;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = scn.nextInt();
		System.out.println("\n Total of fibnocci series is:"+fib(num));
	}

	private static int fib(int num) {
		
		int a = 0, b=1, c=0;
		
		for(int i=0;i<num;i++) {
			System.out.print("\t"+a );
			c = a+b;
			a=b;
			b=c;
			
		}
		System.out.println();
		return c;
		
	}

}
