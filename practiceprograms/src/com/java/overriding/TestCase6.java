package com.java.overriding;

import java.io.FileNotFoundException;
import java.io.IOException;

/*Rules in OverRiding
Rule 4- In overriding, if superclass overriden method is having throws declaration then sub class
overriding method may have throws declaration or may not have throws declaration */
class GenericFilter1{
	public void service() throws IOException{ //allowed
		System.out.println("in genericfilter service method");
	}
}
class FTPFilter1 extends GenericFilter1{
	public void service() {	//allowed
		System.out.println("in FTPFilter1 service method");
	}
}
class FTPFilter2 extends GenericFilter1{
	public void service() throws IOException {	//allowed
		System.out.println("in FTPFilter2 service method");
	}
}
class FTPFilter3 extends GenericFilter1{
	public void service() throws FileNotFoundException {	//allowed
		System.out.println("in FTPFilter3 service method");
	}
}
class FTPFilter4 extends GenericFilter1{
	/*
	 * public void service() throws ClassNotFoundException { // not allowed
	 	System.out.println("in FTPFilter4 service method");
		
	}*/
}
public class TestCase6 {
	public static void main(String[] args) throws IOException {
		GenericFilter1 g;
		g = new FTPFilter1();
		g.service();
		g = new FTPFilter2();
		g.service();
		g = new FTPFilter3();
		g.service();
	}
}
