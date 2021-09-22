package com.java.ExceptionHandling;
//throws or try and catch blocks are mandatory for checked exceptions , otherwise compiler throws error.
public class ExceptionDemo8 {
	public static void main(String[] args) /*throws Exception*/ {
		Exception e = new Exception();
		try {
			throw e;
		}catch(Exception e1) {
			System.out.println("caught exception" );
		}
		
	}	

}
