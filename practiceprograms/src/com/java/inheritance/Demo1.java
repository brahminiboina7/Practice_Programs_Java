package com.java.inheritance;

class Sample1{
	public int a = 5;
}

class Sub extends Sample1{
	int b= 6;
	void show() {
		System.out.println(a);
		System.out.println(b);
	}
}
public class Demo1 {
	public static void main(String[] args) {
		Sub s = new Sub();
		s.show();
	}
}
