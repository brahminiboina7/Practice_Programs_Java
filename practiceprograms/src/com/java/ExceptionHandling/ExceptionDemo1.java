package com.java.ExceptionHandling;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		System.out.println("main begin");
		int a[] = {23,78};
		try {
		a[4] = 5;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please handle the error ie.,you cannot assign elements in an array out of array size:"+e);
		}
		System.out.println("main end");
	}

}
 