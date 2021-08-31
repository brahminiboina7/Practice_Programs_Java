package com.java.overriding;
/*Rules in OverRiding
Rule 3- In ovverriding, sub class method must have same access modifier as super class method or 
must be have more access than super class method modifier but not weaker */

class GenericFilter{
	public void service() {
		System.out.println("in generic filter service method");
	}
	
	protected void xevent() {
		System.out.println("in generic filter xevent method");
	}
	void fun() {
		System.out.println("in generic filter fun method");
	}
	private void run() {
		System.out.println("in generic filter run method");
	}
}
class FTPFilter extends GenericFilter{
	
	public void service() {	//allowed same access
		System.out.println("in ftp filter service method-->public");
		System.out.println("-------------------------------------------");
	}
	/*
	protected void service() {	//not allowed
		System.out.println("in ftp filter service method");
	}
	void service() {	//not allowed
		System.out.println("in ftp filter service method");
	}
	private void service() {	//not allowed
		System.out.println("in ftp filter service method");
	}
	*/
	
	
	/*
	public void xevent() {	//allowed more access
		System.out.println("in ftp filter xevent method-->Public");
		System.out.println("-------------------------------------------");
	}
	*/
	protected void xevent() {	//allowed same access
		System.out.println("in ftp filter xevent method--->Protected");
		System.out.println("-------------------------------------------");
	}
	/*
	void xevent() {	//not allowed
		System.out.println("in ftp filter xevent method-->default or package");
		System.out.println("-------------------------------------------");
	}
	private void xevent() {	//not allowed
		System.out.println("in ftp filter xevent method-->private");
		System.out.println("-------------------------------------------");
	}
	*/
	
	
	/*
	public void fun() {	//allowed more access
		System.out.println("in ftp filter fun method-->Public");
		System.out.println("-------------------------------------------");
	}
	
	protected void fun() {	//allowed more access
		System.out.println("in ftp filter fun method--->Protected");
		System.out.println("-------------------------------------------");
	}
	*/
	
	void fun() {	// allowed same access
		System.out.println("in ftp filter fun method-->default or package");
		System.out.println("-------------------------------------------");
	}
	/*
	private void fun() {	//not allowed
		System.out.println("in ftp filter fun method-->private");
		System.out.println("-------------------------------------------");
	}
	*/
	
	
	/*As super class private methods are not visible in sub class we can't override super class private methods
	
	public void run() {	//allowed more access
		System.out.println("in ftp filter run method-->Public");
		System.out.println("-------------------------------------------");
	}
	
	protected void run() {	//allowed more access
		System.out.println("in ftp filter run method--->Protected");
		System.out.println("-------------------------------------------");
	}
	
	
	void run() {	// allowed more access
		System.out.println("in ftp filter run method-->default or package");
		System.out.println("-------------------------------------------");
	}
	 
	private void run() {	//allowed same access but can't be accessed bcz private is only accessible to same class of the package
		System.out.println("in ftp filter run method-->private");
		System.out.println("-------------------------------------------");
	}*/

	
	
}

public class TestCase5 {
	public static void main(String[] args) {
		GenericFilter g;
		FTPFilter f;
		g = new FTPFilter();
		g.service();
		g.xevent();
		g.fun();
		//g.run(); -->c error as private is only accessible to same class of the package
		//Super class private methods are not visible in sub class
	}
	
}
