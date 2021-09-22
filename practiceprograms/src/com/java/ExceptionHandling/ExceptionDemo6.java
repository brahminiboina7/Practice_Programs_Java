package com.java.ExceptionHandling;
//USING String.getMessage();
public class ExceptionDemo6 {
	static int divide(int a, int b) {
		RuntimeException e = new RuntimeException("divide by zero error");
		if(b==0) {
			throw e;
		}
		return a/b;
	}
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter 1st num");
		int a = sc.nextInt();
		System.out.println("enter 2nd num");
		int b = sc.nextInt();
		try {
			int c = divide(a,b);
			System.out.println("quotient= "+c);
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

}
