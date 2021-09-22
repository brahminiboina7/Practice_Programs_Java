package com.java.ExceptionHandling;

import java.util.Scanner;

//catching different exceptions
public class ExceptionDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the size of the array:");
			int size = sc.nextInt();
			int a[] = new int[size];
			a[-1] = 23;
			
		}catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("caught "+e1);
		}catch(NegativeArraySizeException e2) {
			System.out.println("caught "+e2);
		}
	}

}
