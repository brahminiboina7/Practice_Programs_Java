package com.java.ExceptionHandling;

import java.io.IOException;

/*Point7: Difference b/w throw and throws
 *  "throw" statement throws the exception object
 *  "throws" is used to declare the methods with exceptions
 */
public class Throw_Throws_Diff {
	static double fun(double a) throws IOException //declaring
	{
		double d =a ;
		IOException e = new IOException();
		if(d==0.0) {
			throw e; //this is throwing. Here, "throw e" says fun() is going to throw IOException object.
		}
		return d; // Here it returns double value. double fun(double a) says that fun() returns double.
	}
	public static void main(String[] args) throws IOException {
		fun(0.0);
	}
}
