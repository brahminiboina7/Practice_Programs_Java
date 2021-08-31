package com.java.inheritance;
public class Sub1 extends Sample{
	public static void main(String[] args) {
		Sub1 s = new Sub1();
		s.show();
	}
	void show() {
	//System.out.println(a); ---> as 'a' is private data member, hence it is not accessible by sub class of same class in same package.
		System.out.println(b); //6
		System.out.println(c); //7
		System.out.println(d); //8
	}
	
}
