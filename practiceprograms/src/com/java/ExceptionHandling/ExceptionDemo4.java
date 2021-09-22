package com.java.ExceptionHandling;
//catching each exception 
import java.util.Scanner;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		int a[] = null;
		try {	
			a = new int[size];
		}catch(NegativeArraySizeException e1) {
			System.out.println("caught "+e1);
		}
		try {	
			a[-1] = 23;
		}catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("caught "+e2);
		}catch(NullPointerException e3) {
			System.out.println("caught "+e3);
		}
	}
}
