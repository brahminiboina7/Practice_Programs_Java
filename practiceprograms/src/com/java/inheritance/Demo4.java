package com.java.inheritance;
class Sample4{
	  private int a = 5;
}

class Sub4 extends Sample4{
	int b= 6;
	void show() {
		// System.out.println(a); - -->not allowed as a is private
		System.out.println(b);
	}
}
public class Demo4 {
	public static void main(String[] args) {
		Sub4 s = new Sub4();
		s.show();
	}
}