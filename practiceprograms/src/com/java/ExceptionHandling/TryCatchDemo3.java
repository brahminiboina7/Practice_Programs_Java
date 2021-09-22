package com.java.ExceptionHandling;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

/*Point:3- If a method is throwing more than one checked exception and there is no try catch blocks 
 *inside method then all these checked exceptions must be placed in throws declaration list or we can 
 *place a single Exception in throws declaration i.e., super class of all its checked exceptions.
 * 
 */
public class TryCatchDemo3 {
	static void fun(int a) throws EOFException, FileNotFoundException {
	//static void fun(int a) throws IOException { --> we can also write like this
		if(a==0) {
			throw new FileNotFoundException();
		}
		if(a==1) {
			throw new EOFException();
		}
		
	}
	public static void main(String[] args) throws IOException{
		fun(0);
		fun(1);
	}

}
