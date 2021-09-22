package com.java.ExceptionHandling;

public class ExceptionDemo10 {
	public static void main(String[] args) {
		int a[] = new int[2];
		a[0] = 7;
		a[1] = 5;
		//a[2] = 3; --> This line causes ArrayIndexOutOfBoundsException
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		//System.out.println(a[2]);	--> This line also causes ArrayIndexOutOfBoundsException
	}

}
