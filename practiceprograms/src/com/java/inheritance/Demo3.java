package com.java.inheritance;
class Sample3{
	 int a = 5;
}

class Sub3 extends Sample3{
	int b= 6;
	void show() {
		System.out.println(a);
		System.out.println(b);
	}
}
public class Demo3 {
	public static void main(String[] args) {
		Sub3 s = new Sub3();
		s.show();
	}
}