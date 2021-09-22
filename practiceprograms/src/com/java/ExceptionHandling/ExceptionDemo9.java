package com.java.ExceptionHandling;
//throws or try & catch blocks are not compulsory for unchecked exceptions. They are optional
public class ExceptionDemo9 {
	public static void main(String[] args) /*throws NullPointerException*/{
		NullPointerException n = new NullPointerException("got exception , dont call with null");
		try {
			throw n;
		}catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
