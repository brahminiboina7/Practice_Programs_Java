package com.java.inheritance;
class Sample2{
	protected int a = 5;
}

class Sub2 extends Sample2{
	int b= 6;
	void show() {
		System.out.println(a);
		System.out.println(b);
	}
}
public class Demo2 {
	public static void main(String[] args) {
		Sub2 s = new Sub2();
		s.show();
	}
}
