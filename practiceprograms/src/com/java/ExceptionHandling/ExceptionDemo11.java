package com.java.ExceptionHandling;
//Errors and its subclass exceptions cannot be handled by programmer

import java.util.Scanner;

public class ExceptionDemo11 {
	public static void main(String[] args) {
		int a[] =new int[500000];
		try {
			main(args);
		}catch(OutOfMemoryError e) {
			System.out.println("install new ram");
			Scanner scn = new Scanner(System.in);
			System.out.println("after installing new ram press enter key");
			scn.nextLine();
			main(args);
			
		}catch(StackOverflowError e1) {
			System.out.println("install new ram");
			Scanner scn = new Scanner(System.in);
			System.out.println("after installing new ram press enter key");
			scn.nextLine();
			main(args);
			
		}catch(NoClassDefFoundError e2) {
			System.out.println("install new ram");
			Scanner scn = new Scanner(System.in);
			System.out.println("after installing new ram press enter key");
			scn.nextLine();
			main(args);
			
		}
	}
	

}
